package own_study.kids_book.pet;

public class FishMaster extends Fish {
    public static void main(String[] args) {
        Fish myFish = new Fish ();

        myFish.dive (2);
        myFish.dive (3);
        String myFishReaction = myFish.say ("What the hell");
        myFish.sleep ();
        System.out.println (myFishReaction);
    }

}

