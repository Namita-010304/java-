
import java.util.*;
public class odd_eve {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) 
        {
            if (num % 8 == 0) {
                System.out.println("num by 2 and 8");
            }
        } 
        else {

            if (num % 3 == 0) 
            {
                System.out.println("num by 3 and not by 2");
            }
        }
        sc.close();
    }
}

