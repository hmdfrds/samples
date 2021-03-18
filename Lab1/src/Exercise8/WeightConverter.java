package Exercise8;

//Weight converter to convert weight based on mars gravity
//Weight on Mars= (Weight on Earth/9.81m/s2) * 3.711m/s2
public class WeightConverter {

	double getWeightOnMars(double weight){
		return (weight/9.81)*3.711;
	}
}
