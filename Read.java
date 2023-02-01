/*there are 4 ways to read input from console in java
1. Using Buffered reader class
2. Using Scanner class
3. Using Console class
4. Using Command line Argument*/

//using Buffered reader class

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Read{
    public static void main(String[] args) throws IOException{
        //Enter data using Buffered Reader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //reading data useing readLine
        String name = reader.readLine();

        //printing the read line
        System.out.println(name);
        
    }
}*/







/*import java.util.Scanner;

class Read{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        System.out.println("your entered number is "+ " "+ number);
    }
}*/

/*import java.util.Scanner;
class Read{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number");
        double num2 = sc.nextDouble();
        double num3 = num1*num2;
        System.out.println("result=" + " "+ num3);

    }
}*/

/*class Read{
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int temp;
        int c;
        temp =a;
        a = b;
        b = temp;
        System.out.println(a +" " + b);
    }
}*/

/*import java.io.*;

class Read{
    static void swapValues(int m, int n){
        
        m = m^n;
        n= m^n;
        m= m^n;
        System.out.println("the value of m is "+ " "+ m+" " +  "the value of n is " + " "+ n);
    }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("enter  value of m");
        //int m = 9, n =5;
        swapValues(9,5);
    }
}*/

class Read{
    int real, image;
    
    public Read(int r, int i){
        this.real = r;
        this.image= i;
    }

    public void showC(){
        System.out.println(this.real +" "+ "+i"+ this.image);
    }

    public static Read add(ComplexNumber n1, ComplexNumber n2){

    }
}