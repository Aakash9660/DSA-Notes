
                                //  Fibonacci Series :- 
                                 // Q 1,2 .
                                
// class test
// {
//     public static void main(String[] args) {
//         int n = 13 ;
//         int [] arr = new int[n+1];
//         arr[0]=0;
//         arr[1]=1;
//         System.out.print(arr[0]+" ");
//         System.out.print(arr[1]+" ");
//         for(int i=2;i<=n;i++)
//         {
//             arr[i]=arr[i-1]+arr[i-2];
//             System.out.print(arr[i]+" ");
//         }
//     }
// }



                                // Q 3.  segregate even and odd no. put all even first then odd

// class test
// {
//     public static void main(String[] args) 
//     {
//         int arr[]={12,34,45,9,8,90,3};
//         int len = arr.length ;
//         int [] a= new int[len] ;
//         int j= 0;
//         int k = a.length-1 ;
//         int i = 0 ;
//         while (i<len)
//         {
//             if(arr[i]%2==0)
//             {
//                 a[j]=arr[i];
//                 j++ ;
//             }
//             else
//             {
//                 a[k]=arr[i];
//                 k-- ;
//             }
//             i++;
//         }
//         for(int p=0;p<a.length;p++)
//         {
//             System.out.print(a[p]+" ");
//         }
//     }
// }




                          // Q 4    String have all unique characters  :- 


class test
{
    static String checker(String s)
    {
        for(int i=0;i<s.length()-1;i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                return "false" ;
            }
        }
        return "true" ;
    }
    public static void main(String[] args) 
    {
        String s= "abcd10jk";
        String result = checker(s);
        System.out.println(result);

    }
}

