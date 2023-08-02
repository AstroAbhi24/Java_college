class A {
	public double f;
	public void convert(double f){
		double c;
		c = (f-32)/(1.8);
		System.out.println(f + " F ==" + c + " C");
	}
}

public class temp{
	public static void main(String[] args){
		A obj = new A();
		obj.f = 200;
		obj.convert(obj.f);
	}
}
