
                            //  Question 1 .

// class test
// {
//     static void contains123(int arr[])
//     {
//         for(int i=0;i<arr.length;i++)
//         {
//             int n=arr[i],ld,flag1;
//             int flag=0;
//             while(n>0)
//             {
//                 ld=n%10;
//                 if(ld!=1 && ld!=2 && ld!=3)
//                 {
//                     flag=1;
//                 }
//             }
//             if(flag==0)
//             {
//                 System.out.println(arr[i]);
//             }
//         }
//     }
//     public static void main(String[] args) 
//     {
//         int arr[]={1231,1234,321,1212};
//         contains123(arr);    
//     }

// }

                            // Question 2. 

// class test
// {
//     static int nearestmultipleof10(int n)
//     {
//         int a=n/10,b;
//         a=a*10;
//         b=a+10;
//         if(n-a>b-n)
//             return b;
//         else
//             return a;
//     }
//     public static void main(String[] args) 
//     {
//         int n=25;
//         int result=nearestmultipleof10(n);
//         System.out.println(result);    
//     }
// }


                              // Question 3. 

class test
{
    static String maxOccuringWord(String []arr)
    {
        int max=0,count;
        String result=" ";
        for(int i=0;i<arr.length;i++)
        {
            count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i].equals(arr[j]))
                count++;
            }
            if(count>max)
            {
                max=count;
                result=arr[i];
            }
        }
        return result;
    }
    public static void main(String[] args) 
    {
        String  []arr={"csd","code","csd","code","planet","code"};
        String result=maxOccuringWord(arr);
        System.out.println(result);
    }
}

 
           