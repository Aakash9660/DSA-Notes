

//                            //Interface Methods
          
// interface inter
// {
//     void m1();
//     void m2();                              //iski wajah se error aayegi kyuki ye override nhi ho rha.
// }           
// class test implements inter
// {
//      public void m1()
//     {
//         System.out.println("test-m1");
//     }
//     public static void main(String[] args) {
//         //inter i=new inter();                    error kyuki interface ka object nhi bnta.
//         //inter i=new test();                  error nhi aayegi kyuki inter me m1() h or ovrriding hori h too JVM object k basis pe dekhega or object test ka h . 
//         test i=new test();
//         i.m1();
//     }
// }                


                                 //Interface Variables

// interface inter{
//     int x=10;
// }
// class test implements inter{
//     public static void main(String[] args) {
//         test t=new test();
//         System.out.println(t.x);                  //10
//         System.out.println(test.x);               //10
//         System.out.println(inter.x);               //10
//         System.out.println(x);                     //10
//     }
// }
    
               //Example 2
 
// interface inter{
//     int x=10;
// }
// class test implements inter{
//     public static void main(String[] args) {
//         //x=100;                                 // error aayegi kyuki interface ka variable final hota h uski value change nhi ho skti. 
//         int x=100;                             // erroe nhi aayegi kyuki ab hm main method ka localo variable declare kr rhe h na ki hm inter wale ki value change krre h. 
//         System.out.println(x);
//         System.out.println(inter.x);
//     }
// }               

                            //interface naming conflicts (variable)

// interface inter{
//     int x=10;
// }          
// interface inter1{
//     int x=100;
// }             
// class test implements inter,inter1
// {
//     public static void main(String[] args) 
//     {
//         System.out.println(x);                 // erorr ambiguity
//         System.out.println(test.x);            // eror ambiguity
//         System.out.println(inter.x);        //error nhi aayegi interface m har variable static hota h isliyte ese call krelenge or class m variable fix nhi h static or instance isliye mutiple inheritance possible nhi h .
//         System.out.println(inter1.x);
//     }
// }     

                           //method naming conflicts

// interface inter
// {
//     void m1();
// }
// interface inter1
// {
//     void m1();
// }
// class test implements inter, inter1
// {
//     public void m1()                            //class m method ki body hoti h isliye extends krte h jb multiplple nhi kr skte kyuki ambiguity hogi or interface k case m body nii hoti too object bhi child class ka bnega or wo override  hokar result ussi ka aayega.
//     {
//         System.out.println("test-m1");
//     }
//     public static void main(String[] args) 
//     {
//         test t=new test();
//         t.m1();    
//     }
// }

                         
                       //notes 3 line Example of method naming conflicts
                    
// interface inter
// {
//     void m1();
// }
// interface inter1
// {
//     int m1();
// }
// class test implements inter,inter1
// {
//     public static void main(String[] args)              //error aayegi kyuki ab hmme in dono ko test class m override krna pdega or firr test class m do method ho jayegi with same signature and that is not possible kyuki same signature ki hogi too jb bbhi call krenge ambiguity aayegi  
//     {
             
//     }
// }


                                      //Marker Interface 
                                     
// class test implements Cloneable
// {
//                                          // isse iss class ka pura data bta dega JVM too ye extr ability ho gyi na or iska koi method bhi nhi h .
// }   
// class test1
// {
// }
    
                                        //Adapter Class

// interface inter
// {
//     void m1();
//     void m2();
//     void m3();
//     void m4();
//     void m5();
// }                     
// abstract class adapter implements inter
// {
//     public void m1()
//     {

//     }
//     public void m2()
//     {

//     }
//     public void m3()                    //Adapter class( isme hm ek class likhte h jisme hm interface ki sbhi method ko body de dete h implement krke or firr agar kisi class ko jrurat pdti h interface ki koui 1,2 method ki to usse baki method koo body dene ki jrurat nhi h, wo adapter wali class ko extend krke jiss methopd ki jrurat h usse use le legi or baar baar sbhi method likhne ki jrurat nhi pdegi. )
//     {

//     }
//     public void m4()
//     {

//     }
//     public void m5()
//     {

//     }   
// }                  
// class test extends adapter
// {
//     public static void main(String[] args) 
//     {
//         test t=new test();
//         t.m1();
//     }
//     public void m1()
//     {
//         System.out.println("hello");
//     }
// }
// class test1 extends adapter
// {
//     public void m3()
//     {
//         System.out.println("hye");
//     }
//     public static void main(String[] args) 
//     {
//         test1 t=new test1();
//         t.m3();    
//     }
// }
 
                        //1.8 Version Enhancement

                      //Default Method
                      
// interface inter
// {
//     void m1();
//     default void m2()
//     {

//     }
// } 
// class test implements inter
// {
//     public void m1()
//     {
//         System.out.println("hello");
//     }
//     public static void main(String[] args) 
//     {
//         test t=new test();
//         t.m1();    
//     }
// }

                      //Static method  :-

// interface inter
// {
//     void m1();
//     static void m2()
//     {
//         System.out.println("commom implementation");
//     }
// }
// class test implements inter
// {
//     public void m1()
//     {
//         System.out.println("test m1");
//     }
//     public static void main(String[] args) 
//     {
//         test t=new test();
//         t.m1();
//         inter.m2();    
//     }
// }





                      
// interface inter
// {
//     void m1();
//     static void m2()
//     {

//     }
// } 
// interface inter1
// {
//     void m1();
//     static void m2()
//     {

//     }
// } 
// class test implements inter,inter1
// {
//     public void m1()
//     {
//         System.out.println("hello");
//     }
//     public static void main(String[] args) 
//     {
//         test t=new test();
//         t.m1();    
//     }
// }










