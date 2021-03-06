package RTORegistration;


import RTORegistration.Vehicle;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell pc
 */
public class Registration extends javax.swing.JFrame {
String Card_No,r,office,head_id;
int flag=1;
    public Registration(int x,String r){
        flag=x;
        this.r=r;   //r =registration number
        initComponents();
        if(flag==0){
            jb4.setEnabled(false);
            t1.setEditable(false);
            t2.setEditable(false);
        }
        details();
    }
    private void details(){
        PreparedStatement stm=null;
        if(flag==0){
        t1.setText(r);
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","password");
            stm=con.prepareStatement("Select * from Registration where reg_no=?");
            stm.setString(1,r);
            ResultSet rs=stm.executeQuery();
            while(rs.next()){
                d1.setDate(rs.getDate("Reg_Date"));
                d2.setDate(rs.getDate("Reg_Upto"));
                t2.setText(rs.getString("Chassis_No"));
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Unable to retrieve data");
        }
        }
        else{
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","password");
                stm=con.prepareStatement("Select * from Registration where Reg_No=?");
                stm.setString(1,r);
                ResultSet rs=stm.executeQuery();
                while(rs.next()){
                    t1.setText(rs.getString("Reg_No"));
                    d1.setDate(rs.getDate("Reg_Date"));
                    d2.setDate(rs.getDate("Reg_Upto"));
                    t2.setText(rs.getString("Chassis_No"));
                    Card_No=rs.getString("Card_No");
                    head_id=rs.getString("Head_ID");
                }
                stm=con.prepareStatement("Delete from Registration where Reg_No=?");
                stm.setString(1,r);
                int i=stm.executeUpdate();
                r=head_id;
                if(i<=0)
                    throw new SQLException();
            }
            catch(SQLException e){
                    JOptionPane.showMessageDialog(null,"Deletion Not Successful");
            }
        }
    }
    public Registration(String Card_No,String Head_ID) {
        this.Card_No=Card_No;
        this.r=Head_ID;       //r=head_id;
        head_id=Head_ID;
        initComponents();
        //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param reg
     */

    /**
     * Creates new form Registration
     */
    public Registration() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        jb1 = new javax.swing.JButton();
        d1 = new com.toedter.calendar.JDateChooser();
        d2 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jb2 = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        jb4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Registration Number");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Registration Date");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Registration Upto");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Chassis No");

        t1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        t2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jb1.setText("NEXT");
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

        d1.setDateFormatString("yyyy-MM-dd");

        d2.setDateFormatString("yyyy-MM-dd");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel5.setText("Vehicle Registration Details");

        jb2.setText("Reset");
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

        jb3.setText("Back");
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb3ActionPerformed(evt);
            }
        });
        jb3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jb3KeyPressed(evt);
            }
        });

        jb4.setText("Abort");
        jb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb4ActionPerformed(evt);
            }
        });
        jb4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jb4KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                    .addComponent(jSeparator2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(168, 168, 168))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(t1)
                            .addComponent(d1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(136, 136, 136))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jb4)
                        .addGap(51, 51, 51)
                        .addComponent(jb3)
                        .addGap(47, 47, 47)
                        .addComponent(jb2)
                        .addGap(40, 40, 40)
                        .addComponent(jb1)
                        .addGap(135, 135, 135))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb1)
                    .addComponent(jb2)
                    .addComponent(jb3)
                    .addComponent(jb4))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
        int j=JOptionPane.showConfirmDialog(null, "By clicking on next, the data will be saved in the Database.\nDo you want to go further?");
        if(j==0){
        PreparedStatement stm=null;
        if(flag==1){
        try {
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","password");
        stm=con.prepareStatement("Select * from RTO_OFFICE where Head_ID=?");
        stm.setString(1,r);
        ResultSet rs=stm.executeQuery();
        while(rs.next()){
            office=rs.getString("Office_ID");
        }
        stm=con.prepareStatement("INSERT INTO registration VALUES(?,?,?,?,?,?,?)");
        stm.setString(1,t1.getText());
        stm.setString(2,((JTextField)d1.getDateEditor().getUiComponent()).getText());
        stm.setString(3,((JTextField)d2.getDateEditor().getUiComponent()).getText());
        stm.setString(4,t2.getText());
        stm.setString(5,r);
        stm.setString(6,office);
        stm.setString(7,Card_No);
        int i=stm.executeUpdate();
        if(i>0)
        {
            Vehicle veh=new Vehicle(t1.getText());
            JOptionPane.showMessageDialog(null,"Successfull");
            this.setVisible(false);
            veh.setVisible(true);
        }
        
        // TODO add your handling code here:
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Sorry");
//Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
        else{
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","password");
            stm=con.prepareStatement("Update Registration set Reg_Date=?,Reg_Upto=? where Reg_No=?");
            stm.setString(1,((JTextField)d1.getDateEditor().getUiComponent()).getText());
            stm.setString(2,((JTextField)d2.getDateEditor().getUiComponent()).getText());
            stm.setString(3, r);
            int i=stm.executeUpdate();
            if(i>0){
                JOptionPane.showMessageDialog(null,"Updation Successful");
                this.dispose();
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Updation Failed");
        }
        }
        }
    }//GEN-LAST:event_jb1ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void jb2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jb2KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            jb2.doClick();// TODO add your handling code here:
        }
            
    }//GEN-LAST:event_jb2KeyPressed

    private void jb1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jb1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            jb1.doClick();// TODO add your handling code here:
        }
    }//GEN-LAST:event_jb1KeyPressed

    private void jb3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jb3KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            jb3.doClick();// TODO add your handling code here:
        }
    }//GEN-LAST:event_jb3KeyPressed

    private void jb4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jb4KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            jb4.doClick();// TODO add your handling code here:
        }
    }//GEN-LAST:event_jb4KeyPressed

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed
        // TODO add your handling code here:
        int j=JOptionPane.showConfirmDialog(null, "Do you want to Reset the fields?");
        if(j==0){
        if(flag==1){
        t1.setText("");
        t2.setText("");
        }
        ((JTextField)d1.getDateEditor().getUiComponent()).setText("");
        ((JTextField)d2.getDateEditor().getUiComponent()).setText("");
        }
    }//GEN-LAST:event_jb2ActionPerformed

    private void jb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb3ActionPerformed
        // TODO add your handling code here:
        int j=JOptionPane.showConfirmDialog(null, "Do you want to go back to Owner Details Page?");
        if(j==0){
        if(flag==1){
            Owner_Detail ow=new Owner_Detail(Card_No,head_id,1);
            ow.setVisible(true);
            this.dispose();
        }            
        else{
            Owner_Detail ow=new Owner_Detail(0,r);
            ow.setVisible(true);
            this.dispose();
        }
        }
    }//GEN-LAST:event_jb3ActionPerformed

    private void jb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb4ActionPerformed
        // TODO add your handling code here:
        int j=JOptionPane.showConfirmDialog(null, "Are you sure that you want to abort the Registration of Card Number="+Card_No);
        if(j==0){
        PreparedStatement stm=null;
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","password");
            stm=con.prepareStatement("Delete from Owner where Card_No=?");
            stm.setString(1,Card_No);
            int i=stm.executeUpdate();
            if(i>0){
                this.dispose();
                JOptionPane.showMessageDialog(null, "Registration Aborted");
            }
            else{
                throw new SQLException();
            }
        }
        catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Unknown Error");
        }
    }
    }//GEN-LAST:event_jb4ActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
//System.out.println(Card_No);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser d1;
    private com.toedter.calendar.JDateChooser d2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb2;
    private javax.swing.JButton jb3;
    private javax.swing.JButton jb4;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables

   //To change body of generated methods, choose Tools | Templates
}
