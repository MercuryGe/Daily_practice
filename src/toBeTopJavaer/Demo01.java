package toBeTopJavaer;

/**
 * Integer 缓存机制
 * */


public class Demo01 {

    public static void main(String... strings) {

        Integer integer1 = 3;
        Integer integer2 = 3;
        Integer integer8 = 3;
        Integer integer9 = 3;
        Integer integer5 = 10;
        Integer integer10 = 10;
        Integer integer6 = 126;
        Integer integer7 = 129;

        if (integer1 == integer2)
            System.out.println("integer1 == integer2");
        else
            System.out.println("integer1 != integer2");

        Integer integer3 = 300;
        Integer integer4 = 300;

        if (integer3 == integer4)
            System.out.println("integer3 == integer4");
        else
            System.out.println("integer3 != integer4");

    }
}
