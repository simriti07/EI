/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package artmasterstudio.memento;

import javafx.scene.image.WritableImage;
/**
 *
 * @author DELL
 */
public class Memento {
   private final WritableImage state;

    public Memento(WritableImage state) {
        this.state = state;
    }

    public WritableImage getState() {
        return state;
    } 
}
