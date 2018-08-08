package defining.classes;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class OpinionPool {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int lines = in.nextInt();
        String[] arrStr = new String[lines];
        in.nextLine();

        for (int i = 0; i < lines; i++) {
            arrStr[i] = in.nextLine();
        }

        TreeMap<String, Integer> strMap = new TreeMap();
        for (int i = 0; i < arrStr.length; i++) {
            String[] splitStr = arrStr[i].split(" ");
            if (Integer.parseInt(splitStr[1]) > 30) {


                strMap.put(splitStr[0], Integer.parseInt(splitStr[1]));
            }
        }

        for (Map.Entry<String, Integer> entry : strMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ". Value: " + entry.getValue());
        }
        //System.out.println(strMap.lastEntry());

    }
}
