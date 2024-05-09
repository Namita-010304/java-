
public class armstrong
{
    static boolean isArmstrong(int n)
    {
        int temp, digits = 0, last = 0, sum = 0;
        temp = n;
        while (temp > 0)
        {
            temp = temp / 10;

            digits++;
        }
        temp = n;
        while (temp > 0)
        {
            last = temp % 10;
            sum += (Math.pow(last, digits));
            // removes the last digit

            temp = temp / 10;
        }
        if (n == sum)
            return true;
        else
            return false;
    }

    // driver code

    public static void main(String args[])
    {
        
        int num = Integer.parseInt(args[0]);
        if (isArmstrong(num))
        {
            System.out.println("The given number " + num + " is an armstrong number");
        }
        else
        {
            System.out.println("The given number " + num + " is not an armstrong number");
        }
    }
}

