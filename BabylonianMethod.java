//Sheeba Kuriakose

// needed so user can input the values
import java.util.Scanner;

//public class
public class BabylonianMethod {

//main method
 public static void main(String[] args){
	 
	 //makes kb the variable we want to use to interact with keyboard so user can input
	 Scanner kb = new Scanner (System.in);
	 
	 //local variables inside the method where they have been declared
	 double x, error, initialGuess; 
	 
	 //message so user can input the right value and commands so user can input the values.
	 System.out.print("Enter the number you want to take a square root of: ");
	 x = kb.nextDouble();
	 System.out.print("Enter how much error you are going to tolerate:");
	 error = kb.nextDouble();
	 System.out.println("Enter your intial guess:");
	 initalGuess = kb.nextDouble();
	 
	 
	 double diff = x - (initalGuess*initialGuess);
	 System.out.println(babylonian(x,error,initialGuess));
 }
 
 //method for using the babylonian method to find square root
 //constructor to initialize babylonian
 //@param x, error, initialGuess
 public static double babylonian(double x, double error, double initialGuess){
	double nextGuess = 0;
	double difference = x - (initialGuess*initialGuess);
	double absVal = abs(difference);
	
	 //if absolute value is less than or equal to error
    // return initial guess
	if(absVal <= error)
		return initialGuess;
	//else return value using babylonian equation
	else{
		System.out.println("values = "+0.5*(initialGuess+x/initialGuess));
		return babylonian(x,0.5*(initialGuess+x/initialGuess), error);
	}
 }
 
 //method for absolute value
 public static double abs(double absVal){
	 if(absVal < 0){
		 absVal = absVal*-1;
		 return absVal;
	 }
	 else 
		 return absVal;
 }
}
