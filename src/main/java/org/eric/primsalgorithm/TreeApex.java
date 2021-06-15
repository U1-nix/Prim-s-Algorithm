package org.eric.primsalgorithm;

import java.util.List;

public class TreeApex {
    private final int id;
    private final List<Double> coordinates;
    private int previousApexId;
    private double distanceToParent;

    public TreeApex(int id, List<Double> coordinates, int previousApexId) {
        this.id = id;
        this.coordinates = coordinates;
        this.previousApexId = previousApexId;
        distanceToParent = Double.MAX_VALUE;
    }

    public int getId() {
        return id;
    }

    public List<Double> getCoordinates() {
        return coordinates;
    }

    public int getPreviousApexId() {
        return previousApexId;
    }

    public void setPreviousApexId(int previousApexId) {
        this.previousApexId = previousApexId;
    }

    public double getDistanceToParent() {
        return distanceToParent;
    }

    public void setDistanceToParent(double distanceToParent) {
        this.distanceToParent = distanceToParent;
    }

}
