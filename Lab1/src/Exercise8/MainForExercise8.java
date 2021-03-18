package Exercise8;
import java.util.Scanner;


public class MainForExercise8 {

	public static void main(String[] args) {
		
		//get input from user
		Scanner sc = new Scanner(System.in);
		
		System.out.print("how many human : ");
		int humanCount = sc.nextInt();
		
		Humans humans = new Humans();
		Human[] human = new Human[humanCount];//create an array human object and get the name and weight on earth
		for(int i = 0;i<humanCount;i++) {
		human[i] = new Human();
		System.out.print("\nhuman name : ");
		sc.nextLine();
		String name = sc.nextLine();
		human[i].setName(name);
		System.out.print("\nhuman weight(in KG) : ");
		double weight = sc.nextDouble();
		human[i].setWeightOnEarth(weight);
		
		
		//weight on earth is convert to weight on mars
		WeightConverter weightConverter = new WeightConverter();
		int weightInInt = ((int)(weightConverter.getWeightOnMars(human[i].getWeightOnEarth()*100))+5);//simple decimal point converter
		human[i].setWeightOnMars((double)weightInInt/100);// set the value to human attribute
		
		humans.people.add(human[i]);
		}
		
		//display the weight on earth and weight on mars by using the arrayList
		for(int i = 0;i<humans.people.size();i++) {
			
		System.out.println("\n\n"+humans.people.get(i).getName()+" weight on Earth is : "+humans.people.get(i).getWeightOnEarth()+"KG");
		System.out.println(humans.people.get(i).getName()+" weight on Mars is : "+humans.people.get(i).getWeightOnMars()+"KG");
		}
		sc.close();
	}

}
