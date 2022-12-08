package Homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        // task1();
        // 
        task3();
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
        input.close();
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
        input.close();
    }

    public static void task3() {

        System.out.println("""
                Задача №3:\nВывести все простые числа от 1 до 1000 (простые числа - это числа которые
                делятся только на себя и на единицу без остатка.
                Чтобы найти остаток от деления используйте оператор % , например 10%3 будет
                равно единице)\n""");
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        for (int i = 2; i <= 1000; i++) {
            if (i % i == 0) {
                break;
            }
            else {
                res.add(i);
            } 
        }
        

        for (Integer person : res) {

            System.out.println(person);
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
