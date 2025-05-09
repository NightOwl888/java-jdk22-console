public class Main {
    public static void main(String[] args) {
      System.out.println("::group::Random Output");
      java.util.Random r = new java.util.Random(42L);
      
      for (int i = 0; i < 64; i++)
      {
        long value = r.nextLong((long)Integer.MAX_VALUE + 5L);
        // Convert to hexadecimal with 16 digits, padding with leading zeros if necessary
        String hexValue = String.format("%016X", value);

        if (i > 0) {
          System.out.print(" ");
        }
        System.out.print("(long)0x");
        System.out.print(hexValue);
        System.out.print(",");
      }
    
      System.out.println("\n::endgroup::");
    }
}
