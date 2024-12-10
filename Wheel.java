// Written by Jaden Doan

public class Wheel 
{
    private double diameter; 
    private double width; 

    
    public Wheel() 
    {
        this.diameter = 16.0;
        this.width = 1.0;
    }

    
    public Wheel(double diameter, double width) 
    {
        this.diameter = (diameter >= 16.0 && diameter <= 55.0) ? diameter : 16.0;
        this.width = (width >= 1.0 && width <= 2.5) ? width : 1.0;
    }

    
    public double getDiameter() 
    {
        return diameter;
    }

    public double getWidth() 
    {
        return width;
    }

    public void setDiameter(double diameter) 
    {
        this.diameter = (diameter >= 16.0 && diameter <= 55.0) ? diameter : 16.0;
    }

    public void setWidth(double width) 
    {
        this.width = (width >= 1.0 && width <= 2.5) ? width : 1.0;
    }

    public boolean equals(Wheel other) 
    {
        return this.diameter == other.diameter && this.width == other.width;
    }

    @Override
    public String toString() 
    {
        return "[Wheel] Diameter: " + diameter + " Width: " + width;
    }
}
