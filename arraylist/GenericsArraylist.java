package arraylist;

import java.util.*;
import java.util.function.Consumer;

public class GenericsArraylist implements Iterable {

    public static void main(String[] args) {


        //collection subtyoes
        //Integer -> NUmber
        Integer s2 = 123;
        Number s1 = 123;
        System.out.println(s2==s1);

        double dVar = 123.1231;
        Number dNumber = 123.1231;
        System.out.println(dVar == Double.valueOf(dNumber.doubleValue()));
        System.out.println(dNumber.doubleValue());

        List numsFromBank = new ArrayList(getBankVariables()) ;


        for (Object obj: numsFromBank) {
            System.out.println("This is from bank account " + obj);

        }


        //privimite variable
        int primitiveInt = 2134;
        Integer referentVarialble = 123;

        List ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        ints.addAll(numsFromBank);
        int s = 0;

        for (int i = 0; i < ints.size(); i++) {
            System.out.println(ints.get(i));
        }
        for (Object n : ints) {
            System.out.println(n);
        }

        //Without generics
        List<Integer> intsWithoutGenerics = Arrays.asList(new Integer[] {
                new Integer(1), new Integer(2), new Integer(3)
        });

        for (int ss : intsWithoutGenerics) {
            System.out.println(ss);
        }

        //Arraylist generic
        List arrList = new ArrayList();

        arrList.add(12312313);
        arrList.add("asdfasdfasdfasdf");
        arrList.add(454.454545454);

        for (Object obj: arrList) {
            System.out.println(obj);
        }

        int sumVariable = sum(2 ,3);


        //iterator
        java.util.Iterator integerIterator =  ints.iterator();

     while ( integerIterator.hasNext()   ){
         System.out.println(integerIterator.next());
     }

     Collection  collection = new ArrayList();
     ((ArrayList) collection).add(123);
    }



    public static ArrayList getBankVariables(){
        List<Number> numbers = new ArrayList<Number>();
        numbers.add(1234123.4);
        numbers.add(12341234);
        numbers.add(123);
     return (ArrayList) numbers;
    }

    @Override
    public java.util.Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }

    interface Iterable<E>{
        public Iterable<E> iterrator();
    }

    interface  Iterator<E>{
        public Integer hasNext();
        public E next();
        public  void remove();
    }


    //grabagecollector scope
    private static int sum (int a, int b){
        Integer referenceVariable = 1;
        int sum  = 1;
        return  sum;
    }
}
