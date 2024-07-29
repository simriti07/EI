package artmasterstudio.memento;

import javafx.scene.canvas.Canvas;
import javafx.scene.image.WritableImage;

import java.util.Stack;
/**
 *
 * @author DELL
 */
public class Caretaker {
    private final Stack<Memento> undoStack = new Stack<>();
    private final Stack<Memento> redoStack = new Stack<>();

    public void saveState(Canvas canvas) {
        WritableImage currentState = canvas.snapshot(null, null);
        undoStack.push(new Memento(currentState));
        redoStack.clear();
    }

    public void undo(Canvas canvas) {
        if (!undoStack.isEmpty()) {
            Memento memento = undoStack.pop();
            redoStack.push(new Memento(canvas.snapshot(null, null)));
            restoreState(canvas, memento);
        }
    }

    public void redo(Canvas canvas) {
        if (!redoStack.isEmpty()) {
            Memento memento = redoStack.pop();
            undoStack.push(new Memento(canvas.snapshot(null, null)));
            restoreState(canvas, memento);
        }
    }

    private void restoreState(Canvas canvas, Memento memento) {
        canvas.getGraphicsContext2D().drawImage(memento.getState(), 0, 0);
    }
}
