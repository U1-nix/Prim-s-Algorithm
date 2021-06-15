package org.eric.primsalgorithm;

import java.util.List;

public class TreeApex {
    private int id;
    private List<Double> coordinates;
    private int previousApexId;
    private double distanceToParent;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Double> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Double> coordinates) {
        this.coordinates = coordinates;
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
