package com.zsw_2020.data_2_24;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {

    public static void main(String[] args) {
        Path path = Paths.get("D:\\java");
        path.getName(3);
    }
}
