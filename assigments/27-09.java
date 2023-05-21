import java.io.CharArrayReader;

// Question 1.


// class test
// {
//     static void result(String s)
//     {
//         StringBuffer sb=new StringBuffer(s);
//         StringBuffer sb1=new StringBuffer();
//         char c=sb.charAt(0);
//         char d=sb.charAt(1);
//         for(int i=2;i<sb.length();i++)
//         {
//             sb1.append(sb.charAt(i));
//         }
//         sb1.append(c);
//         sb1.append(d);
//         String s1=new String(sb1);
//         if(s.equals(s1))
//         System.out.println("true");
//         else
//         System.out.println("false");
//     }
//     public static void main(String[] args) {
//         String s="amazon";
//         String s1="azonam";
//         result(s);
//     }
// }



                            // Question 2.

// class test
// {
//     static void halfreverse(String s)
//     {
//         int n=s.length();
//         StringBuffer sb=new StringBuffer();
//         for(int i=n/2-1;i>=0;i--)
//         {
//             sb.append(s.charAt(i));
//         }
//         for(int i=n-1;i>=n/2;i--)
//         {
//             sb.append(s.charAt(i));
//         }
//         System.out.println(sb);
//     }
//     public static void main(String[] args) {
//         String s="codeplanet";
//         halfreverse(s);
//     }
// }



                         // Question 3.

class test
{
    static void reversehalfhalf(String s)
    {
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i+=2)
        {
            char c=s.charAt(i);
            sb.append(s.charAt(i+1));
            sb.append(c);
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String s="code";
        reversehalfhalf(s);
    }
}




                                 // Question 4.

// class test
// {
//     static void result(String s)
//     {
//         StringBuffer sb=new StringBuffer();
//         int l=s.length();
//         for(int i=l/2-1,j=l-1;i>=0;i--,j--)
//         {
//            sb.append(s.charAt(i));
//            sb.append(s.charAt(j));
//         }
//         if(l%2!=0)
//         {
//             sb.append(s.charAt(l/2));
//         }
//         System.out.println(sb);
//     }
//     public static void main(String[] args) {
//         String s="sunshine";
//         result(s);
//     }
// }

