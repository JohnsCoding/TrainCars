
public class ProjectNumberEight {
	
	public static void main (String[] args){
		
		//"Set up" the 8 train cars with names & cargo
		//Also, links each car to next using setNextCar method
		TrainCar car1 = new TrainCar("Box Car #1","wheat");
		TrainCar car2 = new TrainCar("Tank Car #1","oil");
		car1.setNextCar(car2);
		
		TrainCar car3 = new TrainCar("Hopper Car #1","coal");
		car2.setNextCar(car3);
		
		TrainCar car4 = new TrainCar("Box Car #2","wheat...and a hobo");
		car3.setNextCar(car4);
		
		TrainCar car5 = new TrainCar("Hopper Car #2","rocks");
		car4.setNextCar(car5);
		
		TrainCar car6 = new TrainCar("BoxCar #3","boxes of 'iPhone 7's");
		car5.setNextCar(car6);
		
		TrainCar car7 = new TrainCar("Tank Car #2","water");
		car6.setNextCar(car7);
		
		TrainCar car8 = new TrainCar("Refridgerator Car #1","tv dinners");
		car7.setNextCar(car8);
		
		//prints out details for the first train car
		System.out.println("Woohoo, here comes the train!\n");
		TrainCar c = car1;
		System.out.println("The first car is " + c.getName() + ".");
		System.out.println("It contains " + c.getCargo() + ".");
		
		//prints out details for the remaining train cars
		//loop runs until the final car (i.e hasNextCar is false)
		do{
			c = c.getNextCar();
			System.out.println("\nThe next car is " + c.getName() + ".");
			System.out.println("It contains " + c.getCargo() + ".");
		}while (c.hasNextCar());
		
	}

	
}
