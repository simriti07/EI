/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package artmasterstudio;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
/**
 *
 * @author DELL
 */
public class DrawingCanvas extends Canvas {
    private GraphicsContext gc;

    public DrawingCanvas(double width, double height) {
        super(width, height);
        gc = getGraphicsContext2D();
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(1);
    }

    public void setColor(Color color) {
        gc.setStroke(color);
    }

    public void drawLine(double startX, double startY, double endX, double endY) {
        gc.strokeLine(startX, startY, endX, endY);
    }
}
