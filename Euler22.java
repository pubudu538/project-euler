import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Euler22 {

    public static void main(String[] args) {

        String data = "";
        File myObj = new File("e22-names.txt");
        try (Scanner myReader = new Scanner(myObj)) {
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
            }
            myReader.close();
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }

        String[] nameList = data.split("\",\"");

        nameList[0] = nameList[0].substring(1, nameList[0].length());

        String val = nameList[nameList.length - 1];
        String temp = val.substring(0, val.length() - 1);
        nameList[nameList.length - 1] = temp;

        Arrays.sort(nameList);
        int totalSum = 0;
        for (int i = 0; i < nameList.length; i++) {

            int letterSum = 0;
            char[] letters = nameList[i].toCharArray();
            for (int j = 0; j < letters.length; j++) {
                int letterValue = (int) letters[j] - 64;
                letterSum += letterValue;
            }
            totalSum = totalSum + (i + 1) * letterSum;
        }

        System.out.println(totalSum);

    }
}
