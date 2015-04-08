package client;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class UserData
{
	public String username;
	public BufferedImage face;
	
	public UserData(String newUser) {
		username = newUser;
		
		
		try {
			face 
			= ImageIO.read(CurveClient.class.getResource("/res/profileimg.png"));
			/*face.getGraphics().drawImage(tempimg, 
					0, 0, tempimg.getWidth(), tempimg.getHeight(), 
					0, 0, 50, 50, null);*/
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public String toString() {
		return username;
	}
}
