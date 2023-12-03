import java.util.Scanner;

class Employee
{
    int id;
    long mobile_no;
    String name,mail_id,address;
    Scanner sc=new Scanner(System.in);

    void getdata()
    {
        System.out.println("Enter name of employee:");
        name=sc.nextLine();
        System.out.println("Enter id of employee:");
        id=sc.nextInt();
        System.out.println("Enter mobile number:");
        mobile_no=sc.nextLong();
        sc.nextLine();
        System.out.println("Enter mail id:");
        mail_id=sc.nextLine();
        System.out.println("Enter address of employee: ");
        address=sc.nextLine();
        System.out.println();
    }
    void display()
    {
        System.out.println("Employee name:"+name);
        System.out.println("Employee id:"+id);
        System.out.println("Mobile no:"+mobile_no);
        System.out.println("Mail id:"+mail_id);
        System.out.println("Address:"+address);
    }
}
class Programmer extends Employee
{
    double bp,da,hra,pf,club,net_salary,gross_salary;
    void programsalary()
    {
        System.out.println("Enter basic pay of Programmer:");
        bp=sc.nextDouble();

        da=(0.97*bp);
        hra=(0.10*bp);
        pf=(0.12*bp);
        club=(0.001*bp);
        gross_salary=(bp+da+hra);
        net_salary=(gross_salary-(pf+club));
        System.out.println("Gross Salary is:"+gross_salary);
        System.out.println("Net Salary is:"+net_salary);
    }
}
class Teamlead extends Employee
{
    double bp,da,hra,pf,club,net_salary,gross_salary;
    void teamleadsalary()
    {
        System.out.println("Enter basic pay of Team leader:");
        bp=sc.nextDouble();

        da=(0.97*bp);
        hra=(0.10*bp);
        pf=(0.12*bp);
        club=(0.001*bp);
        gross_salary=(bp+da+hra);
        net_salary=(gross_salary-(pf+club));
        System.out.println("Gross Salary is:"+gross_salary);
        System.out.println("Net Salary is:"+net_salary);
    }
}
class Asstpromanager extends Employee
{
    double bp,da,hra,pf,club,net_salary,gross_salary;
    void asstprosalary()
    {
        System.out.println("Enter basic pay of Assistant project manager:");
        bp=sc.nextDouble();

        da=(0.97*bp);
        hra=(0.10*bp);
        pf=(0.12*bp);
        club=(0.001*bp);
        gross_salary=(bp+da+hra);
        net_salary=(gross_salary-(pf+club));
        System.out.println("Gross Salary is:"+gross_salary);
        System.out.println("Net Salary is:"+net_salary);
    }
}
class Projectmanager extends Employee
{
    double bp,da,hra,pf,club,net_salary,gross_salary;
    void promanagersalary()
    {
        System.out.println("Enter basic pay of Project manager:");
        bp=sc.nextDouble();

        da=(0.97*bp);
        hra=(0.10*bp);
        pf=(0.12*bp);
        club=(0.001*bp);
        gross_salary=(bp+da+hra);
        net_salary=(gross_salary-(pf+club));
        System.out.println("Gross Salary is:"+gross_salary);
        System.out.println("Net Salary is:"+net_salary);
    }
}
public class Salary
{
    public static void main(String[] args)
    {
        int ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("\n1.Programmer Salary \n2.Teamlead Salary \n3.Assistant Projract Manager Salary \n4.Project Manager Salary\n");
        System.out.println("Enter your choice:");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            Programmer obj1=new Programmer();
            obj1.getdata();
            obj1.display();
            obj1.programsalary();
            break;

            case 2:
            Teamlead obj2=new Teamlead();
            obj2.getdata();
            obj2.display();
            obj2.teamleadsalary();
            break;

            case 3:
            Asstpromanager obj3=new Asstpromanager();
            obj3.getdata();
            obj3.display();
            obj3.asstprosalary();
            break;

            case 4:
            Projectmanager obj4=new Projectmanager();
            obj4.getdata();
            obj4.display();
            obj4.promanagersalary();
            break;

            default:
            break;
        }
    }    
}