package TaskThree_Interface;

public class Chicken extends Animal implements Edible{
    public String sound(){
        return "Cagle";
    }
    public String howToEat(){
        return "Slaughter, dip in boiling water, remove feathers, cook and eat";
    }
}
