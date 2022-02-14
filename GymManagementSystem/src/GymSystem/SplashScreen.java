/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GymSystem;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Abhishek Mane
 */
public class SplashScreen extends javax.swing.JFrame {

    /**
     * Creates new form SplashScreen
     */
    public SplashScreen() {
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

        backgroundPanel = new javax.swing.JPanel();
        loadMessage = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Loading = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(995, 663));
        setUndecorated(true);
        getContentPane().setLayout(null);

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 0));
        backgroundPanel.setLayout(null);

        loadMessage.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        loadMessage.setForeground(new java.awt.Color(255, 0, 0));
        loadMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loadMessage.setText("Loading....");
        backgroundPanel.add(loadMessage);
        loadMessage.setBounds(0, 510, 1000, 50);

        Title.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 51, 0));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Gym Management System");
        backgroundPanel.add(Title);
        Title.setBounds(170, 10, 650, 60);

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GymBG.jpg"))); // NOI18N
        Logo.setText("Hello");
        backgroundPanel.add(Logo);
        Logo.setBounds(0, 0, 1000, 620);

        Loading.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Loading.setForeground(new java.awt.Color(255, 0, 0));
        backgroundPanel.add(Loading);
        Loading.setBounds(-4, 614, 1010, 60);

        getContentPane().add(backgroundPanel);
        backgroundPanel.setBounds(0, 0, 1000, 670);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       SplashScreen splashScreen = new SplashScreen();
       
       splashScreen.setVisible(true);
       splashScreen.loading();
        
    }
    
    public void loading(){
        try {
            int count = 10;
            Loading.setStringPainted(true);
            Thread.sleep(5000); //5000
            
            for(int i = 0; i <= 100; i++){
                Thread.sleep(300); 
                Loading.setValue(i);
                
                if(i >= 0 && i <= 20)
                    loadMessage.setText("Loading....");
                
                if(i >= 21 && i <= 40)
                    loadMessage.setText("Connecting to Database....");
                
                if(i >= 41 && i <= 60)
                    loadMessage.setText("Fetching Data....");
                
                if(i >= 61 && i <= 80)
                    loadMessage.setText("Loading Data....");
                
                if(i >= 81 && i <= 100){
                    
                    if(i % 2 == 0)
                        loadMessage.setText("Please Wait " + count-- +" Sec...");
                }
            }
        } catch (Exception e) {}
        
        this.setVisible(false);
        new Login().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Loading;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel loadMessage;
    // End of variables declaration//GEN-END:variables
}
