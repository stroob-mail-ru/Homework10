public class Main {
    public static void main(String[] args) {

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        task1(fullName);
        task2(fullName);
        task3();
    }

    public static void task1(String fullName) {

        System.out.println();
        System.out.println("Задача 1");

        System.out.println("Ф. И. О. сотрудника - " + fullName);
    }

    public static void task2(String fullName) {

        System.out.println();
        System.out.println("Задача 2");

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета - " + fullName.toUpperCase());
    }

    public static void task3() {

        System.out.println();
        System.out.println("Задача 3");

        String fullName = "Иванов Семён Семёнович";
        System.out.println("Данные Ф. И. О. сотрудника - " + fullName.replace("ё", "е"));
    }
}