/*Find the total number of bits needed to be flipped to convert x to y.
Input: 65 80
Output: 2*/

public class Example15 {

    public static int countBitsToFlip(int x, int y) {
        int xorResult = x ^ y;
        int count = 0;

        while (xorResult != 0) 
      {
            count += xorResult & 1;
            xorResult >>= 1;
        }

        return count;
    }

    public static void main(String[] args) {
        int x = 65;
        int y = 80;
        int bitsToFlip = countBitsToFlip(x, y);
        System.out.println("Number of bits to flip: " + bitsToFlip);
    }
}
