public class Main {

    public static void main(String[] args) {

        // ДЗ-1 Задание 1
        int age = 18;
        if (age >= 18) {
            System.out.println("Поздравляем Вас с совершеннолетием!");
        }
        if (age < 15) {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать!");
        }
        // ДЗ-1 Задание 2
        if (age >= 7 && age < 10) {
            System.out.println("Ребенок ходит в школу!");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет!");
        }
        if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу!");
        }
        // ДЗ-1 Задание 3
        int waggonPlaces = 102;
        int seating = 60;
        int standing = waggonPlaces - seating; // Стоячие места
        int seatingUsed = 24;
        int standingUsed = 24;
        if (seatingUsed < seating) {
            System.out.println("Есть еще " + (seating - seatingUsed) + " сидячих мест!");
        }
        if (seatingUsed == seating) {
            System.out.println("Сидячих мест нет");
        }
        if (standingUsed < standing) {
            System.out.println("Есть еще " + (standing - seatingUsed) + " стоячих мест!");
        }
        if (seatingUsed == seating) {
            System.out.println("Стоячих мест нет");
        }
        // ДЗ-2 Задание 1
        int ageA = 25;
        if (ageA >= 18) {
            System.out.println("Поздравляем Вас с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать!");
        }
        // ДЗ-2 Задание 2
        if (ageA >= 7 && ageA < 10) {
            System.out.println("Ребенок ходит в школу!");
        } else if (ageA >= 18 && ageA < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет!");
        } else if (ageA >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу!");
        }
        // ДЗ-2 Задание 3
        int waggonPlacesA = 102;
        int seatingA = 60;
        int standingA = waggonPlaces - seating; // Стоячие места
        int seatingUsedA = 11;
        int standingUsedA = 11;
        if (seatingUsedA < seatingA) {
            System.out.println("Есть еще " + (seatingA - seatingUsedA) + " сидячих мест!");
        } else {
            System.out.println("Сидячих мест нет");
        }
        if (standingUsedA < standingA) {
            System.out.println("Есть еще " + (standingA - seatingUsedA) + " стоячих мест!");
        } else {
            System.out.println("Стоячих мест нет");
        }
        // ДЗ-3 Задание 1
        int ageB = 17;
        if (ageB >= 2 && ageB <= 6) {
            System.out.println("Если возраст человека равен " + ageB + ", то ему нужно ходить в детский сад!");
        } else if (ageB > 6 && ageB <= 18) {
            System.out.println("Если возраст человека равен " + ageB + ", то ему нужно ходить в школу!");
        } else if (ageB > 18 && ageB <= 24) {
            System.out.println("Если возраст человека равен " + ageB + ", то ему нужно ходить в университет!");
        } else if (ageB > 24) {
            System.out.println("Если возраст человека равен " + ageB + ", то ему нужно ходить на работу!");
        }
        // ДЗ-3 Задание 2
        if (ageB < 5) {
            System.out.println("Ребенок не может кататься на аттракционе!");
        } else if (ageB > 14) {
            System.out.println("Ребенок может кататься на аттракционе только в сопровождении взрослого!");
        } else {
            System.out.println("Ребенок может кататься на аттракционе!");
        }
        // ДЗ-3 Задание 3
        int one = 4;
        int two = 8;
        int three = 11;
        if (one < two) {
            if (one >= three) {
                System.out.println("Максимальное число - " + one + "!");
            } else {
                System.out.println("Максимальное число - " + three + "!");
            }
        } else if (two > one) {
            if (two >= three) {
                System.out.println("Максимальное число - " + two + "!");
            } else {
                System.out.println("Максимальное число - " + three + "!");
            }
        } else {
            if (one > three) {
                System.out.println("Максимальное число - " + one + "!");
            } else if (three > one) {
                System.out.println("Максимальное число - " + three + "!");
            } else {
                System.out.println("Все 3 числа равны!");
            }
        }
    }
}