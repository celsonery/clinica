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
public class Usuario {
    private Long usrId;
    private String usrLogin;
    private String usrNome;
    private String usrSenha;
    private int usrStatus;
    private Integer tblNivel_nID;

    public Long getUsrId() {
        return usrId;
    }

    public void setUsrId(Long usrId) {
        this.usrId = usrId;
    }

    public String getUsrLogin() {
        return usrLogin;
    }

    public void setUsrLogin(String usrLogin) {
        this.usrLogin = usrLogin;
    }

    public String getUsrNome() {
        return usrNome;
    }

    public void setUsrNome(String usrNome) {
        this.usrNome = usrNome;
    }

    public String getUsrSenha() {
        return usrSenha;
    }

    public void setUsrSenha(String usrSenha) {
        this.usrSenha = usrSenha;
    }

    public int getUsrStatus() {
        return usrStatus;
    }

    public void setUsrStatus(int usrStatus) {
        this.usrStatus = usrStatus;
    }

    public Integer getTblNivel_nID() {
        return tblNivel_nID;
    }

    public void setTblNivel_nID(Integer tblNivel_nID) {
        this.tblNivel_nID = tblNivel_nID;
    }
}
