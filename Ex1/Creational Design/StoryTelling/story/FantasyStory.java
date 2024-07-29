package story;

/**
 *
 * @author DELL
 */
public class FantasyStory implements Storyline {
    @Override
    public void createNarrative() {
        System.out.println("Creating a magical world filled with wizards and dragons.");
    }

    @Override
    public void interactWithCharacters() {
        System.out.println("Interacting with elves, dwarves, and other fantasy creatures.");
    }

    @Override
    public void plotTwist() {
        System.out.println("The dragon was a guardian protecting a hidden kingdom.");
    }
}
