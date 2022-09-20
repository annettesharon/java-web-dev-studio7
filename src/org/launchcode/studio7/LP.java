package org.launchcode.studio7;

public class LP extends BaseDisc implements OpticalDisc {
    public LP(String name, double capacity, String contents, String discType) {
        super(name, capacity, contents, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("The LP '" + this.name + "' spins at a rate of 78 rpm.");
    }

    @Override
    public void writeData() {
        System.out.println("Sorry! The average Joe does not have the ability to write data to a vinyl record.");
    }

    @Override
    public void readData() {
        System.out.println("The LP is now playing the " + this.discType + " named '" + this.name + "'.");
    }
}
