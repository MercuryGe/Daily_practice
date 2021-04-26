package april_twenty_six;

abstract class Animal{
    abstract void say();
}
public class Cat extends Animal{

    public Cat(){
        System.out.println("I am a cat");
    }
    public static void main(String[] args){
        Cat cat = new Cat();
    }

    @Override
    void say() {

    }
}
