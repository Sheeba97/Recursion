import java.util.Scanner;

public class BabylonianMethod {
	//int a = 10; => instance variable or class variable: scope is within the class
 public static void main(String[] args){
	 Scanner kb = new Scanner (System.in);
	 double x, error, initalGuess; //local variable => inside the method where they have been declared
	 
	 System.out.print("Enter the number you want to take a square root of: ");
	 x = kb.nextDouble();
	 System.out.print("Enter how much error you are going to tolerate:");
	 error = kb.nextDouble();
	 System.out.println("Enter your intial guess:");
	 initalGuess = kb.nextDouble();
	 
	 
	 double diff = x - (initalGuess*initalGuess);
	 System.out.println(babylonian(x,error,initalGuess));
 }
 public static double babylonian(double x, double error, double initalGuess){
	double nextGuess = 0;
	double difference = x - (initalGuess*initalGuess);
	double absVal = abs(difference);
	if(absVal <= error)
		return initalGuess;
	else{
		System.out.println("values = "+0.5*(initalGuess+x/initalGuess));
		return babylonian(x,0.5*(initalGuess+x/initalGuess), error);
	}
 }
 
 public static double abs(double absVal){
	 if(absVal < 0){
		 absVal = absVal*-1;
		 return absVal;
	 }
	 else 
		 return absVal;
 }
}
