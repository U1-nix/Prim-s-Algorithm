package org.eric.primsalgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        List<TreeApex> treeApexes = new ArrayList<>();
        initializeMainTreeApexes(treeApexes);

        Prim.createMinimumSpanningTree(treeApexes);

        double sum = 0;
        for (TreeApex e : treeApexes) {
            if (e.getPreviousApexId() != -2) {
                sum += e.getDistanceToParent();
            }
        }

        System.out.println(Math.sqrt(sum));
    }

    private static void initializeMainTreeApexes(List<TreeApex> apexes) {
        Scanner scanner = new Scanner(System.in);
        int numberOfMainApexes = scanner.nextInt();
        for (int i = 0; i < numberOfMainApexes; i++) {
            TreeApex treeApex = new TreeApex();
            treeApex.setId(i);
            // -1 means no next tree apex
            if (i == 0) {
                // -2 means first tree apex
                treeApex.setPreviousApexId(-2);
            } else {
                treeApex.setPreviousApexId(-1);
            }
            treeApex.setDistanceToParent(Double.MAX_VALUE);
            List<Double> coordinates = new ArrayList<>();
            // userInput - coordinate in String format
            String userInput = scanner.next();
            double coordinate = Double.parseDouble(userInput);
            coordinates.add(coordinate);
            userInput = scanner.next();
            coordinate = Double.parseDouble(userInput);
            coordinates.add(coordinate);
            treeApex.setCoordinates(coordinates);
            apexes.add(treeApex);
        }
    }
}
