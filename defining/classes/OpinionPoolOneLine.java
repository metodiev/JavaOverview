package defining.classes;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class OpinionPoolOneLine {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String arrStr = in.nextLine();


        String[] arrSplitArrayFinal = arrStr.split(" ");

        TreeMap<String, Integer> strMap = new TreeMap();

        for (int i = 0; i < arrSplitArrayFinal.length; i++) {

            int tmpInt = 0;
            String tmpString = "";
            for (int j = i++; j < arrSplitArrayFinal.length; j++) {

                if (j % 2 == 0 || j == 0) {
                    tmpString = arrSplitArrayFinal[j];
                } else {
                    tmpInt = Integer.parseInt(arrSplitArrayFinal[j]);
                }

                if (tmpString.length() > 0 && tmpInt > 0) {
                    break;
                }
            }

            if (tmpInt > 30) {

                strMap.put(tmpString, tmpInt);
                //strMap.put(splitStr[0], Integer.parseInt(splitStr[1]));
            }
        }

        for (Map.Entry<String, Integer> entry : strMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ". Value: " + entry.getValue());
        }
        //System.out.println(strMap.lastEntry());

    }
}
