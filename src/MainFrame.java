import javax.swing.*;

public class MainFrame {
    public static void main(String[] args) {

     class Frames{
        public void PantallaSeleccionarCliente() {

            JFrame frame1 = new LoginFrame("Login Frame");
            ImageIcon icon = new ImageIcon("icono.png");
            frame1.setVisible(true);
            frame1.setSize(500, 400);
            frame1.setTitle("Login");
            frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame1.setResizable(false);
            frame1.setIconImage(icon.getImage());


        }
     }
        Frames Frame1 = new Frames();
     Frame1.PantallaSeleccionarCliente();


    }
}
