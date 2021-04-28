package april_twentyeight;

public class Test6 {
    String str = new String("good");
    char[] ch = {'a','b','c'};

    public static void main(String[] args) {
        Test6 ex = new Test6();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str + " and ");
        System.out.print(ex.ch);
    }
    public static void change(String str, char ch[]){
        str = "test ok";
        ch[0] = 'g';
    }
}
