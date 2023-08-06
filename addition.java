class Addit{
	public int a,b;
	public void add() {
		int s = a+b;
		System.out.println("The sum is "+ s);
	}
}

class addition {
	public static void main(String[] args){
		Addit obj = new Addit();
		obj.a = 10;
		obj.b = 20;
		obj.add();
	}

} 
