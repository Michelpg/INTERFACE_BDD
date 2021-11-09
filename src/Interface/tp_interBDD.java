package Interface;
import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.SQLException;

import static java.lang.System.exit;


public class tp_interBDD extends JFrame implements ActionListener {

    private JFrame cadre;
    private JLabel text1, text2, image;
    private JTextField user;
    private JPasswordField ps;
    private JButton jb, anul;
    private JPanel texte1, texte2, texte3;


    public void connexion() {
        cadre = new JFrame("Securite de Windows");
        cadre.setSize(500, 500);
        cadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cadre.setVisible(true);
        cadre.setResizable(false);

        text1 = new JLabel("Authentification réseaux");
        text1.setBounds(20, 2, 300, 20);

        text2 = new JLabel("Veuillez entrer les informations d'dentification utilisateur");
        text2.setBounds(20, 14, 500, 35);

        image = new JLabel();
        image.setIcon(new ImageIcon("C:\\Users\\miche\\OneDrive\\Images\\anime-kimetsu-no-yaiba-hd-wallpaper-preview (2).jpg"));
        image.setBounds(50, 155, 140, 120);

        user = new JTextField("");
        user.setBounds(190, 165, 240, 50);

        ps = new JPasswordField("");
        ps.setBounds(190, 220, 240, 50);


        jb = new JButton("OK");
        jb.setBounds(310, 415, 60, 35);
        anul = new JButton("Annuler");
        anul.setBounds(370, 415, 100, 35);

        texte1 = new JPanel();
        texte1.setLayout(null);
        texte1.setSize(500, 100);
        texte1.setBackground(Color.GREEN);
        texte1.add(text1);
        texte1.add(text2);
        cadre.add(texte1);

        texte2 = new JPanel();
        texte2.setLayout(null);
        texte2.setSize(500, 400);
        texte2.setBackground(Color.CYAN);
        texte2.add(image);
        texte2.add(user);
        texte2.add(ps);
        cadre.add(texte2);

        texte3 = new JPanel();
        texte3.setLayout(null);
        texte3.setSize(500, 500);
        texte3.setBackground(Color.MAGENTA);

        texte3.add(jb);
        texte3.add(anul);
        cadre.add(texte3);

        jb.addActionListener(this);
        anul.addActionListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    @Override
    public void actionPerformed(ActionEvent a) {
        Modele conn = new Modele();
        int nombre =0 ;
        java.sql.Connection conn1 = null;
        Connection connexion=null;
        Statement stmt = null;
        String log = user.getText();
        String pass = new String(ps.getPassword());
        String url = "jdbc:mysql://localhost:3306/bddgraph";
        String user1 = "root";
        String password = "";
        //String req = "Select count(*) FROM utilisateur WHERE login ='" + log + "' AND password ='" + pass + "';";
        String req = "Select count(*) FROM utilisateur  ; ";
        System.out.println(req);

        if (a.getSource() == anul) {
             System.exit(0);
        }
        else
        if (a.getSource() == jb) {
            try{
                System.out.println(url);
                System.out.println(user1);
                System.out.println(password);
                //connexion =  conn.seConnecter(url, user1, password);

                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        conn1 = DriverManager.getConnection(url, user1, password);
                    }

                    catch(ClassNotFoundException e){
                        System.out.println("Erreur lors des chargements" + e.getMessage());
                        exit(0);
                    }

                stmt = connexion.createStatement();
                ResultSet result = stmt.executeQuery(req);

                while(result.next()){
                    nombre = result.getInt(1);

                }
            }
            catch (SQLException e){
                System.out.println("Connexion erreur");

            }


            if ( nombre == 1) {
                InterBDD feni = new InterBDD();
                feni.setResizable(false);
                this.setVisible(false);
                feni.setVisible(true);
                feni.setLocationRelativeTo(null);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Erreur de connexion");
                user.setText("");
                ps.setBackground(Color.WHITE);
                user.requestFocus();
            }
        }

    }
}



