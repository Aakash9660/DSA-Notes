                                    // reverse of an array by using another array:-


// import java.util.Scanner;

// class test
// {
//     static void print(int[] arr)
//     {
//         for(int ele:arr)
//         System.out.print(ele);
//     }
//     static void reverse(int[] arr1)         //ye local array ka reference variable h arr1 yebhi arr wale array ko hii point krne lagega
//     {
//         int len=arr1.length;
//         int[] arr2=new int[len];
//         int j=0;
//         for(int i=len-1;i>=0;i--)
//         {
//             arr2[j]=arr1[i];
//             j++;
//         }
//         for(int i=0;i<=len-1;i++)
//         {
//             arr1[i]=arr2[i];
//         }
//     }
//     public static void main(String[] args)  
//     {
//         int[] arr={4,10,7,3,2};
//         print(arr);
//         System.out.println();
//         reverse(arr);
//         print(arr);    //yha ye arr ab reverse wale array k elemenets kop poimntr krra h 
//     }
// }


                                            // reverse of an array by using third variable :-


// class test
// {
//     static void print(int[] arr)
//     {
//         for( int ele:arr)
//         System.out.println(ele);
//     }
//     static void reverse1(int[] arr)
//     {
//         for(int i=0,j=arr.length-1;j>i;i++,j--)
//         {
//             int c= arr[i];
//             arr[i]=arr[j];
//             arr[j]= c;
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr={4,10,7,3,2};
//         print(arr);
//         System.out.println();
//         reverse1(arr);
//         print(arr);
//     }
// }


                                      // power of numbers  :-

// class test
// {
//     static int power(int a,int b)
//     {
//         int pow=1;
//         for(int i=1;i<=b;i++)
//         {
//             pow=pow*a;
//         }
//         return pow;
//     }
//     public static void main(String[] args) {
//         Scanner s=new Scanner(System.in);
//         System.out.println("enter 1st no. : ");
//         int a=s.nextInt();
//         System.out.println("enter 2nd no. : ");
//         int b=s.nextInt();
//         int result=power(a, b);
//         System.out.println(result);
//     }
// }




