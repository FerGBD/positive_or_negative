import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the number:");
        int n = sc.nextInt();
            if(n > 0){
                System.out.println("This number is positive");
            }else{
                System.out.println("This number is negative");
            }
    }
}