class test
{
    public static void main(String[] args) 
    {
        int arr[]={1,2,3};
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]%arr[i]==0)
                {
                    count++;
                }
            }
            if(count>1)
            {
                System.out.println(count);
            }
        }    
    }
}