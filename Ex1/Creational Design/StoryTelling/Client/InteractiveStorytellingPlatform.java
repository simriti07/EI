package client;

import factory.FantasyStoryFactory;
import factory.MysteryStoryFactory;
import factory.SciFiStoryFactory;
import factory.StorylineFactory;
import story.Storyline;
/**
 *
 * @author DELL
 */
public class InteractiveStorytellingPlatform {
    public static void main(String[] args) {
        // Create Fantasy Story
        StorylineFactory fantasyFactory = new FantasyStoryFactory();
        Storyline fantasyStory = fantasyFactory.createStoryline();
        fantasyStory.createNarrative();
        fantasyStory.interactWithCharacters();
        fantasyStory.plotTwist();

        // Create Mystery Story
        StorylineFactory mysteryFactory = new MysteryStoryFactory();
        Storyline mysteryStory = mysteryFactory.createStoryline();
        mysteryStory.createNarrative();
        mysteryStory.interactWithCharacters();
        mysteryStory.plotTwist();

        // Create Sci-Fi Story
        StorylineFactory sciFiFactory = new SciFiStoryFactory();
        Storyline sciFiStory = sciFiFactory.createStoryline();
        sciFiStory.createNarrative();
        sciFiStory.interactWithCharacters();
        sciFiStory.plotTwist();
    }
}
