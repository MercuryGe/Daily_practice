package april_twenty_three;

public class Test2 {
    public static int getValue(int i){
        int result = 0;
        switch (i){
            case 1:
                result = result + i;
            case 2:
                result = result + i * 2;
            case 3:
                result = result + i * 3;
        }
        return result;
    }
    public static void main(String[] args) {
        Thread t = new Thread(){
            public void run(){
                pong();
            }
        };
        t.run();
        System.out.println("ping");

        System.out.println(getValue(2));
    }
    static void pong(){
        System.out.println("pong");
    }

}
