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
public class Exame {
    private int exID;
    private String exNome;
    private Double exCol1;
    private Double exCol2;
    private Double exPreco;
    private int exTab;

    public int getExID() {
        return exID;
    }

    public void setExID(int exID) {
        this.exID = exID;
    }

    public String getExNome() {
        return exNome;
    }

    public void setExNome(String exNome) {
        this.exNome = exNome;
    }

    public Double getExCol1() {
        return exCol1;
    }

    public void setExCol1(Double exLab1) {
        this.exCol1 = exLab1;
    }

    public Double getExCol2() {
        return exCol2;
    }

    public void setExCol2(Double exLab2) {
        this.exCol2 = exLab2;
    }

    public Double getExPreco() {
        return exPreco;
    }

    public void setExPreco(Double exPreco) {
        this.exPreco = exPreco;
    }
    
    public int getExTab() {
        return exTab;
    }

    public void setExTab(int exTab) {
        this.exTab = exTab;
    }

}
