// Written by Jaden Doan

public class Frame {
    private double size;
    private String type; 

    public Frame() 
    {
        this.size = 18.5;
        this.type = "Diamond";
    }

    public Frame(double size, String type) 
    {
        this.size = (size >= 18.5 && size <= 60.0) ? size : 18.5;
        this.type = (type.equals("Diamond") || type.equals("Step-Through") || 
                     type.equals("Truss") || type.equals("Penny-Farthing")) ? type : "Diamond";
    }

    public double getSize() 
    {
        return size;
    }

    public String getType() 
    {
        return type;
    }

    public void setSize(double size) 
    {
        this.size = (size >= 18.5 && size <= 60.0) ? size : 18.5;
    }

    public void setType(String type) 
    {
        this.type = (type.equals("Diamond") || type.equals("Step-Through") || 
                     type.equals("Truss") || type.equals("Penny-Farthing")) ? type : "Diamond";
    }

    public boolean equals(Frame other) 
    {
        return this.size == other.size && this.type.equals(other.type);
    }

    @Override
    public String toString() 
    {
        return "[Frame] Size: " + size + " Type: " + type;
    }
}
