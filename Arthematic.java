import java.util.Scanner;
public class Arthematic{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a and b values:");
	int a = sc.nextInt();
	int b = sc.nextInt();
		System.out.print("Enter your choice");
		int choice = sc.nextInt();
		switch(choice){
			case 1:
				System.out.println("Addition");
				System.out.println("a+b="+(a+b));
				break;
			case 2:
				System.out.println("Subtraction");
				System.out.print("a-b="+(a-b));
				break;
			case 3:
				System.out.println("Multiplication");
				System.out.print("a*b="+(a*b));			
				break;
			case 4:
				System.out.println("Division");
				System.out.print("a/b="+(a/b));			
 				break;
 			default:
 				System.out.print("Invalid operations");
 		}
 		sc.close();
 	  }
}
 
			
