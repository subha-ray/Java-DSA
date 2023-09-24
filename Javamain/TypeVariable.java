package Javamain;
class Type{
    int a=100;
    static int b=500;
    void print() {
        System.out.println("Jai Shree Ram");
    }
}
public class TypeVariable {
    public static void main(String[] args) {
        Type D=new Type();
        D.print();
        System.out.println(D.a);
        D.a=200;
        D.b=1000;
        System.out.println(D.b);
        Type.b=1004;
        System.out.println(D.b);
    }
}
