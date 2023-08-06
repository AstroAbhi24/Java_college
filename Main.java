class cal{
    public int age;
    void ageCalc(){
//        int x;
        System.out.println(age+10);
    }
}


public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        cal a = new cal();
        a.age = 100;
        a.ageCalc();
    }
}