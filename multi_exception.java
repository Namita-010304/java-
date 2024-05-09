public class multi_exception 
{    public static void main(String[] args) {
        int i=2;
        int j=10;
        int x=0;
        int[] arr = new int[5];
        String str = null;
        try 
        {
            int i = str.length();  // This will throw NullPointerException

            int j = Integer.parseInt("abc");  // This will throw NumberFormatException

            int k = arr[10];  // This will throw ArrayIndexOutOfBoundsException
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println(" ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurred: " + e.getMessage());

        }
        catch (Exception e) //parennt class of every exception 
        {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}





/*/
Handling parents and child Exception both
-- when catching both child and parent exceptions in a try-catch block, it is generally recommended to catch the child 
  exceptions before the parent exception.

-- The reason for this is that if you catch the parent exception before the child exception, the catch block for the parent exception will also catch any child exceptions that are subclasses of the parent exception. 
This can make it more difficult to handle the child exceptions separately.
*/

//-- this will give compile time error i.e error: exception ArithmeticException has already been caught by Exception class
//right way:first child Exception then parents Exception  


/*
int a = 10;
int arr[]={3,4,5};
try{
  int b = 3/a;
  System.out.println(arr[b]);
}
catch(ArithmeticException e){
}
catch(Exception e){
  System.out.print("parent class of every exception");
}
*/