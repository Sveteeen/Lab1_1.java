// Пользователь вводит с клавиатуры 3 целых числа, обозначающих день, месяц и год его рождения.
// Необходимо по введенным значениям вывести возраст человека в формате: * лет, * месяцев и * дней.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int presentYear = 2022;
        int presentMonth = 10;
        int presentDay = 24;
        int numberOfYears;
        int numberOfMonths;
        int numberOfDays;

        System.out.println("День рождения: ");
        int dayBirth = in.nextInt();
        while ((dayBirth < 1) | ( dayBirth > 31)){
            System.out.println("Недопустимое значение, введите число от 1 до 31: ");
            dayBirth = in.nextInt();
        }
        if (dayBirth <= presentDay) {
            numberOfDays = presentDay - dayBirth;
        }else{
            numberOfDays = presentDay + (31 - dayBirth);
        }

        System.out.println("Месяц рождения: ");
        int monthBirth = in.nextInt();
        while ((monthBirth > 12) | (monthBirth <1)){
            System.out.println("Недопустимое значение, введите число от 1 до 12");
            monthBirth = in.nextInt();
        }
        if (((monthBirth == presentMonth) & (dayBirth <= presentDay)) | ((monthBirth < presentMonth) & (dayBirth <= presentDay))){
            numberOfMonths = presentMonth - monthBirth;
        }else if ((monthBirth < presentMonth) & (dayBirth > presentDay)){
            numberOfMonths = (presentMonth -1) - monthBirth;
        }else if ((monthBirth == presentMonth) & (dayBirth > presentDay)){
            numberOfMonths = 11;
        }else if (dayBirth < presentDay){
            numberOfMonths = (12 - monthBirth) + presentMonth;
        }else{
            numberOfMonths = (12 - monthBirth) + (presentMonth -1);
        }

        System.out.println("Год рождения: ");
        int yearBirth = in.nextInt();
        while (yearBirth < 1){
            System.out.println("Недопустимое значение, введите положительное число");
            yearBirth = in.nextInt();
        }
        if (((presentMonth == monthBirth) & (presentDay >= dayBirth)) | (presentMonth > monthBirth)){
            numberOfYears = presentYear - yearBirth;
        } else {
            numberOfYears = (presentYear -1)  - yearBirth;
        }

        System.out.println( numberOfYears + " лет, " + numberOfMonths+ " месяцев и " + numberOfDays + " дней" );
    }
}
