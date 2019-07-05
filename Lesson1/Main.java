package Lesson1;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        // task #1
        String[] strings = new String[2];
        strings[0] = "See";
        strings[1] = "noEvil";
        ArrayUtils.swap(strings, 0, 1);
        System.out.println(Arrays.toString(strings));

        // task #2
        ArrayList<String> list = ArrayUtils.asArrayList(strings);
        System.out.println(list);

        // task #3
        Box<Orange> oranges = new Box<>();
        oranges.addFruit(new Orange(1.1f));
        oranges.addFruit(new Orange(1.5f));
        oranges.addFruit(new Orange(1.4f));

        Box<Apple> apples = new Box<>();
        apples.addFruit(new Apple(1.0f));
        apples.addFruit(new Apple(.6f));
        apples.addFruit(new Apple(.5f));

        System.out.println(oranges.compare(apples));

        Box<Apple> apples1 = new Box<>();
        apples1.addFruit(new Apple(1.5f));

        System.out.println(apples);
        System.out.println(apples1);
        apples.dropToAnotherBox(apples1);
        System.out.println(apples1);

    }
}