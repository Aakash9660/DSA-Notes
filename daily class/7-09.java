

                                      //  Left Rotate :-
      
// class test
// {
//     static void print(int[] arr)
//     {
//         for(int i=0;i<=arr.length-1;i++)
//         System.out.print(arr[i]+" ");
//     }
//     static void leftshift(int[]arr)
//     {
//         int first=arr[0];
//         for(int i=1;i<=arr.length-1;i++)
//         {
//             arr[i-1]=arr[i];
//         }
//         arr[arr.length-1]=first;
//     }
//     public static void main(String[] args) 
//     {
//         int arr[]={6,2,4,9,11};
//         print(arr);
//         leftshift(arr);
//         System.out.println();  
//         print(arr);  
//     }
// }




           // Right Rotate :-


// class test
// {
//     static void print(int[] arr)
//     {
//         for(int i=0;i<=arr.length-1;i++)
//         System.out.print(arr[i]+" ");
//     }
//     static void rightshift(int arr[])
//     {
//         int last=arr[arr.length-1];
//         for(int i=arr.length-1;i>0;i--)
//         {
//             arr[i]=arr[i-1];
//         }
//         arr[0]=last;
//     }
//     public static void main(String[] args) 
//     {
//         int arr[]={6,2,4,9,11};
//         print(arr);  
//         rightshift(arr);
//         System.out.println();
//         print(arr); 
//     }
// }




                     
                                  // Left rotate by (n) value enter by user :-
                // utna left shift hora h jitna apan value daal rhe h n=3 mtlb 3 baar ek element shift hora h 

// import java.util.Scanner;
// class test
// {
//     static void print(int[] arr)
//     {
//         for(int i=0;i<=arr.length-1;i++)
//         System.out.print(arr[i]+" ");
//     }
//     static void leftrotatebyN(int[] arr,int n)
//     {
//         for(int j=1;j<=n;j++)
//         {
//             int first=arr[0];
//             for(int i=1;i<=arr.length-1;i++)
//             {
//                 arr[i-1]=arr[i];
//             }
//             arr[arr.length-1]=first;                  //time complexity O(n*k) naki O(n^2) kyuki ek loop n times chl ra h or loop k times chl ra h alag alag h  
//         }
//     }
//     public static void main(String[] args) 
//     {
//         int arr[]={6,2,4,9,11};
//         print(arr);
//         System.out.println();
//         Scanner s=new Scanner(System.in);
//         System.out.println("enter value of n: ");
//         int n=s.nextInt();
//         leftrotatebyN(arr,n); 
//         System.out.println();   
//         print(arr);
//     }
// }





          // Right Rotate by value (n) enter by user :-



// class test
// {
//     static void print(int[] arr)
//     {
//         for(int i=0;i<=arr.length-1;i++)
//         System.out.print(arr[i]+" ");
//     }
//     static void rightshift(int arr[])
//     {
//         int last=arr[arr.length-1];
//         for(int i=arr.length-1;i>0;i--)
//         {
//             arr[i]=arr[i-1];
//         }
//         arr[0]=last;
//     }
//     static void rightrotatebyN(int[] arr,int n)
//     {
//         for(int i=1;i<=n;i++)
//         {
//             rightshift(arr);
//         }
//     }
//     public static void main(String[] args) 
//     {
//         int arr[]={6,4,9,2,11};
//         print(arr);
//         System.out.println();
//         Scanner s=new Scanner(System.in);
//         System.out.println("enter value of n: ");
//         int n=s.nextInt();
//         rightrotatebyN(arr,n);
//         print(arr);
//     }
// }

