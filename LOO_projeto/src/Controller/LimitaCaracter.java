
package Controller;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class LimitaCaracter extends PlainDocument{
    private int tamanhoMax = 10;
         
    public LimitaCaracter(int tamanhoMax){
        this.tamanhoMax = tamanhoMax;
    }
    @Override
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
 
            if (str == null) return; 
                    
             String stringAntiga = getText (0, getLength() ); 
             int tamanhoNovo = stringAntiga.length() + str.length();
                        
             if (tamanhoNovo <= tamanhoMax) { 
                 super.insertString(offset, str , attr); 
             } else {   
                 super.insertString(offset, "", attr);
             } 
    }
    
    /*
    implementacao 
    JTextField textField = new JTextField();
textField.setDocument( new DocumentoLimitado(15) );
    
    
    
    opcao 2
    
    public class MaxLengthTextDocument extends PlainDocument {
    //Armazena o número máximo de caracteres para o texto.
    private int maxChars;
 
    @Override
    public void insertString(int offs, String str, AttributeSet a)
            throws BadLocationException {
        if(str != null && (getLength() + str.length() < maxChars)){
                    super.insertString(offs, str, a);
            }
    }
 
    //getter e setter omitidos
}   MaxLengthTextDocument maxLength = new MaxLengthTextDocument();
maxLength.setMaxChars(50);//Limitamos para 50 caracteres
 
jTextField.setDocument(maxLength);
    
    
    */
}
