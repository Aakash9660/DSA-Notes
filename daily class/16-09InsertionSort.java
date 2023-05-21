
//                              Bubble sort continue kiya h yha se :-


// 3. bubble sort is stable sorting algorithms .
//     if duplicate elements are present and while sorting if any algorithms doesnt change order of duplicate elements then that sorting algorithms comes under stable sorting algorithms .abstract

// 4. if we provide already sorting array to any sorting algorithms and in this case if sorting algorithms comes less time then that sorting algorithm comes under adaptive sorting algorithms 
// 5. bubble sort is by default not adaptive but we can make it adaptive by applying some changes 
// 6. time complexity of bubble sort ---
//    best case --> when array is already sorted -->O(n)
//    worst case -->when array is reverse sorted -->O(n*n)

  

   
//                                     Insertion sort   :-    (kuch copy m h )
                                  
                                   

// 1.Individual pass of insertion sort is not useful 
// 2.




// class test
// {
//   static void print(int[]arr)
//   {
//     for(int i=0;i<=arr.length-1;i++)
//     {
//       System.out.print(arr[i]+" ");
//     }
//   }
//   static void swap(int arr[],int i,int j)                
//   {
//     int c;
//     c=arr[i];
//     arr[i]=arr[j];
//     arr[j]=c;
//   }
//   static void bubblesort(int arr[])
//   {
//     int n=arr.length,flag;
//     for(int i=1;i<=n-1;i++)
//     {
//        flag=0;
//       for(int j=0;j<=n-i-1;j++)                             // agar array sorted h  too pura cglane ki jrurat nhgi h apan isko first pass m hii rok dege
//       {
//         if(arr[j]>arr[j+1])                                //isi property ko adaptive khte h 
//         {
//           swap(arr,j,j+1);
//           flag=1;                                         // apan ne flag variable se bnaya h bubble sort ko addptive ye tha nhi 
//         }
//       }
//       if(flag==0)
//       break;
//     }
//   }
//   public static void main(String[] args) 
//   {
//       int arr[]={2,4,5,8,9};
//       print(arr);
//       bubblesort(arr);
//       System.out.println();
//       print(arr);
//   }
// }





               // Question related too Insertion sort :-

// import java.util.Scanner;
// class test
// {
//   static void print(int arr[])
//   {
//       for(int i=0;i<arr.length;i++)
//       System.out.print(arr[i]+" ");
//   }
//   static void method(int arr[],int ele)
//   {
//     int n=arr.length;
//     int j=n-2;
//     while(j>=0 && arr[j]>ele)
//     {
//       arr[j+1]=arr[j];
//       j--;
//     }
//     arr[j+1]=ele;
//   }
//   public static void main(String[] args) 
//   {
//     Scanner s=new Scanner(System.in);
//     System.out.print("enter element to sort in an array : ");
//     int ele=s.nextInt();
//     int arr[]={4,9,15,20,0};  
//     print(arr);
//     System.out.println();
//     method(arr, ele);    
//     print(arr);
//   }
// }






