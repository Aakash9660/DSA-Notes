class test
{
    static void productof(int[] arr)
    {
        int total=1;
        for(int i=0;i<=arr.length-1;i++)
        {
            total=total*arr[i];
        }
        int result;
        for(int i=0;i<=arr.length-1;i++)
        {
            result=total/arr[i];
            System.out.println(result);
        }
    }
    public static void main(String[] args) 
    {
        int arr []={2,3,3,5,7};
        productof(arr);    
    }
}