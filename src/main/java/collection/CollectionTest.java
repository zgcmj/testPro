package collection;


import org.apache.commons.collections4.CollectionUtils;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class CollectionTest {


    @Test
    public void test1() {
        String str = "200010052212643 \n" +
                "200010002218864 \n" +
                "200010032280772 \n" +
                "200010032334689 \n" +
                "200010028123928 \n" +
                "200010051656702 \n" +
                "200010009515148 \n" +
                "200010008008244 \n" +
                "4442263073595 \n" +
                "200010020645703 \n" +
                "4442263259379 \n" +
                "200010027825433 \n" +
                "4422261474518 \n" +
                "4422261818712 \n" +
                "4422261915233 \n" +
                "4422261116860 \n" +
                "4422260195030 \n" +
                "4412260227350 \n" +
                "4412260121274 \n";
        String[] s = str.split(" ");
        List<String> strings = Arrays.asList(s);

        System.out.println(strings);

        String str2 = "200010052212643 \n" +
                "200010002218864 \n" +
                "200010032334689 \n" +
                "200010028123928 \n" +
                "200010051656702 \n" +
                "200010009515148 \n" +
                "200010008008244 \n" +
                "4442263073595 \n" +
                "200010020645703 \n" +
                "4442263259379 \n" +
                "200010027825433 \n" +
                "4422261474518 \n" +
                "4422261818712 \n" +
                "4422261915233 \n" +
                "4422261116860 \n" +
                "4422260195030 \n" +
                "4412260227350 \n" +
                "4412260121274";
        String[] s1 = str2.split(" ");
        List<String> strings1 = Arrays.asList(s1);

        Collection<String> subtract = CollectionUtils.subtract(strings, strings1);
        System.out.println(subtract);
    }

    @Test
    public void test2() {

        HashMap<String, String> one = new HashMap<>();
        one.put("458", "o0");
        one.put("459", "o20");
        one.put("899", "o20");

        HashMap<String, String> two = new HashMap<>();
        two.put("879", "ccc");
        two.put("899", "cc8c");

        HashMap<String, String> result = new HashMap<>();

        result.putAll(one);
        result.putAll(two);
        System.out.println(result);
    }

    @Test
    public void test3() {
        List<String> a = new ArrayList<>();
        a.add("张三");
        a.add("王五");
        a.add("李四");
        List<String> b = new ArrayList<>();
        b.add("赵六");
        b.add("孙七");
        b.add("王五");
        b.add("老八");

        for (String s : a) {
            for (String s1 : b) {
                if (s.equals(s1)) {
                    System.out.println(s + "==" + s1);
                    break;
                }
                System.out.println(s + "我会一直执行" + s1);
            }
        }
    }

    @Test
    public void test4() {
        List<String> a = new ArrayList<>();
        a.add("张三");
        a.add("王五");
        a.add("李四");
        List<String> b = new ArrayList<>();
        b.add("赵六");
        b.add("孙七");
        b.add("王五");
        b.add("老八");
        List<String> list3 = new ArrayList<>();
        list3 = a;
        System.out.println(list3);
        list3 = b;
        System.out.println(list3);
    }

    @Test
    public void test5() {
        List<String> arr = null;
        for (String s : arr) {
            System.out.println(s);
        }
    }

    @Test
    public void test6() {
        ConcurrentHashMap<String, AtomicBoolean> concurrentHashMap = new ConcurrentHashMap<>();

        AtomicBoolean atomicBoolean = concurrentHashMap.computeIfAbsent(null, k -> new AtomicBoolean(false));

        System.out.println(concurrentHashMap);
    }

    @Test
    public void test7() {
        HashMap<String, Integer> testMap = new HashMap<String, Integer>();
        testMap.put("李四", 1);
        testMap.put("张三", 1);
        testMap.put("王五", 1);
        //Collections.copy();
    }


    @Test
    public void test8() {

        //laiyishou fanxing duixaign tainjia
        ArrayList arrayList = new ArrayList();
        List coll = coll(arrayList, arrayList);
        ArrayList ss = ss(arrayList);
    }

    @Test
    public void test9() {
        ArrayList arrayList = new ArrayList();
        Object o = arrayList.get(0);
    }


    public <T> T coll(List<? super List> coll, T t) {

        return t;
    }

    public <T extends Collection> T ss(T t) {
        return t;
    }




}

