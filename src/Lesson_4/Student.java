
package Lesson_4;

public class Student {
        
int studentId;
String name;
String lastName;
int academicYear;
double mathAverage;
double economyAverage;
double languageAverege;  

}
class StudentTest {
    public static void main(String[] args) {
        
        Student Sofiychuk = new Student();
        Student Bogachuk = new Student();
        Student Korneychuk = new Student();
        
        Sofiychuk.studentId = 1;
        Sofiychuk.name = "Алексей";
        Sofiychuk.lastName = "Софийчук";
        Sofiychuk.academicYear = 2020;
        Sofiychuk.mathAverage =10;
        Sofiychuk.economyAverage = 9;
        Sofiychuk.languageAverege = 7;
        
        Bogachuk.studentId = 2;
        Bogachuk.name = "Ирина";
        Bogachuk.lastName =  "Богачук";
        Bogachuk.academicYear = 2020;
        Bogachuk.mathAverage = 12;
        Bogachuk.economyAverage = 11;
        Bogachuk.languageAverege = 12;
        
        Korneychuk.studentId = 3;
        Korneychuk.name = "Наталья";
        Korneychuk.lastName = "Корнейчук";
        Korneychuk.academicYear = 2020;
        Korneychuk.mathAverage = 10;
        Korneychuk.economyAverage = 11;
        Korneychuk.languageAverege = 12;
        
        System.out.println("-----------");
        System.out.println("Студенческий ID : " + Sofiychuk.studentId);
        System.out.println("СТУДЕНТ : " + Sofiychuk.name + " " + Sofiychuk.lastName);
        System.out.println("УЧЕБНЫЙ  ГОД : " + Sofiychuk.academicYear);
        System.out.println("-----------");
        System.out.println("Успеваемость :");
        System.out.println("           Математика     - " + Sofiychuk.mathAverage);
        System.out.println("           Экономика      - " + Sofiychuk.economyAverage);
        System.out.println("           Английский яз. - " + Sofiychuk.languageAverege);
        System.out.println("           Средний бал    - " + (Sofiychuk.mathAverage + Sofiychuk.mathAverage + Sofiychuk.economyAverage)/3);
        System.out.println("-----------");
        
        System.out.println("-----------");
        System.out.println("Студенческий ID : " + Bogachuk.studentId);
        System.out.println("СТУДЕНТ : " + Bogachuk.name + " " + Bogachuk.lastName);
        System.out.println("УЧЕБНЫЙ  ГОД : " + Bogachuk.academicYear);
        System.out.println("-----------");
        System.out.println("Успеваемость :");
        System.out.println("           Математика     - " + Bogachuk.mathAverage);
        System.out.println("           Экономика      - " + Bogachuk.economyAverage);
        System.out.println("           Английский яз. - " + Bogachuk.languageAverege);
        System.out.println("           Средний бал    - " + (Bogachuk.mathAverage + Bogachuk.mathAverage + Bogachuk.economyAverage)/3);
        System.out.println("-----------");
        
        System.out.println("-----------");
        System.out.println("Студенческий ID : " + Korneychuk.studentId);
        System.out.println("СТУДЕНТ : " + Korneychuk.name + " " + Korneychuk.lastName);
        System.out.println("УЧЕБНЫЙ  ГОД : " + Korneychuk.academicYear);
        System.out.println("-----------");
        System.out.println("Успеваемость :");
        System.out.println("           Математика     - " + Korneychuk.mathAverage);
        System.out.println("           Экономика      - " + Korneychuk.economyAverage);
        System.out.println("           Английский яз. - " + Korneychuk.languageAverege);
        System.out.println("           Средний бал    - " + (Korneychuk.mathAverage + Korneychuk.mathAverage + Korneychuk.economyAverage)/3);
        System.out.println("-----------");
        
        
        
    }

   
    
}
   
