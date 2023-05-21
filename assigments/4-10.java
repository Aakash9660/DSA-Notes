

                  // equal point where open and close brackets are equal :-


class test
{
    static int point(String s)
    {
        int len = s.length();
        int open = 0,close = 0 ;
        int i = 0,j=len-1;
        while(i<j)
        {
            if(close>=open)
            {
                if(s.charAt(i)=='(')
                {
                    open ++ ;
                }
                i++ ;
            }
            else
            {
                if(s.charAt(j)==')')
                {
                    close++;
                }
                j--;
            }
        }
        return i+1 ;
    }
    public static void main(String[] args) 
    {
        String s="(())))(";
        int result = point(s);
        System.out.println(result);    
    }
}

