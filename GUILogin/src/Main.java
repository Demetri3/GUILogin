import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {

    private static JLabel userLabel;
    private static JButton button;
    private static JPasswordField passwordText;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JLabel success;


    public static void main(String[] args) {


        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);

        panel.setLayout(null);

        JLabel userlabel = new JLabel("Username:");
        userlabel.setBounds(10, 10, 90, 25);
        panel.add(userlabel);

        JLabel passwordlabel = new JLabel("Password:");
        passwordlabel.setBounds(10, 40, 90, 25);
        panel.add(passwordlabel);

        userText = new JTextField();
        userText.setBounds(80, 10, 165, 25);
        panel.add(userText);

        passwordText = new JPasswordField();
        passwordText.setBounds(80, 40, 165, 25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(80, 80, 80, 25);
        button.addActionListener(new Main());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10, 100, 170, 25);
        panel.add(success);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked");
        String user = userText.getText();
        String password = passwordText.getText();
        System.out.println(user + "," + password);

        if(user.equals("admin") && password.equals("admin")) {
            success.setText ("Login Successful!");
        }
    }


}