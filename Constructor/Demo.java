package Constructor;

class TestCons{
    int data;
    {
        System.out.println("Static block");
    }
    TestCons() {
        System.out.println("Main Constructor");
    }
    TestCons(int data) {
        this.data=data;
        System.out.println(data);
    }
}
class TestConsChild extends TestCons {
    TestConsChild() {
        System.out.println("Child Constructor");
    }
}
public class Demo {
    public static void main(String[] args) {
        //TestCons t = new TestCons(123);
        TestConsChild d=new TestConsChild();
    }
}
