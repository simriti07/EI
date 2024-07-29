package client;

import gallery.*;
/**
 *
 * @author DELL
 */
public class DigitalArtGalleryDemo {
    public static void main(String[] args) {
        // Create media elements
        MediaElement image1 = new MediaElement("Sunset.jpg", "Image");
        MediaElement video1 = new MediaElement("Nature.mp4", "Video");
        MediaElement animation1 = new MediaElement("LoopingAnimation.gif", "Animation");
        MediaElement text1 = new MediaElement("Description.txt", "Text");

        // Create exhibits and add media elements
        Exhibit exhibit1 = new Exhibit("Nature Exhibit");
        exhibit1.addComponent(image1);
        exhibit1.addComponent(video1);

        Exhibit exhibit2 = new Exhibit("Interactive Art Exhibit");
        exhibit2.addComponent(animation1);
        exhibit2.addComponent(text1);

        // Create a main gallery exhibit
        Exhibit mainGallery = new Exhibit("Main Gallery");
        mainGallery.addComponent(exhibit1);
        mainGallery.addComponent(exhibit2);

        // Display the gallery and interact with it
        mainGallery.display();
        mainGallery.interact();
    }
}
