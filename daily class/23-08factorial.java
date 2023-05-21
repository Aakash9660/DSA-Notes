                   // factorial of number  :-

// import java.util.Scanner;
// class test
// {
//     public static void main(String[] args) 
//     {
//         Scanner s=new Scanner(System.in);
//         System.out.print("enter no. for factorial : ");
//         int n=s.nextInt();
//         int result=1;
//         for(int i=2;i<=n;i++)
//         {
//             result=result*i;
//         }    
//         System.out.println(result);
//     }
// }


                       // upar wala hii h bs alag method de diya :-

// import java.util.Scanner;
// class test
// {
//     static int factorial(int n)
//     {
//         int result=1;
//         for( int i=2;i<=n;i++)
//         {
//             result=result*i;
//         }
//         return result;
//     }
//     public static void main(String[] args) 
//     {
//         Scanner s=new Scanner(System.in);
//         System.out.print("enter no. of factorial : ");
//         int result=s.nextInt();  
//         System.out.println(factorial(result)); 
//     }
// }



                                        // permutation and combination (nCr) :-
                                        
// class test
// {
//     static int factorial(int n)
//     {
//         int result=1;
//         for(int i=2;i<=n;i++)
//         {
//             result=result*i;
//         }
//         return result;
//     }
//     static int combination(int n , int r)
//     {
//         int ans=factorial(n)/(factorial(r)*factorial(n-r));
//         return ans;
//     }
//     public static void main(String[] args) 
//     {
//         // Scanner s=new Scanner(System.in);
//         // System.out.print("enter first no. for permutation&combination : ");
//         // int ans=s.nextInt();
//         // System.out.println();
//         int result1=combination(7, 5);
//         System.out.println(result1);
//     }
// }




class test
{
    static int factorial(int n)
    {
        int result=1;
        for(int i=2;i<=n;i++)
        {
            result=result*i;
        }
        return result;
    }
    static int combination(int n , int r)
    {
        int ans=factorial(n)/(factorial(r)*factorial(n-r));
        return ans;
    }
    static void pattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                int result=combination(i-1,k-1);
                System.out.print(result+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        pattern(5);
    }
}










