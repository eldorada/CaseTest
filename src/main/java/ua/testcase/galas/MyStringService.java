package ua.testcase.galas;

public class MyStringService {

    public String reverseStringWithRecursion(String inputString) {
        String rightPart;
        String leftPart;

        int length = inputString.length();

        if (length <= 1) {
            return inputString;
        }

        leftPart = inputString.substring(0, length / 2);

        rightPart = inputString.substring(length / 2, length);

        return reverseStringWithRecursion(rightPart) + reverseStringWithRecursion(leftPart);
    }
}
