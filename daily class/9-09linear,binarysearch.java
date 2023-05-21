                              // SEARCH ALGORITHMS   :-


// Generally there are 2 STANDARD SEARCHING ALGORITH :-
// 1. Linear search
// 2. Binary search


//                            Linear Search  :-
//                            -------------
 
//               " Best,Average,Worst Case " 


// 1. Best Case  =>
//     if we are searching for an element that is present on 0 index (first element ) thgen it will be best case of linear search

//     >> Best case complexity ->O(1)



// 2. Worst Case  =>
//     if we are searching for the last elemsnt or if we are searchoingh fot elemnt which is not present then it will bw worst case of linear search .

//    >> Worst case complexity ->O(n)

//     Where n is no. of elements present in array .



// 3. Average Case =>

//     in linear search average case will be 

//       Average case =    comparison of all the cases                   n(n+1)/2                            n(n+1)
//                       _________________________________           _______________          ==>     ___________________
//                            total no. of cases                          n                                    2n




                              
                              
                              // linear search question :-

// import java.util.Scanner;

// class test
// {
//     static int output(int arr[],int ele)
//     {
//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i]==ele)
//             return i;
//         }
//         return -1;
//     }
//     public static void main(String[] args) 
//     {
//         int arr[]={4,2,18,15,13,8};
//         Scanner s=new Scanner(System.in);
//         System.out.println("enter ele. : ");
//         int ele=s.nextInt();
//         System.out.println(output(arr, ele));
        
//     }
// }


   

                            //   binary search question  :-   
                   // isme hm half half krke chlte h too loop km baar chlta h 


// import java.util.Scanner;

// class test
// {
//     static int binarysearch(int []arr, int ele)
//     {
//         int start=0;
//         int end=arr.length-1;
//         while(end>=start)
//         {
//             int mid=(start+end)/2;
//             if(arr[mid]==ele)
//               return mid;
//             else if(arr[mid]<ele)
//               start=mid+1;
//             else
//               end=mid-1;
//         }
//         return -1;

//     }
//     public static void main(String[] args) 
//     {
//         int arr[]={4,8,11,15,19,22,24};
//         Scanner s=new Scanner(System.in);  
//         System.out.println("enter ele : ");  
//         int ele=s.nextInt();
//         int result=binarysearch(arr,ele);
//         System.out.println(result);
//     }
// }





// import java.util.Scanner;
// class test
// {
//     static int binarysearch(int arr[], int n)
//     {
//         int start=0;
//         int end=arr.length-1;
//         for(int i=start;end>=start;i++)
//         {
//             int mid=(start+end)/2;
//             if(arr[mid]==n)
//                 return mid;
//             else if(arr[mid]<n)
//                 start=mid+1;
//             else
//                 end=mid-1;
//         }
//         return -1;
//     }
//     public static void main(String[] args) 
//     {
//         int arr[]={5,7,12,15,26,29,35,69};
//         Scanner s=new Scanner(System.in);
//         System.out.println("enter ele : ");
//         int n=s.nextInt();
//         int result=binarysearch(arr,n);
//         System.out.println(result);    
//     }
// }