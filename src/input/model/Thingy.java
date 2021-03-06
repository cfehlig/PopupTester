package input.model;

//Creates a Thingy object to show access and proper variable types
public class Thingy
{
	private String name;
	private int age;
	private double weight;
	
		/**
		 * Sets the values for name, age, and weight.
		 */
		public Thingy()
		{
			name = "";
			age = -99;
			weight = -.008;
		}
		
		/**
		 * 
		 * @param ame
		 * @param age
		 * @param weight
		 */
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
		
		
		public void setName(String name)
		{
			this.name = name;
		}
		
		public void setAge(int age)
		{
			this.age = age;
		}
		
		public void setWeight(double weight)
		{
			this.weight = weight;
		}
	}

