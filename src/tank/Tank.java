package tank;

public class Tank {
    private String name;
    private byte life;
    public int posX;
    public int posY;

    public TankType getType() {
        return type;
    }

    public void setType(TankType type) {
        this.type = type;
    }

    private TankType type;

    public byte getLife() {
        return life;
    }

    public void setLife(byte life) {
        this.life = life;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int changeX) {
        int temp = this.posX + changeX;

        if (temp < 25) {
            this.posX = 25;
        } else if (temp > 700) {
            this.posX = 700;
        } else {
            this.posX = temp;
        }
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int changeY) {
        int temp = this.posY + changeY;

        if (temp < 25) {
            this.posY = 25;
        } else if (temp > 700) {
            this.posY = 700;
        } else {
            this.posY = temp;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
