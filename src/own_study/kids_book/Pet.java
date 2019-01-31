package KidsBook;

 class Pet {
    int age;
    float weight;
    float color;

    public void sleep(){
            System.out.println("Спокойной ночи! До завтра!");
    }
    public void eat() {
            System.out.println("Я очень голоден, давайте перкусим чипсами!");
    }
    public String say(String aWord) {
            String petResponse = "Ну ладно!! " + aWord;
        return petResponse;
    }
}
