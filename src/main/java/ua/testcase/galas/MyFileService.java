package ua.testcase.galas;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyFileService {

    private MyFileController fileController = new MyFileController();
    private MyStringService stringService = new MyStringService();

    public List<String> reverseIfFibonacciIndex(File name) throws IOException {

        List<String> items = fileController.readLines(name);
        int i = 1;
        int j = 2;
        int FibonacciNumber = FibonacciNumbers(j);
        List<String> resultItems = new ArrayList<>();

        for (String str : items) {
            if (str != null) {
                if (i == FibonacciNumber) {

                    resultItems.add(stringService.reverseStringWithRecursion(str));

                    j += 1;
                    FibonacciNumber = FibonacciNumbers(j);
                }
                i++;
            }

        }
        return resultItems;
    }

    static int FibonacciNumbers(int n)
    {
        if (n <= 1)
            return n;
        return FibonacciNumbers(n-1) + FibonacciNumbers(n-2);
    }

}
