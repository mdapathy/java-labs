import com.lablll.labwork4.*;

public class Main {

    public static void main(String[] args) {
        Line[] lines = new Line[2];
        for (int i = 0; i < lines.length; i++) {
            lines[i] = new Line();
            lines[i].display();
        }

        Rectangle rectangle = new Rectangle(new LineAdapter(lines[0]), new LineAdapter(lines[1]));
        rectangle.display();

    }
}
