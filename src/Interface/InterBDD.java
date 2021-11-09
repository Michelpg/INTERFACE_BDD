package Interface;
import java.awt.*;
import javax.swing.*;
//import com.jgoodies.forms.factories.*;
import net.miginfocom.swing.*;


public class InterBDD extends JFrame {
    public InterBDD() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();
        textField5 = new JTextField();
        panel2 = new JPanel();
        label6 = new JLabel();
        textField6 = new JTextField();
        label7 = new JLabel();
        label8 = new JLabel();
        textField8 = new JTextField();
        textField7 = new JTextField();
        label9 = new JLabel();
        textField9 = new JTextField();
        label10 = new JLabel();
        textField10 = new JTextField();
        label11 = new JLabel();
        label12 = new JLabel();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        checkBox1 = new JCheckBox();
        checkBox2 = new JCheckBox();
        checkBox3 = new JCheckBox();
        checkBox4 = new JCheckBox();
        textField1 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        panel3 = new JPanel();
        comboBox1 = new JComboBox();
        label14 = new JLabel();
        label15 = new JLabel();
        label16 = new JLabel();
        comboBox2 = new JComboBox();
        comboBox3 = new JComboBox();
        panel4 = new JPanel();
        label17 = new JLabel();
        textField11 = new JTextField();
        separator1 = new JSeparator();
        panel5 = new JPanel();
        label18 = new JLabel();
        panel6 = new JPanel();
        separator2 = new JSeparator();
        panel7 = new JPanel();
        label13 = new JLabel();

        //======== this ========
        setBackground(Color.white);
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== panel1 ========
        {
            panel1.setBackground(new Color(102, 153, 0));
            panel1.setLayout(null);

            //---- label1 ----
            label1.setText("Nom");
            panel1.add(label1);
            label1.setBounds(5, 5, 65, 35);

            //---- label2 ----
            label2.setText("Pr\u00e9nom");
            panel1.add(label2);
            label2.setBounds(5, 40, 105, 30);

            //---- label3 ----
            label3.setText("Date de Naissance");
            panel1.add(label3);
            label3.setBounds(5, 80, 130, 30);

            //---- label4 ----
            label4.setText("lieu de Naissance");
            panel1.add(label4);
            label4.setBounds(5, 120, 125, 30);

            //---- label5 ----
            label5.setText("Nationalit\u00e9");
            panel1.add(label5);
            label5.setBounds(5, 160, 120, 30);
            panel1.add(textField2);
            textField2.setBounds(130, 40, 240, 35);
            panel1.add(textField3);
            textField3.setBounds(130, 75, 240, 35);
            panel1.add(textField4);
            textField4.setBounds(130, 115, 240, 35);
            panel1.add(textField5);
            textField5.setBounds(135, 160, 235, 35);

            //======== panel2 ========
            {
                panel2.setBackground(new Color(204, 255, 255));
                panel2.setLayout(null);

                //---- label6 ----
                label6.setText("Rue");
                panel2.add(label6);
                label6.setBounds(5, 10, 45, label6.getPreferredSize().height);
                panel2.add(textField6);
                textField6.setBounds(45, 5, 190, 25);

                //---- label7 ----
                label7.setText("CP");
                panel2.add(label7);
                label7.setBounds(245, 5, 45, 25);

                //---- label8 ----
                label8.setText("Ville");
                panel2.add(label8);
                label8.setBounds(5, 35, 40, 25);
                panel2.add(textField8);
                textField8.setBounds(45, 35, 325, textField8.getPreferredSize().height);
                panel2.add(textField7);
                textField7.setBounds(290, 5, 75, 25);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel2.getComponentCount(); i++) {
                        Rectangle bounds = panel2.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel2.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel2.setMinimumSize(preferredSize);
                    panel2.setPreferredSize(preferredSize);
                }
            }
            panel1.add(panel2);
            panel2.setBounds(5, 205, 370, 80);

            //---- label9 ----
            label9.setText("T\u00e9l\u00e9phone");
            panel1.add(label9);
            label9.setBounds(15, 300, 90, 25);
            panel1.add(textField9);
            textField9.setBounds(100, 300, 280, 25);

            //---- label10 ----
            label10.setText("Mail");
            panel1.add(label10);
            label10.setBounds(10, 330, 85, 20);
            panel1.add(textField10);
            textField10.setBounds(105, 330, 275, 25);

            //---- label11 ----
            label11.setText("Sexe");
            panel1.add(label11);
            label11.setBounds(5, 370, 100, 25);

            //---- label12 ----
            label12.setText("Loisirs");
            panel1.add(label12);
            label12.setBounds(5, 405, 65, 25);

            //---- radioButton1 ----
            radioButton1.setText("Homme");
            radioButton1.setBackground(new Color(102, 153, 0));
            panel1.add(radioButton1);
            radioButton1.setBounds(70, 370, 100, 25);

            //---- radioButton2 ----
            radioButton2.setText("Femme");
            radioButton2.setBackground(new Color(102, 153, 0));
            panel1.add(radioButton2);
            radioButton2.setBounds(180, 370, 110, 25);

            //---- checkBox1 ----
            checkBox1.setText("Sports");
            checkBox1.setBackground(new Color(102, 153, 0));
            panel1.add(checkBox1);
            checkBox1.setBounds(55, 405, 75, 20);

            //---- checkBox2 ----
            checkBox2.setText("Musique");
            checkBox2.setBackground(new Color(102, 153, 0));
            panel1.add(checkBox2);
            checkBox2.setBounds(120, 405, 85, 20);

            //---- checkBox3 ----
            checkBox3.setText("Voyages");
            checkBox3.setBackground(new Color(102, 153, 0));
            panel1.add(checkBox3);
            checkBox3.setBounds(205, 405, 75, 20);

            //---- checkBox4 ----
            checkBox4.setText("Lecture");
            checkBox4.setBackground(new Color(102, 153, 0));
            panel1.add(checkBox4);
            checkBox4.setBounds(285, 405, 75, 20);
            panel1.add(textField1);
            textField1.setBounds(130, 0, 240, 35);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel1.getComponentCount(); i++) {
                    Rectangle bounds = panel1.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel1.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel1.setMinimumSize(preferredSize);
                panel1.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel1);
        panel1.setBounds(0, 45, 375, 440);

        //---- button1 ----
        button1.setText("Valider");
        button1.setBackground(new Color(255, 153, 204));
        contentPane.add(button1);
        button1.setBounds(325, 500, 120, 33);

        //---- button2 ----
        button2.setText("Quitter");
        button2.setBackground(new Color(255, 153, 204));
        contentPane.add(button2);
        button2.setBounds(460, 500, 120, 33);

        //---- button3 ----
        button3.setText("Reset");
        button3.setBackground(new Color(255, 153, 204));
        contentPane.add(button3);
        button3.setBounds(595, 500, 145, 33);

        //======== panel3 ========
        {
            panel3.setBackground(new Color(153, 0, 153));
            panel3.setLayout(null);
            panel3.add(comboBox1);
            comboBox1.setBounds(95, 30, 130, comboBox1.getPreferredSize().height);

            //---- label14 ----
            label14.setText("Fili\u00e8re");
            label14.setBackground(new Color(214, 217, 223));
            panel3.add(label14);
            label14.setBounds(15, 30, 60, 30);

            //---- label15 ----
            label15.setText("Niveaux");
            label15.setBackground(new Color(214, 217, 223));
            panel3.add(label15);
            label15.setBounds(15, 75, 65, 26);

            //---- label16 ----
            label16.setText("BAC");
            panel3.add(label16);
            label16.setBounds(15, 110, 70, 30);
            panel3.add(comboBox2);
            comboBox2.setBounds(95, 75, 130, comboBox2.getPreferredSize().height);
            panel3.add(comboBox3);
            comboBox3.setBounds(95, 110, 130, comboBox3.getPreferredSize().height);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel3.getComponentCount(); i++) {
                    Rectangle bounds = panel3.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel3.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel3.setMinimumSize(preferredSize);
                panel3.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel3);
        panel3.setBounds(375, 40, 225, 190);

        //======== panel4 ========
        {
            panel4.setBackground(new Color(102, 102, 0));
            panel4.setLayout(null);

            //---- label17 ----
            label17.setText("Affichage");
            panel4.add(label17);
            label17.setBounds(10, 10, 55, 30);
            panel4.add(textField11);
            textField11.setBounds(30, 35, 300, 215);
            panel4.add(separator1);
            separator1.setBounds(0, 5, 390, 12);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel4.getComponentCount(); i++) {
                    Rectangle bounds = panel4.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel4.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel4.setMinimumSize(preferredSize);
                panel4.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel4);
        panel4.setBounds(375, 230, 385, 255);

        //======== panel5 ========
        {
            panel5.setBackground(new Color(102, 255, 102));
            panel5.setLayout(null);

            //---- label18 ----
            label18.setIcon(new ImageIcon("C:\\Users\\miche\\IdeaProjects\\TP_Inter_BDD\\profil1.jpg"));
            panel5.add(label18);
            label18.setBounds(30, 15, 105, 125);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel5.getComponentCount(); i++) {
                    Rectangle bounds = panel5.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel5.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel5.setMinimumSize(preferredSize);
                panel5.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel5);
        panel5.setBounds(600, 40, 160, 195);

        //======== panel6 ========
        {
            panel6.setBackground(new Color(153, 153, 0));
            panel6.setLayout(null);
            panel6.add(separator2);
            separator2.setBounds(0, 0, 760, 17);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel6.getComponentCount(); i++) {
                    Rectangle bounds = panel6.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel6.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel6.setMinimumSize(preferredSize);
                panel6.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel6);
        panel6.setBounds(0, 480, 760, 65);

        //======== panel7 ========
        {
            panel7.setBackground(new Color(153, 153, 0));
            panel7.setLayout(null);

            //---- label13 ----
            label13.setText("Contact \u00e9tudiant");
            label13.setFont(label13.getFont().deriveFont(Font.BOLD, label13.getFont().getSize() + 12f));
            panel7.add(label13);
            label13.setBounds(280, 0, 215, 35);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel7.getComponentCount(); i++) {
                    Rectangle bounds = panel7.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel7.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel7.setMinimumSize(preferredSize);
                panel7.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel7);
        panel7.setBounds(0, 0, 760, 45);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JPanel panel2;
    private JLabel label6;
    private JTextField textField6;
    private JLabel label7;
    private JLabel label8;
    private JTextField textField8;
    private JTextField textField7;
    private JLabel label9;
    private JTextField textField9;
    private JLabel label10;
    private JTextField textField10;
    private JLabel label11;
    private JLabel label12;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JPanel panel3;
    private JComboBox comboBox1;
    private JLabel label14;
    private JLabel label15;
    private JLabel label16;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JPanel panel4;
    private JLabel label17;
    private JTextField textField11;
    private JSeparator separator1;
    private JPanel panel5;
    private JLabel label18;
    private JPanel panel6;
    private JSeparator separator2;
    private JPanel panel7;
    private JLabel label13;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    private void jRadioButtonActivation(java.awt.event.ActionEvent ect) {

        if (radioButton1.isSelected()) {
            System.out.println("Homme");
        }
    }

    private void jRadioButton2Activation(java.awt.event.ActionEvent ect) {

        if (radioButton2.isSelected()) {
            System.out.println("Femme");
        }
    }
}

