         // Question 1.

// class test
// {
//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,3};
//         int count=0;
//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=i+1;j<arr.length;j++)
//             {
//                 if((arr[i]+arr[j])%4==0)
//                 {
//                     count++;
//                 }
//             } 
//         }
//         if(count>=1)
//                 {
//                     System.out.println(count);
//                 }
//     }
// }



                           //Question 2.



// class test
// {
//     public static void main(String[] args) 
//     {
//         int arr[]={-1,-3,-4,2,0,-5};
//         int productmax=(arr[0]*arr[1]);
//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=i+1;j<arr.length;j++)
//             {
//                 if((arr[i]*arr[j])>productmax)
//                 productmax=(arr[i]*arr[j]);
//             }
//         }
//        System.out.println(productmax);
//     }
// }




                 // Question 3.       (fibonacci series)


// import java.util.Scanner;
// class test
// {
    
//     static void fibonacci(int n)
//     {
//         int a=0,b=1,c;
//         for(int i=1;i<=n;i++)
//         {
//             System.out.println(a);
//             c=a+b;
//             b=a;
//             a=c;
//         }
//     }
//     public static void main(String[] args) 
//     {
//         Scanner s=new Scanner(System.in);  
//         System.out.print("enter fibonacci no. : ");  
//         int  n=s.nextInt();
//         fibonacci(n);
//     }
// }


                   

                         // Question 4  :-   (decimal to binary conversion)


// import java.util.Scanner;                    
// class test
// {
//     public static void main(String[] args) 
//     {
//         Scanner s=new Scanner(System.in);
//         System.out.print("enter number : ");
//         int num=s.nextInt();
//         int[]arr=new int[num];
//         int count=0;
//         for(int i=0;num>=1;i++)
//         {
//             arr[i]=num%2;
//             num=num/2;
//             count++;
//         }
//         System.out.print("output : ");
//         for(int i=count-1;i>=0;i--)
//         {
//             System.out.print(arr[i]);
//         }
//     }
// }




                                     //Question 5  (pattern)


class test
{
    public static void main(String[] args) 
    {
        int n=3;
        System.out.println("*");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==1)
                    System.out.print("* ");
                    System.out.print(j+" ");
            }
            for(int j=i-1;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println("*");
        }    
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==1)
                    System.out.print("* ");
                    System.out.print(j+" ");
            }
            for(int j=i-1;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println("*");
        }    
        System.out.println("*");
    }
}




