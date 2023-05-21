                                  //Static Import

// class test
// {
//     public static void main(String[] args) 
//     {
//         System.out.println(Math.max(10,20));     //ye ek method h max jo math class m present h or static h 
//         System.out.println(Math.max(202,100));   //to isko class k naam pe kre h call aise 
//     }                              // ab har baar hme aise pura likhna naa pde math.max isliye hm stastic import krte h 
// }          



// import static java.lang.Math.max;
// class test
// {
//     public static void main(String[] args) 
//     {
//         System.out.println(max(10,20));
//         System.out.println(min(202,100));       //min method se error aayegi kyuki JVM isse test class m dhundega or wo h hii nhi 
//     }
// }


// import static java.lang.Math.max;
// import static java.lang.Math.min;
// class test
// {
//     public static void main(String[] args) 
//     {
//         System.out.println(max(10,20));
//         System.out.println(min(202,100));       
//     }
// }


                     // line 3 in notes example

// import static java.lang.Integer.*;
// import static java.lang.Byte.MAX_VALUE;
// class test
// {
//     static int MAX_VALUE=300;
//     public static void main(String[] args) {
//         System.out.println(MAX_VALUE);         //phle priority khudki class k static variable kmo milegi isliye output 300 aayega 
//     }
// }

// import static java.lang.Integer.*;
// import static java.lang.Byte.MAX_VALUE;
// class test
// {
//         public static void main(String[] args) {
//         System.out.println(MAX_VALUE);           //ab priority explicit import ko milegi too Byte ki max value aa jayegi
//     }
// }


                                //  Package


// package in.co.codeplanet.test;
// class Test
// {
//     public static void main(String[] args) {
//         System.out.println("hello");
//     }
// }
//compile aise krenge javac -d . DandA.java    (DandA.java hmare program ka naam htoo jo bhi naam hoo yha aise daalenge )
//run aise karenge java in.co.codeplanet.test.Test isko fully qualified name khte h   (in.co.codeplanet.test hmara package h or Test hmari file h )
// hm run aise hii too krate h java or firr file ka naam (java.Test) pr aise krenge too JVM Test.class file ko Desktop pr hi dhundne lagega
//pr ye too h kha iss packlage m isliye aise krenge fully qualified name  


                           // public Modifier :-

// package in.co.codeplanet.modifiers;
// public class calculator 
// {
//      public void add(int x, int y)
//     {
//         System.out.println(x+y);
//     }
// }                          


                                 // <default> Modifier :-
// package in.co.codeplanet.modifiers;
// class calculator                                  //default ko hm same package m kr skte h bahar error aayegi
// {
//       void add(int x, int y)
//     {
//         System.out.println(x+y);
//     }
// }
// class test
// {
//     public static void main(String[] args) 
//     {                                           //compile (javac -d . calculator.java)
//         calculator c=new calculator();         //run (java in.co.codeplanet.modifiers.test) fulkly qualified name se krege.
//         c.add(10, 20);   
//     }
// }


                         // private Modifier   :-

// package in.co.codeplanet.modifiers;
// class calculator                                  
// {
//       private void add(int x, int y)                //private ko hm same package m outside of class bhi access nhi  kr skte 
//     {                                              //to outside of package too kaise possible h 
//         System.out.println(x+y);
//     }
// }
// class test
// {
//     public static void main(String[] args) 
//     {                                           
//         calculator c=new calculator();        
//         c.add(10, 20);   
//     }
// }                         

            

// package in.co.codeplanet.modifiers;
// class calculator                                  
// {    
//       private int x;                      //inside same class m hii access kr skte h 
//       private void add(int x, int y)     //ye hii baat variable k liye h agar koi variable private h too same class m hi kr skte h access            
//     {                                              
//         System.out.println(x+y);
//     }
//     public static void main(String[] args) 
//     {                                           
//         calculator c=new calculator();        
//         c.add(10, 20);                   // output 30;
//         System.out.println(c.x);            //isse output (0) aayega kyuki int ki default value 0 hoti h   
//     }
// }


                            // protected Modifiers :-            

// package in.co.codeplanet.modifiers;
//  public class calculator                                  
// {                        
//       protected void add(int x, int y)           
//     {                                              
//         System.out.println(x+y);
//     }
// }


                          // final Modifier  :-(final instance variable)

// class test
// {
//     final int x;
//     public static void main(String[] args) {       //error aayegi kyuki agar hmne variable declare kr diya final k sath mtlb hm usse change nhi kr skte mtlb value nhi de skte islioye declaration k time hiii value deni hogi 
//         test t=new test();                       //ya firr constructor k khatam hone se phle value deni hogi 
//         System.out.println(t.x);                 //hm 3 tarike se value de skte h ya to declaration k time de ya instance block m de ya contructor m de
//     }
// }



// class test
// {
//     final int x=10;
//     // {
//     //     x=100;       // ye instance block m de skte h declaration k time naa de too ye bhi contructor se phle chlta h 
//     // }
//     // test()
//     //     {
//     //         x=1000;    //ya ye last m constructor m de skte h agar yha tk hmne kese bhi value nhi dii too error aayegi
//     //     }
    
//     public static void main(String[] args) {
//         test t=new test();
//         System.out.println(t.x);
//     }
// }



// class test
// {
//     final int x;
//     public static void main(String[] args) {
//         test t=new test();                    //error too abhi bhi aayegi kyuki hmne constructor khatam hone se phle value nhi dii
//         t.x=100;                              // ye too badme chlti error phle hii aajayegi
//         System.out.println(t.x);
//     }
// }


                          // final static variable  :-

// class test
// {
//     static final int x;
//     public static void main(String[] args) {
//         test t=new test();                       //error aayegi kyuki value nhi dii na hmne final variable ko
//         System.out.println(t.x);                  //static ko value dene ke 2 tarike h static class ke sath load hota h na isloiye ya too direct declare krte waqt ya firr static block m 
//     }
// }


// class test
// {
//     static final int x;
//     static
//     {
//         x=10;
//     }                                         //ab koi error nhi aayegi hmne valkue dedi ststic block m
//     public static void main(String[] args) {
//         test t=new test();
//         System.out.println(t.x);
//     }
// }


// class test
// {
//     static final int x;
//     public static void main(String[] args) 
//     {
//         test t=new test();
//         t.x=10;                               //whi baat error aayegi kyuki main method kb chlegi class load hone k baad or class load hone tk iske pas koi value nhi h 
//         System.out.println(t.x);    
//     }
// }


                                  // Local Variable  :-

// class test
// {
//     static void m1(int x, int y)
//     {
//         int z=40; //y local variable h kyuki ye is m1() ka private variable mtlb issime kaam aara h  
//         System.out.println(x+y+z);
//     }
//     public static void main(String[] args) 
//     {
//         test.m1(10,20);    // ye sbhi local varible h too method execution complte hote hii sb destroy ho jayege yha se output 70 aayega
//         // System.out.println(x);   //yha error aayegi kyuki x too local variable h m1() ka uske khatam hote hii destroy ho gya  
//     }
// }


// class test
// {
//     public static void main(String[] args) 
//     {
//         int x=10;
//         System.out.println(x);   //x main() ka local h or main() hii use krra h too error nhi aayegi  
//     }                              
// }


// class test
// {
//     public static void main(String[] args) 
//     {
//         int x=10;
//         x=100;                              //output 100;
//         System.out.println(x);   
//     }                              
// }


// class test
// {
//     public static void main(String[] args) 
//     {
//         final int x=10;
//         x=100;                          //error aayegi kyuki final ko change krre h apan                   
//         System.out.println(x);   
//     }                              
// }


// class test
// {
//     public static void main(String[] args) 
//     {
//         int x;                               //ye kya h local h too local too bhot sarreee ho skte h too JVM individually nhi jayega sbki value dene 
//         System.out.println(x);               //or local mtlb personal mtlb whi use kr skta h or koi nhi kr skta    
//     }                                        //isliye isme default value nhi dega JVM
// }


class test
{
    public static void main(String[] args) 
    {
        int x;                        //isme error nhi aayegi kyuki JVM too nhi dega local variable ko value but isse koi problem nhi h output hello aajayega kyuki hme local variable ko value deni hoti h usse use lene se phle           
        System.out.println("hello");                  
    }                                        
}














