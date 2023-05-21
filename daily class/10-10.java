 
                                   // Q.1   fibonacci series :-


// class test
// {
//     static void fibonacci(int n)
//     {
//         int num1=0;
//         int num2=1;
//         int num3 ;
//         for(int i=1;i<=n;i++)
//         {
//             System.out.println(num1);
//             num3=num1+num2 ;
//             num1=num2;
//             num2=num3;
//         }
//     }
//     public static void main(String[] args) 
//     {
//         int n=10;
//         fibonacci(n);    
//     }
// }




                                // Q 2    hexadecimal to decimal  :-

// class test
// {
//     static int todecimal(String s)
//     {
//         StringBuffer sb = new StringBuffer();
//         int num=1,sum=0;
//         for(int i=s.length()-1;i>=0;i--)
//         {
//             char ch = s.charAt(i);
//             if(ch>='0' && ch<='9')
//                 sum=sum+(ch-48)*num ;
//             else
//                 sum=sum+(ch-87)*num ;
//             num=num*16 ;
//         }
//         return sum ;
//     }
//     public static void main(String[] args) 
//     {
//         String s = "b4" ;
//         int result = todecimal(s); 
//         System.out.println(result);       
//     }
// }


                                // Q 3  isme ye manna h a=1,b=2,c=3 firr inse multiply krana h
                // isme unicode vale hoti h h na small 'a' ki 97 uske respect m ye value nikal lege 


// class test
// {
//     static int multiplyAndSum(String s,String s1)
//     {
//         int sum = 0 ;
//         for(int i=0;i<s.length();i++)
//         {
//             sum=sum+(s.charAt(i)-48)*(s1.charAt(i)-96);
//         }
//         return sum ;
//     }
//     public static void main(String[] args) {
//         String s = "43508";
//         String s1 = "acyzb";
//         int result=multiplyAndSum(s,s1);
//         System.out.println(result);
//     }
// }

               

                       // Q 4   s2 string m unique h too hii multiply krna h orr add krna h 


// class test
// {
//     static int multiplyAndSumIfUniqueinS2(String s1,String s2)
//     {
//         int sum = 0,count ;
//         for(int i=0;i<s1.length();i++)
//         {
//             count = 0 ;
//             for(int j=0;j<s2.length();j++)
//             {
//                 if(s2.charAt(i)==s2.charAt(j))
//                 count++ ;
//             }
//             if(count==1)
//                 sum=sum+(s1.charAt(i)-48)*(s2.charAt(i)-96);
//         }
//         return sum ;
//     }
//     public static void main(String[] args) 
//     {
//         String s1 = "435082";
//         String s2 = "acycby";
//         int result=multiplyAndSumIfUniqueinS2(s1,s2);
//         System.out.println(result);    
//     }
// }


                         // Q 

                                   








