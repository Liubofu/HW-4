import com.sun.security.jgss.GSSUtil;

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
            System.out.println("На улице " + temperature + " градус, нужно надеть шапку.");
        } else {
            System.out.println("На улице тепло, можно не одевать шапку.");
        }

        System.out.println("Задача 3");

        int speed = 75;
        if (speed > 60) {
            System.out.println("Если скорость превышает 60 км в час, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость меньше или равна 60 км в час, можно ехать спокойно.");
        }
        int speed2 = 45;
        if (speed2 <= 60) {
            System.out.println("Если скорость меньше или равна 60 км в час, можно ехать спокойно.");
        } else {
            System.out.println("Если скорость превышает 60 км в час, то придется заплатить штраф.");
        }

        System.out.println("Задача 4");

        int agePerson = 23;
        if (agePerson >= 2 && agePerson <=6) {
            System.out.println("Ему нужно ходить в детский сад.");
        } else if (agePerson >= 7 && agePerson <= 17) {
            System.out.println("Ему нужно ходить в школу.");
        } else if (agePerson >= 18 && agePerson <= 24) {
            System.out.println("Вам нужно ходить в университет.");
        } else if (agePerson > 24) {
            System.out.println("Ему нужно ходить на работу.");
        }

        System.out.println("Задача 5");

        int childAge = 3;
        if (childAge < 5) {
            System.out.println("Возраст ребенка " + childAge + " ему нельзя кататься на аттракционе.");
        }
        int childAge2 = 13;
        if (childAge2 > 5 && childAge2 <= 14) {
            System.out.println("Возраст ребенка " + childAge2 + " лет, ему можно кататься только в сопровождении взрослого.");
        }
        int childAge3 = 15;
        if (childAge3 > 14) {
            System.out.println("Ребенку " + childAge3 + " лет, ему можно кататься без сопровождения взрослого.");
        }

        System.out.println("Задача 6");

        int places = 102;
        int sitPlaces = 60;
        int passengers = 75;
        if (passengers < 60) {
            System.out.println("Есть сидячие месты.");
        } else if (passengers < 102) {
            System.out.println("В вагоне есть стоячие места, но нет сидячих.");
        } else {
            System.out.println("Вагон полон, свободных мест нет.");
        }

        System.out.println("Задача 7");

        int a = 10;
        int b = 25;
        int c = 15;
        if (a >= b && a >= c) {
            System.out.println("a - наибольшее число");
        } else if (b >= a && b >= c) {
            System.out.println("b - наибольшее число");
        } else {
            System.out.println("c - наибольшее число");
        }
    }
}


