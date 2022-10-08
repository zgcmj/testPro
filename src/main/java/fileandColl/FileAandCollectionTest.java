package fileandColl;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class FileAandCollectionTest {
    public static void main(String[] args) throws IOException {
        List<String> skuList = FileUtils.readLines(new File("C:\\Users\\Administrator.DESKTOP-TG2LINT\\Desktop\\TEST.txt"), "UTF-8");
        HashMap<String, Integer> countMap = new HashMap<>();
        for (String s : skuList) {
            Integer integer = countMap.get(s);
            if (integer == null) {
                countMap.put(s, 1);
            } else {
                countMap.put(s, ++integer);
            }
        }
        countMap.forEach((key, value) -> {
            System.out.println(key+"--"+value);
        });

    }
}
