public class stringss {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "abcd";
        String s3 = new String("abcd");
        String s4 = new String("abcd");
        String s5 = "hello";

        // Convert s1 to uppercase
        String s1UpperCase = s1.toUpperCase();
        System.out.println("Uppercase of s1: " + s1UpperCase);

        // Convert s2 to lowercase
        String s2LowerCase = s2.toLowerCase();
        System.out.println("Lowercase of s2: " + s2LowerCase);

        // Check if s1 equals s2
        boolean s1EqualsS2 = s1.equals(s2);
        System.out.println("s1 equals s2: " + s1EqualsS2);

        // Check if s1 equals s3
        boolean s1EqualsS3 = s1.equals(s3);
        System.out.println("s1 equals s3: " + s1EqualsS3);

        // Check if s3 equals s4
        boolean s3EqualsS4 = s3.equals(s4);
        System.out.println("s3 equals s4: " + s3EqualsS4);

        // Check if s1 equals s5
        boolean s1EqualsS5 = s1.equals(s5);
        System.out.println("s1 equals s5: " + s1EqualsS5);
    }
}

