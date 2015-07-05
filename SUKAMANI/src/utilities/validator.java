/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import javax.swing.JPasswordField;

/**
 *
 * @author catchlrnovo
 */
public class validator {
    String nameRegex           =   "[a-zA-Z]+";
    String alphanumericRegex   =   "[a-zA-Z0-9]+"; 
    String emailRegex          =   "[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})";
    String phoneRegex          =   "[0-9]+";
        
    public boolean isnull(String value) {
        if ( "".equals(value) || value == null) {
            return true;
        }
       return false;
    }
    
    public boolean validateName( String name ) {
        return (!isnull( name ) && !name.matches(nameRegex));
    }
    
    public boolean validateEmail( String email ) {
        return (!isnull( email ) && !email.matches(emailRegex));
    }
    
    public boolean validateUsername( String username ) {
        if ( !username.matches(alphanumericRegex) ) {
            return false;
        }        
        return true;
    }
    
    public boolean validatePhone( String phone ) {
        if ( isnull( phone ) || !phone.matches(phoneRegex) ) {
            return false;
        }        
        return true;
    }
    
    public boolean validatePassword( String password ) {
        
        if ( isnull(password) || password.length() <6 ) {
            return false;
        }        
        return true;
    }
    
    public boolean validateConfirm( String first, String second ) {
        if ( !second.equals(first) ) {
            return false;
        }        
        return true;
    }   

    public boolean validatePhone(JPasswordField payRent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
}

