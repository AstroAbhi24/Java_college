import java.util.Scanner;

class Fibo{
	int a = -1;
	int b = 1;
	int c = a+b;
	void fib_series(int n){
		System.out.println("Fib series - ");
		for(int i=0; i<n; i++){	
			System.out.print(c+" ");
			a = b;
			b = c;
			c = a+b;
		}
	}
}



public class fib{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of terms of fib series - ");
		int var = sc.nextInt();
		Fibo x = new Fibo();
		x.fib_series(var);
	}
}
