class Exception {
    public static void main(String args[]) {
        int num1,num2;
        try {
            num1=0;
            num2=62/num1;
            System.out.println(num2);
        }
        catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero "+e);
        }
        
        try {
            int a[]=new int[5];
            a[10]=50;
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array is out of Bounds "+e);
        }
   
        try {
            String s="xyz";
            int i=Integer.parseInt(s);
        }
        catch(NumberFormatException e) {
            System.out.println("Number Format Exception is occurred "+e);
        }
        
        try {
            String s=null;
            System.out.println(s.length());
        }
        catch(NullPointerException e) {
            System.out.println("Null Pointer Exception is occurred "+e);
        }
        System.out.println("Out of try-catch block...");
    }
}
