public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int age = 9;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }

        int outsideAirTemperature = 1;
        if (outsideAirTemperature >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }

        int carSpeed = 61;
        if (carSpeed > 60) {
            System.out.println("Если скорость " + carSpeed + " , то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + carSpeed + " , то можно ездить спокойно");
        }

        int personAge = 24;
        if (personAge <= 6) {
            System.out.println("Если возраст человека равен " + personAge + " , то ему нужно ходить в детский сад");
        }
        if (personAge > 6 && personAge <= 17) {
            System.out.println("Если возраст человека равен " + personAge + " , то ему нужно ходить в школу");
        }
        if (personAge > 17 && personAge <= 24) {
            System.out.println("Если возраст человека равен " + personAge + " , то ему нужно ходить в университет");
        }
        if (personAge > 24) {
            System.out.println("Если возраст человека равен " + personAge + " , то ему нужно ходить на работу");
        }

        int childAge = 8;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + " , то ему нельзя кататься на аттракционе");
        } else if (childAge >= 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + " , то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + childAge + " , то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        int carriageCapacity = 102;
        int seatsInTheCarriage = 60;
        int numberOfPassengers = 100;
        if (numberOfPassengers < seatsInTheCarriage) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (numberOfPassengers > seatsInTheCarriage && numberOfPassengers <= carriageCapacity) {
            System.out.println(" В вагоне есть стоячие места");
        } else {
            System.out.println("В вагоне нет мест");
        }

        int one = 20;
        int two = 5;
        int three = 10;
        if (one > two && one > three) {
            System.out.println(one);
        } else if (two > one && two > three) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }


    }
}