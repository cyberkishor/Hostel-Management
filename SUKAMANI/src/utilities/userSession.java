/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utilities;

/**
 *
 * @author Anup
 */
public class userSession {
    
    private int userId;
    private String userName;
    private String password;
    private int userRole;
    private String status;    
    
    public userSession(){
        userId = 0;
        userName = "";
        password = "";
        userRole = 0;
        status = "";
    }
    
    public int getUserId(){
        return userId;
    }
    
    public void setUserId(int value){
        userId = value;
    }
    
    public String getUserName(){
        return userName;
    }
    
    public void setUserName( String value ) throws Exception{
          if (value.length() > 0){
              this.userName = value;
          }else{
              throw new Exception("Please type Username");
          }
    }

    public String getPassword(){
        return password;
    }
    
    public void setPassword(String value) throws Exception{
        if (value.length() > 0){
              this.password = value;
          }else{
              throw new Exception("Password couldn't be blank");
          }
    }
    
    public int getUserRole(){
        return userRole;
    }
    
    public void setUserRole(int value){
        userRole = value;
    }
    
    public String getStatus(){
        return status;
    }
    
    public void setStatus(String value){
        status = value;
    }

    public String getText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setText(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
