/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.util;

import clinica.gui.FrmPacientesMedico;
import clinica.gui.FrmFuncionarios;
import clinica.gui.FrmAgenda;
import clinica.gui.FrmPrecos;
import clinica.gui.FrmEstoque;
import clinica.gui.FrmFerramentas;
import clinica.gui.FrmImpressos;
import clinica.gui.FrmPacientesOdonto;

/**
 *
 * @author celso
 */
public class guis {

    private static FrmPacientesMedico iMed = null;
    private static FrmPacientesOdonto iDent = null;
    private static FrmFuncionarios iFunc = null;
    private static FrmAgenda iAgenda = null;
    private static FrmPrecos iPrecos = null;
    private static FrmEstoque iEstoque = null;
    private static FrmFerramentas iFerr = null;
    private static FrmImpressos iPrint = null;

    public static FrmPacientesMedico getiMed() {
        return iMed;
    }

    public static void setiMed(FrmPacientesMedico iMed) {
        guis.iMed = iMed;
    }

    public static FrmPacientesOdonto getiDent() {
        return iDent;
    }

    public static void setiDent(FrmPacientesOdonto iDent) {
        guis.iDent = iDent;
    }
    
    public static FrmPacientesMedico getiPac() {
        return iMed;
    }

    public static void setiPac(FrmPacientesMedico iPac2) {
        iMed = iPac2;
    }

    public static FrmFuncionarios getiFunc() {
        return iFunc;
    }

    public static void setiFunc(FrmFuncionarios iFunc2) {
        iFunc = iFunc2;
    }

    public static FrmAgenda getiAgenda() {
        return iAgenda;
    }

    public static void setiAgenda(FrmAgenda iAge2) {
        iAgenda = iAge2;
    }

    public static FrmPrecos getiPrecos() {
        return iPrecos;
    }

    public static void setiPrecos(FrmPrecos iPrecos2) {
        iPrecos = iPrecos2;
    }

    public static FrmEstoque getiEstoque() {
        return iEstoque;
    }
    
    public static void setiEstoque(FrmEstoque iEst2) {
        iEstoque = iEst2;
    }

    public static FrmFerramentas getiFerr() {
        return iFerr;
    }

    public static void setiFerr(FrmFerramentas iFerr) {
        guis.iFerr = iFerr;
    }

    public static FrmImpressos getiPrint() {
        return iPrint;
    }

    public static void setiPrint(FrmImpressos iPrint) {
        guis.iPrint = iPrint;
    }
}
