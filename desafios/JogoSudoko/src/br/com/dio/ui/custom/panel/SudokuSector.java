package br.com.dio.ui.custom.panel;

import br.com.dio.ui.custom.input.NumberText;

import java.util.List;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

import static java.awt.Color.black;

public class SudokuSector extends JPanel {

    public SudokuSector(final List<NumberText> textFields) {
        var dim = new Dimension(170, 170);
        this.setSize(dim);
        this.setPreferredSize(dim);
        this.setBorder(new LineBorder(black, 2, true));
        this.setVisible(true);
        textFields.forEach(this::add);
    }
}
