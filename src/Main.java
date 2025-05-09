public class Main {
    public static void main(String[] args) {
      System.out.println("::group::Random Output");
      java.util.Random r = new java.util.Random(42L);
      
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < 64; i++)
      {
        long value = r.nextLong(Integer.MIN_VALUE, Long.MAX_VALUE);
        // Convert to hexadecimal with 16 digits, padding with leading zeros if necessary
        String hexValue = String.format("%016X", value);
      
        if (i > 0)
        {
          sb.append(", ");
        }
        sb.append("(long)0x");
        sb.append(hexValue);
      }
    
      System.out.println(sb.toString());
      System.out.println("\n::endgroup::");
    }
}
