package week1VariablesAndOperations;

public class VariablesAndOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int availablePlaneSeats = 5;
		
		double costOfGroceries = 23.64;
		
		char middleInitial = 'G';
		
		boolean isHotOutside = false;
		
		String customerFirstName = "John";
		
		String streetAdress = "2505 E Pleasant Ln.";
		
		System.out.println("Available seats left on the plane: " + availablePlaneSeats);
		System.out.println("Cost of groceries: $" + costOfGroceries);
		System.out.println("Customer middle initial: " + middleInitial);
		System.out.println("Is it hot outside?: " + isHotOutside);
		System.out.println("Customer first name: " + customerFirstName);
		System.out.println("Street adress: " + streetAdress);
		
		availablePlaneSeats = availablePlaneSeats - 2;
		availablePlaneSeats -= 2;
		System.out.println(availablePlaneSeats);
		
		costOfGroceries += 2.15;
		System.out.println(costOfGroceries);
		
		middleInitial = 'C';
		System.out.println(middleInitial);
		
		isHotOutside = !isHotOutside;
		System.out.println(isHotOutside);
		
		String fullName = (customerFirstName +" "+ middleInitial +" Morbius");
		System.out.println(fullName);
		
		String customer = ("This is " + fullName + ", " + "who lives at " + streetAdress);
		System.out.println(customer);
	}

}
