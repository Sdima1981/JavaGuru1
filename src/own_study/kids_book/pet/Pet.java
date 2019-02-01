package own_study.kids_book.pet;

class Pet {
    int age;
    float weight;
    float color;

    void sleep() {
        System.out.println ("Спокойной ночи! До завтра!");
    }

    void eat() {
        System.out.println ("Я очень голоден, давайте перкусим чипсами!");
    }

    String say(String aWord) {
        String petResponse = "Ну ладно!! " + aWord;
        return petResponse;
    }
}
