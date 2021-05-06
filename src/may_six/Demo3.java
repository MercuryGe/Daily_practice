package may_six;

class X{
    Y y = new Y();
    public X(){
        System.out.println("X");
    }
}
class Y{
    public Y(){
        System.out.println("Y");
    }

}
public class Demo3 extends X{
    Y y = new Y();
    public Demo3(){
        System.out.println("Z");
    }

    public static void main(String[] args) {
        new Demo3();
    }

}
