
package Lesson_5;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;


public class Employee {
    String name;
    String patronim;
    String lastName;
    String department;
    double salary;
    LocalDate workSince;
    
    public Employee(String name,String patronim,String lastName,String department,double salary, LocalDate workSince){
    this.name = name;
    this.lastName = lastName;
    this.patronim = patronim;
    this.department = department;
    this.workSince = workSince;
    this.salary = salary;
    }
    

    
    
    public boolean isTwoYearsInCompany(){
        long years = ChronoUnit.YEARS.between(workSince, LocalDate.now());
        if (years >=2){
            return true;
        }
        else return false;
    }
       double selaryUpgrade(){
                 
       if (this.isTwoYearsInCompany() == true) {   
        
        return salary *= 1.5;
       } 
        else salary += 0;
        return salary;
    }
//    int selaryUpgrade(){
//        salary *= 2;
//        return (int) salary;
//    }

    void showInfo(){
        String buffer = "";
        if (this.isTwoYearsInCompany() == true){
            buffer = "ДА";
        }
        else buffer = "НЕТ";
        
        System.out.println("-----------" + "\n"+ 
                "Имя : " + name + "\n"+
                "Отчество : " + patronim + "\n"+
                "Фамилия : " + lastName + "\n"+
                "Департамент : " + department + "\n"+
                "Оформлен с : " + workSince + "\n"+
                "Квалифицирован к повышению оклада : " + buffer + "\n"+        
                "Оклад : " + salary + "\n"+        
                "-----------" + "\n");
        
    
}
}

class EmployeeList{
    public static void main(String[] args) {
        
    Employee Alex = new Employee("Алексей","Иванович","Иванович","GameDev",10,LocalDate.of(2015,Month.APRIL, 5));
    //----------------------------------------------------------------
//    Alex.salary = 10;
//    Alex.workSince = LocalDate.of(2015, Month.MARCH, 1);
//    Alex.selaryUpgrade(); //должно присуцтвовать в коде (подумать как убрать)
//    Alex.name = "Алексей";
//    Alex.department = "GameDev";
//    Alex.patronim = "Иванович";
//    Alex.lastName = "Иванович";
   //----------------------------------------------------------------
    Alex.showInfo();
    
    
    
    Employee Kate = new Employee("Катерина","Андреевна","Драпак","Учитель",9,LocalDate.of(2019, Month.APRIL, 1));
    //----------------------------------------------------------------
//    Kate.salary = 9;
//    Kate.workSince = LocalDate.of(2019, Month.APRIL, 1);
//    Kate.selaryUpgrade(); //должно присуцтвовать в коде (подумать как убрать) 
//    Kate.name = "Катерина";
//    Kate.department = "Учитель";
//    Kate.patronim = "Андреевна";
//    Kate.lastName = "Драпак";
   //----------------------------------------------------------------
    Kate.showInfo();
     
    
    
    }
}
