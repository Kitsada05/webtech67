import java.util.Scanner;

class Dept1{
    int ministryBudget;
    int educationfee;
    int servicefee;
    int donation;
    int salary;
    int electricity;
    int educationalcost;
    int income = 0;
    int expense = 0;
    Dept1(int staff,int students){
        this.computeIncome(staff,students);
        this.expense = computeExpense(staff, students);
        this.income = computeIncome(staff, students);
        System.out.println("total income = "+this.income);
        System.out.println("total expense = "+this.expense);
        System.out.println("income "+"-"+"; expense = "+(this.income-this.expense));
    }
    int computeIncome(int staff,int students){
        this.ministryBudget = (staff*500000)+(students*3000);
        this.educationfee = students*5000;
        this.servicefee = 300000;
        this.donation = 100000;
        int sum = (staff*500000)+(students*3000)+(students*5000)+300000+100000;
        return sum;
    }
    int computeExpense(int staff,int students){
        this.salary = staff*600000;
        this.electricity = (staff+students)*2000;
        this.educationalcost = students*4000;
        int sum = (staff*600000)+((staff+students)*2000)+(students*4000);
        return sum;
    }
    void printReport(){
        System.out.println("ministry budget = "+this.ministryBudget);
        System.out.println("service fee = "+this.servicefee);
        System.out.println("education fee = "+this.educationfee);
        System.out.println("donation = "+this.donation);
        System.out.println("salary = "+this.salary);
        System.out.println("electricity = "+this.electricity);
        System.out.println("educational cost = "+this.educationalcost);
    }
}

public class Department2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int staff = sc.nextInt();
        int students = sc.nextInt();
        Dept1 a = new Dept1(staff, students);
        a.printReport();
    }
}
