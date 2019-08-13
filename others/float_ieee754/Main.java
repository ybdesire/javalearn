public class Main {
    public static void main(String[] args) {
        int intBits = Float.floatToIntBits(3.14f);
        System.out.println( Integer.toHexString(intBits) );// 4048f5c3
        //check result here https://www.h-schmidt.net/FloatConverter/IEEE754.html
    }
}