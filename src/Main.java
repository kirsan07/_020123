import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        if (one ==1 & two != 1 & three != 1){
            System.out.println("true");
        }
        else if (one !=1 & two == 1 & three != 1){
            System.out.println("true");
        }
        else if (one !=1 & two != 1 & three == 1){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}