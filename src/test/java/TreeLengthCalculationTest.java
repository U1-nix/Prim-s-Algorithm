import org.eric.primsalgorithm.Main;
import org.eric.primsalgorithm.Prim;
import org.eric.primsalgorithm.TreeApex;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TreeLengthCalculationTest {
    @Test
    void testLengthCalculation() {
        List<TreeApex> treeApexes = new ArrayList<>();
        List<Double> coordinates = new ArrayList<>();

        coordinates.add(0.0);
        coordinates.add(0.0);
        TreeApex treeApex = new TreeApex(0, coordinates, -2);
        treeApexes.add(treeApex);

        coordinates.clear();

        coordinates.add(5.0);
        coordinates.add(0.0);
        treeApex = new TreeApex(1, coordinates, -1);
        treeApexes.add(treeApex);

        coordinates = new ArrayList<>();

        coordinates.add(0.0);
        coordinates.add(-10.0);
        treeApex = new TreeApex(2, coordinates, -1);
        treeApexes.add(treeApex);

        Prim.createMinimumSpanningTree(treeApexes);
        double treeLength = Math.round(Main.calculateTreeLength(treeApexes) * 100.0) / 100.0;
        assertEquals(11.18, treeLength);

        treeApexes.clear();
        coordinates = new ArrayList<>();

        coordinates.add(0.0);
        coordinates.add(0.0);
        treeApex = new TreeApex(0, coordinates, -2);
        treeApexes.add(treeApex);

        coordinates = new ArrayList<>();

        coordinates.add(5.0);
        coordinates.add(0.0);
        treeApex = new TreeApex(1, coordinates, -1);
        treeApexes.add(treeApex);

        Prim.createMinimumSpanningTree(treeApexes);
        treeLength = Math.round(Main.calculateTreeLength(treeApexes) * 100.0) / 100.0;
        assertEquals(5.0, treeLength);
    }
}
