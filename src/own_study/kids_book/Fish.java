package KidsBook;

public class Fish extends Pet {
        public static void main (String [] args){
            Fish MyLittleFish = new Fish();
            MyLittleFish.sleep();
    }

    int currentDepth = 0;
    public int dive(int howDeep) {
        currentDepth = currentDepth + howDeep;
        System.out.println("Going for a depth " + howDeep + " feet");
        System.out.println("I`m on a depth " + currentDepth + " feet below sea line");
        return currentDepth;
    }


}
