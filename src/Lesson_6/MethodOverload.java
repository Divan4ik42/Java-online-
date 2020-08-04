
package Lesson_6;


public class MethodOverload {
   
    MethodOverload(int b1, int c1, int d1, int e1){ 
        this(0,b1,c1,d1,e1);
    }
    
  MethodOverload(int c2, int d2, int e2){
       this(0,0,c2,d2,e2); 
    }
    
     MethodOverload(int d3, int e3){        
       this(0,0,0,d3,e3);
    }
    
    MethodOverload(int e4){
        this(0,0,0,0,e4);      
    }
    
   MethodOverload(){
       this(0,0,0,0,0);
    }

MethodOverload(int a5, int b5, int c5, int d5, int e5){
        a = a5;
        b = b5;
        c = c5;
        d = d5;
        e = e5; 
}
int MethodOverload(){
   return  a + b + c + d + e;
}
void showInfo(){
    System.out.println(this.MethodOverload());
        }
int a;
int b;
int c;
int d;
int e;
}

class MethodOverloadTest {
    public static void main(String[] args) {
        
        MethodOverload m1 = new MethodOverload();
        m1.showInfo();
        MethodOverload m2 = new MethodOverload(1);
        m2.showInfo();
        MethodOverload m3 = new MethodOverload(1,7);
        m3.showInfo();
        MethodOverload m4 = new MethodOverload(1,7,5);
        m4.showInfo();
        MethodOverload m5 = new MethodOverload(1,7,9,1);
        m5.showInfo();
        MethodOverload m6 = new MethodOverload(1,7,9,1,20);
        m6.showInfo();
    }
}