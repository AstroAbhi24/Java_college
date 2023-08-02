import java.util.Scanner;

class Average{
	void cal_avg(int a, int b, int c){
		float av = (a+b+c)/3;
		System.out.println("The average of "+ a + " " + b + " " + c +" is - " + av);
	}

}



public class avg{
	public static void main(String[] args){
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st no. - ");
		a = sc.nextInt();
		System.out.print("Enter the 2nd no. - ");
		b = sc.nextInt();
		System.out.print("Enter the 3rd no. - ");
		c = sc.nextInt();
		Average x = new Average();
		x.cal_avg(a,b,c);
	}
}
