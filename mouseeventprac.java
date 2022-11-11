import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class mouseeventprac extends Applet implements MouseListener,MouseMotionListener{
    String msg = " ";
    double mx=100, my=100;
    Font f;
    public void init(){
        setBackground(Color.BLACK);
        f = new Font("Courier",Font.BOLD,45);
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void mouseClicked(MouseEvent me){
        msg = "Mouse Clicked - "+me.getX()+":"+me.getY();
        repaint();
    }
    public void mouseEntered(MouseEvent me){
        msg = "Mouse Entered - "+me.getX()+":"+me.getY();
        repaint();
    }
    public void mouseExited(MouseEvent me){
        msg = "Mouse Exited - "+me.getX()+":"+me.getY();
        repaint();
    }
    public void mousePressed(MouseEvent me){
        mx = me.getX();
        my = me.getY();
        msg = "Mouse Down - "+me.getX()+":"+me.getY();
        repaint();
    }
    public void mouseReleased(MouseEvent me){
        mx = me.getX();
        my = me.getY();
        msg = "Mouse Released - "+me.getX()+":"+me.getY();
        repaint();
    }
    public void mouseDragged(MouseEvent me){
        mx = me.getX();
        my = me.getY();
        msg = "Mouse Dragged";
        showStatus("Mouse dragged: "+ me.getX()+":"+me.getY());
        repaint();
    }
    public void mouseMoved(MouseEvent me){
        mx = me.getX();
        my = me.getY();
        msg = "Mouse Moved";
        showStatus("Mouse Moved: "+ me.getX()+":"+me.getY());
        repaint();
    }
    public void paint(Graphics g){
        g.setFont(f);
        g.setColor(Color.green);
        g.drawString(msg,(int)mx,(int)my);
    }
}
/*
 * <applet code="mouseeventprac.class" width = 300 height = 300>
 * </applet>
 */