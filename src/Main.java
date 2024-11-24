import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame menuVista = new JFrame("MenuVista");
        menuVista.setContentPane(new MenuVista().pPrincipal);
        menuVista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuVista.pack();
        menuVista.setVisible(true);
        menuVista.setLocationRelativeTo(null);
    }
    }
