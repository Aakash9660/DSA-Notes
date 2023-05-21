                                // sorting Algorithms    :=-
                                
                                
// 1. Sorting is one of the most common task required in the real time industry 
// 2.There are multiple sorting algorithms availaible and based on our requiremment wer can decide which sorting algorithm will be best suitable.
// 3.Generally we can compare sorting algorithms on the basis of following factors  :-
//   1. Number of Comparison
//   2. Number of Swaps 
//   3. Adaptive
//   4. stable              (iska mtlb sorting k time order change nhi hona chahiye)Ex. agar array m koi 2 same element h 2,2 too sorting hoo too order change nii hona chahiye inka
//   5. Extra Memory



//                                     Bubble Sort  :-                        (Copy m bhi notes h java wali )
//                               __________________________

// 1. Every individual pass of bubble sort is also useful as it set corresponding  maximum element at the corresponding last index .
// 2. Sorting algorithms time complexity depends on no. of comparison .






                               // Question  :-

// class test
// {
//   static void print(int[]arr)
//   {
//     for(int i=0;i<=arr.length-1;i++)
//     {
//       System.out.print(arr[i]+" ");
//     }
//   }
//   static void swap(int arr[],int i,int j)                  //yha pe i ka mtlb (j)h or j ka mtlb (j+1)h
//   {
//     int c;
//     c=arr[i];
//     arr[i]=arr[j];
//     arr[j]=c;
//   }
//   static void bubblesort(int arr[])
//   {
//     int n=arr.length;
//     for(int i=1;i<=n-1;i++)
//     {
//       for(int j=0;j<=n-i-1;j++)
//       {
//         if(arr[j]>arr[j+1])
//         {
//           swap(arr,j,j+1);
//         }
//       }
//     }
//   }
//   public static void main(String[] args) 
//   {
//       int arr[]={9,8,4,5,2};
//       print(arr);
//       bubblesort(arr);
//       System.out.println();
//       print(arr);
//   }
// }





