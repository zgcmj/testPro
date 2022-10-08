package leetcode;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.FieldAccessor_Long;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoNumbers {


    @Test
    public void test1() {
        Integer[] numbers = {15, 213, 456, 5, 88, 7, 45, 66};

        //Integer target = 20;
        //HashMap<Integer,Integer> numMap = new HashMap<>();
        //for (Integer number : numbers) {
        //    if (numMap.get(target-number)){
        //
        //    }
        //}

    }

    @Test
    public void test2() {
        String s = "";
        assert s == "";
    }

    @Test
    public void test3() throws IOException {

        File file = new File("list/image.jpg");

        List<String> list = Arrays.asList("12", "123");
        System.out.println(file.exists());
        FileUtils.writeLines(file,list);


    }
}
