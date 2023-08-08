package Practicum;

public class Task1_AlternativeThroughMassive {
    public static void main(String[] args) {
        /* Написать метод,, который принимает 3 числа int (day, month, year)
           возвращает строку вида "08. August 2023 "
         */

        int day = 8;
        int month = 8;
        int year = 2023;

        System.out.println(dateToString(day,month, year));

    }
    public static String dateToString (int day,int month, int year){
        if (month <0 || month>12){   // в случае ввода неправильных данных выдает Error
            return "Error";}
        String [] months = {"", " January"," Febr"," mar"," April"," May"," June"," July"," August"," September"," October"," November"," December"};
        return (day<10?"0":"0") + day+" "+ months[month]+" "+year;
    }

}
