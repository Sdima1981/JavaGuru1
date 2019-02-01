package own_study.kids_book.pet;

class Fish extends Pet {
    int currentDepth = 0;

    public static void main(String[] args) {
        Fish MyLittleFish = new Fish ();
        MyLittleFish.sleep ();
    }

    public int dive(int howDeep) {
        currentDepth = currentDepth + howDeep;
        System.out.println ("Going for a depth " + howDeep + " feet");
        System.out.println ("I`m on a depth " + currentDepth + " feet below sea line");
        return currentDepth;
    }


}
