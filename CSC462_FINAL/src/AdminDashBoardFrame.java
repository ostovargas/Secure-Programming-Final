/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.DecimalFormat;

import java.sql.*;

/**
 *
 * @author ryansmac
 */
public class AdminDashBoardFrame extends javax.swing.JFrame {
    private Connection connection;
    private User user;
    
    private static double companyFunds = 0.00;
    DecimalFormat decimalFormatter = new DecimalFormat("0.00");
    /**
     * Creates new form AdminDashBoardFrame
     */
    public AdminDashBoardFrame(User user, Connection connection) {
        this.user = user;
        this.connection = connection;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify
     * this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        adminDashBoardAddCompanyFundsButton = new javax.swing.JButton();
        adminDashBoardViewAndPayoutEmployeeTimeCardsButton = new javax.swing.JButton();
        adminDashBoardLogoutButton = new javax.swing.JButton();
        adminDashBoardViewCompanyFinanceLogsButton = new javax.swing.JButton();
        adminDashBoardEditEmployeeWagesButton = new javax.swing.JButton();
        adminDashBoardRemoveEmployeeButton = new javax.swing.JButton();
        adminDashBoardViewEmployeeYTDPaymentsButton = new javax.swing.JButton();
        adminDashBoardCreateVerificationCodeButton = new javax.swing.JButton();
        adminDashBoardChangePersonalInfoButton = new javax.swing.JButton();
        adminDashBoardCompanyFundsLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        adminDashBoardAddCompanyFundsButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        adminDashBoardAddCompanyFundsButton.setText("Add Company Funds");
        adminDashBoardAddCompanyFundsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminDashBoardAddCompanyFundsButtonMouseClicked(evt);
            }
        });

        adminDashBoardViewAndPayoutEmployeeTimeCardsButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        adminDashBoardViewAndPayoutEmployeeTimeCardsButton.setText("View/Payout Employee Time Cards");
        adminDashBoardViewAndPayoutEmployeeTimeCardsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminDashBoardViewAndPayoutEmployeeTimeCardsButtonMouseClicked(evt);
            }
        });

        adminDashBoardLogoutButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        adminDashBoardLogoutButton.setText("Logout");
        adminDashBoardLogoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminDashBoardLogoutButtonMouseClicked(evt);
            }
        });

        adminDashBoardViewCompanyFinanceLogsButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        adminDashBoardViewCompanyFinanceLogsButton.setText("View Company Finance Logs");
        adminDashBoardViewCompanyFinanceLogsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminDashBoardViewCompanyFinanceLogsButtonMouseClicked(evt);
            }
        });

        adminDashBoardEditEmployeeWagesButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        adminDashBoardEditEmployeeWagesButton.setText("Edit Employee Wages");
        adminDashBoardEditEmployeeWagesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminDashBoardEditEmployeeWagesButtonMouseClicked(evt);
            }
        });

        adminDashBoardRemoveEmployeeButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        adminDashBoardRemoveEmployeeButton.setText("Remove Employee");
        adminDashBoardRemoveEmployeeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminDashBoardRemoveEmployeeButtonMouseClicked(evt);
            }
        });

        adminDashBoardViewEmployeeYTDPaymentsButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        adminDashBoardViewEmployeeYTDPaymentsButton.setText("View Employee YTD Payments");
        adminDashBoardViewEmployeeYTDPaymentsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminDashBoardViewEmployeeYTDPaymentsButtonMouseClicked(evt);
            }
        });

        adminDashBoardCreateVerificationCodeButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        adminDashBoardCreateVerificationCodeButton.setText("Create Verification Code");
        adminDashBoardCreateVerificationCodeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminDashBoardCreateVerificationCodeButtonMouseClicked(evt);
            }
        });

        adminDashBoardChangePersonalInfoButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        adminDashBoardChangePersonalInfoButton.setText("Change Personal Info");
        adminDashBoardChangePersonalInfoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminDashBoardChangePersonalInfoButtonMouseClicked(evt);
            }
        });

        try {
            String psQuery = 
                    "SELECT funds FROM company_funds WHERE fund_name = 'Company Funds'";
            
            PreparedStatement ps = connection.prepareStatement(psQuery);
            
            ResultSet funds = ps.executeQuery();
            funds.next();
            
            companyFunds = funds.getDouble("funds");
            
            adminDashBoardCompanyFundsLabel.setText("Company Funds Available: $"
                    + decimalFormatter.format(companyFunds));
        }
        catch (Exception e) {
            
        }
        
        adminDashBoardCompanyFundsLabel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        adminDashBoardCompanyFundsLabel.setForeground(new java.awt.Color(255, 255, 255));
        adminDashBoardCompanyFundsLabel.setText("Company Funds Available: $" + decimalFormatter.format(companyFunds));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adminDashBoardAddCompanyFundsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminDashBoardChangePersonalInfoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminDashBoardViewEmployeeYTDPaymentsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                    .addComponent(adminDashBoardViewAndPayoutEmployeeTimeCardsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addGap(133, 133, 133)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adminDashBoardCreateVerificationCodeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminDashBoardRemoveEmployeeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminDashBoardViewCompanyFinanceLogsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                    .addComponent(adminDashBoardEditEmployeeWagesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(adminDashBoardLogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(339, 339, 339))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(adminDashBoardCompanyFundsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(adminDashBoardCompanyFundsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminDashBoardCreateVerificationCodeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminDashBoardChangePersonalInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminDashBoardRemoveEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminDashBoardViewEmployeeYTDPaymentsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminDashBoardViewCompanyFinanceLogsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminDashBoardAddCompanyFundsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminDashBoardViewAndPayoutEmployeeTimeCardsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminDashBoardEditEmployeeWagesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(adminDashBoardLogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminDashBoardAddCompanyFundsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminDashBoardAddCompanyFundsButtonMouseClicked
        // add + 5000 to global variable companyFunds and update label within admin dash board
        // might need to store company Funds in DB and load into label upon page loading while logging in
        
        try {
            String psUpdateQuery =
                    "UPDATE company_funds SET " +
                    "funds = ? " +
                    "WHERE fund_name = 'Company Funds'";
            
            PreparedStatement ps = connection.prepareStatement(psUpdateQuery);
            
            companyFunds += 5000.0;
            
            ps.setDouble(1, companyFunds);
            
            ps.executeUpdate();
            
            adminDashBoardCompanyFundsLabel.setText("Company Funds Available: $"
                    + decimalFormatter.format(companyFunds));
        }
        catch (Exception e) {
            
        }
    }//GEN-LAST:event_adminDashBoardAddCompanyFundsButtonMouseClicked

    private void adminDashBoardViewAndPayoutEmployeeTimeCardsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminDashBoardViewAndPayoutEmployeeTimeCardsButtonMouseClicked
        this.remove(this);
        this.setVisible(false);
        ViewAndPayoutEmployeeTimeCardsFrame viewAndPayoutEmployeeTimeCardsPage = new ViewAndPayoutEmployeeTimeCardsFrame(user, connection);
        viewAndPayoutEmployeeTimeCardsPage.setVisible(true);
    }//GEN-LAST:event_adminDashBoardViewAndPayoutEmployeeTimeCardsButtonMouseClicked

    private void adminDashBoardLogoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminDashBoardLogoutButtonMouseClicked
        this.remove(this);
        this.setVisible(false);
        LoginFrame loginPage = new LoginFrame();
        loginPage.setVisible(true);
    }//GEN-LAST:event_adminDashBoardLogoutButtonMouseClicked

    private void adminDashBoardViewCompanyFinanceLogsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminDashBoardViewCompanyFinanceLogsButtonMouseClicked
        this.remove(this);
        this.setVisible(false);
        ViewCompanyFiananceLogsFrame viewCompanyFinanceLogsPage = new ViewCompanyFiananceLogsFrame(user, connection);
        viewCompanyFinanceLogsPage.setVisible(true);
    }//GEN-LAST:event_adminDashBoardViewCompanyFinanceLogsButtonMouseClicked

    private void adminDashBoardEditEmployeeWagesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminDashBoardEditEmployeeWagesButtonMouseClicked
        this.remove(this);
        this.setVisible(false);
        EditEmployeeWagesFrame editEmployeeWagesPage = new EditEmployeeWagesFrame(user, connection);
        editEmployeeWagesPage.setVisible(true);
    }//GEN-LAST:event_adminDashBoardEditEmployeeWagesButtonMouseClicked

    private void adminDashBoardRemoveEmployeeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminDashBoardRemoveEmployeeButtonMouseClicked
        this.remove(this);
        this.setVisible(false);
        RemoveEmployeeFrame removeEmployeePage = new RemoveEmployeeFrame(user, connection);
        removeEmployeePage.setVisible(true);
    }//GEN-LAST:event_adminDashBoardRemoveEmployeeButtonMouseClicked

    private void adminDashBoardViewEmployeeYTDPaymentsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminDashBoardViewEmployeeYTDPaymentsButtonMouseClicked
        this.remove(this);
        this.setVisible(false);
        ViewEmployeeYTDPaymentsFrame viewEmployeeYTDPaymentsPage = new ViewEmployeeYTDPaymentsFrame(user, connection);
        viewEmployeeYTDPaymentsPage.setVisible(true);
    }//GEN-LAST:event_adminDashBoardViewEmployeeYTDPaymentsButtonMouseClicked

    private void adminDashBoardCreateVerificationCodeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminDashBoardCreateVerificationCodeButtonMouseClicked
        this.remove(this);
        this.setVisible(false);
        CreateVerificationCodeFrame createVerificationCodePage = new CreateVerificationCodeFrame(user, connection);
        createVerificationCodePage.setVisible(true);
    }//GEN-LAST:event_adminDashBoardCreateVerificationCodeButtonMouseClicked

    private void adminDashBoardChangePersonalInfoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminDashBoardChangePersonalInfoButtonMouseClicked
        // will need to load in from DB all current fields in this form
        this.remove(this);
        this.setVisible(false);
        AdminChangePersonalInfoFrame adminChangePersonalInfoPage = new AdminChangePersonalInfoFrame(user, connection);
        adminChangePersonalInfoPage.setVisible(true);
    }//GEN-LAST:event_adminDashBoardChangePersonalInfoButtonMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AdminDashBoardFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AdminDashBoardFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AdminDashBoardFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AdminDashBoardFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AdminDashBoardFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminDashBoardAddCompanyFundsButton;
    private javax.swing.JButton adminDashBoardChangePersonalInfoButton;
    private javax.swing.JLabel adminDashBoardCompanyFundsLabel;
    private javax.swing.JButton adminDashBoardCreateVerificationCodeButton;
    private javax.swing.JButton adminDashBoardEditEmployeeWagesButton;
    private javax.swing.JButton adminDashBoardLogoutButton;
    private javax.swing.JButton adminDashBoardRemoveEmployeeButton;
    private javax.swing.JButton adminDashBoardViewAndPayoutEmployeeTimeCardsButton;
    private javax.swing.JButton adminDashBoardViewCompanyFinanceLogsButton;
    private javax.swing.JButton adminDashBoardViewEmployeeYTDPaymentsButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
