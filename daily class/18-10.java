
                                 // pairs with sum = 11 ; () there are total 3 pairs with sum =11)
                       
// class test
// {
//     public static void main(String[] args) 
//     {
//         int arr []= {8,5,3,6,7,9,2};
// 		int count = 0 ;
// 		for(int i=0;i<arr.length;i++)
// 		{
// 			for(int j=i+1;j<arr.length;j++)
// 			{
// 				if(arr[i]+arr[j]==11)
// 					count++ ;
// 			}
// 		}
// 		System.out.println(count);   
//     }
// }



                     // isiko Hashset se krre h complexity kam ho jayegi : -

// import java.util.HashSet;
// class test
// {
//     static int pairsWith11(int arr[],int sum)
//     {
//         int count = 0 ;
//         HashSet s = new HashSet();
//         for(int i=0;i<arr.length;i++)
//         s.add(arr[i]);
//         for(int i=0;i<arr.length;i++)
//         {
//             if(s.contains(sum-arr[i]))
//             count++ ;
//         }
//         return count/2 ;                        // same pair 2 baar count hora h trace krke dkh isliye /2 return kiya h 
//     }
//     public static void main(String[] args) 
//     {
//         int sum = 11 ;
//         int arr []= {8,5,3,6,7,9,2};
//         int result = pairsWith11(arr,sum);
//         System.out.println(result);
//     }
// }




import java.util.HashSet;
class test
{
    static boolean pythagorusTriplet(int arr [])
    {
        int n= arr.length ;
        int sum ;
        HashSet s= new HashSet();
        for(int i=0;i<n;i++)
            s.add(arr[i]*arr[i]) ;
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                sum = arr[i]*arr[i]+arr[j]*arr[j];
                if(s.contains(sum)==true)
                return true ;
            }
        }
        return false ;
    }
    public static void main(String[] args) 
    {
        int arr []={3,2,4,6,5};              // true 
        // int arr []={3,8,5};                 // false   
        boolean result = pythagorusTriplet(arr); 
        System.out.println(result);
    }
}
