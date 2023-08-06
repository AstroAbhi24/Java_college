import java.util.Scanner;

class student{
    void stud_details(){
        System.out.println("----------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name - ");
        String name = sc.next();
        System.out.print("Enter the roll - ");
        int roll_no = sc.nextInt();
        System.out.print("Enter the ygpa - ");
        double ygpa = sc.nextDouble();

    }

}

public class ygpa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of students - ");
        int a = sc.nextInt();
        for(int i=0; i<a; i++){
            student st = new student();
            st.stud_details();
        }
    }
}
