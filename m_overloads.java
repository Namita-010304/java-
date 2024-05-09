
//varargs
public class m_overloads {
    public static int sum(int ...arr)
    {
        int sum=0;
        for(int a:arr)
        {
            sum=sum+a;
        }
        return sum;
    }
    public static void main(String[] args) {
       // int a=2,b=3,c=4;
        System.out.println(sum(6,7));
        System.out.println(sum(7,7,8));
    }
}
