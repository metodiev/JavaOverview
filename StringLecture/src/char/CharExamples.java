

public class CharExamples {
    public static void main(String []args){
        charCastChanegeCharValue();
        assignCharInteger();
        charSpecialLiterals();
        hexaChar();
    }

    public static void charCastChanegeCharValue(){
        char chy = 'Y';
        chy = (char)(chy + 1);

        System.out.println(chy);
    }

    public static  void assignCharInteger(){
        char chy = 'Y';

        int number = chy;
        System.out.println("chy number:" + number);

        char convertAciiNumbertoChar = (char) 89;

        System.out.println(convertAciiNumbertoChar);
    }

    public static void charSpecialLiterals(){
        char chy = '@';

        System.out.println((int)chy);
        char speciaNumber = (char) 64;
        System.out.println(speciaNumber);
    }

    public static void hexaChar(){
        char hexa = 'a';
        // u00AB
        System.out.println("\\u" + hexa);
        int charI = Integer.parseInt("0064", 16);
        char symbol = (char)charI;
        System.out.println(symbol);
    }
}