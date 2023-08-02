class A {
	public void sum(int a, int b){
		int c = a+b;
		System.out.println("The sum is " + c);
	}
	public void sum(int a, int b, int c){
		int d = a+b+c;
		System.out.println("The sum is " + d);
	}
	public void sum(double a, double b){
		double c = a+b;
		System.out.println("The sum is " + c);
	}
	public void sum(int a){
		int c = a+a;
		System.out.println("The sum is " + c);
	}
	
}

public class mthd_overloading{
	public static void main(String[] args){
		A obj = new A();
		obj.sum(1 , 2);
		obj.sum(102.23 , 101.43);
		obj.sum(3, 5, 6);
		obj.sum(6);
	}

}
