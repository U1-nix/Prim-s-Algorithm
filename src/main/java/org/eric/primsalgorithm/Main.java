package org.eric.primsalgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        List<TreeApex> treeApexes = new ArrayList<>();
        initializeMainTreeApexes(treeApexes);

        Prim.createMinimumSpanningTree(treeApexes);
        double treeLength = Math.round(calculateTreeLength(treeApexes) * 100.0) / 100.0;

        System.out.println("Length of minimal spanning tree is " + treeLength);
    }

    private static void initializeMainTreeApexes(List<TreeApex> apexes) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of tree apexes: ");
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
            System.out.print("x" + i + ": ");
            String userInput = scanner.next();
            double coordinate = Double.parseDouble(userInput);
            coordinates.add(coordinate);
            System.out.print("y" + i + ": ");
            userInput = scanner.next();
            coordinate = Double.parseDouble(userInput);
            coordinates.add(coordinate);

            TreeApex treeApex = new TreeApex(i, coordinates, previousApexId);
            apexes.add(treeApex);
        }
    }

    public static double calculateTreeLength(List<TreeApex> treeApexes) {
        double treeLength = 0;
        for (TreeApex e : treeApexes) {
            if (e.getPreviousApexId() != -2) {
                treeLength += e.getDistanceToParent();
            }
        }
        return Math.sqrt(treeLength);
    }
}
