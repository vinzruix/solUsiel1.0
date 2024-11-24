import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuVista {
    JPanel pPrincipal;
    private JButton btnAgregar;
    private JButton btnSalir;
    private JScrollBar scrollBar1;
    private JPanel pdos;
    private JRadioButton radioButton1;

    public MenuVista() {


        btnAgregar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame agregarFrame = new JFrame("AgregarVista");
                agregarFrame.setContentPane(new AgregarVista().panel1);
                agregarFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                agregarFrame.pack();
                agregarFrame.setLocationRelativeTo(null);
                agregarFrame.setVisible(true);
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(btnAgregar); currentFrame.dispose();
            }
        });
    }


}
