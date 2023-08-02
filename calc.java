import java.util.Scanner;

class Calculate{
	void addition(int a, int b){
		System.out.println("The addition of" +a+" "+b+" is"+(a+b));
	}
	void subtraction(int a, int b){
		System.out.println("The subtraction of" +a+" "+b+" is"+(a-b));
	}
	void multiplication(int a, int b){
		System.out.println("The multiplication of" +a+" "+b+" is"+(a*b));
	}
	void division(int a, int b){
		System.out.println("The division of" +a+" "+b+" is"+(a/b));
	}
	
}


public class calc{
	public static void main(String[] args){
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st num - ");
		a = sc.nextInt();
		System.out.print("Enter the 2nd num - ");
		b = sc.nextInt();
		Calculate c = new Calculate();
		c.addition(a,b);
		c.subtraction(a,b);
		c.multiplication(a,b);
		c.division(a,b);
	}

}
