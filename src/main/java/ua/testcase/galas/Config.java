package ua.testcase.galas;

import java.io.File;

public class Config {

    private File inputFile;
    private File outputFile;

    public Config(String inputStr, String outputStr) {
        inputFile = setInputFile(inputStr);
        outputFile = setOutputFile(outputStr);

    }

    public Config() {
        inputFile = setInputFile("source.txt");
        outputFile = setOutputFile("output.txt");
    }

    public File getOutputFile() {
        return outputFile;
    }

    public File getInputFile() {
        return inputFile;
    }

    private File setInputFile(String str) {
        return new File(str);
    }

    private File setOutputFile(String str) {
        return new File(str);
    }
}
