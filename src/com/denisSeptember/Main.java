package com.denisSeptember;

//   В массиве хранится информация о баллах, полученных спортсменом-
// десятиборцем в каждом из десяти видов спорта. Для выхода в следующий
// этап соревнований общая сумма баллов должна превысить некоторое
// известное значение. Определить, вышел ли данный спортсмен в
// следующий этап соревнований.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double minPoint = 0d;
        double point = 0d;

        System.out.print("Введите проходной бал ");
        minPoint = scanner.nextDouble();
        System.out.println(minPoint);

        for (int i = 0; i < 10; i++) {
            System.out.print("Ведите число балов спорт " + (i + 1) + " ");
            point = point + scanner.nextDouble();
        }

        System.out.println(point);

        point = point / 10;

        System.out.println("среднее арефметическое " + point);


        // Проверка на, вышел ли данный спортсмен в следующий этап соревнований.
        if (point >= minPoint) {

            System.out.println("вышел");

        } else {

            System.out.println("Не вышел");

        }


    }


}
