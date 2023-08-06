import java.util.Scanner;
class batsman{
    int totalRuns, noOfInnings;
    batsman(){
        totalRuns = 0;
        noOfInnings = 0;
    }
    public void runs_and_innings(int runs){
        totalRuns+=runs;
        noOfInnings++;
        System.out.println("The batsman scored "+totalRuns+" in "+noOfInnings+" innings");
    }

}

class bowler{
    int runsGiven, noOfInnings, noOfWickets;
    public void runs_and_wickets(int runsToAdd, int wicketsToAdd){
        runsGiven+=runsToAdd;
        noOfWickets+=wicketsToAdd;
        noOfInnings++;
        System.out.println("The bowler took "+noOfWickets+" and gave "+runsGiven+" in "+noOfInnings+" innings.");
    }
}

public class cricket {
    public static void main(String[] args) {
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        batsman b = new batsman();
        System.out.print("Enter the runs of the batsman - ");
        x = sc.nextInt();
        b.runs_and_innings(x);
        bowler c = new bowler();
        System.out.print("Enter the runs given by bowler - ");
        y = sc.nextInt();
        System.out.print("Enter the wickets taken - ");
        z = sc.nextInt();
        c.runs_and_wickets(y,z);
    }

}
