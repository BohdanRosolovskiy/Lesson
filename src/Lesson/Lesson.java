package Lesson;

import java.util.Random;
import java.util.stream.IntStream;

class Homework
{
    //завдання 3
    public static void main(String[] args) {


        var randomNumber = new Random(). nextInt (100);

        if (randomNumber% 3 == 0) {
            System.out.println ("div на 3");
        } else if (randomNumber% 5 == 0) {
            System.out.println ("div на 5");
        } else if (randomNumber% 7 == 0) {
            System.out.println ("div на 7");
        } else {
            System.out.println (randomNumber);}}}
class RandomString {
    public static final String SOURCES =
            "qwertyuiop";

    public static void main(String[] args) {
        RandomString rs = new RandomString();
        System.out.println(rs.generateString(new Random(), SOURCES, 10));


    }

     // завдання 1
    public String generateString(Random random, String characters, int length) {
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = characters.charAt(random.nextInt(characters.length()));
        }
        return new String(text);
    }
}
//завдання 2
class Sum {
    public static void main(String[] args){
        int sum=0;
        for(int i=0; i<=15; i=i+2)
        if (i%2==0){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

    class Cycle {
        public static void main(String[] args) {

            for (int i = 1; i <= 50; i++)
                if(i%7==0){
                System.out.println(i);
                    int array[] = {7,14,21,28,35,42,49,};
                    int sum = 0;
                    for (int element : array)
                        sum += element;

                        System.out.println(sum);




        }

    }
}







