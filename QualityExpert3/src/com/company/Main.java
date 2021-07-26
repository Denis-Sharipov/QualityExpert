package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите кол-во циклопов:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(reader.readLine());
        int[] cyclops = new int[k];
        System.out.println("Введите диоптирии циклопов:");
        for (int i = 0; i < k; i++) {
            System.out.println("Введите диоптрии " + (i + 1) + "-го циклопа");
            cyclops[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println("Минимальное количество пар линз: " + lenses(k, cyclops));
    }

    private static int lenses(int k, int[] cyclops) {
        int minPares = 0; //Переменная для кол-ва пар линз.
        Arrays.sort(cyclops); //Сортировка массива по возрастанию.
        for (int i = 1; i < cyclops.length; i++) { //Цикл прохождения по значениям элементов массива.
            for (int j = i + 1; j < cyclops.length; j++) { //Цикл для сравнения значений эл-тов массива со всеми остальными значениями, перед ним.
                if (cyclops[i] != 0 && cyclops[j] != 0 && Math.abs(cyclops[i]-cyclops[j]) == 0){ //Условие: если 2 значения эл-тов массива не равны нулю, и их разность по модулю равна 0, то заполняется счётчик, а значения массива обнуляются.
                    minPares++;
                    cyclops[i] = 0;
                    cyclops[j] = 0;
                }
            }
            for (int j = i + 1; j < cyclops.length; j++) {
                if (cyclops[i] != 0 && cyclops[j] != 0 && Math.abs(cyclops[i]-cyclops[j]) == 1){ //Условие: если 2 значения эл-тов массива не равны нулю, и их разность по модулю равна 1, то заполняется счётчик, а значения массива обнуляются.
                    minPares++;
                    cyclops[i] = 0;
                    cyclops[j] = 0;
                }
            }
            for (int j = i + 1; j < cyclops.length; j++) {
                if (cyclops[i] != 0 && cyclops[j] != 0 && Math.abs(cyclops[i]-cyclops[j]) == 2){ //Условие: если 2 значения эл-тов массива не равны нулю, и их разность по модулю равна 2, то заполняется счётчик, а значения массива обнуляются.
                    minPares++;
                    cyclops[i] = 0;
                    cyclops[j] = 0;
                }
            }
            if (cyclops[i] != 0){ //Счётчик пополняется за счёт элементов, которым не досталось пары.
                minPares++;
            }
        }
        return minPares; //Кол-во пар линз.
    }
}
