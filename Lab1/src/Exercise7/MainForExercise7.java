package Exercise7;
import java.util.Scanner;


public class MainForExercise7 {

	public static void main(String[] args) {
		
		//get input from user
		Scanner sc = new Scanner(System.in);
		
		Human human1 = new Human();//create a human object and get the name and weight on earth
		System.out.print("what is your name : ");
		String name = sc.nextLine();
		human1.setName(name);
		System.out.print("\nwhat is your weight(in KG) : ");
		double weight = sc.nextDouble();
		human1.setWeightOnEarth(weight);
		
		sc.close();
		
		//weight on earth is convert to weight on mars
		WeightConverter weightConverter = new WeightConverter();
		int weightInInt = ((int)(weightConverter.getWeightOnMars(human1.getWeightOnEarth()*100))+5);//simple decimal point converter
		human1.setWeightOnMars((double)weightInInt/100);// set the value to human attribute
		
		//display the weight on earth and weight on mars
		System.out.println("\n\n"+human1.getName()+" weight on Earth is : "+human1.getWeightOnEarth()+"KG");
		System.out.println(human1.getName()+" weight on Mars is : "+human1.getWeightOnMars()+"KG");
	}

}
