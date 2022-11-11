import java.applet.*;
import java.awt.*;
public class appletprac extends Applet{
    public void init(){
        setBackground(Color.black);
        // setFont(getFont());
    }
    public void start(){
        System.out.println("Start invoked");
    }
    public void paint(Graphics g){
        g.setColor(Color.green);
        g.drawString("Welcome",150,150);
        g.drawLine(10,20,50,60);
        g.drawRect(80,80,50,60);
        g.fillRect(80,80,50,60);
        String s1 = getParameter("str 1");
        g.drawString(s1,150,50);

    }
    public void stop(){
        System.out.println("Stop invoked...");
    }
    public void destroy(){
        System.out.println("Destroyed");
    }
}
/*
 * <html>
 * <body>
 * <applet code = "appletprac.class"
 *         height = 480
 *         width = 720>
 * <param name="str 1" value="Hello"/>
 * </applet>
 * </body>
 * </html>
 */

