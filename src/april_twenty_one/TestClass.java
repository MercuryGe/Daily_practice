package april_twenty_one;

public class TestClass {

    private static void testMethod(){
        System.out.println("testMethod");
    }

    public static void main(String[] args) {
        ((TestClass)null).testMethod();
    }
}
