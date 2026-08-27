package oop.assigment_problems;

class employeeStatic{
    String empName;
    double salary;
    static String companyName="Bright Horizon Technologies";
    static int count; 
    employeeStatic(String empName,double salary){
        this.empName=empName;
        this.salary=salary;
        count++;
    }
    static void printCompanyInfo(){
        System.out.println(companyName);
        System.out.println("Employees on record: "+count);
    }

}
public class Static {
    public static void main(String[] args) {
        employeeStatic e1=new employeeStatic("Radha", 25000);
        employeeStatic e2=new employeeStatic("Sadique", 500000);
        employeeStatic e3=new employeeStatic("Shyaam",20000);
        employeeStatic.printCompanyInfo();
    }
    
}
