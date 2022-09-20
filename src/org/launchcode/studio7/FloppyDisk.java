package org.launchcode.studio7;

public class FloppyDisk extends BaseDisc implements OpticalDisc {
    public FloppyDisk(String name, double capacity, String contents, String discType) {
        super(name, capacity, contents, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("The floppy disk spins at a rate of 300 rpm.");
    }

    @Override
    public void writeData() {
        System.out.println("The " + this.discType + " named '" + this.name + "' has been copied to the floppy disk.");
    }

    @Override
    public void readData() {
        System.out.println("The floppy disk is now running the " + this.discType + " named '" + this.name + "'.");
    }
}
