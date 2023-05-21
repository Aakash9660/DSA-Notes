//replace ith element by difference in left side right side sum


// class test
// {
//     static void print(int[] arr)
//     {
//         for(int i=0;i<=arr.length-1;i++)
//         System.out.print(arr[i]+" ");
//     }
//     static void replacerightleft(int[] arr)
//     {
//         int sum=0;
      
//         for(int i=0;i<=arr.length-1;i++)
//            sum=sum+arr[i];
//            int sum1=0;
//             int ls,rs;
//         for(int i=0;i<=arr.length-1;i++)
//         {
//             ls=sum1;
//             sum1=sum1+arr[i];
//             rs=sum-arr[i];
//             sum=sum-arr[i];
//             arr[i]=rs-ls;
//         }
//     }
//     public static void main(String[] args) 
//     {
//         int[] arr={4,5,2,3,7};   
//         print(arr);
//         System.out.println();
//         replacerightleft(arr);
//         print(arr);
//     }
// }




//left side minimum  :-

// class test
// {
//     static void leftsideminimum(int[] arr)
//     {
//         int min=arr[0];
//         System.out.print(-1+" ");
//         for(int i=1;i<=arr.length-1;i++)
//         {
//             System.out.print(min+" ");
//             if(arr[i]<min)            
//             min=arr[i];
//         }

//     }
//     public static void main(String[] args) 
//     {
//         int[] arr={9,4,3,5,8};
//         leftsideminimum(arr);    
//     }
// }





//right side minimum :-

// class test
// {
//     static void rightsideminimum(int[] arr)
//     {
//         for(int i=0;i<arr.length-2;i++)
//         {
//             int min=arr[i+1];
//             for(int j=i+2;j<=arr.length-1;j++)
//             {
//             if(arr[j]<min)
//             min=arr[j];
//             }
//             System.out.println(min);
//         }
//         System.out.println(-1);
//     }
//     public static void main(String[] args) 
//     {
//         int[] arr={9,4,3,5,8};
//         rightsideminimum(arr);
//     }
// }




// class test
// {
//     public static void main(String[] args) 
//     {
//         System.out.println(Math.abs(-5));    
//         System.out.println(Math.abs(5));     //abs ek method h joo hmesha +ve dete h or math class m present h or static h or java.lang m preenty h isliye import nhi kiya
//     }
// }




// difference in +ve and-ve of right side element :-


class test
{
    static void rightposneg(int[] arr)
    {
        for(int i=0;i<=arr.length-1;i++)  
        {
            int posum=0;
            int negsum=0;
            for(int j=i+1;j<=arr.length-1;j++)
            {
                if(arr[j]>0)
                posum=posum+arr[j];
                else
                negsum=negsum+arr[j];
            }
            System.out.println(posum+negsum);
        }  
    }
    public static void main(String[] args) 
    {
        int[] arr={5,-4,-3,2,-1,-7,6};
        rightposneg(arr);
        
    }
}


 