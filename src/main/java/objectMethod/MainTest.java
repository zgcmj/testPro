package objectMethod;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        A a = new A();
        a.setName("A");
        a.setAge("12");

        A aa = new A();
        aa.setName("AA");
        aa.setAge("13");

        A a2 = new A();
        a2.setName("A2");
        a2.setAge("22");

        A a3 = new A();
        a3.setName("A");
        a3.setAge("12");

        List<A> aList = new ArrayList<>();
        aList.add(a);
        aList.add(aa);

        List<A> a2List = new ArrayList<>();
        a2List.add(a2);
        a2List.add(a3);

        Collection<A> intersection = CollectionUtils.intersection(aList, a2List);
        System.out.println(intersection);
        Collection<A> subtract = CollectionUtils.subtract(aList, a2List);
        for (A a1 : subtract) {
            System.out.println(a1);
        }




    }
}
