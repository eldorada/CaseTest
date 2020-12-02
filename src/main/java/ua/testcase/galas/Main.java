package ua.testcase.galas;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Dispatcher dispatcher = new Dispatcher();
        try {
            dispatcher.printResult();
        } catch (IOException | NullPointerException e) {
            System.out.println(e.getMessage());
        }

    }

}
