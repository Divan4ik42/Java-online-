
package Lesson_5;

public class BankAccount_v1 {
    int id ;
    String Name;
    double balance;
    
    
    public double cashAdd(double cashOperations){
        //System.out.println("Сумма до пополнения" + balance);
        balance += cashOperations;
        //System.out.println("Сумма  после пополнения" + balance);
        return balance;
    }
    
     public double cashTake (double cashOperations){
        balance -= cashOperations;
        return balance;
    }
   
         
     
       
             
     
     //---------------------------------------------------------
     void barierOrigin(BankAccount_v1 c1){
      
        System.out.println("------------------------------------------------------------------");
        System.out.println("                      Befor changes");
        System.out.println("------------------------------------------------------------------");   
     }
      void barierChanges(){
      
        System.out.println("------------------------------------------------------------------");
        System.out.println("                      After changes");
        System.out.println("------------------------------------------------------------------");   
     }
     void showInfo(){
        
//       System.out.println(this.changes());
         System.out.println("-----------" + "\n"+ 
                "Bank ID : " + id + "\n"+
                "Name : " + Name + "\n"+
                "Balance : " + balance + "\n"+
                "-----------" + "\n");
         
    
     }
    
    @Override
     
    public String toString(){ 
        return ("-----------" + "\n"+ 
                "Bank ID : " + id + "\n"+
                "Name : " + Name + "\n"+
                "Balance : " + balance + "\n"+
                "-----------" + "\n");   
    }
       //---------------------------------------------------------
}
class BankAccount_realization{
    
 public static void main(String[] args) {
   
        
    BankAccount_v1 Alex = new BankAccount_v1();
    BankAccount_v1 Stive = new BankAccount_v1();
    BankAccount_v1 Zombie = new BankAccount_v1();
    BankAccount_v1 string = new BankAccount_v1();
    
    
    Alex.id = 1;
    Alex.Name = "Alexey";
    Alex.balance = 126.5;
        Alex.showInfo();

    
    Stive.id = 2;
    Stive.Name = "Stivenson";
    Stive.balance = 17;
        Stive.showInfo();

    
    Zombie.id = 3;
    Zombie.Name = "Zombos";
    Zombie.balance = 2.5;
        Zombie.showInfo();
        
        

        
    //---------------------------------------------------------
    //OPERATIONS
    
    Alex.cashAdd(1000);
    Stive.cashTake(12);
    Zombie.cashAdd(1200);
    Zombie.cashTake(1001.5);
   
    

    
    Alex.showInfo();
    Stive.showInfo();
    Zombie.showInfo();
//        System.out.println("-----------");
//        System.out.println("Bank ID : " + Alex.id);
//        System.out.println("Name : " + Alex.Name);
//        System.out.println("Balance : " + Alex.balance);
//        System.out.println("-----------");
//        
//        System.out.println("-----------");
//        System.out.println("Bank ID : " + Stive.id);
//        System.out.println("Name : " + Stive.Name);
//        System.out.println("Balance : " + Stive.balance);
//        System.out.println("-----------");
//        
//        System.out.println("-----------");
//        System.out.println("Bank ID : " + Zombie.id);
//        System.out.println("Name : " + Zombie.Name);
//        System.out.println("Balance : " + Zombie.balance);
//        System.out.println("-----------");
//        
    
    
        
    }

}
