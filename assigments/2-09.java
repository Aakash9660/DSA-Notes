class test
{
    public static void main(String[] args)
    {
        int A[]={16,17,4,3,5,2};
        for(int i=0;i<A.length;i++)
        {
            int result=0;
            for(int j=i+1;j<A.length;j++)
            {
                if(A[i]<A[j])
                {
                  result++;
                //   break;
                }
            }     
           if(result==0)
           {
            System.out.println(A[i]);
           }
        }
    }
}