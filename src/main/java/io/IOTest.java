package io;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOTest {

    @Test
    public void test1() throws IOException {

        try(FileInputStream fileInputStream = new FileInputStream("a.txt")){
            System.out.println("我被执行了");
            fileInputStream.read();
        }finally {
            System.out.println("我被执行了finally");
        }
    }
}
