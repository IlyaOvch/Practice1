package OvcharenkoLab5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GUI {
    private static int count1;
    private static int count2;

    public static void main(String[] args) {
        JFrame fr1 = new JFrame("Frame");
        Container cp;
        count1 = 0;
        count2 = 0;
        JButton komanda1, komanda2;
        fr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr1.setSize(300, 200);
        fr1.setResizable(false);
        cp = fr1.getContentPane();
        cp.setLayout(new GridLayout(5, 1));
        komanda1 = new JButton("AC Milan");
        komanda2 = new JButton("Real Madrid");
        JLabel label1 = new JLabel("Result: " + count1 + "X" + count2);
        JLabel label2 = new JLabel("Last Scorer: " + "N/A");
        JLabel label3 = new JLabel("Winner: " + "DRAW");
        cp.add(komanda1);
        cp.add(komanda2);
        cp.add(label1);
        cp.add(label2);
        cp.add(label3);
        komanda1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                count1++;
                label1.setText("Result: " + count1 + " X " + count2);
                label2.setText("Last Scorer: " + "AC Milan");
                if(count1 > count2)
                    label3.setText("Winner: " + "AC Milan");
                if(count1 == count2)
                    label3.setText("Winner: " + "DRAW");
            }
        });

        komanda2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                count2++;
                label1.setText("Result: " + count1 + " X " + count2);
                label2.setText("Last Scorer: " + "Real Madrid");
                if(count1 < count2)
                    label3.setText("Winner: " + "Real Madrid");
                if(count2 == count1)
                    label3.setText("Winner: " + "DRAW");
            }
        });

        fr1.show();
    }
}
