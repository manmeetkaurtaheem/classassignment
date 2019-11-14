import java.util.*;
class Array200
{
    public static void main(String[] arg)
    {
        int[] arr=new int[10];
        int count=0;
        int product=1;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<k;j++)
            {
                product=product*arr[i+k];
            }
            if(product!=0)
            count++
                    }
                    System.out.println(count);
   }
}