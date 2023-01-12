import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        // использовали next() чтобы записать ввод в одну строку
        String one = scanner.next();
        String two = scanner.next();
        String three = scanner.next();
        // для решения используем регулярное выражение
        // указали диапазон с 1 до 9, т.к. было условие если ввод больше 0
        String regex = "[1-9]"; 
        // использовали сравнение matches()
        if (one.matches(regex) & !two.matches(regex) & !three.matches(regex)){
            System.out.println("true");
        }
        else if (!one.matches(regex) & two.matches(regex) & !three.matches(regex)){
            System.out.println("true");
        }
        else if (!one.matches(regex) & !two.matches(regex) & three.matches(regex)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
