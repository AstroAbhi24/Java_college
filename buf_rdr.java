//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.io.*;

class Employee{
	String name;
	int age, id;
	Employee (String name, int age, int id){
		this.name = name;
		this.age = age;
		this.id = id;
	}
	public void Display(){
		System.out.println("The name is - "+(this.name));
		System.out.println("The age is - "+(this.age));
		System.out.println("The id is - "+(this.id));
		
	}
}

public class buf_rdr{
	public static void main(String[] args)throws IOException{
		String name;
		int age, id;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name - ");
		name = reader.readLine();
		System.out.println("Enter the age - ");
		age = Integer.parseInt(reader.readLine());
		System.out.println("Enter the id - ");
		id = Integer.parseInt(reader.readLine());
		Employee emp = new Employee(name,age,id);
		emp.Display();
	}

}
