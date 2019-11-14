import java.util.*
public class SubArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int k=sc.nextInt();
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=1;j<5;j++)
        {
            for(int i=0;i<j;i++)
            {
                if(arr[i]>=4)
                System.out.println(arr[i]);

            }
        }



    }
}