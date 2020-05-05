package clinica;

import clinica.gui.FrmLogin;

public class Clinica {

    public static final Config config = new Config();

    public static void main(String[] args) {
        FrmLogin login = new FrmLogin();
         login.setLocationRelativeTo(null);
         login.setVisible(true);
    }
}
