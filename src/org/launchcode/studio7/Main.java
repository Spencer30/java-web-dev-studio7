package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        DVD inception = new DVD("Inception", "DVD", "Thriller Movie", 200, 700);
        CD intense = new CD("Intense", "CD", "EDM Album", 20, 350);

        // TODO: Call each CD and DVD method to verify that they work as expected.
        inception.spinDisc();
        inception.pauseSpinDisc();
        inception.stopSpinDisc();
        System.out.println(inception.getName());
        System.out.println(inception.getDiscType());
        System.out.println(inception.getDiscContent());
        System.out.println(inception.getDataStorage());
        System.out.println(inception.getRpm());

        intense.spinDisc();
        intense.pauseSpinDisc();
        intense.stopSpinDisc();
        System.out.println(intense.getName());
        System.out.println(intense.getDiscType());
        System.out.println(intense.getDiscContent());
        System.out.println(intense.getDataStorage());
        System.out.println(intense.getRpm());
    }
}
