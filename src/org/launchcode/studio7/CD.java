package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{
    public CD(String name, String discType, String discContent, int dataStorage, int rpm) {
        super(name, discType, discContent, dataStorage, rpm);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of " + getRpm() + "rpm");
    }

    @Override
    public void pauseSpinDisc() {
        System.out.println(getName() + " has been paused");
    }

    @Override
    public void stopSpinDisc() {
        System.out.println(getName() + " has been stopped");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
