                                           // jo digit daale uska sum krana h :-
                                           
// import java.util.Scanner;
// class test
// {
//     static int sumDigit(int n)
//     {
//         int sum=0,ld;
//         while(n>0)
//         {
//             ld=n%10;                //modulus mtlb hm jb divide krte h too remainder joo bchta h mtlb hm digits k last ka digit nikalna chahte h too
//             n=n/10;                 // or 10 se divide krte h too lastr wala digit htt jayega or baki ka pura digit mil jauyega 
//             sum=sum+ld;
//         }
//         return sum;
//     }
//     public static void main(String[] args) 
//     {
//         Scanner s=new Scanner(System.in);   
//         System.out.print("enter no. : ");
//         int n=s.nextInt();
//         int result=sumDigit(n);
//         System.out.println(result); 
//     }
// }


                             // check armstrong 


// import java.util.Scanner;
// class test
// {
//     static int noofdigit(int n)
//     {
//         int d=0;
//         while(n>0)
//         {
//             n=n/10;
//             d++;
//         }
//         return d;
//     }
//     static int power(int a,int b)
//     {
//         int pow=1;
//         for(int i=1;i<=b;i++)
//         pow=pow*a;
//         return pow;
//     }
//     static boolean checkarmstrong(int n)
//     {
//         int sum=0,ld;
//         int n1=n;
//         int d=noofdigit(n);
//         while(n1>0)
//         {
//             ld=n1%10;
//             sum=sum+power(ld,d);
//             n1=n1/10;
//         }
//         if (sum==n)
//             return true;
//         else
//         return false;        

//     }
//     public static void main(String[] args) 
//     {
//         Scanner s=new Scanner(System.in);
//         System.out.print("enter no. of digit : ");
//         int n=s.nextInt();       
//         boolean result=checkarmstrong(n);
//         System.out.println(result);
//     }
// }




                                        // to find max value of array :-
                                                       
// class test
// {
//     static void max(int [] arr)
//     {
//         int max=arr[0];
//         for(int i=1;i<=arr.length-1;i++)
//         {
//             if(arr[i]>max)
//             max=arr[i];
//         }
//         System.out.println(max);
//     }
//     public static void main(String[] args) 
//     {
//         int [] arr={5,15,25,4,6};
//         max(arr);
//     }
// }





// //to find min value of array :-
// class test
// {
//     static void min(int [] arr)
//     {
//         int min=arr[0];
//         for(int i=1;i<=arr.length-1;i++)
//         {
//             if(arr[i]<min)
//             min=arr[i];
//         }
//         System.out.println(min);
//     }
//     public static void main(String[] args) 
//     {
//         int [] arr={5,15,25,4,6};
//         min(arr);
//     }
// }





// print the no. which is greater from its before and after no. if itis not in array then print -1
// class test
// {
//     static int test(int[] arr)
//     {
//         for(int i=1;i<=arr.length-2;i++)
//         {
//         if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
//         return arr[i];
//         }
//         return -1;
//     }
//     public static void main(String[] args) 
//     {
//         int[] arr={5,7,9,6,14};
//         int result=test(arr);
//         System.out.println(result);
//     }
// }

