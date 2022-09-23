import java.applet.*;
import java.awt.*;
public class testing extends Applet{
	Font f;
    public void init(){
		f = new Font("Arial", Font.BOLD, 26);
		resize(500,300);
		setBackground(Color.BLACK);
		setForeground(Color.GREEN);
	
}
    public void paint(Graphics g){
        int x = 0;
		int y = 0;
		String msg = "";
		x = Integer.parseInt(getParameter("xPosition"));
		y = Integer.parseInt(getParameter("yPosition"));
		msg = getParameter("msg");
		g.setFont(f);
		g.drawString(msg, x, y);
		
		
    }
}

/*<html>
<title> My Applet</title>
<hr>

<applet code="appletdemo.class" width="300" height="300">

<param name="msg" value="This is a test program"/>

<param name="xPosition" value= "150"/>

<param name="yPosition" value="50"/>

</applet>
</hr>
</html>*/
