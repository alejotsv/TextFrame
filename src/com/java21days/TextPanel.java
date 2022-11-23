package com.java21days;

import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel {
    String text;

    TextPanel(String text){
        super();
        this.text = text;
    }

    @Override
    public void paintComponent(Graphics comp){
        super.paintComponent(comp);
        Graphics2D comp2D = (Graphics2D) comp;
        comp2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Font font = new Font("Arial Black", Font.BOLD, 14);
        FontMetrics metrics = getFontMetrics(font);
        comp2D.setFont(font);
        int x = (getSize().width - metrics.stringWidth(this.text))/2;
        int y = getSize().height/2;
        comp2D.drawString(this.text, x, y);

    }
}
