import java.util.*;
class jh
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter the sizze or the matrix of the array of nXn");
        n=in.nextInt();
        int x;int c=0;
        int a[][]=new int[n][n];System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                x=in.nextInt();
                if(x<=9)
                {
                    a[i][j]=x;
                }
                else if(x>9)
                {
                    System.out.println("Entered number is greater than 9, enter a number smaller than 10");
                    a[i][j]=in.nextInt();
                }
            }
        }
        
        for(int f=0;f<n;f++)
        {
            for(int h=0;h<n;h++)
            {
                System.out.print(a[f][h]);
            }
            System.out.println();
        }
        
        for(int y=0;y<n-1;y++)
        {
            for(int z=0;z<n-1;z++)
            {
                if((n-z-1)>0 && (n-y-1)>0)
                {
                    if(a[y][z]==1 && a[y][z+1]==2 && a[y+1][z]==3 && a[y+1][z+1]==4)
                    {
                        c++;
                    }
                }
                else if(n-z-1==0)
                {
                    if(a[y][z]==1 && a[y][0]==2 && a[y+1][z]==3 && a[y+1][0]==4)
                    {
                        c++;
                    }
                }
                else if(n-y-1==0)
                {
                    if(a[y][z]==1 && a[y][z+1]==2 && a[0][z]==3 && a[0][z+1]==4)
                    {
                        c++;
                    }
                }
                else if((n-z-1==0) && (n-y-1)==0)
                {
                    if(a[y][z]==1 && a[y][0]==2 && a[0][z]==3 && a[0][0]==4)
                    {
                        c++;
                    }
                }
            }
        }
        System.out.println("Total no of times the arrray is present ="+c);
    }
}
                        
