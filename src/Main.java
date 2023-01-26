public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1 () {
        System.out.println("Задача 1");
         // Пишем код для задачи 1
        String number = "9064075784";
        number = number.replace("-","");
        number = number.replace(" ","");
        number = number.replace("+","");
        if (number.length() == 10) {
          number = '7' + number;
        }
        else if (number.length()>11) {
            throw new RuntimeException(" Ошибка телефон длинный");

        } else if ( number.length()<10){
            throw new RuntimeException(" Телефон короткий");
        } else if (number.length() == 11 && number.charAt(0) != '7') {
            throw new RuntimeException("Введен не правильный код");
        }
        System.out.println( "телефон " + number);
        String rightNumber = "79064075784";
        if (number.equals(rightNumber)) {
            System.out.println(" Телефон сходится");

        } else {
            System.out.println( "нас постигла нудача");
        }

    }

    public static void task2 () {
        System.out.println("Задача 2");
         // Представьте, что вы работаете в небольшой компании.
        // Данные сотрудников хранятся в неструктурированном формате.
        // Бухгалтерия попросила написать программу, в которой  можно работать с Ф. И. О. сотрудников.
        //
        //Напишите четыре строки:
        //
        //    С именем firstName — для хранения имени.
        //    С именем middleName — для хранения отчества.
        //    С именем lastName — для хранения фамилии.
        //    С именем fullName — для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
        //
        //Выведите в консоль фразу: «ФИО сотрудника — …».
        //
        //В качестве данных для задачи используйте "Ivanov Ivan Ivanovich".
        String firstName = "Иван ";
        String middleName = "Иванович ";
        String lastName = "Иванов ";
        String fullName = lastName+firstName+middleName;
        System.out.println("ФИО сотрудника - "+ fullName);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        // Для ежемесячного отчета и ведения документации бухгалтерии
        // нужны Ф. И. О. сотрудников, полностью написанные заглавными буквами (верхним регистром).
        //
        //Напишите программу, которая изменит написание
        // Ф. И. О. сотрудника с "Ivanov Ivan Ivanovich" на полностью заглавные буквы.
        //
        //В качестве строки с исходными данными используйте строку fullName.
        //
        //Результат программы выведите в консоль в формате:
        // "Данные ФИО сотрудника в регистре для заполнения отчета — …"
        String firstName = "Иван ";
        String middleName = "Иванович ";
        String lastName = "Иванов ";
        String fullName = lastName+firstName+middleName;
        System.out.println("ФИО сотрудника - "+ fullName);
        System.out.println("Данные ФИО сотрудника в верхнем регистре для заполнения отчета — " + fullName.toUpperCase());
        System.out.println("Данные ФИО сотрудника в нижнем регистре для заполнения отчета — " + fullName.toLowerCase());
    }
    public static void task4 () {
        System.out.println("Задача 4");
        // Система, в которой мы работаем, не принимает символ «ё».
        // Напишите программу, которая заменяет символ «ё» на символ «е».
        //
        //В качестве исходных данных используйте строку fullName и данные в ней — "Иванов Семён Семёнович".
        //
        //Выведите результат программы в консоль в формате: «Данные ФИО сотрудника — ...».
        String firstName = "Семён ";
        String middleName = "Семёнович ";
        String lastName = "Иванов ";
        String fullName = lastName+firstName+middleName;
        String correctFullName = fullName.replace("ё", "е");
        System.out.println("ФИО сотрудника - "+ fullName);
        System.out.println("Данные ФИО сотрудника (вместо ё - е):  " + correctFullName);

    }
}