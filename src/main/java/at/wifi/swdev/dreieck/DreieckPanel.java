package at.wifi.swdev.dreieck;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class DreieckPanel extends JPanel {

    private int seite;
    private int hoehe;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;

        int cx = this.getWidth() / 2;
        int cy = 30;

        int ax = cx - (seite / 2);
        int ay = cy + hoehe;

        int bx = cx + (seite / 2);
        int by = cy + hoehe;

        g2.setStroke(new BasicStroke(2));
        g2.setColor(Color.CYAN);
        g2.drawLine(cx, cy, ax, ay);
        g2.drawLine(cx, cy, bx, by);
        g2.drawLine(bx, by, ax, ay);
    }

    public int getHoehe() {
        return hoehe;
    }

    public void setHoehe(int hoehe) {
        this.hoehe = hoehe;
    }

    public int getSeite() {
        return seite;
    }

    public void setSeite(int seite) {
        this.seite = seite;
    }

}
