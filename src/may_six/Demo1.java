package may_six;

public class Demo1 {
    public String name = "abc";

    public static void main(String[] args) {
        Demo1 test = new Demo1();
        Demo1 testB = new Demo1();
        System.out.println(test.equals(testB)+ "，" + test.name.equals(testB.name));
    }
}
