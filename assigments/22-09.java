// import java.util.Scanner;
// class test
// {
//     static void primeno(int a,int b)
//     {
//         for(int i=a;i<=b;i++)
//         {
//             int count=0;
//             for(int j=2;j<=i;j++)
//             {
                
//                 if(i%j==0)
//                 {
//                     count++;
                    
//                 }
//             }
//             if(count==1)
//                 {
//                     System.out.println(i);
//                 }
//         }
//     }
//     public static void main(String[] args) 
//     {
//         Scanner s=new Scanner(System.in);
//         System.out.print("enter range :  ");
//         int a=s.nextInt();  
//         int b=s.nextInt();  
//         primeno(a, b);  
//     }
// }





// class test
// {
//     static boolean primeno(int n)
//     {
//         int count=0;
//         for(int i=2;i<=n;i++)
//         {
//             if(n%1==0 && n%i==0)
//             {
//                 count++;
//             }
//         }
//         if(count==1)
//         return true;
//         else
//         return false;
//     }
//     public static void main(String[] args) 
//     {
//         Scanner s=new Scanner(System.in);
//         System.out.print("enter no. to check it is prime or not :  ");
//         int n=s.nextInt();  
//         boolean result=primeno(n);  
//         System.out.println(result);
//     }
// }