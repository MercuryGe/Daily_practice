package may_six;

public class Demo2 {
    private int count;

    public static void main(String[] args) {
        Demo2 test = new Demo2(88);
        System.out.println(test.count);
    }
    Demo2(int a){
        count=a;
    }
}
