/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelmgmt.connection;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;

/**
 *
 * @author catchlrnovo
 */
public class createConfig extends javax.swing.JFrame {

    /**
     * Creates new form createConfig
     */
    public createConfig() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        url = new javax.swing.JTextField();
        driver = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        testConnection = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        createConnection = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("URL");

        jLabel2.setText("Driver");

        jLabel3.setText("Username");

        jLabel4.setText("Password");

        url.setText("jdbc:mysql://localhost/hostel");
        url.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urlActionPerformed(evt);
            }
        });

        driver.setText("com.mysql.jdbc.Driver");

        username.setText("root");

        reset.setText("Reset");

        testConnection.setText("Test Connection");
        testConnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testConnectionActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("New Connection");

        createConnection.setText("Create Connection");
        createConnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createConnectionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(url)
                            .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(driver, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(password)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(testConnection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createConnection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reset)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(url, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(driver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset)
                    .addComponent(createConnection)
                    .addComponent(testConnection))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void urlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_urlActionPerformed

    private void testConnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testConnectionActionPerformed
        if ( testConnection() ) {
            JOptionPane.showMessageDialog(null, "Success: Database Connection Successful");
        }
        else {
            JOptionPane.showMessageDialog(null, "Error: Failed to connect  to databse!!!");
        }
    }//GEN-LAST:event_testConnectionActionPerformed

    private void createConnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createConnectionActionPerformed
        if ( testConnection()) {
            String Url = url.getText();
            String Driver = driver.getText();
            String Username = username.getText();
            char[] Password = password.getPassword();
        
            try {
                DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

                // root elements
                Document doc = docBuilder.newDocument();
                org.w3c.dom.Element rootElement = doc.createElement("config");
                doc.appendChild(rootElement);

                // jdbc elements
                org.w3c.dom.Element staff = doc.createElement("jdbc");
                rootElement.appendChild(staff);

                // url elements
                org.w3c.dom.Element Url_element = doc.createElement("url");
                Url_element.appendChild(doc.createTextNode(Url));
                staff.appendChild(Url_element);
                
                // driver elements
                org.w3c.dom.Element Driver_element = doc.createElement("driver");
                Driver_element.appendChild(doc.createTextNode(Driver));
                staff.appendChild(Driver_element);
                
                // username elements
                org.w3c.dom.Element Username_element = doc.createElement("username");
                Username_element.appendChild(doc.createTextNode(Username));
                staff.appendChild(Username_element);
                
                // password elements
                org.w3c.dom.Element Password_element = doc.createElement("password");
                Password_element.appendChild(doc.createTextNode(String.valueOf(Password)));
                staff.appendChild(Password_element);                

                // write the content into xml file
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                transformer.setOutputProperty(OutputKeys.INDENT, "yes"); 
                transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
                DOMSource source = new DOMSource(doc);
                StreamResult result = new StreamResult(new File("src//hostelmgmt//connection//config.xml"));

                // Output to console for testing
                transformer.transform(source, result);
                    
                JOptionPane.showMessageDialog(null, "Configuration Complete. Please restart the program to continue");
                
                System.exit(1);
            } 
            catch (TransformerConfigurationException ex) {
                JOptionPane.showMessageDialog(null, "Error: Failed to create configuration file!!!");
                Logger.getLogger(createConfig.class.getName()).log(Level.SEVERE, null, ex);
            } catch (TransformerException | ParserConfigurationException ex) {
                JOptionPane.showMessageDialog(null, "Error: Failed to create configuration file!!!");
                Logger.getLogger(createConfig.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Error: Failed to create configuration file!!!");
        }
        
    }//GEN-LAST:event_createConnectionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(createConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createConfig().setVisible(true);
            }
        });
    }
    
    public boolean testConnection() {                                               
        Connection con;
        String Url = url.getText();
        String Driver = driver.getText();
        String Username = username.getText();
        char[] Password = password.getPassword();
        
        //do validation here
        
        try {
                Class.forName(Driver);
                try {
                    con = DriverManager.getConnection(Url, Username, String.valueOf(Password));
                    return true;
                } catch (SQLException ex) {
                    // log an exception. fro example:
                    System.out.println("false1");
                    return false;
                }
            } catch (ClassNotFoundException ex) {
                // log an exception. for example:
                System.out.println("false2");
                return false;
            }        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createConnection;
    private javax.swing.JTextField driver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton reset;
    private javax.swing.JButton testConnection;
    private javax.swing.JTextField url;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
