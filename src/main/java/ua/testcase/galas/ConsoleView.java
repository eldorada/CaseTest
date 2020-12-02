package ua.testcase.galas;

import java.util.List;

public class ConsoleView implements View {

    public void print(List<String> str) {
        System.out.println(str);
    }

}
