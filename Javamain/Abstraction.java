package Javamain;

abstract class AbstractionTest {
    abstract int sum();
    public void print() {
        System.out.println("Subha");
    }
}
class Abstract extends AbstractionTest {
    int sum() {
        System.out.println("Sonu");
        return 10;
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Abstract s=new Abstract();
        s.sum();
        s.print();
        AbstractionTest M=new Abstract();
    }
}
