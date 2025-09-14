package WorkDir110925.jenerics;

import java.applet.Applet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<? extends Fruit> list = Arrays.asList(new Apple());
        Fruit f = list.get(0);
//        list.add(new Apple());
        System.out.println(f);


        Box<Apple> appleBox = new Box<>();
        appleBox.setItem(new Apple());
        Apple myapple = appleBox.getItem();
    }
}


class Fruit {

    public void eat() {
        System.out.println("Ем фрукт");
    }

}

class Apple extends Fruit {

    @Override
    public void eat() {
        System.out.println("Ем яблоко");;
    }
}

class Banana extends Fruit {

    @Override
    public void eat() {
        System.out.println("Ем банан");
    }
}

class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

