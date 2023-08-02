import java.util.Scanner;

class Area{
	public int l,b;
	public void setDim(int a, int b){
		this.l = a;
		this.b = b;	
	}
	public void getArea(){
		int ar;
		ar = this.l*this.b;
		System.out.println("The area is - "+ar);
	}
}


public class rectangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("length - ");
		a = sc.nextInt();
		System.out.print("breadth - ");
		b = sc.nextInt();
		Area ar = new Area();
		ar.setDim(a,b);
		ar.getArea();
	}

}
