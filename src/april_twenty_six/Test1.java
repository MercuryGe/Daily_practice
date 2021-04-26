package april_twenty_six;

public class Test1 {
    public static void fun(){
        int x = 20, y = 30;
        boolean b;
        b = x > 50 && y > 60 || y < -60 || x < -50 && y > 60 || x < -50 && y < -60;
        System.out.println(b);
    }

    public static void main(String[] args) {
        fun();
    }
}
