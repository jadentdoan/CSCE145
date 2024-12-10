// Written by Jaden Doan

public class Bicycle {
    private String make; 
    private Wheel frontWheel;
    private Wheel backWheel; 
    private Frame frame; 

    public Bicycle() 
    {
        this.make = "none";
        this.frontWheel = new Wheel();
        this.backWheel = new Wheel();
        this.frame = new Frame();
    }

    public Bicycle(String make, Wheel frontWheel, Wheel backWheel, Frame frame) 
    {
        this.make = (make != null) ? make : "none";
        this.frontWheel = (frontWheel != null) ? frontWheel : new Wheel();
        this.backWheel = (backWheel != null) ? backWheel : new Wheel();
        this.frame = (frame != null) ? frame : new Frame();
    }

    public String getMake() 
    {
        return make;
    }

    public Wheel getFrontWheel() 
    {
        return frontWheel;
    }

    public Wheel getBackWheel() {
        return backWheel;
    }

    public Frame getFrame() 
    {
        return frame;
    }

    public void setMake(String make) 
    {
        this.make = (make != null) ? make : "none";
    }

    public void setFrontWheel(Wheel frontWheel) 
    {
        this.frontWheel = (frontWheel != null) ? frontWheel : new Wheel();
    }

    public void setBackWheel(Wheel backWheel) 
    {
        this.backWheel = (backWheel != null) ? backWheel : new Wheel();
    }

    public void setFrame(Frame frame) 
    {
        this.frame = (frame != null) ? frame : new Frame();
    }

    public boolean equals(Bicycle other) 
    {
        return this.make.equalsIgnoreCase(other.make) && 
               this.frontWheel.equals(other.frontWheel) &&
               this.backWheel.equals(other.backWheel) &&
               this.frame.equals(other.frame);
    }

    @Override
    public String toString() 
    {
        return "[Bicycle] Make: " + make + " Front Wheel: " + frontWheel.toString() +
               " Back Wheel: " + backWheel.toString() + " Frame: " + frame.toString();
    }
}
