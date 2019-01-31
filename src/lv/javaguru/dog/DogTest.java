package lv.javaguru.dog;

public class DogTest{
    public static void main(String[] args){
        Dog testDog = new Dog ();
        testDog.setName ("Мистер Пибоди");
        testDog.setColor ("Белая с черными ушами");
        testDog.setAge (45);

        String testDogName = testDog.getName ();
        String testDogColor = testDog.getColor ();
        int testDogAge = testDog.getAge ();

        System.out.println ("Нашу Тестовую собаку зовут " + testDogName + ".");
        System.out.println ("Она " + testDogColor + ".");
        System.out.println ("И ей уже " + testDogAge + " лет.");
        testDog.eat ();
        testDog.voice ();
        testDog.sleep ();
    }

}
