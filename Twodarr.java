import java.util.*;
public class Twodarr 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no of rows ");
        int r=sc.nextInt();
        System.out.print("eneter no of cols ");
        int c=sc.nextInt();

        int [][]arr=new int [r][c];
        System.out.println("start entering the arr elements int he row below ");
        
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<r;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(" the arr elements  will be in the row below ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<r;j++)
            {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

        System.out.println("enter no u wish to search");
        int x=sc.nextInt();
        System.out.print("lets find i and j for the no u wish to search");

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<r;j++)
            {
                if(arr[i][j]==x)
                {
                    System.out.print("row "+i +"col "+j);
                }
            }
            System.out.println();
        }
    }
}
