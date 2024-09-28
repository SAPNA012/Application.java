package basicJava.org.com;
import java.util.*;

public class Application {
	
int num=10;



	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Application a=new Application();
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=input.nextInt();
		
		System.out.println("Enter the number2");
		
		int num2 = input.nextInt();
		int sum=num+num2;
		
		System.out.println(sum);
		
		System.out.println("Enter the name:");
		input.nextLine();
		String str=input.nextLine();
		
		System.out.println(str);
	
		
		
		
		
		
	}

}
