
                // Q 1  subarray bnanaa h (k) ki value se todke or unme se joo max h usko print krate rhna h 

       
// class test {
// 	static void checkMaxByK(int []a,int k)
// 	{
// 		for(int i=0;i<=a.length-k;i++)
// 		{
// 			int max =a[i];
// 			for(int j=i+1;j<i+k;j++)
// 			{
// 				if(max<a[j])
// 					max=a[j];
// 			}
// 			System.out.print(max+" ");
// 		}
// 	}
// 	public static void main(String[] args) {
// 		int a[]= {8,5,10,7,9,4,15,12,90,13};
// 		int k=4;
// 		checkMaxByK(a,k);
// 	}
// }




                        // Q 2    if duplicate then return true else return false 

// class test
// {
//     static boolean containduplicate(int []a)
// 	{
// 		for(int i=0;i<a.length;i++)
// 		{
// 			for(int j=i+1;j<a.length;j++)
// 			{
// 				if(a[i]==a[j])
// 					return true ;
// 			}
// 		}
// 		return false ;
// 	}
// 	public static void main(String[] args) {
// 		int a[]= {10,20,15,40,30};
// 		boolean result = containduplicate(a);
// 		System.out.println(result);
// 	}
// }




                // Q 3 hashset duplicate allow nhi krta too isse krre h upar wala complexity km hori h isse

                
import java.util.HashSet ;
class test
{
    static boolean duplicate(int []a)
	{
		HashSet hs = new HashSet<>();
		int n=a.length ;
		for(int i=0;i<n;i++)
			hs.add(a[i]);
		if(hs.size()==n)
			return false ;
		else 
			return true ;
	}
	public static void main(String[] args) {
		int a[]= {10,20,10,40,45};
		boolean result = duplicate(a);
		System.out.println(result);
	}
}









