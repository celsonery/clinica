/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.bean;

/**
 *
 * @author celso
 */
public class TabelaPrecos {

    private int texID;
    private String texNome;
    private String texCol1;
    private String texCol2;
    private String texAtivo;

    public int getTexID() {
        return texID;
    }

    public void setTexID(int texID) {
        this.texID = texID;
    }

    public String getTexNome() {
        return texNome;
    }

    public void setTexNome(String texNome) {
        this.texNome = texNome;
    }

    /**
     * @return the texCol1
     */
    public String getTexCol1() {
        return texCol1;
    }

    /**
     * @param texCol1 the texCol1 to set
     */
    public void setTexCol1(String texCol1) {
        this.texCol1 = texCol1;
    }

    /**
     * @return the texCol2
     */
    public String getTexCol2() {
        return texCol2;
    }

    /**
     * @param texCol2 the texCol2 to set
     */
    public void setTexCol2(String texCol2) {
        this.texCol2 = texCol2;
    }

    /**
     * @return the texAtivo
     */
    public String getTexAtivo() {
        return texAtivo;
    }

    /**
     * @param texAtivo the texAtivo to set
     */
    public void setTexAtivo(String texAtivo) {
        this.texAtivo = texAtivo;
    }
}
