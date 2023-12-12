package lesson1;

public class Die {
    private int topSide;
    private int numSides;

    // mutator method : when changing the state of the instance/object
    public void roll(){
        topSide = (int)(Math.random()*numSides) + 1;
    }

    public int getTopSide(){
        return topSide;
    }
}
