package tank;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class UserTank extends Tank {
    private int initialX = 200;
    private int initialY = 200;
    private TankType type = TankType.Small;
    private BufferedImage image;

    public UserTank(String name) throws IOException {
        image = ImageIO.read(new File("src/tank/tank_user_1.png"));
        this.setName(name);
        this.setPosX(initialX);
        this.setPosY(initialY);
        this.setType(type);
    }

    public void drawTank(Graphics g) {
        g.drawImage(image, posX, posY, 50,50, null);
    }
}
