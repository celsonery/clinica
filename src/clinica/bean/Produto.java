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
public class Produto {

    private int prodID;
    private String prodNome;
    private int prodQuantidade;
    private int Informar;
    private int tblCategoria_catID;

    public int getProdID() {
        return prodID;
    }

    public void setProdID(int prodID) {
        this.prodID = prodID;
    }

    public String getProdNome() {
        return prodNome;
    }

    public void setProdNome(String prodNome) {
        this.prodNome = prodNome;
    }

    public int getProdQuantidade() {
        return prodQuantidade;
    }

    public void setProdQuantidade(int prodQuantidade) {
        this.prodQuantidade = prodQuantidade;
    }

    public int getInformar() {
        return Informar;
    }

    public void setInformar(int Informar) {
        this.Informar = Informar;
    }
    public int getTblCategoria_catID() {
        return tblCategoria_catID;
    }

    public void setTblCategoria_catID(int tblCategoria_catID) {
        this.tblCategoria_catID = tblCategoria_catID;
    }    
}
