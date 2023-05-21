                  //ways to make an object eloigible for GC
  // 1. nullifying the reference variable

// test t1=new test();
// test t2=new test();
// t1=null;
// t2=null;                  //after that both object is eligible for GC


      //  2. reassigning the reference varibale

// test t1=new test();
// test t2=new test();      
// t1=new test();
// t2=new test();

            // 3.object created inside method

// class test
// {
//     static void m1()
//     {
//         int x=100;
//         test t1=new test();            //ye sbhi  local variable h method khatma hote hii destroy ho jate h 
//         test t2=new test();
//     }
//     public static void main(String[] args) {
//         test.m1();
//     }
// }

// class test{
//     static int x;
//     static test t1;
//     static void m1()
//     {
//         x=100;
//         t1=new test();
//         test t2=new test();         //ye local h isliye sirf ye eligible h GC k liye 
//     }
//     public static void main(String[] args) {
//         test.m1();
//     }
// }

          // 4. Island Of Isolation :-
  //ye btana h ki line 57 line 58 line 59 ke baad kitte kitte object eligible h h GC k liye
// class test{
//     test t;
//     public static void main(String[] args) {
//         test t1=new test();
//         test t2=new test();
//         test t3=new test();
//         t1.t=t2;
//         t2.t=t3;                                    //diagram copy m h
//         t3.t=t1;
//         t1=null;                          //internally hm sbko call kr skte hh isliyue 0 eligible h 
//         t2=null;                           // upar wali line same
//         t3=null;                          // iske baad ek ko bhi nhi kr skte kyuki bahar wala reference variable baccha hii nhi isliye sb eligible h 
//     }                                   // total object tooo 3 hii bnege
// }          


                
                 //Ways for requesting JVM to run GC
  
                        // 1. By using gc() of system class which is static method 
                        // 2. by using gc() of runtime clas which is instance method

                          
                        
                          // Finalisation  :-
                                            
// class test
// {
//     public static void main(String[] args) 
//     {
//         String s=new String();
//         s=null;
//         System.gc();                                  //output 'end main' aayega kyuki yha gc ko request krri apan ne too ye finalise method
//         System.out.println("end main");            //chalayega or string m too finalise method likhi nii apan ne too object class ki chlegi 
//     }                                                //or object class ki finalise method m empty implementation hota h isliye iske nivhe wALI LINE print ho jayegi                                                                                       
//     public void finalize()
//     {                                              // apn ne finalise methjod test class m likhi h naki string k liye or object eleiigible string ka h  
//         System.out.println("finalize");          //agar tyest ka object eligible hot atoo finalise method wala output aata 
//     }
// }                            



// class test
// {
//     public static void main(String[] args) 
//     {
//         test s=new test();
//         s=null;
//         System.gc();                               //yha hhmne gc() call kri too ye finalise method chalayega ab object
//         System.out.println("end main");          // test class ka h or eleigible bbhi whi h isliye finalise test class ki chlegi                                                                               
//     }                                              // or finalise print hoo jayega 
//     public void finalize()                         //firr end main print hoga
//     {                                              //yha agar JVM hmari request accept krta h too yha 2 thread kaam kreneg ek GC thread or ek main thread tab aisa result aara h 
//         System.out.println("fionalize");         //iska output fix nhi hog kyuki 2 thread ek sath kaam krre h 
//     }                                              //inka order upar niche hota rhega jb apn baar baar run krayege
// }


class test
{
    public static void main(String[] args) 
    {
        test t=new test();
        t.finalize();                         //iss case m finaloize method noramal method ki jese behave krega kyuki hm call lkrre h 
        t.finalize();                          //isliye in dono ki wajaha se finalize finalize printy hoga 
        t=null;
        System.gc();                           //yha gc call krega finalize method ko ab yha se 2 thread active honge 
        System.out.println("end main");       
    }
    public void finalize()
    {                                                        //or abb yha end main or finalise shuffle honge 
        System.out.println("finalize");
    }
}