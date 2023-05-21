
                 // print duplicate elements :-
                //  ----------------------

// class test
// {
//     public static void main(String[] args) 
//     {
//         int arr[]={5,4,3,5,4,9};
//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=i+1;j<arr.length;j++)                 // agr array m 9 ki jagah 5 likhunga too output 5,4,5 aajayegqa pr kyuki 5 teen ho jayenge isme isliye pr apan ko 2 hii 5 chiye too niche likha h usk code
//             {
//                 if(arr[i]==arr[j])
//                 {
//                    System.out.println(arr[i]);
//                    break;
//                 }
//             }
//         }
//     }
// }




                           // above question  again :-  (due to mention problem)
              // agar duplicate 2 se jada ho too upar wale code m problem aayegi uska solution h 
             

// class test
// {
//     public static void main(String[] args) 
//     {
//         int arr[]={5,4,3,5,4,9,5,5,4,4,5};
//         for(int i=0;i<arr.length;i++)
//         {
//             int flag=0;
//             if(arr[i]!=-1)
//         {
//             for(int j=i+1;j<arr.length;j++)                
//             {
//                 if(arr[i]==arr[j])
//                 {
//                     flag=1;
//                     arr[j]=-1;
//                 }
//             }
//         }
//             if(flag==1)
//                 {
//                     System.out.println(arr[i]);
//                 }
//         }
//     }
// }
         




                //   isme hm duplicate ko print krrare h or wo jitni baar aara h usko bhi print krare h 


class test
{
    public static void main(String[] args) 
    {
        int arr[]={5,4,3,5,4,9,5,5,4};
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            if(arr[i]!=-1)
        {
            for(int j=i+1;j<arr.length;j++)                
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    arr[j]=-1;
                }
            }
        }
            if(count>0)
                {
                    System.out.println(arr[i]+" "+count);
                }
        }
    }
}
