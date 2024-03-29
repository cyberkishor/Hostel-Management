package hostelmgmt;


import static com.sun.org.apache.xerces.internal.util.XMLChar.trim;
import hostelmgmt.connection.connection;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import org.xml.sax.SAXException;
import utilities.userSession;
import utilities.validator;
//import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author publisy
 */
public class Member extends javax.swing.JInternalFrame {
    userSession user;
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    int is_active =0;
    /**
     * Creates new form jtable
     */
    public Member(userSession user) {
        initComponents();
        try {
            conn = connection.getConnection();
        } catch (ParserConfigurationException | SAXException | IOException | XPathExpressionException | URISyntaxException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
    this.user = user;
        this.fillUserTable("SELECT id,fName,lname,address,date From member");
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        guardEdit = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        conEdit = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lnameEdit = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fnameEdit = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        userchkmsg = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        addEdit = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        emailEdit = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        dateEdit = new datechooser.beans.DateChooserCombo();
        jLabel11 = new javax.swing.JLabel();
        genderEdit = new javax.swing.JComboBox();
        contEdit = new javax.swing.JTextField();
        deleteEdit = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        canvas1 = new java.awt.Canvas();
        submitEdit = new javax.swing.JButton();
        userId = new javax.swing.JLabel();
        submitEdit1 = new javax.swing.JButton();
        clear = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(userTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        guardEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                guardEditKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                guardEditKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                guardEditKeyTyped(evt);
            }
        });

        jLabel3.setText("Contact no.");

        jLabel1.setText("First name");

        jLabel7.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Member Information");

        jLabel2.setText("Last name");

        jLabel5.setText("Guardian's Name");

        jLabel6.setText("Guardian's Contact");

        userchkmsg.setForeground(new java.awt.Color(255, 51, 0));

        jLabel4.setText("Address");

        jLabel9.setText("Email address");

        jLabel10.setText("Join date");

        dateEdit.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dateEdit.setFormat(2);

    jLabel11.setText("Gender");

    genderEdit.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Gender", "Male", "Female" }));
    genderEdit.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            genderEditItemStateChanged(evt);
        }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userchkmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel10)
                        .addComponent(jLabel11))
                    .addGap(20, 20, 20)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dateEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                                    .addComponent(fnameEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lnameEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(guardEdit)
                                    .addComponent(contEdit))
                                .addComponent(genderEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel9))
                            .addGap(64, 64, 64)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(emailEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                                .addComponent(conEdit))))
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(fnameEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lnameEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel4)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(addEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(genderEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))))
            .addGap(4, 4, 4)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(emailEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel9))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(conEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3))
            .addGap(8, 8, 8)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addComponent(userchkmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(24, 24, 24))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(guardEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(contEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(3, 3, 3)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel10)
                .addComponent(dateEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
            .addContainerGap(44, Short.MAX_VALUE))
    );

    deleteEdit.setText("Delete Selected Record");
    deleteEdit.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            deleteEditActionPerformed(evt);
        }
    });

    search.setText("Search");
    search.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            searchFocusGained(evt);
        }
    });
    search.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            searchKeyTyped(evt);
        }
    });

    submitEdit.setText("Add New Member");
    submitEdit.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            submitEditActionPerformed(evt);
        }
    });

    userId.setText("jLabel9");

    submitEdit1.setText("Edit Old Member");
    submitEdit1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            submitEdit1ActionPerformed(evt);
        }
    });

    clear.setText("Clear");
    clear.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            clearActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(83, 83, 83)
                    .addComponent(deleteEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))))
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addComponent(submitEdit)
                    .addGap(18, 18, 18)
                    .addComponent(clear)
                    .addGap(35, 35, 35)
                    .addComponent(submitEdit1)
                    .addGap(413, 413, 413)
                    .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(userId)))
            .addGap(0, 81, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(3, 3, 3)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(deleteEdit)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                    .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(submitEdit1)
                        .addComponent(submitEdit)
                        .addComponent(clear))
                    .addGap(8, 8, 8)))
            .addComponent(userId)
            .addGap(22, 22, 22))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardEditKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_guardEditKeyPressed
    }//GEN-LAST:event_guardEditKeyPressed

    private void guardEditKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_guardEditKeyReleased
    }//GEN-LAST:event_guardEditKeyReleased

    private void guardEditKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_guardEditKeyTyped
    }//GEN-LAST:event_guardEditKeyTyped

    private void submitEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitEditActionPerformed
        String firstname    = (String) trim(fnameEdit.getText());
        String lastname     = (String) trim(lnameEdit.getText());
        String address      = (String) trim(addEdit.getText());
        String gender       =  trim ((String) genderEdit.getSelectedItem());
        String email        = (String) trim(emailEdit.getText());
        String phone        = (String) trim(conEdit.getText());
        String guardian     = (String) trim(guardEdit.getText());
        String guardiancon  = (String) trim(contEdit.getText());
        DateFormat df       = new SimpleDateFormat("Y-MM-dd");
        String date         = df.format(dateEdit.getSelectedDate().getTime());
        Integer loginUser   = user.getUserId();
        String login        = loginUser.toString();
        if(this.is_active==1){
        }
        String error        =   "";
        validator v         = new validator();
        if (v.isnull(firstname) || v.validateName(firstname)) {
            error += "ERROR ! Invalid First Name\n";
        }
        if (v.isnull(lastname) || v.validateName(lastname)) {
            error += "ERROR !Invalid Last Name\n";
        }
        if (v.isnull(address) ) {
            error += "ERROR !Address cannot be blank\n";
        }
        if (v.isnull(email) ) {
            error += "ERROR !email cannot be blank\n";
        }
        if(!v.validatePhone(phone)) {
            error += "ERROR !Invalid Phone number \n";
        }
        if(v.isnull(guardian)) {
            error += "ERROR ! Please fill your guardian's name \n";
        }
        if(!v.validatePhone(guardiancon)) {
            error += "ERROR ! Invalid Phone number \n";
        }
        if(gender == "Select Gender"){
            error += "Please select Gender\n";
        }
        if(error.equals("")){
            String insertSQL = "INSERT INTO member (fname,lname,address,gender,email,contact,parent,parentno,date,paid_upto,created_by) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            String[] params = {firstname,lastname,address,gender,email,phone,guardian,guardiancon,date,date,login};

            Integer b;
            try {
                if(connection.dbExecute(insertSQL, params)){
                    JOptionPane.showMessageDialog(null, "failed");
                    this.clearField();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Successfully Added");
                    this.clearField();
                    this.fillUserTable("SELECT id,fName,lname,address,date From member");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
                JOptionPane.showMessageDialog(null, error);
                    }
    }//GEN-LAST:event_submitEditActionPerformed
    
private void clearField(){
        fnameEdit.setText("");
        lnameEdit.setText("");
        addEdit.setText("");
        emailEdit.setText("");
        conEdit.setText("");
        guardEdit.setText("");
        contEdit.setText("");
        submitEdit.setVisible(true);
    }                           
        
    private void clearEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearEditActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_clearEditActionPerformed

    private void userTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTableMouseClicked
        // TODO add your handling code here:
        try{
            // enable update button and desable Register button 
            int row = userTable.getSelectedRow();
            String Table_click = (userTable.getModel().getValueAt(row, 0).toString());
            String sql = "Select * from member where id =?";
            pst = conn.prepareStatement(sql);
            pst.setString(1,Table_click);
            rs = pst.executeQuery();
            if(rs.next()){
                String firstname = rs.getString("fname");
                userId.setText(rs.getString("id"));
                fnameEdit.setText(firstname);
                lnameEdit.setText(rs.getString("lname"));
                addEdit.setText(rs.getString("address"));
                if("Male".equals(rs.getString("gender")) ){
                    genderEdit.setSelectedIndex(1);
                }
                else {
                    genderEdit.setSelectedIndex(2);
                }
                
                emailEdit.setText(rs.getString("email"));
                conEdit.setText(rs.getString("contact"));
                guardEdit.setText(rs.getString("parent"));
                contEdit.setText(rs.getString("parentno"));
                Calendar cal = Calendar.getInstance();
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                cal.setTime(df.parse(rs.getString("date")));
                dateEdit.setSelectedDate(cal);
                submitEdit.setVisible(false);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_userTableMouseClicked

    private void searchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFocusGained
        // TODO add your handling code here:
        search.setText("");
    }//GEN-LAST:event_searchFocusGained

    private void searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyTyped
        // TODO add your handling code here:
        String sq = search.getText();
        String sql = "SELECT id,fName,lname,address From member where fName like '%"+sq+"%'";
        this.fillUserTable(sql);
    }//GEN-LAST:event_searchKeyTyped

    private void deleteEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEditActionPerformed
        // TODO add your handling code here:
       if(JOptionPane.showConfirmDialog(null, "Are u Sure ?","Billing System", JOptionPane.OK_CANCEL_OPTION) == 0)
        {
            if(!("".equals(userId.getText()))){
                String uid = userId.getText(); 
                String Sql = "DELETE from member where status = 0 and id=?"; 
                try {
                    pst = conn.prepareStatement(Sql);
                    pst.setString(1,uid);
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Member Deleted");
                    userId.setText("");
                    this.fillUserTable("select id,fName,lname,address from member");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, ex);
                }
            }
            else{
                deleteEdit.setVisible(false);
        }
        }
    }//GEN-LAST:event_deleteEditActionPerformed

    private void submitEdit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitEdit1ActionPerformed
        String firstname    = (String) trim(fnameEdit.getText());
        String lastname     =(String) trim(lnameEdit.getText());
        String address      = (String) trim(addEdit.getText());
        String gender       = trim((String) genderEdit.getSelectedItem());
        String email        = (String) trim(emailEdit.getText());
        String phone        = (String) trim(conEdit.getText());
        String guardian     = (String) trim(guardEdit.getText());
        String guardiancon  = (String) trim(contEdit.getText());
        DateFormat df       = new SimpleDateFormat("Y-MM-dd");
        String date         = df.format(dateEdit.getSelectedDate().getTime());
        String id           = (userId.getText());
        Integer loginUser   = user.getUserId();
        String login        = loginUser.toString();
        if(this.is_active==1){
        }

        String error        =   "";
        validator v         = new validator();
        if (v.isnull(firstname) || v.validateName(firstname)) {
            error += "ERROR ! Invalid First Name\n";
        }
        if (v.isnull(lastname) || v.validateName(lastname)) {
            error += "ERROR !Invalid Last Name\n";
        }
        if (v.isnull(address) ) {
            error += "ERROR !Address cannot be blank\n";
        }
        if (v.isnull(email) ) {
            error += "ERROR !email cannot be blank\n";
        }
        if(!v.validatePhone(phone)) {
            error += "ERROR !Invalid Phone number \n";
        }
        if(v.isnull(guardian)) {
            error += "ERROR ! Please fill your guardian's name \n";
        }
        if(!v.validatePhone(guardiancon)) {
            error += "ERROR ! Invalid Phone number \n";
        }
        if(gender == "Select Gender"){
            error += "Please select Gender\n";
        }
        if(error.equals("")){
            String updateSQL = "UPDATE member set fname = ?, lname = ?, address= ? , gender= ?, email =? , contact = ? , parent= ? ,parentno= ?, date =?, modified_by=? where id = ?";
            String[] uparams = {firstname,lastname,address,gender,email,phone,guardian,guardiancon,date,login,id};
 
            Integer b;
            try {
                b = connection.dbExecuteUpdate(updateSQL, uparams);
                JOptionPane.showMessageDialog(null, "Updated Successfully", "Success",JOptionPane.INFORMATION_MESSAGE);
                this.clearField();
                this.fillUserTable("SELECT id,fName,lname,address,date From member");
            }
            catch (SQLException ex) {
                System.out.println(ex);
                Logger.getLogger(Newuser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, error);
        }
    }//GEN-LAST:event_submitEdit1ActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        fnameEdit.setText("");
        lnameEdit.setText("");
        addEdit.setText("");
        genderEdit.setSelectedIndex(0);
        emailEdit.setText("");
        conEdit.setText("");
        guardEdit.setText("");
        contEdit.setText("");
        submitEdit.setVisible(true);
        deleteEdit.setVisible(true);

    }//GEN-LAST:event_clearActionPerformed

    private void genderEditItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_genderEditItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_genderEditItemStateChanged

    
  private void fillUserTable(String sql){
        
        DefaultTableModel dtm = new DefaultTableModel();
        try{
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery(sql);
        
        dtm.addColumn("id");
        dtm.addColumn("First name");
        dtm.addColumn("Last Name");
        dtm.addColumn("Address");
        
        while(rs.next()){
            Object objData[] = new Object[4];
            for(int i = 0; i<4;i++){
                objData[i]= rs.getString(i+1);
            }
            dtm.addRow(objData);
        }
        
        userTable.setModel(dtm);
        userTable.getColumnModel().getColumn(0).setMinWidth(0);
        userTable.getColumnModel().getColumn(0).setMaxWidth(0);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(this, e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addEdit;
    private java.awt.Canvas canvas1;
    private javax.swing.JButton clear;
    private javax.swing.JTextField conEdit;
    private javax.swing.JTextField contEdit;
    private datechooser.beans.DateChooserCombo dateEdit;
    private javax.swing.JButton deleteEdit;
    private javax.swing.JTextField emailEdit;
    private javax.swing.JTextField fnameEdit;
    private javax.swing.JComboBox genderEdit;
    private javax.swing.JTextField guardEdit;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lnameEdit;
    private javax.swing.JTextField search;
    private javax.swing.JButton submitEdit;
    private javax.swing.JButton submitEdit1;
    private javax.swing.JLabel userId;
    private javax.swing.JTable userTable;
    private javax.swing.JLabel userchkmsg;
    // End of variables declaration//GEN-END:variables
}
