/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author celso
 */
public class OnlyNumberField extends PlainDocument {

    private int maxlength;

    public OnlyNumberField() {

    }

    public OnlyNumberField(int maxlength) {
        super();
        this.maxlength = maxlength;
    }
    
    @Override
    public void insertString(int offs, String str, AttributeSet a){
        try{
            Integer.parseInt(str);
        } catch (NumberFormatException ex){
            str = "";
        }
        
        try{
            boolean fixedLengh = (!((getLength() + str.length()) > maxlength));
            if(maxlength == 0 || fixedLengh)
                super.insertString(offs, str, a);
        } catch (BadLocationException ex){
        }
    }
}
