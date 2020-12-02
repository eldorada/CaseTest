package ua.testcase.galas;

import java.io.IOException;
import java.util.List;

public class Dispatcher {

    private final Config config;
    private final MyFileService fileService;
    private final MyFileController fileController;

    public Dispatcher() {

        config = new Config();
        fileService = new MyFileService();
        fileController = new MyFileController();
    }

    public void printResult() throws IOException {
        List<String> str = fileService.reverseIfFibonacciIndex(config.getInputFile());

        View consoleView = new ConsoleView();
        consoleView.print(str);
        View fileView = new FileView();
        fileView.print(str);
    }


}
