package com.java21days;

import javax.swing.*;
import java.awt.*;

public class TextFrame extends JFrame {
    Dimension dim = new Dimension(300, 150);
    TextFrame(String title, String text){
        super(title);
        setSize(dim);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);
    }
}
