package may_eight;

public class Demo1 {
    public static void main(String[] args) {

        Integer i01 = 59;
        int i02 = 59;
        Integer i03 = Integer.valueOf(59);  // 这种方法不会创建新的对象
        Integer i04 = new Integer(59);

        System.out.println(i03 == i04); // false
        System.out.println(i01 == i02); //
        System.out.println(i01 == i03); // true
        System.out.println(i02 == i04);
        System.out.println(i01 == i04);

        System.out.println(i01);
        System.out.println(i02);
        System.out.println(i03);
        System.out.println(i04);
    }
    // 一个Unicode编码占两个字节，一个字节占8个比特位，所以每个Unicode码占用16个比特位
}
