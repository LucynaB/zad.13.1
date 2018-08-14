package app;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        DataOperations.readData();
        DataOperations.sortData();
        DataOperations.saveData("stats.csv");

    }
}
