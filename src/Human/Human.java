package Human;

public class Human {

    String name;
    int age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayHi() {
        System.out.println ("Hi! My name is " + name + ", I`m " + age + " years old.");
    }
    public static void main(String[] args){

        Human human = new Human ();
        human.name = "John";
        human.age = 20;

        String humanName = human.name;
        int humanAge = human.age;

        human.sayHi ();
    }

}
