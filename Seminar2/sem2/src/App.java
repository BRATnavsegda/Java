import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public static int GetNumber() {
        Scanner numberS = new Scanner(System.in);
        int number;
        while (true) {
            try {
                System.out.println("Введите число: ");
                number = numberS.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Ошибка ввода");
            }
        }
        return number;
    }

    public static String GetString() {
        Scanner str = new Scanner(System.in);
        String equation;
        System.out.print("Введите формулу");
        equation = str.next();
        return equation;

    }
    
}
