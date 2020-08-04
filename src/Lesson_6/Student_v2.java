
package Lesson_6;

import Lesson_5.*;

public class Student_v2 {
    
    Student_v2(int studentId1, String name1, String lastName1,int academicYear1,double mathAverage1, double economyAverage1,double languageAverege1){
        studentId = studentId1; 
        name = name1;
        lastName = lastName1;  
        academicYear = academicYear1;
        mathAverage = mathAverage1;
        economyAverage = economyAverage1;
        languageAverege = languageAverege1; 
    }
    Student_v2(int studentId2, String name2, String lastName2,int academicYear2){
        this(studentId2,name2,lastName2,academicYear2,0.0, 0.0,0.0);
        
    }
     Student_v2(){
    }
        
int studentId;
String name;
String lastName;
int academicYear;
double mathAverage;
double economyAverage;
double languageAverege;  

double classesAverege(){
    return (mathAverage + economyAverage + languageAverege)/3;
}



void showInfo(){
System.out.println ("-----------" + "\n"+ 
 "Студенческий ID : " + studentId + "\n"+ 
 "СТУДЕНТ : " + name + " " + lastName + "\n"+ 
"-----------" + "\n"+ 
"Успеваемость :" + "\n"+ 
"           Математика     - " + mathAverage + "\n"+ 
"           Экономика      - " + economyAverage + "\n"+ 
"           Английский яз. - " + languageAverege + "\n"+ 
"           Средний бал    - " + (float)this.classesAverege()  + "\n"+ 
"-----------");           
}

}

class StudentList {
    public static void main(String[] args) {
        
        Student_v2 Sofiychuk = new Student_v2(1,"Алексей","Софийчук",2020);
//        Sofiychuk.studentId = 1;
//        Sofiychuk.name = "Алексей";
//        Sofiychuk.lastName = "Софийчук";
//        Sofiychuk.academicYear = 2020;
        Sofiychuk.mathAverage =10;
        Sofiychuk.economyAverage = 9;    //  только часть значений нужно вбивать вручную
        Sofiychuk.languageAverege = 7;
       
        Student_v2 Bogachuk = new Student_v2(2,"Ирина","Богачук",2020,12,11,12);
//        Bogachuk.studentId = 2;
//        Bogachuk.name = "Ирина";
//        Bogachuk.lastName =  "Богачук";
//        Bogachuk.academicYear = 2020;      // все прошло автоматм на этапе формирования метода
//        Bogachuk.mathAverage = 12;
//        Bogachuk.economyAverage = 11;
//        Bogachuk.languageAverege = 12;


        Student_v2 Korneychuk = new Student_v2();
        Korneychuk.studentId = 3;
        Korneychuk.name = "Наталья";
        Korneychuk.lastName = "Корнейчук";
        Korneychuk.academicYear = 2020;     //все значени нужно было вбивать вручную
        Korneychuk.mathAverage = 10;
        Korneychuk.economyAverage = 11;
        Korneychuk.languageAverege = 12;
        
        
        Sofiychuk.showInfo();
        Bogachuk.showInfo();
        Korneychuk.showInfo();
        
//        System.out.println("-----------");
//        System.out.println("Студенческий ID : " + Sofiychuk.studentId);
//        System.out.println("СТУДЕНТ : " + Sofiychuk.name + " " + Sofiychuk.lastName);
//        System.out.println("УЧЕБНЫЙ  ГОД : " + Sofiychuk.academicYear);
//        System.out.println("-----------");
//        System.out.println("Успеваемость :");
//        System.out.println("           Математика     - " + Sofiychuk.mathAverage);
//        System.out.println("           Экономика      - " + Sofiychuk.economyAverage);
//        System.out.println("           Английский яз. - " + Sofiychuk.languageAverege);
//        System.out.println("           Средний бал    - " + (Sofiychuk.mathAverage + Sofiychuk.mathAverage + Sofiychuk.economyAverage)/3);
//        System.out.println("-----------");
//        
//        System.out.println("-----------");
//        System.out.println("Студенческий ID : " + Bogachuk.studentId);
//        System.out.println("СТУДЕНТ : " + Bogachuk.name + " " + Bogachuk.lastName);
//        System.out.println("УЧЕБНЫЙ  ГОД : " + Bogachuk.academicYear);
//        System.out.println("-----------");
//        System.out.println("Успеваемость :");
//        System.out.println("           Математика     - " + Bogachuk.mathAverage);
//        System.out.println("           Экономика      - " + Bogachuk.economyAverage);
//        System.out.println("           Английский яз. - " + Bogachuk.languageAverege);
//        System.out.println("           Средний бал    - " + (Bogachuk.mathAverage + Bogachuk.mathAverage + Bogachuk.economyAverage)/3);
//        System.out.println("-----------");
//        
//        System.out.println("-----------");
//        System.out.println("Студенческий ID : " + Korneychuk.studentId);
//        System.out.println("СТУДЕНТ : " + Korneychuk.name + " " + Korneychuk.lastName);
//        System.out.println("УЧЕБНЫЙ  ГОД : " + Korneychuk.academicYear);
//        System.out.println("-----------");
//        System.out.println("Успеваемость :");
//        System.out.println("           Математика     - " + Korneychuk.mathAverage);
//        System.out.println("           Экономика      - " + Korneychuk.economyAverage);
//        System.out.println("           Английский яз. - " + Korneychuk.languageAverege);
//        System.out.println("           Средний бал    - " + (Korneychuk.mathAverage + Korneychuk.mathAverage + Korneychuk.economyAverage)/3);
//        System.out.println("-----------");
        
        
        
    }

   
    
}
   
