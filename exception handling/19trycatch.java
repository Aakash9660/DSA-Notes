

// class test
// {
//     public static void main(String[] args) {
//         System.out.println("start");
//         try{
//             System.out.println(10/0);
//         }
//         catch(ArithmeticException e)
//         {
//             System.out.println(10/2);
//         }
//         System.out.println("end");
//     }
// }

           //Example 2

// class test
// {
//     public static void main(String[] args) 
//     {
//     System.out.println("start");    //start    
//     try 
//     { 
//         System.out.println("start try");     //start try
//         System.out.println(10/0);            //yha se catch block m jayega 
//         System.out.println("end try");
//     } 
//     catch (ArithmeticException e) 
//     {
//         System.out.println("start catch");    //start catch
//         System.out.println(10/2);             //5
//         System.out.println("end catch");    //end catch
//     }
//     System.out.println("end");         //end
//     }
// }    

          //Example 3

// class test
// {
//     public static void main(String[] args) 
//     {
//     System.out.println("start");    
//     try 
//     {
//         System.out.println("start try");
//         System.out.println(10/0);
//         System.out.println("end try");
//     } 
//     catch (NullPointerException e)      // exception aayega kuki arithmetic excerption  or hmne nul pointer exception ka catch likjha h
//     {
//         System.out.println("start catch");
//         System.out.println(10/2);
//         System.out.println("end catch");
//     }
//     System.out.println("end");
//     }
// }    

// output start
//        start try
//        abnormal termination (beacuse we are not handling arithmetic exception of try block.)

