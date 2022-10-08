package collection;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("zs", "ls", "ww");
        list.stream()
                .filter(item -> item.length()>1)
                .map(item->{
                    System.out.println(item);

                    item.toUpperCase(Locale.ROOT);

                    System.out.println("---");
                    return item;
                })
                .collect(Collectors.toList());

    }
}
