package input.model;

public class Thingy
{
	private String name;
	private int age;
	private double weight;
	
		
		public Thingy()
		{
			name = "";
			age = -99;
			weight = -.008;
		}
		
		public Thingy(String ame, int age, double weight)
		{
			//this. refers to the current instance of this object (A thingy)
			this.name = name;
			this.age = age;
			this.weight = weight;
		}
		
		public String getName()
		{
			return name;
		}
		public int getAge()
		{
			return age;
		}
		
		public double getWeight()
		{
			return weight;
		}
	}

