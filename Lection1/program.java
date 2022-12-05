package Lection1;

/**
 * program
 */
public class program {

    public static void main(String[] args) {
        int i = -1;                  // _ это разделитель для наглядности
        System.out.println("Hi people"); // sys и затем выбираем out
        int b = --i - i--; // =0
        int c = i-- - --i; // =2
        System.out.println(b);
        System.out.println(c);
    }
}