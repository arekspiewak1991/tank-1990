package tank;

public abstract class Tank {
    private String name;
    private byte life;
    private int posX;
    private int posY;

    public byte getLife() {
        return life;
    }

    public void setLife(byte life) {
        this.life = life;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
