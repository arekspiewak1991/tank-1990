package gameplay;

import map.Map;
import tank.Tank;
import tank.UserTank;

import javax.swing.*;
import java.util.ArrayList;

public class Gameplay extends JPanel {
    private ArrayList<Tank> usersTank;

    public Gameplay() {
        this.usersTank = new ArrayList<>();
    }

    public void init(int width, int height, int users) {
        Map map = new Map(width, height);
        createUsers(users);
    }

    private void createUsers (int number) {
        for (int i = 0; i < number; i++) {
            String user = "User " + i;
            this.usersTank.add(new UserTank(user));
        }
    }
}
