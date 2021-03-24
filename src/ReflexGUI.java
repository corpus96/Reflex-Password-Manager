import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReflexGUI extends JFrame {
    private JPanel loginPanel;
    private JLabel passWordLabel;
    private JButton unlockButton;
    private JPasswordField reflexPasswordField;
    private JLabel reflexTitle;
    private JLabel emailLabel;
    private JTextField emailTextFIeld;

    //temp, change later
    private static String password = "password";
    private static String email = "email@email.com";

    //constructor
    public ReflexGUI(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(loginPanel);
        this.pack();
        unlockButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //We get password from password field and cast it into a string
                char [] p_char = reflexPasswordField.getPassword();
                String p = String.valueOf(p_char);
                String emailVar = emailTextFIeld.getText();

                if(emailVar.equals(email) && p.equals(password))
                {
                    JOptionPane.showMessageDialog(null, "Succesful");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Incorrect mail password", "Incorrect",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new ReflexGUI("Reflex Password Manager");

        frame.setVisible(true);
    }


}
