package homeWork;

public class Student {
    /* Создать класс Student со следующими полями
    (String firstName, String lastName, MyDate birthday, String group, MyDate startCourse}
     Создайте пару объектов этого класса. Напишите метод studentToString(Student student)
     который возвращает строку с данными студента.
     */
    String firstName;
    String lastName;
    String group;

    int day;
    int month;
    int year;

    int day2;
    int month2;
    int year2;

    public static void main(String[] args) {
        Student student = new Student();
        student.firstName = "Vitali";
        student.lastName = "Mazurenka";
        student.group = "Full-stack developer and tester, Group 31.1";
        MyDate date = new MyDate();
        date.day = 16;
        date.month = 11;
        date.year = 1984;
        StartCourse date1 = new StartCourse();
        date1.day2 = 18;
        date1.month2 = 07;
        date1.year2 = 2023;

        System.out.println(studentToString(student));
    }

    public static String studentToString(Student student) {

        String result = (student.firstName + " " + student.lastName + ", " + student.group);
        return result;
            }

}

