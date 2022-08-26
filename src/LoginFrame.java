import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class LoginFrame extends JFrame  {
    private JPanel panel1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton ingresarButton;

    public LoginFrame (String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        ingresarButton.setFocusable(false);
        ingresarButton.setBorder(BorderFactory.createMatteBorder(2,2,2,2, Color.black));


        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Usuario user = new Usuario();
                user.setNombre("Angel");
                user.setApellido("Godoy");
                user.setCarnet("202113539");
                if(textField1.getText().equals(user.nombre+" "+user.getApellido()) && passwordField1.getText().equals(user.carnet)){
                    JOptionPane.showMessageDialog(null, "Bienvenido "+user.getNombre()+" "+user.getApellido()+"!", "Información", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Datos incorrectos!", "Error", JOptionPane.ERROR_MESSAGE);

                }


            }
        });
    }


}
