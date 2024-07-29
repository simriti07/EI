package factory;

import story.FantasyStory;
import story.Storyline;
/**
 *
 * @author DELL
 */
public class FantasyStoryFactory extends StorylineFactory {
    @Override
    public Storyline createStoryline() {
        return new FantasyStory();
    }
}
