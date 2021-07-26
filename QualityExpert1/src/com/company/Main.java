package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите число X:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strX = reader.readLine();
        int x = Integer.parseInt(strX);
        int sum = sumPr(x);
        System.out.println("Cумма всех простых чисел, не превышающих число X: " + sum);
    }

    private static int sumPr(int x){ //Функция для вычисления суммы простых чисел, не превышающих X.
       int sum = 0;
       a:
            for (int i = 2; i <= x; i++){ //Цикл-счётчик для простых чисел от 2 (так как 1 - не простое число) до X включительно.
                for (int j = 2; j < i; j++){ //Цикл для проверки, является ли число простым.
                    if (i%j==0){
                        continue a; //В случае, если число не является простым, то внешний цикл переходит на новое значение.
                    }
                }
                sum+=i;
            }
       return sum;
    }
}
