package app;

import data.NameComparator;
import data.PointsComparator;
import data.Score;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DataOperations {
    private static Scanner scan = new Scanner(System.in);
    private static List<Score> scores = new ArrayList<>();

    public static void readData() {
        String score;

        while (!scan.equals("stop")) {
            System.out.println("Podaj wynik kolejnego zawodnika (lub stop):");
            score = scan.nextLine();

            if (!score.equals("stop")) {
                String[] split = score.split(" ");
                scores.add(new Score(split[0], split[1], Integer.valueOf(split[2])));
            } else
                break;
        }


    }


    public static void sortData() {
        System.out.println("Wybierz algorytm sortowania (imię/nazwisko/punkty):");
        String wybor = scan.nextLine();

        switch (wybor) {
            case "nazwisko":
                Collections.sort(scores);
                break;
            case "imię":
                Collections.sort(scores, new NameComparator());
                break;
            case "punkty":
                Collections.sort(scores, new PointsComparator());
                break;
            default:
                System.out.println("Podałeś błędną wartość!");
        }

        System.out.println(scores);
    }

    public static void saveData(String path) throws IOException {
        FileWriter fw = new FileWriter(path);
        BufferedWriter bfw = new BufferedWriter(fw);

        for (int i = 0; i < scores.size(); i++) {
            bfw.write(scores.get(i).toString());
            bfw.newLine();
        }
        bfw.close();

        System.out.println("Zapisno dane w pliku " + path);
    }
}
