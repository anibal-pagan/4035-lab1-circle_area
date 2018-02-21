import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius of the circle: ");
		double radius = input.nextDouble();
		System.out.println("Its area is: " + circleArea(radius));
		System.out.println("Its half-area is: " + circleHalfArea(radius));
		input.close();
		
	}
	
	static double circleArea(double rad){
		
		return Math.PI*rad*rad;
		
	}
	
	static double circleHalfArea(double rad){
		
		return (Math.PI*rad*rad)/2;
		
	}
	
}
