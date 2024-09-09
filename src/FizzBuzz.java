/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        int i = 0;
         while (i < 101) {
             i = doFizzBuzz(i);
         }
    }

    private static int doFizzBuzz(int i) {
        // Print our appropriate result.
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("Fizz Buzz");
        } else if (i % 3 == 0) {
            System.out.println("Fizz");
        } else if (i % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
        i++;
        return i;
    }
}
