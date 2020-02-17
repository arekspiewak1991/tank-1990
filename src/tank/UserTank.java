package tank;

public class UserTank extends Tank {
    private int initialX = 200;
    private int initialY = 100;
    private TankType type = TankType.Small;

    public UserTank(String name) {
        this.setName(name);
        this.setPosX(initialX);
        this.setPosY(initialY);
        this.setType(type);
    }
}
