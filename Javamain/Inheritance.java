package Javamain;

import com.sun.tools.javac.Main;

class Dhoni {
    int a=10;
    void house() {
        System.out.println("Normal house");
    }
}
class DhoniKaBeta extends Dhoni {
    void house() {
        System.out.println("Modified house");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dhoni d=new Dhoni();
        d.a=100;
        System.out.println(d.a);
        d.house();
        DhoniKaBeta s=new DhoniKaBeta();
        System.out.println(s.a);
        s.house();
    }
}
