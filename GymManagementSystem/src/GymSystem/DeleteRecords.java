/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GymSystem;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Abhishek Mane
 */
public class DeleteRecords extends javax.swing.JFrame {

    /**
     * Creates new form DeleteRecords
     */
    Dashboard dsb;
    
    public DeleteRecords() {
        super("Delete Records");
        initComponents();
        
        
        fetchMembershipComboBox(msidCombo);
        fetchFloorComboBox(flooridCombo);
        fetchInstructorComboBox(insidCombo);
        fetchPaymentComboBox(paymentidCombo);
        fetchInventoryComboBox(itemidCombo);
        fetchMemberComboBox(memidCombo);
    }
    
    public DeleteRecords(Dashboard d){
        super("Delete Records");
        dsb = d;
        initComponents();
        
        
        fetchMembershipComboBox(msidCombo);
        fetchFloorComboBox(flooridCombo);
        fetchInstructorComboBox(insidCombo);
        fetchPaymentComboBox(paymentidCombo);
        fetchInventoryComboBox(itemidCombo);
        fetchMemberComboBox(memidCombo);
    }
    
    public void fetchFloorComboBox(JComboBox jb){
        try {
            Database db = new Database();
            String query = "select * from floor";
            ResultSet rs = db.stmt.executeQuery(query);
            
            while (rs.next()) {
               jb.addItem(rs.getString("floor_id"));
            }
            
        } catch (Exception e) {
        }
    }
    
    public void fetchMemberComboBox(JComboBox jb){
        try {
            Database db = new Database();
            String query = "select * from member";
            ResultSet rs = db.stmt.executeQuery(query);
            
            while (rs.next()) {
              jb.addItem(rs.getString("member_id"));  
            }
            
        } catch (Exception e) {
        }
    }
    
    public void fetchMembershipComboBox(JComboBox jb){
        try {
            Database db = new Database();
            String query = "select * from membership";
            ResultSet rs = db.stmt.executeQuery(query);
            
            while (rs.next()) {
               jb.addItem(rs.getString("membership_id"));
            }
            
        } catch (Exception e) {
        }
    }
    
    public void fetchInstructorComboBox(JComboBox jb){
        try {
            Database db = new Database();
            String query = "select * from instructor";
            ResultSet rs = db.stmt.executeQuery(query);
            
            while (rs.next()) {
               jb.addItem(rs.getString("instructor_id"));
            }
            
        } catch (Exception e) {
        }
    }
    
    public void fetchPaymentComboBox(JComboBox jb){
        try {
            Database db = new Database();
            String query = "select * from payment";
            ResultSet rs = db.stmt.executeQuery(query);
            
            while (rs.next()) {
               jb.addItem(rs.getString("payment_id"));
            }
            
        } catch (Exception e) {
        }
    }
    
    public void fetchInventoryComboBox(JComboBox jb){
        try {
            Database db = new Database();
            String query = "select * from inventory";
            ResultSet rs = db.stmt.executeQuery(query);
            
            while (rs.next()) {
               jb.addItem(rs.getString("item_id"));
            }
            
        } catch (Exception e) {
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        memidCombo = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        msidCombo = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        insidCombo = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        flooridCombo = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        paymentidCombo = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        itemidCombo = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 200));
        setMinimumSize(new java.awt.Dimension(1199, 573));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Delete Records");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(480, 10, 280, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 110, 50);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Select Member ID To Delete Record Associated With It");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 40, 690, 50);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Member ID - ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 200, 170, 30);

        memidCombo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(memidCombo);
        memidCombo.setBounds(190, 190, 230, 50);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("Delete Member");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(730, 130, 220, 210);

        jTabbedPane1.addTab("Members", jPanel1);

        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Select Membership ID To Delete Record Associated With It");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 40, 710, 50);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Membership ID - ");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 200, 210, 30);

        msidCombo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(msidCombo);
        msidCombo.setBounds(230, 190, 240, 50);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setText("Delete Membership");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(720, 130, 270, 210);

        jTabbedPane1.addTab("Membership", jPanel2);

        jPanel3.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Select Instructor ID To Delete Record Associated With It");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(10, 40, 690, 50);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Instructor ID - ");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(10, 200, 190, 30);

        insidCombo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel3.add(insidCombo);
        insidCombo.setBounds(200, 190, 250, 50);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setText("Delete Instructor");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(730, 130, 240, 210);

        jTabbedPane1.addTab("Instructor", jPanel3);

        jPanel4.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Select Floor ID To Delete Record Associated With It");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(10, 40, 690, 50);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("Floor ID - ");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(10, 200, 130, 30);

        flooridCombo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel4.add(flooridCombo);
        flooridCombo.setBounds(170, 190, 250, 50);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton5.setText("Delete Floor");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5);
        jButton5.setBounds(730, 130, 220, 210);

        jTabbedPane1.addTab("Floor", jPanel4);

        jPanel5.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Select Payment ID To Delete Record Associated With It");
        jPanel5.add(jLabel6);
        jLabel6.setBounds(10, 40, 690, 50);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setText("Payment ID - ");
        jPanel5.add(jLabel12);
        jLabel12.setBounds(10, 200, 170, 30);

        paymentidCombo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel5.add(paymentidCombo);
        paymentidCombo.setBounds(200, 190, 260, 50);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton6.setText("Delete Payment");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton6);
        jButton6.setBounds(730, 130, 230, 210);

        jTabbedPane1.addTab("Payment", jPanel5);

        jPanel6.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Select Item ID To Delete Record Associated With It");
        jPanel6.add(jLabel7);
        jLabel7.setBounds(10, 40, 690, 50);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("Item ID - ");
        jPanel6.add(jLabel13);
        jLabel13.setBounds(10, 200, 170, 30);

        itemidCombo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel6.add(itemidCombo);
        itemidCombo.setBounds(140, 190, 280, 50);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton7.setText("Delete Item");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton7);
        jButton7.setBounds(730, 130, 220, 210);

        jTabbedPane1.addTab("Inventory", jPanel6);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 80, 1200, 490);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setText("Refresh");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(1070, 0, 130, 50);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        dsb.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here: delete member
        try{
                Database db = new Database();
                String sql = "delete from member where member_id = ?";
                PreparedStatement pst =  db.con.prepareStatement(sql);

                pst.setString(1, (String) memidCombo.getSelectedItem());
                
                pst.executeUpdate();

                JOptionPane.showMessageDialog(this,"1 Row Affected \n Record Deleted Successfully");
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here: delete membership
        try{
                Database db = new Database();
                String sql = "delete from membership where membership_id = ?";
                PreparedStatement pst =  db.con.prepareStatement(sql);

                pst.setString(1, (String) msidCombo.getSelectedItem());
                
                pst.executeUpdate();

                JOptionPane.showMessageDialog(this,"1 Row Affected \n Record Deleted Successfully");
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here: delete instructor
        try{
                Database db = new Database();
                String sql = "delete from instructor where instructor_id = ?";
                PreparedStatement pst =  db.con.prepareStatement(sql);

                pst.setString(1, (String) insidCombo.getSelectedItem());
                
                pst.executeUpdate();

                JOptionPane.showMessageDialog(this,"1 Row Affected \n Record Deleted Successfully");
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:delete floor
        try{
                Database db = new Database();
                String sql = "delete from floor where floor_id = ?";
                PreparedStatement pst =  db.con.prepareStatement(sql);

                pst.setString(1, (String) flooridCombo.getSelectedItem());
                
                pst.executeUpdate();

                JOptionPane.showMessageDialog(this,"1 Row Affected \n Record Deleted Successfully");
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here: delete payment
        try{
                Database db = new Database();
                String sql = "delete from payment where payment_id = ?";
                PreparedStatement pst =  db.con.prepareStatement(sql);

                pst.setString(1, (String) paymentidCombo.getSelectedItem());
                
                pst.executeUpdate();

                JOptionPane.showMessageDialog(this,"1 Row Affected \n Record Deleted Successfully");
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here: delete inventory
        try{
                Database db = new Database();
                String sql = "delete from inventory where item_id = ?";
                PreparedStatement pst =  db.con.prepareStatement(sql);

                pst.setString(1, (String) itemidCombo.getSelectedItem());
                
                pst.executeUpdate();

                JOptionPane.showMessageDialog(this,"1 Row Affected \n Record Deleted Successfully");
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new DeleteRecords(dsb).setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * @param args the command line arguments
 */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> flooridCombo;
    private javax.swing.JComboBox<String> insidCombo;
    private javax.swing.JComboBox<String> itemidCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> memidCombo;
    private javax.swing.JComboBox<String> msidCombo;
    private javax.swing.JComboBox<String> paymentidCombo;
    // End of variables declaration//GEN-END:variables
}
