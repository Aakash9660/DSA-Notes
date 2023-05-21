import java.util.Scanner;
class test
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);   
        int[] arr=new int[5];
        System.out.println("enter elements :  ");
        for(int i=0;i<5;i++)
        {
            arr[i]=s.nextInt();
        } 
        for(int i=0;i<5;i++)
        {
            System.out.print(arr[i]);
        }
    }
}
