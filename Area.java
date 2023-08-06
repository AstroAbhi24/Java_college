import java.util.Scanner;
class ar {
    public int l,b;
    void setDim(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length - ");
        l = sc.nextInt();
        System.out.print("Enter the breadth - ");
        b = sc.nextInt();
    }
    void getArea(){
        int area = l*b;
        System.out.println("The area is - "+area+" sq units");
    }
}

public class Area {
    public static void main(String[] args){
        ar x = new ar();
        x.setDim();
        x.getArea();
    }
}