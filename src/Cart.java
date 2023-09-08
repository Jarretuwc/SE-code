
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author njama
 */
public class Cart extends javax.swing.JFrame {

    /**
     * Creates new form Cart
     */
    public Cart() {
        initComponents();
        pnlTable.setVisible(false);
    }
    public Cart(String user){
        initComponents();
        lblUser.setText(user);
        btnLogin.setVisible(false);
        
    }
    public void updateTable(){
        Connection con;
        MyConnector mcon = new MyConnector();
        con = mcon.connectionMaker();
        String sqlquery = "Select * from CartItems";
        Statement stmt;
        ResultSet rs;
        try {
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs = stmt.executeQuery(sqlquery);
            tblCart.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCart = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblMyCart = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        pnlTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        jLabel69 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblEmotyCart = new javax.swing.JLabel();
        lblEmptyCart1 = new javax.swing.JLabel();
        lblEmptyCart2 = new javax.swing.JLabel();
        btnContinueShop = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 580));
        setPreferredSize(new java.awt.Dimension(850, 580));
        getContentPane().setLayout(null);

        btnCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shopping-cart_40x40.png"))); // NOI18N
        btnCart.setText("CART");
        getContentPane().add(btnCart);
        btnCart.setBounds(780, 10, 50, 40);

        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(680, 10, 90, 40);

        btnProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user_40x40.png"))); // NOI18N
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });
        getContentPane().add(btnProfile);
        btnProfile.setBounds(630, 10, 40, 40);

        lblUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUser.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lblUser);
        lblUser.setBounds(630, 10, 140, 40);

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO.png"))); // NOI18N
        jLabel68.setToolTipText("");
        getContentPane().add(jLabel68);
        jLabel68.setBounds(30, 0, 100, 70);

        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setText("What are you looking for?");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(150, 20, 460, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot 2023-09-05 131147.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 974, 70);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblMyCart.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblMyCart.setText("My Cart");

        btnHome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnHome.setText("Home Page");
        btnHome.setActionCommand("btnBack");
        btnHome.setBorder(null);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblMyCart, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 581, Short.MAX_VALUE)
                .addComponent(btnHome)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMyCart)
                    .addComponent(btnHome))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 70, 850, 60);

        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblCart);

        javax.swing.GroupLayout pnlTableLayout = new javax.swing.GroupLayout(pnlTable);
        pnlTable.setLayout(pnlTableLayout);
        pnlTableLayout.setHorizontalGroup(
            pnlTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        pnlTableLayout.setVerticalGroup(
            pnlTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );

        getContentPane().add(pnlTable);
        pnlTable.setBounds(0, 130, 850, 370);

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ContactDetails.png"))); // NOI18N
        getContentPane().add(jLabel69);
        jLabel69.setBounds(30, 510, 780, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot 2023-09-05 131333.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-20, 500, 980, 54);

        lblEmotyCart.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblEmotyCart.setForeground(new java.awt.Color(255, 102, 51));
        lblEmotyCart.setText("Your Cart Is Empty :(");
        getContentPane().add(lblEmotyCart);
        lblEmotyCart.setBounds(260, 210, 330, 40);

        lblEmptyCart1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEmptyCart1.setForeground(new java.awt.Color(153, 153, 153));
        lblEmptyCart1.setText("When you add items to your cart, they will");
        getContentPane().add(lblEmptyCart1);
        lblEmptyCart1.setBounds(230, 260, 370, 25);

        lblEmptyCart2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEmptyCart2.setForeground(new java.awt.Color(153, 153, 153));
        lblEmptyCart2.setText("be organised here.");
        lblEmptyCart2.setToolTipText("");
        getContentPane().add(lblEmptyCart2);
        lblEmptyCart2.setBounds(340, 290, 160, 25);

        btnContinueShop.setBackground(new java.awt.Color(255, 102, 51));
        btnContinueShop.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnContinueShop.setForeground(new java.awt.Color(255, 255, 255));
        btnContinueShop.setText("Continue Shopping");
        btnContinueShop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinueShopActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinueShop);
        btnContinueShop.setBounds(290, 340, 270, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnContinueShopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueShopActionPerformed
        // TODO add your handling code here:
       if (btnLogin.isVisible()){
           Home h =new Home();
           h.setVisible(true);
           setVisible(false); 
        }else{
           String user =lblUser.getText();
           Home h =new Home(user);
           h.setVisible(true);
           setVisible(false);
        }   
        
    }//GEN-LAST:event_btnContinueShopActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        if (btnLogin.isVisible()){
           Home h =new Home();
           h.setVisible(true);
           setVisible(false); 
        }else{
           String user =lblUser.getText();
           Home h =new Home(user);
           h.setVisible(true);
           setVisible(false);
        }   
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        LoginForm lf= new LoginForm();
        lf.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCart;
    private javax.swing.JButton btnContinueShop;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnProfile;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblEmotyCart;
    private javax.swing.JLabel lblEmptyCart1;
    private javax.swing.JLabel lblEmptyCart2;
    private javax.swing.JLabel lblMyCart;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel pnlTable;
    private javax.swing.JTable tblCart;
    // End of variables declaration//GEN-END:variables
}
