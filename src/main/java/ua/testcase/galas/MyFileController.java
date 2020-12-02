package ua.testcase.galas;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

public class MyFileController {

    public List<String> readLines(File name) throws IOException {
        return Files.readAllLines(name.toPath());
    }

    public void writeLines(File name, List<String> str) throws IOException {
        Files.write(name.toPath(), str, Charset.defaultCharset());
    }

}
