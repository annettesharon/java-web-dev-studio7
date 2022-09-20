package org.launchcode.studio7;

public abstract class BaseDisc {
    /*** FIELDS/PROPERTIES ***/

    String name;
    double capacity;
    String contents;
    String discType;

    public BaseDisc(String name, double capacity, String contents, String discType) {
        this.name = name;
        this.capacity = capacity;
        this.contents = contents;
        this.discType = discType;
    }

    /*** GETTERS ***/

    public String getName() {
        return name;
    }

    public double getCapacity() {
        return capacity;
    }

    public String getContents() {
        return contents;
    }

    public String getDiscType() {
        return discType;
    }

    /*** METHODS ***/

    void returnInfo() {} // if all four properties need to be accessed at once
}
