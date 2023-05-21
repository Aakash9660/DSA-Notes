import java.util.Scanner;


                                  // Question 1 :-

// class test
// {
//     static int ans(int arr[])
//     {
//         int max=0;
//         for(int i=0;i<arr.length;i++)
//         {
//             int count=0;
//             int n=arr[i];
//             while(n>=10)
//             {
//                 if(n%10==0)
//                 {
//                     count++;
//                     n=n/10;
//                 }
//                 else if(n%10!=0)
//                 {
//                     n=n/10;
//                     continue;
//                 }
//             }
//             if(count>max)
//             {
//                 max=count;
//             }
//         }
//         return max;
//     }
//     public static void main(String[] args) 
//     {
//         int arr[]={10,20,3000,200,500400};    
//         int result=ans(arr);
//         System.out.println(result);
//     }
// }


                               // Question 2 :-

// class test
// {
//     static String ans(int arr[],int a,int b)
//     {
//         for(int i=a;i<=b;i++)
//         {
//             int count=0;
//             for(int j=0;j<arr.length;j++)
//             {
//                 if(i==arr[j])
//                 {
//                     count=1;
//                     break;
//                 }
//             }
//             if(count==0)
//             {
//                 return "No";
//             }
//         }
//         return "yes";
//     }
//     public static void main(String[] args) 
//     {
//         int arr[]={1,4,5,2,7,8,3};
//         Scanner s=new Scanner(System.in);
//         System.out.print("enter range : ");
//         int a=s.nextInt();
//         int b=s.nextInt();
//         String result=ans(arr, a, b);
//         System.out.println(result);
//     }
// }
