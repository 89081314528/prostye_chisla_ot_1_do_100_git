package com.company;
/**
 * метод, который создает массив с простыми числами от 1 до 100 и печатает его
 * посчитать, сколько времени работает программа
 * создать массиив со временами заполнения числами от 2 до 2, 2 до 3...2 до 200.
 * сохранить его в csv файл, выгрузть его  в эксель, и построить график зависимости времени от количества простых чисел
 * c временем работы: создать массив с -1, е его временами работы с шагом 10000, создать новый массив из не -1 и
 * распечатать. вынести это в метод (метод, который возвращает массив с временами) и распечатать в мэйне.
 * сохранять шаги в гите.
 * придумать задачу с десятью простыми шагами и соранить каждый шаг в гит.
 */
public class Main {

    public static void main(String[] args) {
        int chisloEnd = 30000;
        int step = 10000;
        long[] massivTime = new long[chisloEnd];
        for (int i = 1; i < chisloEnd; i += step) {
             long timeStart = System.currentTimeMillis();
//            System.out.println("Время начала работы программы " + timeStart);
            printMassivProstyhChisel(i);
            long timeFinish = System.currentTimeMillis();
//            System.out.println("Время окончания работы программы " + timeFinish);
            System.out.println("Время работы программы " + (timeFinish - timeStart));
            massivTime[i] = timeFinish - timeStart;
        }
        System.out.println("Массив с временем нахождения простых чисел от 1 до " + chisloEnd + " с шагом " + step);
        for (int i = 1; i < chisloEnd; i += step) {
            System.out.print(massivTime[i] + " ");
        }
    }

    public static void printMassivProstyhChisel(int chislo) {
        int count = 0;
        int[] massiv = new int[chislo];
        for (int i = 2; i < chislo; i++) {
            int b = 0;
            for (int a = 2; a < i; a++) {
                if (i % a == 0) {
                    b = b + 1;
                }
            }
            if (b == 0) {
                massiv[i] = i;
//                System.out.println(i);
                count = count + 1;
//            } else {
//                massiv[i] = 0;
            }
//            System.out.println(massiv[i]);
        }
        System.out.println("количество простых чисел от 1 до " + chislo + " равно " + count);
        int[] massivProstyh = new int[count];
        int b = 0;
        for (int i = 0; i < chislo; i++) {
            if (massiv[i] > 0) {
                massivProstyh[b] = massiv[i];
//                System.out.println(massivProstyh[b]);
                b = b + 1;
            }
        }
        for (int i = 0; i < count; i++) {
//            System.out.print(massivProstyh[i] + " ");
        }
        System.out.println();
    }
}



