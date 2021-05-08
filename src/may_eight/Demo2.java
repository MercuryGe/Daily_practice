package may_eight;

public class Demo2 {
    public String str = "6";

    public static void main(String[] args) {
        Demo2 sv = new Demo2();
        sv.change(sv.str);
        System.out.println(sv.str);
    }
    public void change(String  str){
        str = "10";
    }
}
