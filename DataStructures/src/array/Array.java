package array;

public class Array {

    public  static void main(String[] args){

        //impelemnt some array
        int [] numArr = {1 ,2, 3, 4};
        int [] numArrEqual = {1 ,2, 3, 4};

        //clone array
        int[] secondNumArr = numArr.clone();
        for (int i = 0; i < numArr.length; i++) {
            System.out.println(secondNumArr[i]);
        }

        //equals and hachcode
        int numHashCode = numArr.hashCode();
        System.out.println(numHashCode);
        System.out.println(secondNumArr.hashCode());

        System.out.println(numArr.equals(numArrEqual));

        //string equals and hashcode
        //String pool
        String str = "Test";
        String strTwo = "Test";

        str = "no";
        System.out.println(str.hashCode());
        System.out.println(strTwo.hashCode());
        System.out.println(str.equals(strTwo));

        String strNew = "test";
        String strNewTwo = new String("test");

        System.out.println(strNew.hashCode());
        System.out.println(strNewTwo.hashCode());
        System.out.println(strNew.equals(strNewTwo));



        String s1 = "Cat";
        String s2 = "Cat";
        String s3 = new String("Cat");

        System.out.println("s1 == s2 :"+(s1==s2));
        System.out.println("s1 == s3 :"+(s1==s3));

        System.out.println(s1.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s1.equals(s3));

    }

}
