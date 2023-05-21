         // replace element with right side positiove minus negative :-


// class test
// {
//     static void replace(int arr[])
//     {
//         int posum=0;
//         int negsum=0;

//         for(int i=0;i<=arr.length-1;i++)
//         {
//             if(arr[i]>0)
//             posum=posum+arr[i];
//             else
//             negsum=negsum+arr[i];
//         }
//         negsum=Math.abs(negsum);
//         for(int i=0;i<=arr.length-1;i++)
//         {
//             if(arr[i]>0)
//             posum=posum-arr[i];
//             else
//             negsum=negsum+arr[i];
//             System.out.println(posum-negsum);
//         }
        
//     }
//     public static void main(String[] args) 
//     {
//         int arr[]={5,-4,-3,2,-1,-7,6};   
//         replace(arr); 
//     }
// }





       //index having left sum equal to right sum :-


// class test
// {
//     static int leftsumequalrightsum(int[] arr)
//     {
//         int sum=0;
//         int ls=0;
//         for(int i=0;i<=arr.length-1;i++)
//         {
//             sum=sum+arr[i];
//         }
//         for(int i=0;i<=arr.length-1;i++)
//         {
//             sum=sum-arr[i];
//             if(ls==sum)
//               return i;
//             ls=ls+arr[i];
//         }
//         return -1;
//     }
//     public static void main(String[] args) 
//     {
//         int[] arr={5,3,-1,4,6,1};
//         int result=leftsumequalrightsum(arr);   
//         System.out.println(result); 
//     }
// }





//  jo bhi input dalle us number ka revese krke print krana h :-

// import java.util.Scanner;
// class test
// {
//     static int reverse(int num)
//     {
//         int result=0;
//         while(num>0)
//         {
//         result=result*10+num%10;
//         num=num/10;
//         }
//         return result;
//      }
//     public static void main(String[] args) 
//     {
//         Scanner s=new Scanner(System.in);
//         System.out.println("enter any no. : ");
//         int num=s.nextInt(); 
//         int result=reverse(num);   
//         System.out.println(result);
//     }
// }



// aise index find krni h jiske right side ka sum uske left k sum k reverse k equal hoo :-



// class test
// {
//     static int reverse(int num)
//         {
//             int result=0;
//             while(num>0)
//             {
//             result=result*10+num%10;
//             num=num/10;
//             }
//             return result;
//          }
//     static int reverseleftsumequalrightsum(int[] arr)
//         {
//             int sum=0;
//             int ls=0;
//             for(int i=0;i<=arr.length-1;i++)
//                 sum=sum+arr[i];
//             for(int i=0;i<=arr.length-1;i++)
//             {
//                 sum=sum-arr[i];
//                 if(reverse(ls)==sum)
//                   return i;
//                 ls=ls+arr[i];
//             }
//             return -1;
//         }
//         public static void main(String[] args) 
//         {
//             int[] arr={14,18,19,16,10,5};
//             int result=reverseleftsumequalrightsum(arr);   
//             System.out.println(result); 
//         }
// }





