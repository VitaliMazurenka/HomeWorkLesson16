package Practicum;

public class Task1_DateToString {
    public static void main(String[] args) {
        /* Написать метод,, который принимает 3 числа int (day, month, year)
           возвращает строку вида "08. August 2023 "
         */

        int day = 8;
        int month = 8;
        int year = 2023;

        System.out.println(dateToString(day,month, year));



    }
    // Method
        public static String dateToString (int day,int month, int year){
        String res = "";
        String strMonth="";
        switch (month){
            case 1:strMonth = "January"; break;   // если правильно то выходим из цикла
            case 2:strMonth = "February"; break;   // если правильно то выходим из цикла
            case 3:strMonth = "March"; break;   // если правильно то выходим из цикла
            case 4:strMonth = "April"; break;   // если правильно то выходим из цикла
            case 5:strMonth = "May"; break;   // если правильно то выходим из цикла
            case 6:strMonth = "June"; break;   // если правильно то выходим из цикла
            case 7:strMonth = "July"; break;   // если правильно то выходим из цикла
            case 8:strMonth = "August"; break;   // если правильно то выходим из цикла
            case 9:strMonth = "September"; break;   // если правильно то выходим из цикла
            case 10:strMonth = "October"; break;   // если правильно то выходим из цикла
            case 11:strMonth = "November"; break;   // если правильно то выходим из цикла
            case 12:strMonth = "December"; break;   // если правильно то выходим из цикла
        }

        res = (day<10?"0": "")+day +". " + strMonth +" " + year; // итоговая строка
         return res;
        }

    // End Method
}
