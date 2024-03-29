
package hostelmgmt;

import java.io.IOException;
import utilities.centerDesktop;
import utilities.userSession;

/**
 *
 * @author Pratik Lal Shrestha
 */
public class Menupage extends javax.swing.JFrame {
    userSession userSession;
    /**
     * Creates new form MainDesktop
     * @param userSession
     */
    public Menupage(userSession userSession) {
        initComponents();
        this.userSession = userSession;
        UserId.setText(userSession.getUserName() + "/ " + userSession.getUserRole());
        setUserPermission();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator29 = new javax.swing.JSeparator();
        Desktop = new javax.swing.JDesktopPane();
        UserId = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_functions = new javax.swing.JMenu();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();
        ChangePassword1 = new javax.swing.JMenuItem();
        jSeparator16 = new javax.swing.JPopupMenu.Separator();
        Logout1 = new javax.swing.JMenuItem();
        User = new javax.swing.JMenu();
        jSeparator19 = new javax.swing.JPopupMenu.Separator();
        m_add_user = new javax.swing.JMenuItem();
        jSeparator18 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jSeparator17 = new javax.swing.JPopupMenu.Separator();
        menu_administration = new javax.swing.JMenu();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        updateMember = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        memberReport = new javax.swing.JMenu();
        selectedReport = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        menu_account = new javax.swing.JMenu();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        payment = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        refund = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        income = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        expenditure = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        memberReport1 = new javax.swing.JMenu();
        jSeparator27 = new javax.swing.JPopupMenu.Separator();
        selectedReport1 = new javax.swing.JMenuItem();
        jSeparator21 = new javax.swing.JPopupMenu.Separator();
        Deposit = new javax.swing.JMenuItem();
        jSeparator22 = new javax.swing.JPopupMenu.Separator();
        jMenuItem12 = new javax.swing.JMenuItem();
        jSeparator23 = new javax.swing.JPopupMenu.Separator();
        jMenuItem13 = new javax.swing.JMenuItem();
        jSeparator24 = new javax.swing.JPopupMenu.Separator();
        jMenuItem14 = new javax.swing.JMenuItem();
        jSeparator25 = new javax.swing.JPopupMenu.Separator();
        jMenuItem15 = new javax.swing.JMenuItem();
        jSeparator26 = new javax.swing.JPopupMenu.Separator();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        menu_warden = new javax.swing.JMenu();
        jSeparator28 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        report = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        menu_utils = new javax.swing.JMenu();
        jSeparator31 = new javax.swing.JPopupMenu.Separator();
        Restore = new javax.swing.JMenuItem();
        jSeparator30 = new javax.swing.JPopupMenu.Separator();
        BackupRestore = new javax.swing.JMenuItem();
        jSeparator32 = new javax.swing.JPopupMenu.Separator();
        jMenu1 = new javax.swing.JMenu();
        jSeparator35 = new javax.swing.JPopupMenu.Separator();
        Help = new javax.swing.JMenuItem();
        jSeparator33 = new javax.swing.JPopupMenu.Separator();
        About = new javax.swing.JMenuItem();
        jSeparator34 = new javax.swing.JPopupMenu.Separator();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 531, Short.MAX_VALUE)
        );

        UserId.setText("User ID");
        UserId.setMaximumSize(new java.awt.Dimension(36, 5));

        jMenuBar1.setToolTipText("Student Information System");

        menu_functions.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        menu_functions.setText("     FUNCTIONS      |");
        menu_functions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_functionsActionPerformed(evt);
            }
        });
        menu_functions.add(jSeparator15);

        ChangePassword1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        ChangePassword1.setText("Change Password");
        ChangePassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePassword1ActionPerformed(evt);
            }
        });
        menu_functions.add(ChangePassword1);
        menu_functions.add(jSeparator16);

        Logout1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK));
        Logout1.setText("Logout");
        Logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout1ActionPerformed(evt);
            }
        });
        menu_functions.add(Logout1);

        User.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        User.setText("   User Management");
        User.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserActionPerformed(evt);
            }
        });
        User.add(jSeparator19);

        m_add_user.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        m_add_user.setText("Add New User");
        m_add_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_add_userActionPerformed(evt);
            }
        });
        User.add(m_add_user);
        User.add(jSeparator18);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem4.setText("Update/Edit User/Roles");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        User.add(jMenuItem4);
        User.add(jSeparator1);

        menu_functions.add(User);
        menu_functions.add(jSeparator17);

        jMenuBar1.add(menu_functions);

        menu_administration.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        menu_administration.setText("    ADMINISTRATION     |");
        menu_administration.add(jSeparator13);

        updateMember.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        updateMember.setText("Add/Update Member Details");
        updateMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateMemberActionPerformed(evt);
            }
        });
        menu_administration.add(updateMember);
        menu_administration.add(jSeparator3);

        memberReport.setText("View Member Reports");

        selectedReport.setText("Total Report");
        selectedReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedReportActionPerformed(evt);
            }
        });
        memberReport.add(selectedReport);

        jMenuItem10.setText("Report by selection");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        memberReport.add(jMenuItem10);

        menu_administration.add(memberReport);
        menu_administration.add(jSeparator12);

        jMenuBar1.add(menu_administration);

        menu_account.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        menu_account.setText("     ACCOUNT     |");
        menu_account.add(jSeparator14);

        payment.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.ALT_MASK));
        payment.setText("Payment Details");
        payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentActionPerformed(evt);
            }
        });
        menu_account.add(payment);
        menu_account.add(jSeparator2);

        refund.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        refund.setText("Refund Details");
        refund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refundActionPerformed(evt);
            }
        });
        menu_account.add(refund);
        menu_account.add(jSeparator4);

        income.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        income.setText("Other Incomes");
        income.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incomeActionPerformed(evt);
            }
        });
        menu_account.add(income);
        menu_account.add(jSeparator5);

        expenditure.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        expenditure.setText("Other Expenditures");
        expenditure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expenditureActionPerformed(evt);
            }
        });
        menu_account.add(expenditure);
        menu_account.add(jSeparator6);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem5.setText("Rate management");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menu_account.add(jMenuItem5);
        menu_account.add(jSeparator7);

        memberReport1.setText("Account Reports");
        memberReport1.add(jSeparator27);

        selectedReport1.setText("Payment");
        selectedReport1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedReport1ActionPerformed(evt);
            }
        });
        memberReport1.add(selectedReport1);
        memberReport1.add(jSeparator21);

        Deposit.setText("Deposit ");
        Deposit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepositMouseClicked(evt);
            }
        });
        Deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositActionPerformed(evt);
            }
        });
        memberReport1.add(Deposit);
        memberReport1.add(jSeparator22);

        jMenuItem12.setText("Refund");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        memberReport1.add(jMenuItem12);
        memberReport1.add(jSeparator23);

        jMenuItem13.setText("Total Income Details");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        memberReport1.add(jMenuItem13);
        memberReport1.add(jSeparator24);

        jMenuItem14.setText("Total Expenditure Details");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        memberReport1.add(jMenuItem14);
        memberReport1.add(jSeparator25);

        jMenuItem15.setText("Balance Sheet");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        memberReport1.add(jMenuItem15);
        memberReport1.add(jSeparator26);

        menu_account.add(memberReport1);
        menu_account.add(jSeparator8);

        jMenuBar1.add(menu_account);

        menu_warden.setText("     WARDEN      |");
        menu_warden.add(jSeparator28);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem3.setText("Allocate rooms");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menu_warden.add(jMenuItem3);
        menu_warden.add(jSeparator9);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem6.setText("Checkout");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        menu_warden.add(jMenuItem6);
        menu_warden.add(jSeparator10);

        report.setText("Room Status Report");
        report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportActionPerformed(evt);
            }
        });
        menu_warden.add(report);
        menu_warden.add(jSeparator11);

        jMenuBar1.add(menu_warden);

        menu_utils.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        menu_utils.setText("     UTILITIES      |");
        menu_utils.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_utilsActionPerformed(evt);
            }
        });
        menu_utils.add(jSeparator31);

        Restore.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        Restore.setText("Backup");
        Restore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestoreActionPerformed(evt);
            }
        });
        menu_utils.add(Restore);
        menu_utils.add(jSeparator30);

        BackupRestore.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        BackupRestore.setText("Restore");
        BackupRestore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackupRestoreActionPerformed(evt);
            }
        });
        menu_utils.add(BackupRestore);
        menu_utils.add(jSeparator32);

        jMenuBar1.add(menu_utils);

        jMenu1.setText("HELP");
        jMenu1.add(jSeparator35);

        Help.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        Help.setText("Help");
        Help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpActionPerformed(evt);
            }
        });
        jMenu1.add(Help);
        jMenu1.add(jSeparator33);

        About.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        About.setText("About");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });
        jMenu1.add(About);
        jMenu1.add(jSeparator34);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);
        jMenuBar1.getAccessibleContext().setAccessibleName("Student Information System");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(848, Short.MAX_VALUE)
                .addComponent(UserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addComponent(Desktop)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Desktop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserId, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void previlige(){
        if(userSession.getUserRole() == 1){}
        else if(userSession.getUserRole() == 2){
            User.setEnabled(false);
            BackupRestore.setEnabled(false);
        }
        else {
//            User.setEnabled(false);
//            GenerateReport.setEnabled(false);
//            BackupRestore.setEnabled(false);
        }         
    }
    private void RestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestoreActionPerformed
//        UserAdditionalInformation r = new UserAdditionalInformation(userSession);
//        Desktop.add(r);
//        centerDesktop centerDesktop = new centerDesktop(Desktop, r);
//        r.show();
    }//GEN-LAST:event_RestoreActionPerformed

    private void UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        User_edit r = new User_edit(userSession);
        Desktop.add(r);
        centerDesktop centerDesktop = new centerDesktop(Desktop, r);
        r.show();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void m_add_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_add_userActionPerformed
        Newuser n = new Newuser(userSession);
        Desktop.add(n);
        centerDesktop centerDesktop = new centerDesktop(Desktop, n);
        n.show();
    }//GEN-LAST:event_m_add_userActionPerformed

    private void menu_utilsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_utilsActionPerformed
//        UserAdditionalInformation u = new UserAdditionalInformation(userSession);
//        Desktop.add(u);
//        centerDesktop centerDesktop = new centerDesktop(Desktop, u);
//        u.show();
    }//GEN-LAST:event_menu_utilsActionPerformed
    private void setUserPermission(){

        /*
        a. Admin (1)
        - -All menus

        b. Administration user (2)
        - Functions Menu - change passowrd and logout only
        - Administraion menu, utilities menu and help menu total


        c. Account User(3)
        - Functions Menu - change passowrd and logout only
        - Account menu and help menu total


        d. Warden(4)
        - Functions Menu - change passowrd and logout only
        - warden menu and help menu total

        */
        
        menu_functions.setEnabled(false);
        menu_administration.setEnabled(false);
        menu_account.setEnabled(false);
        menu_warden.setEnabled(false);
        menu_utils.setEnabled(false);
        
        int user_type = userSession.getUserRole();
        if( user_type == 1 ) { // admin
            menu_functions.setEnabled(true);
            menu_administration.setEnabled(true);
            menu_account.setEnabled(true);
            menu_warden.setEnabled(true);
            menu_utils.setEnabled(true);
        }
        
        if( user_type == 2 ) { //administration
            menu_functions.setEnabled(true);
            menu_administration.setEnabled(true);
        }
        
        if( user_type == 3 ) { //account
            menu_functions.setEnabled(true);
            menu_account.setEnabled(true);
        }
        
        if( user_type == 4 ) { //warden
            menu_warden.setEnabled(true);
        }
        
    }
    
    private void AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutActionPerformed
        About abt = new About();
        Desktop.add(abt);
        centerDesktop centerDesktop = new centerDesktop(Desktop, abt);
        abt.show();
    }//GEN-LAST:event_AboutActionPerformed

    private void HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpActionPerformed
        Help h = new Help();
        Desktop.add(h);
        centerDesktop centerDesktop = new centerDesktop(Desktop, h);
        h.show();
    }//GEN-LAST:event_HelpActionPerformed

    private void BackupRestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackupRestoreActionPerformed

    }//GEN-LAST:event_BackupRestoreActionPerformed

    
    private void updateMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateMemberActionPerformed
        Member m = new Member(userSession);
        Desktop.add(m);
        centerDesktop centerDesktop = new centerDesktop(Desktop, m);
        m.show();// TODO add your handling code here:
    }//GEN-LAST:event_updateMemberActionPerformed

    private void paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentActionPerformed
    Payment P = new Payment(userSession);
    Desktop.add(P);
    centerDesktop centerDesktop = new centerDesktop(Desktop, P);
    P.show();
// TODO add your handling code here:
    }//GEN-LAST:event_paymentActionPerformed

    private void DepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositActionPerformed
        Report_deposit RD = new Report_deposit();
        Desktop.add(RD);
        centerDesktop centerDesktop = new centerDesktop(Desktop, RD);
        RD.show();
                    
//         TODO add your handling code here:
    }//GEN-LAST:event_DepositActionPerformed

    private void refundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refundActionPerformed
        Refund R = new Refund(userSession);
        Desktop.add(R);
        centerDesktop centerDesktop = new centerDesktop (Desktop, R);
        R.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_refundActionPerformed

    private void incomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incomeActionPerformed
        Income I = new Income(userSession);
        Desktop.add(I);
        centerDesktop centerDesktop = new centerDesktop (Desktop, I);
        I.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_incomeActionPerformed

    private void expenditureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expenditureActionPerformed
        Expenditure E = new Expenditure(userSession);
        Desktop.add(E);
        centerDesktop centerDesktop = new centerDesktop (Desktop, E);
        E.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_expenditureActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
    Report_refund RR = new Report_refund();
    Desktop.add(RR);
    centerDesktop centerDesktop = new centerDesktop(Desktop, RR);
    RR.show();
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
    Report_income RI = new Report_income();
    Desktop.add(RI);
    centerDesktop centerDesktop = new centerDesktop(Desktop, RI);
    RI.show();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
    Report_expense RE = new Report_expense();
    Desktop.add(RE);
    centerDesktop centerDesktop = new centerDesktop(Desktop, RE);
    RE.show();        // TODO add your handling code here:

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
    Balance_sheet b = new Balance_sheet();
    Desktop.add(b);
    centerDesktop centerDesktop = new centerDesktop(Desktop, b);
    b.show();
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void ChangePassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePassword1ActionPerformed
        ChangePassword cp = new ChangePassword(userSession);
        Desktop.add(cp);
        centerDesktop centerDesktop = new centerDesktop(Desktop, cp);
        cp.show();
            // TODO add your handling code here:
    }//GEN-LAST:event_ChangePassword1ActionPerformed

    private void Logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout1ActionPerformed
        Logout l = new Logout();
        // TODO add your handling code here:
    }//GEN-LAST:event_Logout1ActionPerformed

    private void menu_functionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_functionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_functionsActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Rate T = new Rate(userSession);
        Desktop.add(T);
        centerDesktop centerDesktop = new centerDesktop(Desktop, T);
        T.show();
        
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Room RR = new Room(userSession);
        Desktop.add(RR);
        centerDesktop centerDesktop = new centerDesktop(Desktop,RR);
        RR.show();
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        Rep_adm_select rs = new Rep_adm_select();
        Desktop.add(rs);
        centerDesktop centerDesktop = new centerDesktop(Desktop,rs);
        rs.show();
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void selectedReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedReportActionPerformed
    ReportAdmin RA= new ReportAdmin();
    Desktop.add(RA);
    centerDesktop centerDesktop = new centerDesktop(Desktop, RA);
    RA.show();
// TODO add your handling code here:
    }//GEN-LAST:event_selectedReportActionPerformed

    private void selectedReport1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedReport1ActionPerformed
        Report_payment RP = new Report_payment();
        Desktop.add(RP);
        centerDesktop centerDesktop = new centerDesktop(Desktop, RP);
        RP.show();
    }//GEN-LAST:event_selectedReport1ActionPerformed

    private void DepositMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositMouseClicked
        Report_deposit dep = new Report_deposit();
        Desktop.add(dep);
        centerDesktop centerDesktop = new centerDesktop(Desktop, dep);
        dep.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_DepositMouseClicked

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Checkout ch = new Checkout(userSession);
        Desktop.add(ch);
        centerDesktop centerDesktop = new centerDesktop(Desktop, ch);
        ch.show();
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportActionPerformed
    Rep_roomstatus RRS = new Rep_roomstatus();
    Desktop.add(RRS);
    centerDesktop centerDesktop = new centerDesktop(Desktop, RRS);
    RRS.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_reportActionPerformed

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
            java.util.logging.Logger.getLogger(Menupage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menupage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menupage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menupage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Menupage m = new Menupage(null);
                //m.setExtendedState( m.getExtendedState() | Menupage.MAXIMIZED_BOTH);
                m.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem About;
    private javax.swing.JMenuItem BackupRestore;
    private javax.swing.JMenuItem ChangePassword1;
    private javax.swing.JMenuItem Deposit;
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuItem Help;
    private javax.swing.JMenuItem Logout1;
    private javax.swing.JMenuItem Restore;
    private javax.swing.JMenu User;
    private javax.swing.JLabel UserId;
    private javax.swing.JMenuItem expenditure;
    private javax.swing.JMenuItem income;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator15;
    private javax.swing.JPopupMenu.Separator jSeparator16;
    private javax.swing.JPopupMenu.Separator jSeparator17;
    private javax.swing.JPopupMenu.Separator jSeparator18;
    private javax.swing.JPopupMenu.Separator jSeparator19;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JPopupMenu.Separator jSeparator21;
    private javax.swing.JPopupMenu.Separator jSeparator22;
    private javax.swing.JPopupMenu.Separator jSeparator23;
    private javax.swing.JPopupMenu.Separator jSeparator24;
    private javax.swing.JPopupMenu.Separator jSeparator25;
    private javax.swing.JPopupMenu.Separator jSeparator26;
    private javax.swing.JPopupMenu.Separator jSeparator27;
    private javax.swing.JPopupMenu.Separator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator30;
    private javax.swing.JPopupMenu.Separator jSeparator31;
    private javax.swing.JPopupMenu.Separator jSeparator32;
    private javax.swing.JPopupMenu.Separator jSeparator33;
    private javax.swing.JPopupMenu.Separator jSeparator34;
    private javax.swing.JPopupMenu.Separator jSeparator35;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JMenuItem m_add_user;
    private javax.swing.JMenu memberReport;
    private javax.swing.JMenu memberReport1;
    private javax.swing.JMenu menu_account;
    private javax.swing.JMenu menu_administration;
    private javax.swing.JMenu menu_functions;
    private javax.swing.JMenu menu_utils;
    private javax.swing.JMenu menu_warden;
    private javax.swing.JMenuItem payment;
    private javax.swing.JMenuItem refund;
    private javax.swing.JMenuItem report;
    private javax.swing.JMenuItem selectedReport;
    private javax.swing.JMenuItem selectedReport1;
    private javax.swing.JMenuItem updateMember;
    // End of variables declaration//GEN-END:variables
}
