package strings.string_processing.parsetags;

import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ParseTags {

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //String input = in.nextLine();

        String input = "<upcase>StringBuilder</upcase> is <upcase>awesome</upcase>";
        String[] separateWords = input.replace("<upcase>", "")
                .replace("</upcase>", "").split(" ");

        int countWord = countWords(input);
        int counter = 0;
        String lastString = "";
        //  System.out.println(countWord);
        for (int i = 0; i < countWord; i++) {

            int startIndex = input.indexOf("<upcase>", input.indexOf("<upcase>") + i);
            int endIndex = input.indexOf("</upcase>", input.indexOf("</upcase>") + i);
            //  int startIndex = input.indexOf("<upcase>");
            //  int endIndex = input.indexOf("</upcase>");

            //System.out.println(startIndex);
            // System.out.println(endIndex);
            String subStr = input.substring(startIndex, endIndex).replace("<upcase>", "");

            String setence = input.replace("<upcase>", "")
                    .replace(subStr, "")
                    .replace("</upcase>", subStr.toUpperCase());
            for (int j = 0; j < separateWords.length; j++) {

                if (counter >= 1) {

                    if (separateWords[j].equals(lastString.split(" ")[0]) || counter > 1) {
                        if(counter > 2) {
                            if (separateWords[j].equals(subStr.split(" ")[0])) {
                                System.out.print(subStr.toUpperCase());
                            }else {

                                System.out.print(separateWords[j]);
                            }

                            System.out.print(" ");

                        }
                        counter++;
                    }
                } else {


                    if (separateWords[j].equals(subStr.split(" ")[0])) {
                        System.out.print(subStr.toUpperCase());
                        System.out.print(" ");
                        counter++;
                        lastString = subStr;
                        break;
                    } else {
                        System.out.print(separateWords[j]);
                    }
                    System.out.print(" ");
                }
            }
            // System.out.println(setence);
            // System.out.println(subStr);
        }
        StringBuilder sb = new StringBuilder();

    }

    public static int countWords(String input) {

        int wordCount = 0;
        String[] splitInput = input.split(" ");

        for (int i = 0; i < splitInput.length; i++) {
            if (splitInput[i].contains("<upcase>")) {
                wordCount++;
            }
        }
        return wordCount;
    }
}
