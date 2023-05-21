
                            // Q 1 prime factors of no . : 

// import java.util.Scanner;  
// class test 
// {
//     public static void main(String[] args) 
//     {
//         Scanner s = new Scanner(System.in);
//         System.out.print("enter no. for prime factor : ") ;
//         int  n = s.nextInt();
//         int i = 2 ;
//         while(n>0)  
//         {
//             if(n%i == 0)
//             {
//                 n = n/i ;
//                 System.out.print(i+"  ");
//             }
//             else
//             {
//                  i ++ ;
//             }
//         }  
//     }   
// }




                                // Q 2.  Highest common factor : -

// class test 
// {
//     static int hcf(int n1 , int n2)
//     {
//         int min = Math.min(n1,n2);
//         if(n1%min==0 && n2%min==0)
//             return min ;
//         else
//         {
//             for(int i=min/2;i>=1;i--)
//             {
//                 if(n1%i==0 && n2%i==0)
//                     return i ;
//             }
//         }
//         return 1 ;
//     }
//     public static void main(String[] args) 
//     {
//         int n1=36,n2=48 ;
//         int result = hcf(n1,n2);
//         System.out.println(result);    
//     }
// }




                                // same above upar half se ek ek km hoke 1 tk aayega 
                                // isliye ye logic lgaya h 

class test 
{
    static int hcf(int n1 , int n2)
    {
        int n3 ;
       while(n2!=0)
       {
            n3=n2 ;
            n2=n1%n2 ;
            n1=n3 ;
       }
       return 
    }
    public static void main(String[] args) 
    {
        int n1=36,n2=48 ;
        int result = hcf(n1,n2);
        System.out.println(result);    
    }
}




