public class Main {
    public static void main(String[] args) {
      System.out.println("::group::Random Output");
      java.util.Random r = new java.util.Random(42L);
      
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < 64; i++)
      {
        int value = r.nextInt(100, 150);
        // Convert to hexadecimal with 8 digits, padding with leading zeros if necessary
        String hexValue = String.format("%08X", value);
      
        if (i > 0)
        {
          sb.append(", ");
        }
        sb.append("(int)0x");
        sb.append(hexValue);
      }
    
      System.out.println(sb.toString());
      System.out.println("\n::endgroup::");
    }
}
