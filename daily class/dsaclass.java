class test
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                if(i%2==0)
                System.out.print("_");
                else
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=4;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                if(i%2==0)
                System.out.print("_");
                else
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
    


// class test
// {
//     public static void main(String[] args) {
//         int n=5;
//         for( int i=n;i>=1;i--)
//         {
//             for(int j=1;j<=i-1;j++)
//             {
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=2*n-2*i+1;k++)
//             {
//                 if(i%2==0)
//                 System.out.print("_");
//                 else
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// class test
// {
//     public static void main(String[] args) {
//         int n=5;
//         for( int i=1;i<=n;i++)
//         {
//             for( int j=1;j<=i-1;j++)
//             {
//             System.out.print(" ");
//             }
//             for(int k=1;k<=2*n-2*i+1;k++)
//             {
//                 if(k==1 || k==2*n-2*i+1)
//                 System.out.print("*");
//                 else
//                 System.out.print("_");
//             }
//             System.out.println();
//         }
//         for( int i=4;i>=1;i--)
//         {
//             for( int j=1;j<=i-1;j++)
//             {
//             System.out.print(" ");
//             }
//             for(int k=1;k<=2*n-2*i+1;k++)
//             {
//                 if(k==1 || k==2*n-2*i+1)
//                 System.out.print("*");
//                 else
//                 System.out.print("_");
//             }
//             System.out.println();
//         }
//     }
// }


// class test
// {
//  public static void main(String[] args) {
//         int n=9;
//         for(int i=1;i<=n;i++)
//         {
//             for(int j=1;j<=2*n;j++)
//             {
//                 if(j<=n-i+1 || j>=n+i)
//                 System.out.print("*");
//                 else
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//         for(int i=n;i>=1;i--)
//         {
//             for(int j=1;j<=2*n;j++)
//             {
//                 if(j<=n-i+1 || j>=n+i)
//                 System.out.print("*");
//                 else
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }   


// import java.util.Scanner;
// class test
// {
//     public static void main(String[] args) {
//         Scanner s=new Scanner(System.in);
//         System.out.print("Enter no. of rows : ");
//         int n=s.nextInt();
//         for(int i=1;i<=n;i++)
//         {
//             for(int j=1;j<=2*n;j++)
//             {
//                 if(j<=i || j>=2*n-i+1)
//                 System.out.print("* ");
//                 else
//                 System.out.print("  ");
//             }
//             System.out.println();
//         }
//         for(int i=n;i>=1;i--)
//         {
//             for(int j=1;j<=2*n;j++)
//             {
//                 if(j<=i || j>=2*n-i+1)
//                 System.out.print("* ");
//                 else
//                 System.out.print("  ");
//             }
//             System.out.println();
//         }
//     }
// }


