import java.util.Scanner;

class pal{
	public void chk_pal(int a){
		int c = a;
		int b = 0;
		while(a>0){
			b = b*10 + a%10;
			a/=10;
		}
		if(b == c){
			System.out.println("Its is a palindome");
		}
		else{
			System.out.println("It is not a palindrome number.");
		}
	}

}

public class palindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int an = sc.nextInt();
		pal obj = new pal();
		obj.chk_pal(an);
		
	}

}
