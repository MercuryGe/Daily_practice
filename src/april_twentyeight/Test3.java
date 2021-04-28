package april_twentyeight;

class A{
    public A(String str){

    }
}


public class Test3 {
    public static void main(String[] args){
        A classa = new A("he");
        A classb = new A("he");
        System.out.println(classa == classb);
    }
}
