//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int age = 20;
        if (age >= 18) {
            System.out.println("Человек совершеннолетний.");
        } else {
            System.out.println("Возвраст меньше 18, нужно немного подождать.");
        }

        int age2 = 15;
        if (age2 < 18) {
            System.out.println("Возвраст меньше 18, нужно немного подождать.");
        } else {
            System.out.println("Человек совершеннолетний.");
        }

        System.out.println("Задача 2");

        int temperature = 1;
        if (temperature < 5) {
            System.out.println("На улице 1 градус, нужно надеть шапку.");
        }
        int temperature2 = 7;
        if (temperature2 > 5) {
            System.out.println("На улице 7 градусов, можно идти без шапки.");
        }
        System.out.println("Задача 3");

        int speed = 75;
        if (speed > 60) {
            System.out.println("Если скорость превышает 60 км в час, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость меньше или равна 60 км в час, можно ехать спокойно.");
        }
        int speed2 = 45;
        if (speed2 < 60) {
            System.out.println("Если скорость меньше или равна 60 км в час, можно ехать спокойно.");
        } else {
            System.out.println("Если скорость превышает 60 км в час, то придется заплатить штраф.");
        }

        System.out.println("Задача 4");

        int agePerson = 23;
        if (agePerson >= 18 && agePerson <= 24) {
            System.out.println("Вам нужно ходить в университет.");
        }

        System.out.println("Задача 5");

        int childAge = 3;
        if (childAge < 5 ) {
            System.out.println("Возраст ребенка меньше 5 лет, можно кататься на аттракционе.");
        }
        int childAge2 = 13;
        if (childAge2 > 5 && childAge2 <= 14) {
            System.out.println("Возраст ребенка 13 лет, можно кататься только в сопровождении взрослого.");
        }
        int childAge3 = 15;
        if (childAge3 > 14) {
            System.out.println("Ребенок старше 14 лет, можно кататься без сопровождения взрослого.");
        }
        }
    }