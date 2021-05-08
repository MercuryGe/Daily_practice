package may_eight;

public class Demo3 {
    private static int x = 100;

    public static void main(String[] args) {
        Demo3 hs1 = new Demo3();
        hs1.x++;
        Demo3 hs2 = new Demo3();
        hs2.x++;
        hs1 = new Demo3();
        hs1.x++;
        Demo3.x--;
        System.out.println("x=" + x);
    }
}
