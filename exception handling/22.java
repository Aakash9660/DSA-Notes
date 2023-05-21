

                                                   //THROWS KEYWORD  :-


class test
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("start main");
        test.work();    
    }
    static void work() throws Exception
    {
        test.morework();
    }
    static void morework() throws Exception
    {
        Thread.sleep(5000);
    }
}
//OUTPUT= (thread sleep) checked exception h thats why hm isse throws keyword se JVM ko dere h ki ab tu handle kr ab ye error aayegoi too run timke pe aayegi.


                                                      //THROW KEYWORD  :-


// class TooYoungException extends RuntimeException
// {
//     TooYoungException(String msg)
//     {
//         super(msg);
//     }
// }
// class TooOldException extends RuntimeException
// {
//     TooOldException(String msg)
//     {
//         super(msg);
//     }
// }
// class test
// {
//     public static void main(String[] args) 
//     {
//         int age=Integer.parseInt(args[0]);
//         if(age<18)
//                  throw new TooYoungException("plz dont ruin your life its to much early");
//         else if(age>40)
//                 throw  new TooOldException(" plz wait for some time ");
//         else
//             System.out.println("you will get best nmatch soon");
//             System.out.println("thankyou for using our portal");           
//     }       
// }                     




// class overlimitException extends RuntimeException
// {
//     overlimitException()
//     {

//     }
// }
// class underlimitException extends RuntimeException
// {
//     underlimitException()
//     {

//     }
// }
// class test
// {
//     public static void main(String[] args) 
//     {
//         int money=Integer.parseInt(args[0]);
//         if(money<100)
//           throw new underlimitException();
//           else
//           throw new overlimitException();    
//     }
// }




                         //   methods to print Exception information  :-

               // 1. print StackTrace()                2. toString()                  3.getMessage()
               
               
// class test
// {
//     public static void main(String[] args) 
//     {
//         try
//         {
//              System.out.println("start main");   
//              System.out.println(10/0);   
//              System.out.println("end main");   
//         } 
//         catch(ArithmeticException ae)
//         {
//             ae.printStackTrace();                              // isko apan ne direct isliye likha h kyuki ye method kuch bhi return nhi krta (yha print krane ki jrurat nhi kyuki ye void wala h joo kuch return nhi krta )
//             System.out.println(ae.toString());                 //or ye method return krta h isliye apan jo ye return krta h usko print krare h  isko apan aise bhi likh skte the(String s=ae.toString();) or firr(System.out.print ln(s))
//             System.out.println(ae.getMessage());                  //niche example h return krra h uska
//         }
//         System.out.println("end");
//     }
// }




// class test
// {
//     public static void main(String[] args) 
//     {
//         try
//         {
//              System.out.println("start main");   
//              System.out.println(10/0);   
//              System.out.println("end main");   
//         } 
//         catch(ArithmeticException ae)
//         {
//             ae.printStackTrace(); 
//             String s=ae.toString();                            
//             System.out.println(s);                
//             System.out.println(ae.getMessage());
//         }
//         System.out.println("end");
//     }
// }




 