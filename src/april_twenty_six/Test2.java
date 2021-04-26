package april_twenty_six;

public class Test2 {
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run() {
                dianping();
            }
        };
        t.run();
        System.out.print("dazhong");
    }
    static void dianping(){
        System.out.print("dianping");
    }
}
