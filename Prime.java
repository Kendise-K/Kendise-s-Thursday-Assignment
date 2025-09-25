import java.util.Scanner;
public class Prime {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = scanner.nextInt();
        while (num%2==0){
            System.out.println("The number is even");
            break;
        } while(num%2!=0){
            System.out.println("The number is odd");
            break;
        }

        scanner.close();
    }

}
