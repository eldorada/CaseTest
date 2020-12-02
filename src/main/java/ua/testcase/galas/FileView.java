package ua.testcase.galas;

import java.io.IOException;
import java.util.List;

public class FileView implements View {

    private final Config config = new Config();
    private final MyFileController fileController = new MyFileController();

    public void print(List<String> str) throws IOException {
        fileController.writeLines(config.getOutputFile(), str);
    }

}
