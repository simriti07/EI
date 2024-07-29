package gallery;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author DELL
 */
public class Exhibit implements GalleryComponent {
    private String name;
    private List<GalleryComponent> components = new ArrayList<>();

    public Exhibit(String name) {
        this.name = name;
    }

    public void addComponent(GalleryComponent component) {
        components.add(component);
    }

    public void removeComponent(GalleryComponent component) {
        components.remove(component);
    }

    @Override
    public void display() {
        System.out.println("Exhibit: " + name);
        for (GalleryComponent component : components) {
            component.display();
        }
    }

    @Override
    public void interact() {
        System.out.println("Interacting with Exhibit: " + name);
        for (GalleryComponent component : components) {
            component.interact();
        }
    }
}
