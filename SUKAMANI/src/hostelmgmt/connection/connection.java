/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author publisy
 */
package hostelmgmt.connection;

import java.awt.HeadlessException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.sql.*;
import javax.swing.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class connection {
    private static Connection con;
    
    PreparedStatement pst = null;
    
    public static Connection getConnection() throws ParserConfigurationException, SAXException, IOException, XPathExpressionException, URISyntaxException {
        try {
            InputStream input = Thread.currentThread().getContextClassLoader().getResourceAsStream("hostelmgmt//connection//config.xml");
            //System.out.println(input);
            org.w3c.dom.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(input));
            XPath xpath = XPathFactory.newInstance().newXPath();
            String url = (String) xpath.compile("//config//jdbc//url").evaluate(document, XPathConstants.STRING);
            String driver = (String) xpath.compile("//config//jdbc//driver").evaluate(document, XPathConstants.STRING);
            String username = (String) xpath.compile("//config//jdbc//username").evaluate(document, XPathConstants.STRING);
            String password = (String) xpath.compile("//config//jdbc//password").evaluate(document, XPathConstants.STRING);
            if( input == null || "".equals(url) || "".equals(driver) || "".equals(username)  ) {
                connectionError();
                return con;
            }        
            try {
                Class.forName(driver);
                try {
                    con = DriverManager.getConnection(url, username, password);
                } catch (SQLException ex) {
                    // log an exception. fro example:
                    JOptionPane.showMessageDialog(null, "Error: Failed to create the database connection!!!");
                }
            } catch (ClassNotFoundException ex) {
                // log an exception. for example:
                JOptionPane.showMessageDialog(null, "Error: Driver not found!!!");
            }
            return con;
        }
        catch(ParserConfigurationException | SAXException | IOException | XPathExpressionException | HeadlessException e){
            JOptionPane.showMessageDialog(null, "Error: Connection file error!!!");
            connectionError();
            return con;
        }
    }
    
    public static void connectionError() {
        createConfig conf = new createConfig();
        conf.show();
    }
    
    public static void main(String args[]) {
        
        try {
            con = connection.getConnection();            
        } catch (ParserConfigurationException | SAXException | IOException | XPathExpressionException | URISyntaxException ex) {
            //Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
            connection.connectionError();
        }
    }
    
    public connection( ){
        
    }
    
    public static ResultSet dbSelectProc( String procedure, String [] params ) throws SQLException{
        String statement = "{ call "+ procedure +"(";
        for(int i=0; i < params.length ;i++){
           if (i+1 == params.length) {
               statement +="?";
           }
           else {
               statement +="?, ";
           }      
           
        }
        statement += ") }";
        
        CallableStatement proc = con.prepareCall(statement);
        for(int i=0; i < params.length ;i++){
            proc.setString(i+1,params[i]);
        }
        return proc.executeQuery();
    }
    
    public static int dbExecuteProc( String procedure, String [] params ) throws SQLException{
        String statement = "{ call "+ procedure +"(";
        for(int i=0; i < params.length ;i++){
           if (i+1 == params.length) {
               statement +="?";
           }
           else {
               statement +="?, ";
           }      
           
        }
        statement += ") }";
        
        CallableStatement proc = con.prepareCall(statement);
        for(int i=0; i < params.length ;i++){
            proc.setString(i+1,params[i]);
        }
        return proc.executeUpdate();
    }
    
    public static ResultSet dbSelect( String sql, String [] params ) throws SQLException{
        PreparedStatement pst;
        
        pst = con.prepareStatement(sql);
        for(int i=0; i < params.length ;i++){
            pst.setString(i+1,params[i]);
        }
        return pst.executeQuery();
    }
    
    /**
     *
     * @param sql
     * @param params
     * @return
     * @throws SQLException
     */
    public static boolean dbExecute(String sql, String [] params ) throws SQLException{
        PreparedStatement p;
        p = con.prepareStatement(sql);
        //        System.out.println(sql);

        for(int i=0; i < params.length ;i++){
            p.setString(i+1,params[i]);
          //  System.out.println(params[i]);
        }
        return p.execute();
    }
    public static int dbExecuteReturnId(String sql, String [] params ) throws SQLException{
        PreparedStatement p;
        ResultSet rs;
        p = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        //        System.out.println(sql);

        for(int i=0; i < params.length ;i++){
            p.setString(i+1,params[i]);
        }
        int numero = p.executeUpdate();
        int risultato = 0;
        rs = p.getGeneratedKeys();
        if (rs.next()){
            risultato = rs.getInt(1);
        }
        return risultato;
    }
    
    public static int dbExecuteUpdate(String sql, String [] params ) throws SQLException{
        PreparedStatement pst;
        pst = con.prepareStatement(sql);
        for(int i=0; i < params.length ;i++){
            pst.setString(i+1,params[i]);
        }
        return pst.executeUpdate();
    }
    
    public static void displayResultSet(ResultSet rs ) throws SQLException{
        ResultSetMetaData rsmd = rs.getMetaData();
                
        int columnsNumber = rsmd.getColumnCount();
        while (rs.next()) {
            for (int i = 1; i <= columnsNumber; i++) {
                if (i > 1) System.out.print(",  ");
                String columnValue = rs.getString(i);
                System.out.print(columnValue + " " + rsmd.getColumnName(i));
            }
            System.out.println("");
        }
    }
public static int dbExecuteReturnID(String sql, String [] params ) throws SQLException{
        PreparedStatement pst;
        //System.out.println(sql);
        pst = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        
        for(int i=0; i < params.length ;i++){
            //System.out.println(params[i]);
            pst.setString(i+1,params[i]);
        }
        
        int numero = pst.executeUpdate();
        
        ResultSet rs = pst.getGeneratedKeys();
        int ID = 0;
        
        if (rs.next()){
            ID=rs.getInt(1);
        }        
        
        return ID;
        
    }
}