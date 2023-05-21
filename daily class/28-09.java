import java.util.ArrayList;

// Question 1.

// class test
// {
//     static void duplicateremove(int arr[])
//     {
//        int n=arr.length;
//        int k=0;
//        int result[]=new int[n];
//        for(int i=0;i<n;i++)
//        {
//             int flag=0;
//             for(int j=0;j<n;j++)
//             {
//                 if(arr[i]==result[j])                  // complexity O(n^2)
//                 {
//                     flag=1;
//                     break;
//                 }
//             }
//             if(flag==0)
//             {
//                 result[k]=arr[i];
//                 k++;                                 // ye logic too sorted or unsorted dono m kaam krega 
//             }
//        }
//        for(int i=0;i<k;i++)
//        {
//         System.out.print(result[i]+" ");
//        }
//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,2,3,4,4,4,5,5};
//         duplicateremove(arr);
//     }
// }

 

                                  
     
               // upar wala same h O(n) se (sorted array h too uska use leke krre h)
               
               
// class test
// {
//     static void duplicateremove(int arr[])
//     {          
//         int n=arr.length;  
//         int result[]=new int[n]; 
//         int k=0; 
//         for(int i=0;i<n-1;i++)
//         {
//             if(arr[i]!=arr[i+1])
//             {
//                 result[k]=arr[i];
//                 k++;
//             }
//         }
//         result[k]=arr[n-1];
//         for(int i=0;i<=k;i++)
//             System.out.print(result[i]+" ");
    
//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,2,3,4,4,4,5,5};
//         duplicateremove(arr);
//     }   
// }



                         // same upar wala arraylist se kyuki hmme array ki size ka nhi pta isliye 
                         // arraylist dynamic type ka hota h na 


// class test
// {
//     static void duplicateremove(int arr[])
//         {          
//             int n=arr.length;  
//             ArrayList result=new ArrayList(); 
//             int k=0; 
//             for(int i=0;i<n-1;i++)
//             {
//                 if(arr[i]!=arr[i+1])
//                 {
//                     result[k]=arr[i];
//                     k++;
//                 }
//             }
//             result[k]=arr[n-1];
//             for(int i=0;i<=k;i++)
//                 System.out.print(result[i]+" ");
        
//         }
//         public static void main(String[] args) {
//             int arr[]={1,2,2,3,4,4,4,5,5};
//             duplicateremove(arr);
//         }   
// }



                           // Question Pattern  :- 


// class test
// {
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=n;i>=1;i--)
//         {
//             for(int j=1;j<=2*n-1;j++)
//             {
//                 if(j<=i-1 || j>=2*n-i+1)
//                 System.out.print("* ");
//                 else
//                 System.out.print("  ");
//             }
//             System.out.println();
//         }
//     }
// }




