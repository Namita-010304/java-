/**
 * patterns
 */
public class patterns {

    public static void main(String[] args) {
        // triangle pattern
        System.out.println("inc triangle ");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // decreasing triangle
        System.out.println("dec triangle ");
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // right sided increasing tringle
        System.out.println("right sided inc triangle ");

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // right sided decreasing tringle
        System.out.println("right sided dec triangle ");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("hill from triangle ");

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
        System.out.println("butterfly  from triangle ");

        for (int i = 1; i <= n; i++) {
            //upper part 
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
            //lower part
 for (int i = 1; i <= n; i++) 
 {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
