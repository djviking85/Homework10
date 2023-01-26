public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1 () {
        System.out.println("Задача 1");
         // Пишем код для задачи 1
        String number = "9064075784";
        number = "+7" + number;
        if (number.length() == 12) {
            System.out.println( "телефон " + number);
        }
        else if (number.length()>12) {
            throw new RuntimeException(" Ошибка телефон длинный");

        } else if ( number.length()<12){
            throw new RuntimeException(" Телефон короткий");

        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
         // Пишем код для задачи 2
    }
    public static void task3 () {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
    }
}