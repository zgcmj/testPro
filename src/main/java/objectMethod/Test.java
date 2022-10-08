package objectMethod;


public class Test {

    public static  void main(String[] args) throws CloneNotSupportedException {
            B b = new B();
            b.setName("装三");
            b.setAge("15");
            b.setB("B");

        B clone = (B)b.clone();

        clone.setName("clone");
        clone.setAge("18");
        clone.setB("clone");
        System.out.println(b);
        System.out.println(clone);


    }
}
