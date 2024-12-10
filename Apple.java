//Written by Jaden Doan

public class Apple 
{
	private String type;
	private double weight;
	private double price;
	
	public Apple()
	{		
		type = "Gala";
		weight = 0.0;
		price = 0.0;
	}
	
	public Apple(String type, double weight, double price) 
	{
		if(isValidType(type))
			this.type = type;
		else
			this.type = "Gala";
		if(isValidWeight(weight))
			this.weight = weight;
		else
			this.weight = 0.0;
		if(isValidPrice(price))
			this.price = price;
		else
			this.price = 0.0;
	}
	
	public void setType(String type) 
	{
		if(isValidType(type))
			this.type = type;
		else
			this.type = "Gala";
	}
	
	public void setWeight(double weight) 
	{
		if(isValidWeight(weight))
			this.weight = weight;
		else
			this.weight = 0.0;
	}
	
	public void setPrice(double price) 
	{
		if(isValidPrice(price))
			this.price = price;
		else
			this.price = 0.0;
	}
	
	public String toString()
	{
		return "Type: " + type + "Weight: " + weight + "Price: " + price;
	}
	
	public boolean equals(Apple other)
	{
		return this.type.equals(other.getType()) && this.weight == other.getWeight() && this.price == other.getPrice();
	}

	private Object getType() 
	{
		return null;
	}

	private double getWeight() 
	{
		return 0;
	}

	private double getPrice() 
	{
		return 0;
	}

	private boolean isValidType(String type)
	{
		return type != null && (type.equals("Red Delicious")) || (type.equals("Golden Delicious")) || (type.equals("Gala")) || (type.equals("Granny Smith"));
	}
	
	private boolean isValidWeight(double weight)
	{
		return weight >= 0 && weight <= 2;
	}
	
	private boolean isValidPrice(double price)
	{
		return price >= 0;
	}
	
	

}
