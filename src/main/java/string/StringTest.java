package string;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class StringTest {

    public static void main(String[] args) {

    }


    @Test
    public void test1() {
        String str = "whoshishui zs";
        int sh = str.indexOf("h");
        System.out.println(sh);
        String substring = str.substring(sh);
        System.out.println(substring);

    }

    @Test
    public void test2() {

        String test = "0,B84546";
        String substring = test.substring(test.indexOf(",") + 1);
        System.out.println(substring);
    }

    @Test
    public void test3() {
        String name = "zhang";
        name = name + "san";
        System.out.println(name);
    }

    @Test
    public void test4() {
        StringBuilder sb = new StringBuilder();
        String skuLinkTemp = "88888";
        sb.append("https://www.amazon.com/dp/")
                .append(skuLinkTemp)
                .append("?th=1&psc=1");
        System.out.println(sb);
    }

    @Test
    public void test5() {
        HashMap<String, Integer> countMap = new HashMap<>();
        String test = "";
        countMap.put("", 1);
        countMap.put("", 2);
        countMap.put(null, 3);
        Integer integer = countMap.get(null);
        System.out.println(integer);
        System.out.println(countMap);
    }

    @Test
    public void test6() {
        String test = "74.91.26.90:40005:hl:888888";
        String[] split = test.split(":");
        List<String> list = Arrays.asList(split);
        System.out.println(split.length);
        System.out.println(list);
    }

    @Test
    public void test() {
        String asin = "1234567890SK";
        String substring = asin.substring(0, 10);
        String substring1 = asin.substring(10);
        System.out.println(substring1);
    }

    @Test
    public void test8() {
        String asin = "B0888M8SYTQ";
        String substring = asin.substring(0, 10);
        String end = asin.substring(10);
        System.out.println(substring + "-" + end);
    }

    @Test
    public void test9() {

        String start = StringUtils.substring("B08HCXQCLHD", 0, 10);
        System.out.println(start);
        List<String> list = new ArrayList<>();
        list.add("B07GWBQBZXD");
        list.add("B08HCXQCLHD");
        list.add("B09V2KVHG1D");
        list.add("B0888M8SYPQ");

        list = list.stream().map(item -> {
            String result = StringUtils.substring(item, 0, 10);
            return result;
        }).collect(Collectors.toList());
        System.out.println(list);
    }

    @Test
    public void test10() {
        String length = "6090982293570";
        System.out.println(length.length());

    }

    @Test
    public void test11() {
        String src = "cc88b7b3-65c9-402a-b91e-4645c7d4f437";
        int i = src.hashCode();
        System.out.println(i);
        //299049866
        //299049866
        //299049866
    }

    @Test
    public void test12() {
        int num = ~1;
        System.out.println(num);
    }

    @Test
    public void test13() {

        Long max = ~(-1L << 5);
        System.out.println(max);
    }

    @Test
    public void test14() {
        System.out.println(Runtime.getRuntime().availableProcessors());
    }

    @Test
    public void test15() {
        SnowflakeUtils instance = SnowflakeUtils.getInstance();

    }

    @Test
    public void test16() {
        Boolean aBoolean = Boolean.FALSE;

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("23", "true");
        hashMap.forEach((key, value) -> {

            System.out.println(key+"-*-"+value);
            boolean b = Boolean.parseBoolean(value);
            System.out.println(b);
            String s = String.valueOf(b);
            System.out.println(s);
        });

    }

    @Test
    public void test17(){
    }

}
