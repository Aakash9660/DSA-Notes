                             // Question 1 .
                   
// class test
// {
//     static String reverseWithoutSwapIndividual(String str)
//     {
//         String arr []=str.split("\\.");                  // ye kuch regular expression wali baat use aayi h 
//         String result="";                                          // split method  . k hisaab se word alag krti h 
//         for(int i=arr.length-1;i>=0;i--)
//         {
//             result=result+arr[i];
//             if(i!=0)
//             result=result+".";
//         }
//         return result ;
//     }
//     public static void main(String[] args) 
//     {
//         String str = "I.like.this.program.very.much";
//         reverseWithoutSwapIndividual(str);
//         String result =reverseWithoutSwapIndividual(str);    
//         System.out.println(result);
//     }
// }



                                // Question 2 .

// class test
// {
//     static int minimunDistanceFinder(String [] arr,String s1,String s2)
//     {
//         int min=Integer.MAX_VALUE,track1=-1,track2=-1;
//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i].equals("s1"))
//             track1=i;
//             else if(arr[i].equals("s2"))
//             track2=i;
//             if(track1!=-1 || track2!=-1)
//             {
//                 if(min>Math.abs(track2-track1))
//                 min=Math.abs(track2-track1);   
//             }
//         }
//         return min ;
//     }
//     public static void main(String[] args) 
//     {
//         String [] arr = {"code","csd","code","hello","planet"};
//         String s1="code";
//         String s2="planet";
//         int result=minimunDistanceFinder(arr,s1,s2);
//         System.out.println(result);
//     }
// }









class practice
{
    static void reverseWithoutSwapIndividual(String str)
    {
    	int len = str.length();
    	int i = len-1;
    	StringBuffer sb = new StringBuffer();
            while(i>=0)
            {
                while(str.charAt(i)!= '.')
                {
                	sb.append(str.charAt(i));
                	i-- ;
                }
                sb.reverse();
                // sb.append('.');
                System.out.println(sb);
            }
    }
    public static void main(String[] args) 
    {
        String str = "I.like.this.program.very.much";
        reverseWithoutSwapIndividual(str);
    }
}







