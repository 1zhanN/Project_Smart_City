/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import form.Panel1;
import form.Panel2;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.JPanel;
import menu.MenuItem;

/**
 *
 * @author Izhan
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        execute();
    }   

    private void execute(){
        ImageIcon iconAccommodation = new ImageIcon(getClass().getResource("/menu/hotel.png"));
        ImageIcon iconLandmark = new ImageIcon(getClass().getResource("/menu/landmark.png"));
        ImageIcon iconFood = new ImageIcon(getClass().getResource("/menu/food.png"));        
        ImageIcon iconHelp = new ImageIcon(getClass().getResource("/menu/information.png"));
        ImageIcon iconAdd = new ImageIcon(getClass().getResource("/menu/add.png"));
        ImageIcon iconSubMenu = new ImageIcon(getClass().getResource("/menu/subMenu.png"));
       
        // submenus with panel implementation  
          MenuItem menuAccommodation1 = new MenuItem(iconSubMenu, "Hotels", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panel_body.add(new Panel1());
                panel_body.repaint();
                panel_body.revalidate();
            }
        });
          MenuItem menuAccommodation2 = new MenuItem(iconSubMenu, "Motels", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panel_body.add(new Panel1());
                panel_body.repaint();
                panel_body.revalidate();
            }
        });
            MenuItem menuLandmark1 = new MenuItem(iconSubMenu, "Banks", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panel_body.add(new Panel2());
                panel_body.repaint();
                panel_body.revalidate();
            }
        });
            MenuItem menuLandmark2 = new MenuItem(iconSubMenu, "Airports", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panel_body.add(new Panel1());
                panel_body.repaint();
                panel_body.revalidate();
            }
        });
            MenuItem menuLandmark3 = new MenuItem(iconSubMenu, "Shopping Malls", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panel_body.add(new Panel2());
                panel_body.repaint();
                panel_body.revalidate();
            }
        });  
            MenuItem menuLandmark4 = new MenuItem(iconSubMenu, "Institutes", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panel_body.add(new Panel1());
                panel_body.repaint();
                panel_body.revalidate();
            }
        });   
            MenuItem menuFood1 = new MenuItem(iconSubMenu, "Restaurants", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panel_body.add(new Panel1());
                panel_body.repaint();
                panel_body.revalidate();
            }
        });
          MenuItem menuFood2 = new MenuItem(iconSubMenu, "Cafes", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panel_body.add(new Panel1());
                panel_body.repaint();
                panel_body.revalidate();
            }
        });
        MenuItem menuHelp1 = new MenuItem(iconSubMenu, "Emergency Contacts", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panel_body.add(new Panel1());
                panel_body.repaint();
                panel_body.revalidate();
            }
        });
        MenuItem menuHelp2 = new MenuItem(iconSubMenu, "Hospital", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panel_body.add(new Panel1());
                panel_body.repaint();
                panel_body.revalidate();
            }
        });   
       
        
        
        // main menu + subMenu
        MenuItem menuAccommodation = new MenuItem(iconAccommodation, "Accommodation",null ,menuAccommodation1, menuAccommodation2);
        MenuItem menuLandmark = new MenuItem(iconLandmark, "Landmarks",null, menuLandmark1, menuLandmark2, menuLandmark3, menuLandmark4);
        MenuItem menuFood = new MenuItem(iconFood, "Places To Eat",null, menuFood1, menuFood2);
        MenuItem menuHelp = new MenuItem(iconHelp, "Get Help",null, menuHelp1, menuHelp2);
        MenuItem menuAdd = new MenuItem(iconAdd, "Coming Soon",null);
        addMenu(menuAccommodation, menuLandmark, menuFood, menuHelp, menuAdd);
        
       
    }
    private void addMenu(MenuItem... menu){
        for(int i = 0; i<menu.length;i++){
            menus.add(menu[i]);
            ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for(MenuItem m : subMenu){
                addMenu(m);
            }
        }
        menus.revalidate();
        
    }
    @Override
    public void setExtendedState(int state) {
        super.setExtendedState(MAXIMIZED_BOTH); 
    }


// for gradienty colors
        class JpanelGradient extends JPanel{
        protected void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();
            
            Color color1 = new Color(165,71,160);
            Color color2 = new Color(66,39,90);
            GradientPaint gp = new GradientPaint(0, 0, color1, 180, height, color2);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, width, height);
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

        panel_header = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        panel_body = new javax.swing.JPanel();
        panel_menu = new JpanelGradient();
        jScrollPane1 = new javax.swing.JScrollPane();
        menus = new JpanelGradient();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        panel_header.setBackground(new java.awt.Color(165, 71, 160));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("ہمسفر");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("ہر قدم ساتھ");

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_headerLayout = new javax.swing.GroupLayout(panel_header);
        panel_header.setLayout(panel_headerLayout);
        panel_headerLayout.setHorizontalGroup(
            panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_headerLayout.createSequentialGroup()
                .addGroup(panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_headerLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_headerLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel12))
                    .addGroup(panel_headerLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(813, Short.MAX_VALUE))
        );
        panel_headerLayout.setVerticalGroup(
            panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_headerLayout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(panel_header, java.awt.BorderLayout.PAGE_START);

        panel_body.setBackground(new java.awt.Color(255, 255, 255));
        panel_body.setLayout(new java.awt.BorderLayout());
        getContentPane().add(panel_body, java.awt.BorderLayout.CENTER);

        panel_menu.setBackground(new java.awt.Color(153, 0, 153));

        jScrollPane1.setBorder(null);

        menus.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menus.setLayout(new javax.swing.BoxLayout(menus, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(menus);

        javax.swing.GroupLayout panel_menuLayout = new javax.swing.GroupLayout(panel_menu);
        panel_menu.setLayout(panel_menuLayout);
        panel_menuLayout.setHorizontalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
        );
        panel_menuLayout.setVerticalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
        );

        getContentPane().add(panel_menu, java.awt.BorderLayout.LINE_START);

        setSize(new java.awt.Dimension(1076, 635));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel menus;
    private javax.swing.JPanel panel_body;
    private javax.swing.JPanel panel_header;
    private javax.swing.JPanel panel_menu;
    // End of variables declaration//GEN-END:variables
}
