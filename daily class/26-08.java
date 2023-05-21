import javax.lang.model.util.ElementScanner14;

// 2 array h unmese extra element wali index ko print krana h :-

// class test
// {
//     static int extraelement(int[] arr,int[] arr1)
//     {
//         for(int i=0;i<=arr.length-1;i++)
//         {
//             if(arr[i]!=arr1[i])
//             return i;                        //ye return krega andar wali conmdition true hue too 
//         }
//         return -1;                   //yha return krana pdega kyuki method int m bnaya h hmne isliye agar  andar wali comndition true nhi hui too bhar se return hoga -1
//     }   
//     public static void main(String[] args) 
//     {
//         int[] arr={2,4,6,8,9,10,12};
//         int[] arr1={2,4,6,8,10,12};            //4 wali index etra h jispr 8 h too hme index print kramni h isliye 4 print hoga
//         int result=extraelement(arr,arr1);
//         System.out.println(result);
//     }
// }



                                  // same h upar wala :-

// class test
// {
//     static int extraelement(int[] arr,int[] arr1)
//     {
//         for(int i=0;i<=arr.length-1;i++)
//         {
//             if(arr[i]!=arr1[i])
//             return i;                        
//         }
//         return -1;               
//     }   
//     public static void main(String[] args) 
//     {
//         int[] arr={2,4,6,8,10,12};
//         int[] arr1={2,4,6,8,10,12};         //ab iss case m ek bhi index ka element aisa nhi joo extra hoo idliuy -1 return hoga
//         int result=extraelement(arr,arr1);
//         System.out.println(result);
//     }
// }





// class test
// {
//     static int extraelement(int[] arr,int[] arr1)
//     {
//         for(int i=0;i<=arr.length-1;i++)
//         {
//             if(arr[i]!=arr1[i])
//             return i;                        
//         }
//         return -1;               
//     }   
//     public static void main(String[] args) 
//     {
//         int[] arr={2,4,6,7};
//         int[] arr1={2,4,6};            //ab yha too exception aayega ArrayIndexOutofBound Exception kyuki jb arr[3]=arr1{3} condition chlegi too arr1 m too ye index h hii nhi        
//         int result=extraelement(arr,arr1);            //isko extra element ko use bhi kre or ye exception bhinhi aye iske liye next example
//         System.out.println(result);
//     }
// }


                          // agar extra elemnet last wala hua too aise hoga :-

// class test
// {
//     static int extraelement(int[] arr,int[] arr1)
//     {
//         for(int i=0;i<=arr.length-1;i++)
//         {
//             if(i>arr1.length-1  || arr[i]!=arr1[i])      //isse hm upoar wali exception koo hta diye iss condition se 
//             return i;                              
//         }
//         return -1;               
//     }   
//     public static void main(String[] args) 
//     {
//         int[] arr={2,4,6,7};
//         int[] arr1={2,4,6};            
//         int result=extraelement(arr,arr1);            
//         System.out.println(result);
//     }
// }





// class test
// {
//     static void pattern(int n)
//     {
//         for(int i=n;i>=1;i--)
//         {
//             int num=n-i+1;
//             for(int j=1;j<=i;j++)
//             {
//                 if(j==1 || j==i || i==n)         //or operator ka mtlb isme se kuch bhi hota h too too age waloi condition chlegi
//                {
//                 System.out.print(num+" ");
//                }
//                 else
//                {
//                 System.out.print("  ");
//                }
//                 num++;
//             }
//             System.out.println();
//         }
//     } 
//     public static void main(String[] args) 
//     {
//         int n=5;
//         pattern(n);    
//     }
// }




                         //array k sbhi elemnt ka ek no. bnana h jese arr{1,2,4}se 124:-

// class test
// {
//     static int numberformation(int[] arr)
//     {
//         int sum=0,temp=1;
//         for(int i=arr.length-1;i>=0;i--)
//         {
//             sum=sum+arr[i]*temp;
//             temp=temp*10;
//         }
//         return sum+1;
//     }
//     public static void main(String[] args) 
//     {
//         int[] arr={1,2,4};
//         int result=numberformation(arr);
//         System.out.println(result);    
//     }
// }


