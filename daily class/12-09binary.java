                           // Binary Search :-


// To perform binary search array must be sorted, otherwise we will get unpredictable result.

// Best Case  :-
// if we are searchimng for an element that is presrnt at the middle of an array .
// complexity  : O(1)

// Worst Case :-
// if we are searching leaf(ya firr last element tree k niche wale) elements .
//   complexity :   O(log n)



                               // sorting array :-


// import java.util.Scanner;         
// class test
// {
//     static boolean sort(int arr[])
//     {
//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=i+1;j<arr.length;j++)
//             {
//                 if(arr[j]-arr[i]<1)
//                 return false;
//             }                                         // complexity   kind of O(n^2)
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         int arr[]={5,10,65,70,80};
//         System.out.println(sort(arr));
//     }
// }




                           //   isilko O(n)  se krre h   :-



// class test
// {
//     static boolean sort(int arr[])
//     {
//         for(int i=0;i<=arr.length-2;i++)
//         {
//             if(arr[i+1]<arr[i])
//                 return false;
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         int arr[]={5,10,65,70,82};
//         System.out.println(sort(arr));   
//     }
// }




                     // find a missing element in array from n1=1 to n2=11  :-(there sholud be one missing element only)

// class test
// {
//     public static void main(String[] args) 
//     {
//         int arr[]={4,5,8,7,6,3,1,2,9,10};    
//         int n1=1,n2=11;
//         for(int i=n1;i<=n2;i++)
//         {
//             int count=0;
//             for(int j=0;j<arr.length;j++)                       // complexity=>O(n(n2-1))   kind of n^2
//             {
//                 if(arr[j]==i)
//                     count++;
//             }
//             if(count==0)
//                 System.out.println(i);
//         }                                                                                                                                                                                                                           
//     }
// }




                                //    isiko O(n) se kiya h :- 


// class test
// {
//     static void missingele(int arr[])
//     {
//         int sum=0;
//         int result=0;
//         int sum1=0;
//         for(int i=1;i<=11;i++)
//         {
//             sum=sum+i;
//         } 
//         for(int i=0;i<arr.length;i++)
//         {
//             sum1=sum1+arr[i];
//         }
//         result=sum-sum1;
//         System.out.println(result);
//     }
//     public static void main(String[] args) 
//     {
//         int arr[]={4,5,8,7,6,3,1,2,11,10};
//         missingele(arr);
//     }
// }

