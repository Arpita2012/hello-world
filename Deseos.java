//package surprises;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.print.*;

public class Deseos implements Printable, ActionListener {

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int page) throws PrinterException {
        if (page > 0) {
            return NO_SUCH_PAGE;
        }
        Font f = new Font("Serif", Font.ITALIC, 30);
        Graphics2D g = (Graphics2D) graphics;
        g.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
        g.setFont(f);
        g.setColor(Color.magenta);

        {
            String w1 = Character.toString((char) ('A' + 22)) + Character.toString((char) ('a' + 8))
                    + Character.toString((char) ('a' + 18)) + Character.toString((char) ('a' + 7))
                    + Character.toString((char) ('a' + 8)) + Character.toString((char) ('a' + 13))
                    + Character.toString((char) ('a' + 6));
            String w2 = Character.toString((char) ('a' + 24)) + Character.toString((char) ('a' + 14))
                    + Character.toString((char) ('a' + 20)) + " " + Character.toString((char) ('a'));
            String w3 = Character.toString((char) ('a' + 24)) + Character.toString((char) ('a' + 4))
                    + Character.toString((char) ('a')) + Character.toString((char) ('a' + 17));
            String w4 = Character.toString((char) ('a' + 17)) + Character.toString((char) ('a' + 8))
                    + Character.toString((char) ('a' + 2)) + Character.toString((char) ('a' + 7));
            String w5 = Character.toString((char) ('a' + 22)) + Character.toString((char) ('a' + 8))
                    + Character.toString((char) ('a' + 19)) + Character.toString((char) ('a' + 7));
            String w6 = Character.toString((char) ('a' + 22)) + Character.toString((char) ('a' + 8))
                    + Character.toString((char) ('a' + 18)) + Character.toString((char) ('a' + 3))
                    + Character.toString((char) ('a' + 14)) + Character.toString((char) ('a' + 12));
            String w7 = Character.toString((char) ('a' + 11)) + Character.toString((char) ('a' + 8))
                    + Character.toString((char) ('a' + 6)) + Character.toString((char) ('a' + 7))
                    + Character.toString((char) ('a' + 19));
            String w8 = Character.toString((char) ('a')) + Character.toString((char) ('a' + 13))
                    + Character.toString((char) ('a' + 3));
            String w9 = Character.toString((char) ('a' + 11)) + Character.toString((char) ('a' + 14))
                    + Character.toString((char) ('a' + 21)) + Character.toString((char) ('a' + 4));

            String msg1_0 = w1 + " " + w2 + " " + w3 + "\n";
            String msg1_1 = w4 + " " + w5 + " " + w6 + ",\n";
            String msg1_2 = w7 + " " + w8 + " " + w9 + " . ..\n";

            g.drawString(msg1_0, 180, (1 + 0) * 120);
            g.drawString(msg1_1, 180, 190);
            g.drawString(msg1_2, 180, 260);

        }
        g.setFont(new Font("SansSerif", Font.ROMAN_BASELINE, 40));
        g.setColor(Color.blue);
        {
            String w10 = Character.toString((char) ('A' + 7)) + Character.toString((char) ('a'))
                    + Character.toString((char) ('a' + 15)) + Character.toString((char) ('a' + 15))
                    + Character.toString((char) ('a' + 24));
            String w11 = Character.toString((char) ('A' + 3)) + Character.toString((char) ('a' + 8))
                    + Character.toString((char) ('a' + 22)) + Character.toString((char) ('a'))
                    + Character.toString((char) ('a' + 11)) + Character.toString((char) ('a' + 8));

            String msg1_3 = "\n" + w10 + " " + w11;
            g.drawString(msg1_3, 190, 350);

        }
        g.setFont(new Font("Serif", Font.ITALIC, 20));
        g.setColor(Color.DARK_GRAY);
        {
            String w12 = Character.toString((char) ('A' + 5)) + Character.toString((char) ('a' + 17))
                    + Character.toString((char) ('a' + 14)) + Character.toString((char) ('a' + 12));
            String w13 = Character.toString((char) ('A' + 2)) + Character.toString((char) ('a' + 7))
                    + Character.toString((char) ('a' + 4)) + Character.toString((char) ('a' + 4))
                    + Character.toString((char) ('a' + 10)) + Character.toString((char) ('a' + 8));

            String msg2 = "    ~" + w12 + " " + w13;
              g.drawString(msg2, 230, 400);
        }
        return PAGE_EXISTS;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        PrinterJob j = PrinterJob.getPrinterJob();
        j.setPrintable(this);
        boolean ok = j.printDialog();
        if (ok) {
            try {
                j.print();
            } catch (PrinterException ex) {
            }

        }

    }

    public static void main(String args[]) throws Exception {

        JFrame f = new JFrame("Deseos");
        JPanel p = new JPanel();
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        JButton printButton = new JButton("Click me  ; )");
        printButton.setBorderPainted(true);
        printButton.addActionListener(new Deseos());
        p.setBackground(Color.pink);
        p.add("Center", printButton);
        f.add(p);
        f.setResizable(false);
        f.setVisible(true);

        f.setBounds(650, 250, 230, 70);
    }
}
