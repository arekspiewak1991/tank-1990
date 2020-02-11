package tank;

public class UserTank extends Tank {
    private int initialX = 200;
    private int initialY = 100;

    public UserTank(String name) {
        this.setName(name);
        this.setPosX(initialX);
        this.setPosY(initialY);
    }
}
