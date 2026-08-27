package oop.assigment_problems;
import java.util.Scanner;

class Payroll{
    double basicSalary;
    double bonus;
    int percent;
    Payroll(double basicSalary){
           if(basicSalary<0){
            basicSalary=0;
        }
        this.basicSalary=basicSalary;
    }
    void creditBonus(double amount){
        if(amount<=0){
            System.out.println("Rejected");
            return;
        }
        else{
            bonus=amount;
        }
    }
    void deductTax(double percent){
        if(percent<0||percent>100){
            System.out.println("Rejected");
        }
        else{
            this.percent = (int) percent;
            basicSalary=basicSalary-((percent/100)*basicSalary);
        }
    }
    void getNetSalary(){
        System.out.println("Bonus credited: Rs "+bonus+"\nTax Deducted: "+percent+"\nNet Salary: "+(basicSalary+bonus));
    }
}



public class PayrollAccount {
    public static void main(String[]args){   
    Scanner sc=new Scanner(System.in);
    Payroll p1=new Payroll(50000);
    p1.creditBonus(5000);
    p1.deductTax(10);
    p1.getNetSalary();

}
}
