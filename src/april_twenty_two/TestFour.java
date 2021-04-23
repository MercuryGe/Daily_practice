package april_twenty_two;

public class TestFour {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operator(a, b);
        System.out.println(a + "," + b);
        byte b1 = 1, b2 = 2, b3, b6;
        final byte b4 = 4, b5 = 6;
        b6 = b4 + b5;
        b3 = (byte)( b1 + b2);
        System.out.println(b3 + b6);
    }
    public static void operator(StringBuffer x, StringBuffer y){
        x.append(y); y = x;
    }
}
