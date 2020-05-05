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
public class CatEstoque {

    private int catID;
    private String catNome;
    private String catAtivo;

    public int getCatID() {
        return catID;
    }

    public void setCatID(int catID) {
        this.catID = catID;
    }

    public String getCatNome() {
        return catNome;
    }

    public void setCatNome(String catNome) {
        this.catNome = catNome;
    }

    /**
     * @return the catAtivo
     */
    public String getCatAtivo() {
        return catAtivo;
    }

    /**
     * @param catAtivo the catAtivo to set
     */
    public void setCatAtivo(String catAtivo) {
        this.catAtivo = catAtivo;
    }
    
    
}
