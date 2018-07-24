package strings.string_processing.studentresult;

import java.util.Scanner;

public class StudentsResults {

    public static void main(String[] srgs) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();
        //String input = "Mara - 5, 4, 3";
        String[] inputArr = input.replace(" -", "").
                replace(",", "").split(" ");

        Double avarage = 0.0000;
        for (int i = 1; i < inputArr.length; i++) {
            //System.out.println(inputArr[i]);
             avarage += Float.parseFloat(inputArr[i]);
        }

        avarage = (avarage / (inputArr.length - 1));
        int counter = 0;
        System.out.println(String.format("%1$-10s|%2$7s|%3$7s|%4$7s|%5$7s|",
                "Name", "JAdv", "JavaOOP", "AdvOOP", "Average"));

        System.out.println(String.format("%1$-10s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f|",
                inputArr[0], Float.parseFloat(inputArr[1]), Float.parseFloat(inputArr[2]),
                Float.parseFloat(inputArr[3]), avarage));
    }
}
