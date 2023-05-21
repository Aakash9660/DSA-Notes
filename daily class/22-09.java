                        // length k half ka sum krana h or aadhe half ka alag sum krana h firr jo sum aaye unko multiply krana h  :-
                                       //(subarray sum and multiply)

//  class test
//  {
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5};
//         int sum1=0,sum2=0;
//         for(int i=0;i<arr.length/2;i++)
//         {
//             sum1=sum1+arr[i];
//         }
//         // System.out.println(sum1);
//         for(int i=arr.length/2;i<=arr.length-1;i++)
//         {
//             sum2=sum2+arr[i];
//         }
//         // System.out.println(sum2);
//         int result=sum1*sum2;
//         System.out.println(result);
//     }
//  }

             
                            //  array hmehsa even hoga uska left half equal right half krna k liye value dhundni h :-

//  class test
//  {
//     public static void main(String[] args) {
//         int arr[]={1,2,1,2,1,3};
//         int sum1=0,sum2=0;
//         for(int i=0;i<arr.length/2;i++)
//         {
//             sum1=sum1+arr[i];
//         }
//         // System.out.println(sum1);
//         for(int i=arr.length/2;i<=arr.length-1;i++)
//         {
//             sum2=sum2+arr[i];
//         }
//         // System.out.println(sum2);
//         if(sum1>sum2)
//         System.out.println(sum1-sum2);
//         else
//         System.out.println(sum2-sum1);
//     }
//  }

                               

                        // String h jisme sirf 0 or 1 h too jo last index pe 1 uska index print krana h :-

// import java.util.Scanner;
// class test
// {
//     static int characterfinder(String str)
//     {
//         for(int i=str.length()-1;i>=0;i--)
//         {
//             if(str.charAt(i)=='1')
//             {
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.out.println("enter String consisting 0'sand 1's :-");
//         String str=sc.nextLine();
//         // String str="0010100";
//         int result=characterfinder(str);
//         System.out.println(result);
//     }
// }
