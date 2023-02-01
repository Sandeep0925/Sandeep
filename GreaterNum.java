/*import java.io.*;
import java.util.Scanner;
class GreaterNum{
    static int biggestNumber(int x, int y, int z){
        if(x>=y && x>=z)
        return x;
        else if(y>=x && y>=z)
        return y;
        else
        return z;

    }
    public static void main(String[] args) {
        int a,b,c, largest;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        a = sc.nextInt();
        System.out.println("Enter the second number");
        b= sc.nextInt();
        System.out.println("Enter the third number");
        c = sc.nextInt();
        largest = biggestNumber(a,b,c);
        System.out.println(largest + " "+ "is the largest number");
    }
}*/

//Using Collections.max() method and ArrayList

/*import java.lang.*;
import java.util.*;

class GreaterNum{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the first number");
        a = sc.nextInt();
        System.out.println("Enter the second number");
        b= sc.nextInt();
        System.out.println("Enter the third number");
        c = sc.nextInt();

        ArrayList<Integer> sandeep = new ArrayList<>();
        sandeep.add(a);
        sandeep.add(b);
        sandeep.add(c);
        System.out.println(Collections.max(sandeep)+ " "+ "is the largest number");

    }
}*/

//Using ternary operator

