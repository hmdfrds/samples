package Exercise7;

//human class to set and get the name and weight attribute.
public class Human {
	
	private String name;
	private double weightOnEarth;
	private double weightOnMars;
	
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
