package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd1 = new CD("North Borders", 140, "songs","music album");
        DVD dvd1 = new DVD("Gosford Park", 520, "moving picture", "movie");
        LP lp1 = new LP("Boston", 90, "songs", "music album");
        FloppyDisk fd1 = new FloppyDisk("tetris.exe", 32, "files", "program");


        // TODO: Call each CD and DVD method to verify that they work as expected.
        System.out.print("\n");

        cd1.spinDisc();
        dvd1.spinDisc();
        lp1.spinDisc();
        fd1.spinDisc();

        System.out.print("\n");

        cd1.writeData();
        dvd1.writeData();
        lp1.writeData();
        fd1.writeData();

        System.out.print("\n");

        cd1.readData();
        dvd1.readData();
        lp1.readData();
        fd1.readData();

        System.out.print("\n");
    }
}
