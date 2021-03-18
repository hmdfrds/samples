package Exercise8;

//human class to set and get the name and weight attribute.
public class Human {
	
	private String name = "";
	private double weightOnEarth = 0;
	private double weightOnMars = 0;
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName()
	{
		return name;
	}
	
	void setWeightOnEarth(double weight) {
		this.weightOnEarth = weight;
	}
	
	double getWeightOnEarth() {
		return weightOnEarth;
	}
	
	void setWeightOnMars(double weight) {
		this.weightOnMars = weight;
	}
	
	double getWeightOnMars() {
		return weightOnMars;
	}
}
