package string;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StringExamples {

    public static void main(String[] args) {

        //stringBuilder();
        simpleString();
        palindromes();

        compareToString();
        compareToStringIgnoreCase();
        concatenateString();
        stringBuffer();
        copyValueOf();
        endsWithStr();
        equalsStr();
        getBytesStr();
        internStr();
        splitStr();
        replaceFirstStr();
    }

    public static void stringBuilder() {
        //stringbuilder is not thread safe and it add to the string pool without any wating so its quicker than other buffers
        StringBuilder sb = new StringBuilder();

        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            sb.append("M");

            if (i >= 99999) {
                continue;
            } else {
                sb.deleteCharAt(i);
            }


        }
        sb.append("My first");
        sb.deleteCharAt(1);
        System.out.println(sb);

        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);

        //check the position
        sb.append("Miroslav");
        int position = sb.indexOf("Miroslav");
        System.out.println(position);

        //sb insert
        sb.insert(1, 1);
        System.out.println(sb);


        System.out.println(sb);
    }

    public static void simpleString() {
        String words = "";
        long startTime = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            words += "My string " + i;
        }

        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
        //System.out.println(words);
    }

    //   miro orim
    public static void palindromes() {
        String word = "Kiro";
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            String str = word.charAt(i) + "";
            stack.push(str);
        }

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


        Queue<String> palindrome = new LinkedList<>();
        palindrome.add(word);

        System.out.println(((LinkedList<String>) palindrome).peekLast());
    }

    public static void compareToString() {
        String firstString = "Test";
        String secondString = "Test";

        //return 0 if the strings are the same and negative value if there are difference between
        //two strings
        int compareString = firstString.compareTo(secondString);

        System.out.println(compareString);
    }

    public static void compareToStringIgnoreCase() {
        String firstString = "Test";
        String secondString = "test";

        int compareString = firstString.compareToIgnoreCase(secondString);

        System.out.println(compareString);
    }

    public static void concatenateString() {
        String firstString = "Test";
        String secondString = "test";
        String whiteSpace = " ";

        String concatString = firstString.concat(whiteSpace).concat(secondString);
        System.out.println(concatString);

    }

    public static void stringBuffer() {
        //with capacity
        StringBuffer stringBuffer = new StringBuffer(100);

        for (int i = 0; i < 100; i++) {
            stringBuffer.append(i);
        }
        //print zero chars is try with stringbuffer.length()
        System.out.println(stringBuffer);

        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer.insert(1, "Name");

        stringBuffer1.insert(0, "My");
        System.out.println(stringBuffer1);
        stringBuffer1.replace(0, 1, "Test");
        System.out.println(stringBuffer1);

        StringBuffer palindromes = new StringBuffer();
        palindromes.append("kiro");
        palindromes.reverse();
        System.out.println(palindromes);

        //stringbuffer contentEquals
        StringBuffer stringBuffer2 = new StringBuffer("Kiro");
        String str = "Kiro";
        boolean compareStringWithStringBuffer = str.contentEquals(stringBuffer2);
        System.out.println(compareStringWithStringBuffer);

        //this will be slow because we have to convert StringBuffer to String
        int result = str.compareTo(stringBuffer2.toString());
        System.out.println(result);


    }


    public static void copyValueOf() {
        char[] firstString = "Test one".toCharArray();
        String secondString = "Test the second str";

        String thirdStr = secondString.copyValueOf(firstString, 2, 3);
        System.out.println(thirdStr);

    }

    public static void endsWithStr() {
        String fistStr = "Test kiro.";
        String secondStr = ".";

        boolean checkEndStr = fistStr.endsWith(secondStr);
        System.out.println(checkEndStr);
    }

    public static void equalsStr() {
        String str1 = "Test";
        Object str2 = "Test";

        boolean equal = str1.equals(str2);
        System.out.println(equal);

        String str3 = "test";
        System.out.println(str1.equalsIgnoreCase(str3));
    }

    public static void getBytesStr() {
        String str1 = "Kiro";
        byte[] byteArray = str1.getBytes();

        for (byte b : byteArray) {
            System.out.print(b);
        }

        System.out.println();
        String byteString = new String(byteArray);
        System.out.println(byteString);
    }


    public static void internStr() {
        String str1 = "Test";
        String str2 = "TEST ASDF ";
        System.out.println(str2.intern());
    }

    public static void splitStr() {
        String str = "This is split-str. This_is split str.";

        String[] splitArray = str.split("-", 0);
        for (int i = 0; i < splitArray.length; i++) {
            System.out.println(splitArray[i]);

        }

    }

    public static void replaceFirstStr() {
        String str1 = "I want to replace <This value>";
        String str2 = "This";

        //this will replace everything in the string
        String thirdStr = str1.replaceFirst("(.*)" + "<This value>" + "(.*)", str2);
        System.out.println(thirdStr);

        String str4 = str1.replace("<This value>", str2);
        System.out.println(str4);
    }
}
