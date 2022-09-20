package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    public DVD(String name, double capacity, String contents, String discType) {
        super(name, capacity, contents, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("The DVD '" + this.name + "' spins at a rate of 570-1600 rpm.");
    }

    @Override
    public void writeData() {
        System.out.println("A copy of the " + this.discType + " named '" + this.name + "' has been burned to the DVD.");
    }

    @Override
    public void readData() {
        System.out.println("The DVD is now playing the " + this.discType + " named '" + this.name + "'.");
    }

}
