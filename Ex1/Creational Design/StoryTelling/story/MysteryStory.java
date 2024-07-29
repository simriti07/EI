/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package story;

/**
 *
 * @author DELL
 */
public class MysteryStory implements Storyline {
    @Override
    public void createNarrative() {
        System.out.println("Setting up a suspenseful mystery with clues to uncover.");
    }

    @Override
    public void interactWithCharacters() {
        System.out.println("Interrogating suspects and finding hidden connections.");
    }

    @Override
    public void plotTwist() {
        System.out.println("The butler, long thought dead, was behind the plot all along.");
    }
}
