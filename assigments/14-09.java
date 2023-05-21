                         // pattern 1


import java.util.Scanner;                         
class test
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.print("enter no. of rowa : ");
        int n=s.nextInt();
        System.out.println();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(j+64)+" ");
            }
            for(int k=i-1;k>=1;k--)
            {
                System.out.print((char)(k+64)+" ");
            }
            System.out.println(" ");
        }    
    }
}





                      // pattern 2
// class test
// {
//     public static void main(String[] args) 
//     {
//         int n=5;
//         for(int i=5;i>=1;i--)
//         {
//             for(int j=1;j<=(i+3);j++)
//             {
//                System.out.print("*");
//             }
//             for(int k=1;k<=(n+1)-i;k++)
//             {
//                 System.out.print((n+1)-i+"*");
//             }
//             for(int l=1;l<=(i+3)-1;l++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }    
//     }
// }