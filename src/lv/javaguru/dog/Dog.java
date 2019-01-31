package lv.javaguru.dog;

public class Dog {
    int age;
    String color;
    String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public static void voice (){
        System.out.println ("Гав! Гав! Гав!");
    }
    public static void eat() {
        System.out.println ("Наверное уже пора есть!!!");
    }

    public static void sleep() {
        System.out.println ("Приятно познакомиться, но я спать...");
    }



}
