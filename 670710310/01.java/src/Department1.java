import java.util.Scanner;

class Dept{
    int ministryBudget;
    int educationfee;
    int servicefee;
    int donation;
    Dept(int staff,int students){
        this.computeIncome(staff,students);
    }
    void computeIncome(int staff,int students){
        this.ministryBudget = (staff*500000)+(students*3000);
        this.educationfee = students*5000;
        this.servicefee = 300000;
        this.donation = 100000;
    }
    void printReport(){
        System.out.println("ministry budget = "+this.ministryBudget);
        System.out.println("education fee = "+this.educationfee);
        System.out.println("service fee = "+this.servicefee);
        System.out.println("donation = "+this.donation);
    }
}

public class Department1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int staff = sc.nextInt();
        int students = sc.nextInt();
        Dept1 a = new Dept1(staff, students);
        a.printReport();
    }
}
