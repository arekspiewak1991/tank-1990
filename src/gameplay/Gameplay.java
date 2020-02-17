package gameplay;

import map.Map;
import javax.swing.*;

public class Gameplay extends JPanel {
    public Gameplay() {
    }

    public void init(int width, int height) {
        Map map = new Map(width, height);
    }
}
