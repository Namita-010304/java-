public class oops1 {
    private int x;
    private int y;

    // Default constructor
    public oops1() {
        this.x = 0;
        this.y = 0;
    }
    // Constructor with two parameters
    public oops1(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // Constructor with an array parameter
    public oops1(int[] arr) {
        if (arr.length >= 2) {
            this.x = arr[0];
            this.y = arr[1];
        } else {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }
    }
    // Getter methods
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        oops1 obj1 = new oops1();          // Calls the default constructor
        oops1 obj2 = new oops1(3, 5);      // Calls the constructor with two parameters
        oops1 obj3 = new oops1(new int[]{7, 9}); // Calls the constructor with an array parameter

        // Testing objects
        System.out.println("Obj1: x = " + obj1.getX() + ", y = " + obj1.getY());
        System.out.println("Obj2: x = " + obj2.getX() + ", y = " + obj2.getY());
        System.out.println("Obj3: x = " + obj3.getX() + ", y = " + obj3.getY());
    }
}
