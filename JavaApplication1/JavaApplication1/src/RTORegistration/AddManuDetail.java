/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RTORegistration;

import java.awt.event.KeyEvent;
import javax.swing.*;
import java.sql.*;
import java.util.*;

/**
 *
 * @author utkar
 */
public class AddManuDetail extends javax.swing.JFrame {
    int flag=1;
    String mfr_id;
    /**
     * Creates new form AddManuDetail
     */
    public AddManuDetail(int flag1,String MFR_ID1){
        flag=flag1;
        mfr_id=MFR_ID1;
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        if(flag==0){
            t1.setEditable(false);
            jl1.setText("Updating a Manufacturer");
        }
        details();
    }
    private void details(){
        
        PreparedStatement stm=null;
        try{
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","password");
            stm=conn.prepareStatement("Select * from manufacturer where MFR_ID=?");
            stm.setString(1,mfr_id);
            ResultSet rs=stm.executeQuery();
            while(rs.next()){
                t1.setText(rs.getString("mfr_id"));
                t2.setText(rs.getString("MFR_Name"));
                t3.setText(rs.getString("Website"));
                t4.setText(rs.getString("Headquarters"));
                t5.setText(rs.getString("Contact_No"));
            }
            jb2.setText("Update");
        }
        catch(SQLException e){
            
        }
    }
    public AddManuDetail() {
        initComponents();
        t1.setText("Auto Generation");
        t1.setEditable(false);
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
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
        jb2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        t4 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jl1 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jb1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 153)));

        jb2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jb2.setText("Add");
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });
        jb2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jb2KeyPressed(evt);
            }
        });

        t4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        t3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        t2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Headquarters");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Website");

        jl1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jl1.setText("Adding a new Manufacturer");

        t5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Manufacturer ID");

        t1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Contact Number");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Manufacturer Name");

        jb1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jb1.setText("Close");
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });
        jb1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jb1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jl1)
                        .addGap(80, 80, 80))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(t1)
                            .addComponent(t2)
                            .addComponent(t3)
                            .addComponent(t4)
                            .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb2)
                    .addComponent(jb1))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\utkar\\Documents\\JavaApplication1\\Images\\EMB 2.png")); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 102));
        jLabel7.setText("Government of INDIA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(197, 197, 197))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel7)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jb1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){// TODO add your handling code here:
            jb1.doClick();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jb1KeyPressed

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jb1ActionPerformed

    private void jb2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jb2KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){// TODO add your handling code here:
            jb2.doClick();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jb2KeyPressed

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed
        // TODO add your handling code here:
        PreparedStatement stm=null;
        if(flag==1){
            int j=JOptionPane.showConfirmDialog(null, "This will reflect changes into the database.\n"
                    + "Do you want to Add the manufacture?");
            if(j==0){
                try{
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","password");
                    stm=con.prepareStatement("INSERT INTO MANUFACTURER (MFR_Name,WebSite,Headquarters,Contact_No) VALUES (?,?,?,?)");
                    //stm.setString(1,t1.getText());
                    stm.setString(1,t2.getText());
                    stm.setString(2,t3.getText());
                    stm.setString(3,t4.getText());
                    stm.setString(4,t5.getText());
                    int i=stm.executeUpdate();
                    if(i>0){
                        this.dispose();
                        stm=con.prepareStatement("SELECT MFR_ID FROM MANUFACTURER WHERE MFR_NAME=?");
                        stm.setString(1,t2.getText());
                        ResultSet rs=stm.executeQuery();
                        String name=null;
                        while(rs.next())
                            name=rs.getString(1);
                        JOptionPane.showMessageDialog(null,"Data Added Successfully\nThe new manufacturer ID for "+t2.getText()+" is:"+name);
                    }
                }
                catch(SQLException e){
                    JOptionPane.showMessageDialog(null,"Insertion Failed");
                }
            }
        }
        else{
            int j=JOptionPane.showConfirmDialog(null, "Do you want to Update the manufacturer with ID="+t1.getText()+"?");
            if(j==0){
                try{
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","password");
                    stm=con.prepareStatement("Update manufacturer set mfr_name=?,website=?,headquarters=?,contact_no=? where mfr_id=?");
                    stm.setString(1,t2.getText());
                    stm.setString(2,t3.getText());
                    stm.setString(3,t4.getText());
                    stm.setString(4,t5.getText());
                    stm.setString(5,t1.getText());
                    int i=stm.executeUpdate();
                    if(i>0){
                        JOptionPane.showMessageDialog(null,"Changes made Successfully");
                        new MDetails().setVisible(true);
                        this.dispose();
                    }
                    else
                    throw new SQLException();
                }
                catch(SQLException e){
                    JOptionPane.showMessageDialog(null,"Updation Error");
                }
            }
        }
    }//GEN-LAST:event_jb2ActionPerformed

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
            java.util.logging.Logger.getLogger(AddManuDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddManuDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddManuDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddManuDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddManuDetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb2;
    private javax.swing.JLabel jl1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    // End of variables declaration//GEN-END:variables
}
