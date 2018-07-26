package string;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StringExamples {

    public static void main(String []args){

        //stringBuilder();
        simpleString();
        palindromes();
    }

    public static void stringBuilder(){
        //stringbuilder is not thread safe and it add to the string pool without any wating so its quicker than other buffers
        StringBuilder sb = new StringBuilder();

        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            sb.append("M");

            if (i >= 99999  ){
               continue;
            }else {
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
       sb.insert(1,1);
       System.out.println(sb);



        System.out.println(sb);
    }

    public static void simpleString(){
        String words = "";
        long startTime = System.nanoTime();
        for (int i = 0; i < 100 ; i++) {
            words+="My string " + i;
        }

        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
        //System.out.println(words);
    }

 //   miro orim
    public static void palindromes(){
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
}
