package strings.string_processing.parseurl;

import java.util.Scanner;

public class ParseUrl {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        //String input = "https://www.facebook.com/";
        int counter = 0;
        for (int i = 0; i < input.length() ; i++) {
            if (input.charAt(i) == ':'){
                counter++;
            }
        }


        if(counter < 2) {
            String protocol = input.split("://")[0];
            String[] inputArr = input.substring(protocol.length() + 1, input.length())
                    .replace("//", "")
                    .split("/");

            String server = inputArr[0];
            String resources = input.substring((protocol.length() + 4 + server.length()), input.length());
            System.out.println("Protocol = " + protocol);
            System.out.println("Server = " +inputArr[0]);
            System.out.println("Resources = " +resources);
        }
        else {
            System.out.println("Invalid URL");
        }
    }
}
