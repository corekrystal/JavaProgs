import java.util.*;
class A
{
    public static void main(String args[])
    {
        int i,j,k,n,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements of the array");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
            for(k=1;k<=n-1;k++)
        {
            temp=a[k];
            j=k-1;
            while (j>=0 && (temp<=a[j]))
            {
                    a[j+1]=a[j];
                    j=j-1;
            }
            a[j+1]=temp;
                
            }

            for(i=0;i<n;i++)
            {
                System.out.println(a[i]);
            }
         }
        }