//Arithmetic Operations of two Complex Numbers 

import java.util.Scanner;

public class Complex {
    public static void main(String[] args) {
        int a1,a2,b1,b2,a,b;
        char operator;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first complex number: a+bi");
        System.out.print("\ta: ");
        a1=sc.nextInt();

        System.out.print("\tb: ");
        b1=sc.nextInt();

        System.out.println("Enter second complex number: a+bi");
        System.out.print("\ta: ");
        a2=sc.nextInt();

        System.out.print("\tb: ");
        b2=sc.nextInt();

        System.out.println("Choose an operator : +, -, *, or /");
        operator =sc.next().charAt(0);

        switch (operator) {
            case '+':
               a=a1+a2;
               b=b1+b2;
               System.out.format("Addition of complex no. is: \n[(%d+%di)+(%d+%di)]=(%d+%di)",a1,b1,a2,b2,a,b);
               break;

            case '-':
               a=a1-a2;
               b=b1-b2;
               System.out.format("Substraction of complex no. is: \n[(%d+%di)-(%d+%di)]=(%d+%di)",a1,b1,a2,b2,a,b);
               break;
            
            case '*':
               a=(a1*a2)-(b1*b2);
               b=(a1*b2)+(b1*a2);
               System.out.format("Multiplication of complex no. is: \n[(%d+%di)*(%d+%di)]=(%d+%di)",a1,b1,a2,b2,a,b);
               break;

            case '/':
               a=a1/a2;
               b=b1/b2;
               System.out.format("Division of complex no. is: \n[(%d+%di)/(%d+%di)]=(%d+%di)",a1,b1,a2,b2,a,b);
               break;

            default:
               System.out.println("Invalid Operator");
               break;
        }
        sc.close();
    }    
}
