package Homework1;

import java.util.ArrayList;
import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        
        lets_go();

    }

    public static void task1() {

        System.out.println("Задача №1:\nВычислить n-ое треугольного число(сумма чисел от 1 до n)");
        System.out.println("Введите число n: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int res = 0;
        for (int i = 1; i <= num; i++) {
            res += i;
        }
        System.out.println(res);
        // input.close();
    }

    public static void task2() {

        System.out.println("Задача №2:\nВычислить n! (произведение чисел от 1 до n)");
        System.out.println("Введите число n: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }
        System.out.println(res);
        // input.close();
    }

    public static void task3() {

        System.out.println("""
                Задача №3:\nВывести все простые числа от 1 до 1000 (простые числа - это числа которые
                делятся только на себя и на единицу без остатка.
                Чтобы найти остаток от деления используйте оператор % , например 10%3 будет
                равно единице)\n""");
        ArrayList<Integer> res = new ArrayList<Integer>();

        boolean b = true;
        for (int j = 2; j <= 1000; j++) {
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b)
                res.add(j);
            else
                b = true;
        }

        for (Integer person : res) {

            System.out.println(person);
        }
    }

    public static void task4() {
        Scanner input = new Scanner(System.in);
        System.out.println("Задача №4:\nРеализовать простой калькулятор ");

        System.out.println("Введите первое число: ");
        int num1 = input.nextInt();

        System.out.println("Введите второе число: ");
        int num2 = input.nextInt();

        System.out.println("""
                Укажите операцию, которую надо выполнить с этими числами,
                введите цифру которая соответствует нужно операции:
                1 - для прибавления(+) ;
                2 - для вычитания(-) ;
                3 - для умножения(*) ;
                4 - для деления(/) .
                """);

        int operator = input.nextInt();
        int res = 0;
        if (operator == 1) {
            res = num1 + num2;
            System.out.println(res);
        } else if (operator == 2) {
            res = num1 - num2;
            System.out.println(res);
        } else if (operator == 3) {
            res = num1 * num2;
            System.out.println(res);
        } else if (operator == 4) {
            if (num2 == 0) {
                System.out.println("Нельзя делить на ноль!!!");
            } else {
                res = num1 / num2;
                System.out.println(res);
            }

        }
        // input.close();
    }


 public static void lets_go() {
    Scanner input = new Scanner(System.in);
        while (true) {

            System.out.println("""
                    \n\nДоброго времени суток!!!\n
                    Выберите задачу для проверки:\n
                    \t1) Вычислить n-ое треугольного число(сумма чисел от 1 до n)
                    \t2) Вычислить n! (произведение чисел от 1 до n)
                    \t3) Вывести все простые числа от 1 до 1000 (простые числа - это числа которые
                    \tделятся только на себя и на единицу без остатка.
                    \tЧтобы найти остаток от деления используйте оператор % , например 10%3 будет
                    \tравно единице)
                    \t4) Реализовать простой калькулятор.
                    \n>>>> Для выхода введите: 0 <<<<
                    \nвведите номер задачи от 1 до 4 для проверки:

                    """);
            int number = input.nextInt();
           
            if (number == 1) {
                task1();
            } else if (number == 2) {
                task2();
            } else if (number == 3) {
                task3();
            } else if (number == 4) {
                task4();
            } else if (number == 0) {
                System.out.println("""
                    \nАнекдот напоследок: \n\n
                1 монитор - обычный программист, 2 монитора - продвинутый программист, \n
                3 монитора - системный программист, 4 монитора - охранник.\n
                """);
                input.close();
                break;
            }
            else {
                System.out.println("Введите !правильный! номер (от 1 до 4), попробуйте ещё раз...");
            }
        }
}
}

/*
 * 1) Вычислить n-ое треугольного число(сумма чисел от 1 до n)
 * 2) Вычислить n! (произведение чисел от 1 до n)
 * 3) Вывести все простые числа от 1 до 1000 (простые числа - это числа которые
 * делятся только на себя и на единицу без остатка.
 * Чтобы найти остаток от деления используйте оператор % , например 10%3 будет
 * равно единице)
 * 4) Реализовать простой калькулятор ("введите первое число"...
 * "Введите второе число"...
 * "укажите операцию, которую надо выполнить с этими числами"... "ответ: ...")
 * 5+) Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть
 * заменены знаком вопроса, например 2? + ?5 = 69. Требуется восстановить
 * выражение до верного равенства. Предложить хотя бы одно решение или сообщить,
 * что его нет.
 */
