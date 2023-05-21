                                      



                  // Q 2.       // Decimal to Binary :-

                            // binary ka base 2 hota h krte hna apan 2^0*2^1*2^2.................

// class test
// {
//     public static void main(String[] args) {
//         int n=625 ;
//         int ld;
//         StringBuffer sb = new StringBuffer();
//         while(n>0)
//         {
//             ld=n%2;
//             n=n/2;
//             sb.append(ld);
//         }
//         sb.reverse();
//         System.out.println(sb);
//     }
// }




                                      // Q 3.       // decimal to hexadecimal   
            // hexadecimal ka base 16 hota h   hexadecimal m (1-9 or a-f digits hoti h)a=10,b=11,c=12 aise hota h 


// class test
// {
//     static StringBuffer toHexadecimal(int n)
//     {
//         StringBuffer sb = new StringBuffer();
//         int ld ;
//         while(n>0)
//         {
//             ld = n%16 ;
//             if(ld>9)
//             {
//                 sb.append((char)(ld+55));           //a ki unicore value 65 hoti h, b ki 66 aise chlta h 
//             }
//             else
//             sb.append(ld);
//             n=n/16 ;
//         }
//         sb.reverse();
//         return sb ;
//     }
//     public static void main(String[] args) {
//         int n=45 ;
//         StringBuffer result=toHexadecimal(n);
//         System.out.println(result);
//     }
// }




                          // Binary to decimal  :- 

             
// class test
// {
//     static int toDecimal(String s)
//     {
//         int len=s.length();
//         int sum=0,num=1;
//         for(int i=len-1;i>=0;i--)
//         {                                                   // abhi ye binary ka 1 character m aara h too isko covert krna pdega 
//             char ch = s.charAt(i);                         // 0 ki unicore value 48,1 ki 49 ....... aise chlta h 
//             int x= ch-48;
//             sum=sum+(x*num);
//             num=num*2;
//         }
//         return sum ;

//     }
//     public static void main(String[] args) {
//         String s="1011";
//         int result = toDecimal(s);
//         System.out.println(result);
//     }
// }





