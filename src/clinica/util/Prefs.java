/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.util;

/**
 *
 * @author celso
 */
public class Prefs {
        
    private static String login;
    private static int JanWidth;
    private static int JanHeight;
    private static String filtro;

    /**
     * @return the login
     */
    public static String getLogin() {
        return login;
    }

    /**
     * @param aLogin the login to set
     */
    public static void setLogin(String aLogin) {
        login = aLogin;
    }

    /**
     * @return the JanWidth
     */
    public static int getJanWidth() {
        return JanWidth;
    }

    /**
     * @param aJanWidth the JanWidth to set
     */
    public static void setJanWidth(int aJanWidth) {
        JanWidth = aJanWidth;
    }

    /**
     * @return the JanHeight
     */
    public static int getJanHeight() {
        return JanHeight;
    }

    /**
     * @param aJanHeight the JanHeight to set
     */
    public static void setJanHeight(int aJanHeight) {
        JanHeight = aJanHeight;
    }

    /**
     * @return the filtro
     */
    public static String getFiltro() {
        return filtro;
    }

    /**
     * @param aFiltro the filtro to set
     */
    public static void setFiltro(String aFiltro) {
        filtro = aFiltro;
    }

}
