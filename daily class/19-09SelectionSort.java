                                     // Continue Insertion Sort :-

// 2. sorting algorithm time complexity depends on number of comparison .
// 3. Insertion Sort is Stable Sorting Algorithm .
// 4. Insertion Sort is by Default adaptive .
// 5. Time Complexity of Insertion Sort 
//    best Case -->when array is already sorted -->O(n)
//    worst case -->when array is reverse sorted -->O(n*n)
// 6. Insertion Sort doesnt require any extra memory .


                                    // Selection Sort :-

// 1. Every individual pass of selection sort is also useful as it  set corresponding minimum element at the corresponding index.
// 2. sorting algorithm time complexity depends on number of comparison .
// 3. selection sort is non stable sorting algorithm .
// 4. selection sort is by default not adaptive and we cannot make it adaptive .
// 5. time complexity of selection sort is O(n*n).
// 6. selection sort doesnt require any extra memory .



                        // Insertion Sort :-

// class test
// {
//     static void print(int arr[])
//     {
//         for(int i=0;i<arr.length;i++)
//         System.out.print(arr[i]+" ");
//     }
//     static void InsertionSort(int []arr)
//     {
//         int n=arr.length,ele,j;
//         for(int i=1;i<n-1;i++)
//         {
//             ele=arr[i];
//             j=i-1;
//             while(j>=0 && arr[j]>ele)
//             {
//                 arr[j+1]=arr[j];
//                 j--;
//             }
//             arr[j+1]=ele;
//         }
//     }
//     public static void main(String[] args) {
//         int arr[]={8,6,4,5,7};
//         print(arr);
//         System.out.println();
//         InsertionSort(arr);
//         print(arr); 
//     }
// }



                              // Selection Sort :-
                            
// class test
// {
//     static void print(int arr[])
//     {
//         for(int i=0;i<arr.length;i++)
//         System.out.print(arr[i]+" ");
//     } 
//     static void swap(int arr[],int i,int j)                
//     {
//         int c;
//         c=arr[i];
//         arr[i]=arr[j];
//         arr[j]=c;
//      }
//      static void SelectionSort(int arr[])
//      {
//         int n=arr.length,k;
//         for(int i=0;i<=n-2;i++)
//         {
//             k=i;
//             for(int j=i+1;j<=n-1;j++)
//             {
//                 if(arr[j]<arr[k])
//                 k=j;
//             }
//             swap(arr,i,k);
//         }
//      }
//     public static void main(String[] args) {
//         int arr[]={8,6,4,5,7};
//         print(arr);
//         SelectionSort(arr);
//         System.out.println();
//         print(arr);
//     }
// }


