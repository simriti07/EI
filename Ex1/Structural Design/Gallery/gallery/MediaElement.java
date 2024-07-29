/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gallery;

/**
 *
 * @author DELL
 */
public class MediaElement implements GalleryComponent {
    private String name;
    private String mediaType;

    public MediaElement(String name, String mediaType) {
        this.name = name;
        this.mediaType = mediaType;
    }

    @Override
    public void display() {
        System.out.println(mediaType + ": " + name);
    }

    @Override
    public void interact() {
        System.out.println("Interacting with " + mediaType + ": " + name);
    }
}
