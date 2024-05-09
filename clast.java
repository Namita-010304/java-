class clast {
    public static void main(String[] args) {
        try {
            // Division by zero
            int a = 5;
            int b = 0;
            int result = a / b; // Attempting division by zero
            
            // Index out of bounds exception
            int[] array = {1, 2, 3};
            int index = 5; // Accessing index out of bounds
            int value = array[index]; // Attempting to access element at index 5
            
            System.out.println("Result: " + result); // This won't be reached due to exception above
        } catch (ArithmeticException e1) {
            System.out.println("Caught ArithmeticException: Division by zero");
            e1.printStackTrace();
        } catch (IndexOutOfBoundsException e2) {
            System.out.println("Caught IndexOutOfBoundsException: Index out of bounds");
            e2.printStackTrace();
        }
    }
}
