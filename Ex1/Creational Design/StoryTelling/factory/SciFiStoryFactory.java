/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import story.SciFiStory;
import story.Storyline;
/**
 *
 * @author DELL
 */
public class SciFiStoryFactory extends StorylineFactory {
    @Override
    public Storyline createStoryline() {
        return new SciFiStory();
    }
}
