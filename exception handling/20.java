
//                                   finally vs return 
// class test
// {
//     public static void main(String[] args) 
//     {
//         int x=test.m1();
//         System.out.println(x);    
//     }
//     static int m1()
//     {
//         try
//         {
//             return 10;
//         }
//         catch(NullPointerException e)
//         {
//             return 100;
//         }
//         finally{
//             return 1000;
//         }
//     }
// }

// output = 1000(finally will always dominate return statement.)
            

      //if control is in try block then finally always executed except 1 scenario that shutting down the JVM

// class test
// {
//     public static void main(String[] args) 
//     {
//         try
//         {
//             System.out.println("statrt try");
//             System.exit(0);
//         }   
//         catch(ArithmeticException e)
//         {
//             System.out.println("catch");
//         }
//         finally{
//             System.out.println("finally");
//         }
//     }
// }
//  //output = start try





class test
{
      public static void main(String[] args) 
      {
            System.out.println("start");  
            try 
            {
                  System.out.println("start try");
                  System.out.println(10/0);
                  System.out.println();
            } 
            catch (ArithmeticException e) 
            {
                  
            }       
            catch(NullPointerException np)
            {
                  
            }
            finally
            {
                  System.out.println("end");
            } 
      }
      
}