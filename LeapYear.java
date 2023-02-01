import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to check if it is leap year or not");
        int x = sc.nextInt();
        int y = x%4;
        if(y==0){
            System.out.println(x+ " "+"is a leap year");
        }
        else
        System.out.println(x+ " "+ "is not a leap year");
    }
    
}
