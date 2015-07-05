/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hostelmgmt;

import javax.swing.JOptionPane;

/**
 *
 * @author catchlrnovo
 */
public class Logout {
    Logout(){
        if ( JOptionPane.showConfirmDialog(null, "Do you want to LOGOUT?", "LOGOUT!!!",JOptionPane.OK_CANCEL_OPTION) == 0 ){
            System.exit(0);
        }
    }
}
