package HW_4;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();
        Apple apple7 = new Apple();

        ArrayList<Apple> apples1 = new ArrayList<>();
        apples1.add(apple1);
        apples1.add(apple2);
        apples1.add(apple3);

        ArrayList<Orange> oranges1 = new ArrayList<>();
        oranges1.add(orange1);
        oranges1.add(orange2);
        oranges1.add(orange3);
        oranges1.add(orange4);

        Box<Apple> appleBox1 = new Box<>(apples1);

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.add(apple4);
        appleBox2.add(apple5);
        appleBox2.add(apple6);
        appleBox2.add(apple7);

        Box <Orange> orangeBox1 = new Box<>(oranges1);

        System.out.println(appleBox1);
        System.out.println(appleBox2);
        System.out.println(orangeBox1);
        System.out.println("--------------");

        appleBox1.shift(appleBox2);

        System.out.println(appleBox1);
        System.out.println(appleBox2);
        System.out.println(orangeBox1);
        System.out.println("--------------");

        appleBox2.shift(appleBox1);

        System.out.println(appleBox1);
        System.out.println(appleBox2);
        System.out.println(orangeBox1);
        System.out.println("--------------");

        System.out.println(orangeBox1.compare(appleBox1));
        System.out.println("--------------");

        Box<Orange> orangeBox2 = new Box<>();
        Orange orange5 = new Orange();
        Orange orange6 = new Orange();
        Orange orange7 = new Orange();
        Orange orange8 = new Orange();

        orangeBox2.add(orange5);
        orangeBox2.add(orange6);
        orangeBox2.add(orange7);
        orangeBox2.add(orange8);


        System.out.println(appleBox1);
        System.out.println(appleBox2);
        System.out.println(orangeBox1);
        System.out.println(orangeBox2);
        System.out.println("--------------");

        System.out.println(orangeBox1.compare(orangeBox2));
        System.out.println("--------------");

        orangeBox1.shift(orangeBox2);

        System.out.println(appleBox1);
        System.out.println(appleBox2);
        System.out.println(orangeBox1);
        System.out.println(orangeBox2);
        System.out.println("--------------");


        }



}
