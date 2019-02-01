package own_study.kids_book.pet;

public class PetMaster extends Pet {

    public static void main(String[] args) {
        String petReaction;
        Pet myPet = new Pet ();
        myPet.eat ();
        petReaction = myPet.say ("Чик!! Чирик!!");
        System.out.println (petReaction);
        myPet.sleep ();
    }
}
