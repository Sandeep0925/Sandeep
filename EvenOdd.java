import java.util.Scanner;
public class EvenOdd {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        int c = x%2;
        if(x==0){
            System.out.println("this is neither even nor odd");
        }
        else {
        if(c==0){
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }
    }

    }

    
}
