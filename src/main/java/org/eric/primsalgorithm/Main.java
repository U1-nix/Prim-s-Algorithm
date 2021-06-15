package org.eric.primsalgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        List<TreeApex> treeApexes = new ArrayList<>();
        initializeMainTreeApexes(treeApexes);

        Prim.createMinimumSpanningTree(treeApexes);

        double treeLength = 0;
        for (TreeApex e : treeApexes) {
            if (e.getPreviousApexId() != -2) {
                treeLength += e.getDistanceToParent();
            }
        }
        treeLength = Math.sqrt(treeLength);

        System.out.println(treeLength);
    }

    private static void initializeMainTreeApexes(List<TreeApex> apexes) {
        Scanner scanner = new Scanner(System.in);
        int numberOfMainApexes = scanner.nextInt();
        for (int i = 0; i < numberOfMainApexes; i++) {

            int previousApexId;
            // -1 means no next tree apex
            if (i == 0) {
                // -2 means first tree apex
                previousApexId = -2;
            } else {
                previousApexId = -1;
            }

            List<Double> coordinates = new ArrayList<>();
            // userInput - coordinate in String format
            String userInput = scanner.next();
            double coordinate = Double.parseDouble(userInput);
            coordinates.add(coordinate);
            userInput = scanner.next();
            coordinate = Double.parseDouble(userInput);
            coordinates.add(coordinate);

            TreeApex treeApex = new TreeApex(i, coordinates, previousApexId);
            apexes.add(treeApex);
        }
    }
}
