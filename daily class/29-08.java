                                    // left side sum :-

// class test
// {
//     static void leftsum(int[] arr)
//     {
//         int sum=0;
//         for(int i=1;i<=arr.length-1;i++)
//         {
//             sum=sum+arr[i-1];
//             System.out.println(sum);
//         }
//     }
//     public static void main(String[] args) 
//     {
//         int[] arr={4,2,1,5,7,6};
//         System.out.println(0);
//         leftsum(arr);    
//     }
// }



//upar wale ko ese bhi kr sktre h left side sum :-


// class test
// {
//     static void leftsum(int[] arr)
//     {
//         int sum=0;
//         for(int i=0;i<=arr.length-1;i++)
//         {
//             System.out.println(sum);
//             sum=sum+arr[i];
//         }
//     }
//     public static void main(String[] args) 
//     {
//         int[] arr={4,2,1,5,7,6};
//         leftsum(arr);    
//     }
// }




                                           //right side sum :-   O(n^2)

// class test
// {
//     static void rightsum(int[] arr)
//     {
//         for(int i=0;i<=arr.length-1;i++)
//         {
//             int sum=0;
//             for(int j=i+1;j<=arr.length-1;j++)
//             {
//             sum=sum+arr[j];
//             }
//             System.out.println(sum);           //time complexity = (n)^2  h
//         }                                     // isse km complexity m krenge niche wale example m 
//     }
//     public static void main(String[] args)
//     {
//         int[] arr={4,2,1,5,7,6};
//         rightsum(arr);
//     }
// }




// above  question with time complexity O(n) :-


// class test
// {
//     static void rightsum(int[] arr)
//     {
//         int sum=0;
        
//         for(int i=0;i<=arr.length-1;i++)
//              sum=sum+arr[i];
//         for(int i=0;i<=arr.length-1;i++)
//         {
//              sum=sum-arr[i];
//              System.out.println(sum);
//         }
        
//     }
    
//     public static void main(String[] args) 
//     {
//         int [] arr={4,2,1,5,7,6};
//         rightsum(arr);    
//     }
// }




