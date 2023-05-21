// class test
// {
//     static int leftsmallerrightgreater(int arr [])
//     {
//         for(int i=0;i<=arr.length-1;i++)
//         {
//             for(int j=i+1;j<=arr.length-2;j++)
//             {
//                 if(arr[j]>arr[j-1] && arr[j]<arr[j+1])
//                 return arr[j]; 
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) 
//     {
//         int arr[]={4,2,3,5,7};
//         int n=leftsmallerrightgreater(arr);  
//         System.out.println(n);  
//     }
// }



// class test
// {
//     static int leftsmallerrightgreater(int arr [])
//     {
//         int max=arr[1];
//         for(int i=0;i<=arr.length-1;i++)
//         {
//             if(arr[i]>max)
//             return max;
//             for(int j=1;j<=arr.length-2;j++)
//             {
//                if(arr[j]>max && arr[j]<arr[j+1])
//                 return arr[j]; 
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) 
//     {
//         int arr[]={4,2,3,5,7};
//         int n=leftsmallerrightgreater(arr);  
//         System.out.println(n);  
//     }
// }







