package ru.skypro;


public class Main {
    public static void main(String[] args) {
        HomeWork4Easy1();
        HomeWork4Easy2();
        HomeWork4Easy3();
//  HomeWork4Hard6();
//  HomeWork4Hard7();
    }

    public static void HomeWork4Easy1() {
        System.out.println("HomeWork4. Exercise 1.");
        int number = 0;
        while (number <= 10) {
            number++;
            if (number == 10) {
                System.out.println(number);
                break;
            }
            System.out.print(number + " ");
        }
        for (; number > 0; number--) {
            if (number == 1) {
                System.out.print(number);
                break;
            }
            System.out.print(number + " ");
        }
    }

    public static void HomeWork4Easy2() {
        System.out.println();
        System.out.println("HomeWork4. Exercise 2.");
        int firstFriday = 4;  //Введите значение от 1 до 7 соответствующие дню первой пятницы в месяце
                              //    month = 31;
            for ( int currentFriday = firstFriday; currentFriday <= 31; currentFriday += 7) {
                     System.out.println("Сегодня пятница, " + currentFriday + " -е число. Необходимо подготовить отчет.");

            }
        }

    public static void HomeWork4Easy3() {
        System.out.println("HomeWork4. Exercise 3.");
        int currentYear = 2021;
        int beginning = currentYear - 200;
        int ending =  currentYear + 100;
        for ( int i = beginning; i < ending; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
}
