public class arr 
{
    public static void main(String[] args) 
    {
        //1-d array
        int[] arr1 = new int[10];
        arr1[0] = 98;
        arr1[1] = 90;
        arr1[2] = 97;
        arr1[3] = 9;
        arr1[4] = 8;
        arr1[5] = 7;
        arr1[6] = 6;
        System.out.println(arr1[4]);
        System.out.println(arr1.length);

        // iterate thr arr
        for (int i : arr1) {
            System.out.print(i + " ");
        }

        //2 d array
        int[][] arr2;
        arr2 = new int[3][3];
        arr2[0][1] = 2;
        arr2[0][2] = 2;
        arr2[0][0] = 3;
        arr2[1][1] = 4;
        arr2[1][2] = 5;
        arr2[1][0] = 6;
        System.out.println(arr2[0][1]);
        System.out.println(arr2.length);
        for (int i = 0; i < arr2.length; i++) 
        {
            for (int j = 0; j < arr2.length; j++) 
            {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }


        // reverse array
        //int [] arr_n=new int[10];

        int [] a ={1,2,3,4,5,6,7,8,9,10};
        int l =a.length;
        int n=Math.floorDiv(l,2);
        int temp;
        for(int i=0;i<n;i++)
        {
            temp=a[i];
            a[i]=a[l-i-1];
            a[l-i-1]=temp;
        }
        for(int element: a)
        {
            System.out.print(element + " ");
        }
        System.out.println();
        //max in above array
        int max=0;
        for(int e:a)
        {
            if(e>max)
            {
                max=e;
            }
        }
        System.out.println("the max element in array is "+max);
        boolean issorted=true;
        int [] b={13,24,45,56,67,78,98,76};

        for(int i=0;i<b.length-1;i++)
        {
            if(b[i]>b[i+1])
            {
                issorted=false;
                break;
            }
        }
         if(issorted)
         {
            System.out.println("array is sorted");
         }
         else{
            System.out.println("arr is not sorted");
         }
    }
}
