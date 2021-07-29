/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproject2;

import java.awt.Color;
import javax.swing.JPanel;


/**
 *
 * @author Izhan, Khadija, Erum
 */
public class SmartCityGui extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    public SmartCityGui() {
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

        background = new javax.swing.JPanel();
        information_panel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        header_panel = new javax.swing.JPanel();
        btn_close = new javax.swing.JLabel();
        menu_panel = new javax.swing.JPanel();
        btn_accommodation = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_landmark = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_food = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_help = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_soon = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        information_panel.setBackground(new java.awt.Color(207, 141, 232));

        jLabel11.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Hotels / Motels ");

        javax.swing.GroupLayout information_panelLayout = new javax.swing.GroupLayout(information_panel);
        information_panel.setLayout(information_panelLayout);
        information_panelLayout.setHorizontalGroup(
            information_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(information_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(652, Short.MAX_VALUE))
        );
        information_panelLayout.setVerticalGroup(
            information_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, information_panelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addGap(76, 76, 76))
        );

        background.add(information_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 820, 150));

        header_panel.setOpaque(false);
        header_panel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                header_panelMouseDragged(evt);
            }
        });
        header_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                header_panelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout header_panelLayout = new javax.swing.GroupLayout(header_panel);
        header_panel.setLayout(header_panelLayout);
        header_panelLayout.setHorizontalGroup(
            header_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
        );
        header_panelLayout.setVerticalGroup(
            header_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jLayeredPane1.add(header_panel);
        header_panel.setBounds(0, 0, 1140, 30);

        btn_close.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btn_close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopproject2/images/icons8_delete_32px_3.png"))); // NOI18N
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_closeMousePressed(evt);
            }
        });
        jLayeredPane1.add(btn_close);
        btn_close.setBounds(1140, 0, 30, 30);

        menu_panel.setBackground(new java.awt.Color(153, 0, 255));
        menu_panel.setForeground(new java.awt.Color(255, 255, 255));
        menu_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_accommodation.setBackground(new java.awt.Color(153, 92, 255));
        btn_accommodation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_accommodationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_accommodationMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_accommodationMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopproject2/images/icons8_hotel_building_32px.png"))); // NOI18N

        jLabel4.setBackground(new java.awt.Color(153, 51, 255));
        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Accommodation");

        javax.swing.GroupLayout btn_accommodationLayout = new javax.swing.GroupLayout(btn_accommodation);
        btn_accommodation.setLayout(btn_accommodationLayout);
        btn_accommodationLayout.setHorizontalGroup(
            btn_accommodationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_accommodationLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btn_accommodationLayout.setVerticalGroup(
            btn_accommodationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_accommodationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btn_accommodationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        menu_panel.add(btn_accommodation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 350, 60));

        btn_landmark.setBackground(new java.awt.Color(153, 51, 255));
        btn_landmark.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_landmarkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_landmarkMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_landmarkMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopproject2/images/icons8_eiffel_tower_32px_1.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Important Landmarks");

        javax.swing.GroupLayout btn_landmarkLayout = new javax.swing.GroupLayout(btn_landmark);
        btn_landmark.setLayout(btn_landmarkLayout);
        btn_landmarkLayout.setHorizontalGroup(
            btn_landmarkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_landmarkLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_landmarkLayout.setVerticalGroup(
            btn_landmarkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_landmarkLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btn_landmarkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        menu_panel.add(btn_landmark, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 350, 60));

        btn_food.setBackground(new java.awt.Color(153, 51, 255));
        btn_food.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_foodMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_foodMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_foodMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopproject2/images/icons8_food_32px_1.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Places To Eat");

        javax.swing.GroupLayout btn_foodLayout = new javax.swing.GroupLayout(btn_food);
        btn_food.setLayout(btn_foodLayout);
        btn_foodLayout.setHorizontalGroup(
            btn_foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_foodLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_foodLayout.setVerticalGroup(
            btn_foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_foodLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btn_foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        menu_panel.add(btn_food, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 350, -1));

        btn_help.setBackground(new java.awt.Color(153, 0, 255));
        btn_help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_helpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_helpMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_helpMousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopproject2/images/icons8_information_32px_1.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Get Help");

        javax.swing.GroupLayout btn_helpLayout = new javax.swing.GroupLayout(btn_help);
        btn_help.setLayout(btn_helpLayout);
        btn_helpLayout.setHorizontalGroup(
            btn_helpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_helpLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_helpLayout.setVerticalGroup(
            btn_helpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_helpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btn_helpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        menu_panel.add(btn_help, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 350, -1));

        btn_soon.setBackground(new java.awt.Color(153, 0, 255));
        btn_soon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_soonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_soonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_soonMousePressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopproject2/images/icons8_plus_math_32px_1.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Coming Soon");

        javax.swing.GroupLayout btn_soonLayout = new javax.swing.GroupLayout(btn_soon);
        btn_soon.setLayout(btn_soonLayout);
        btn_soonLayout.setHorizontalGroup(
            btn_soonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_soonLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_soonLayout.setVerticalGroup(
            btn_soonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_soonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btn_soonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        menu_panel.add(btn_soon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 350, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("ہر قدم ساتھ");
        menu_panel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 110, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("ہمسفر");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        menu_panel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 150, 70));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        menu_panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 330, 10));

        jLayeredPane1.add(menu_panel);
        menu_panel.setBounds(0, 0, 350, 910);

        background.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 910));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1170, 910));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMousePressed
        // closes the application
        System.exit(0);
    }//GEN-LAST:event_btn_closeMousePressed

    private void header_panelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header_panelMouseDragged
        // coordinate handling
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_header_panelMouseDragged

    private void header_panelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header_panelMousePressed
        // coordinate handling
        xMouse = evt.getX();
        yMouse = evt.getY();
        
    }//GEN-LAST:event_header_panelMousePressed

    
    
    private void btn_accommodationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_accommodationMousePressed
        setColor(btn_accommodation);
        resetColor(btn_landmark);
        resetColor(btn_food);
        resetColor(btn_help);
        resetColor(btn_soon);
    }//GEN-LAST:event_btn_accommodationMousePressed

    private void btn_landmarkMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_landmarkMousePressed
        setColor(btn_landmark);
        resetColor(btn_accommodation);
        resetColor(btn_food);
        resetColor(btn_help);
        resetColor(btn_soon);
    }//GEN-LAST:event_btn_landmarkMousePressed

    private void btn_foodMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_foodMousePressed
        setColor(btn_food);
        resetColor(btn_accommodation);
        resetColor(btn_landmark);
        resetColor(btn_help);
        resetColor(btn_soon);
    }//GEN-LAST:event_btn_foodMousePressed

    private void btn_helpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_helpMousePressed
        setColor(btn_help);
        resetColor(btn_accommodation);
        resetColor(btn_landmark);
        resetColor(btn_food);
        resetColor(btn_soon);
    }//GEN-LAST:event_btn_helpMousePressed

    private void btn_soonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_soonMousePressed
        setColor(btn_soon);
        resetColor(btn_landmark);
        resetColor(btn_accommodation);
        resetColor(btn_landmark);
        resetColor(btn_help);
    }//GEN-LAST:event_btn_soonMousePressed

    private void btn_accommodationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_accommodationMouseEntered
        setColor1(btn_accommodation);
    }//GEN-LAST:event_btn_accommodationMouseEntered

    private void btn_landmarkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_landmarkMouseEntered
        setColor1(btn_landmark);
    }//GEN-LAST:event_btn_landmarkMouseEntered

    private void btn_foodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_foodMouseEntered
        setColor1(btn_food);
    }//GEN-LAST:event_btn_foodMouseEntered

    private void btn_helpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_helpMouseEntered
        setColor1(btn_help);
    }//GEN-LAST:event_btn_helpMouseEntered

    private void btn_soonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_soonMouseEntered
        setColor1(btn_soon);
    }//GEN-LAST:event_btn_soonMouseEntered

    private void btn_accommodationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_accommodationMouseExited
        resetColor1(btn_accommodation);
    }//GEN-LAST:event_btn_accommodationMouseExited

    private void btn_landmarkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_landmarkMouseExited
        resetColor1(btn_landmark);
    }//GEN-LAST:event_btn_landmarkMouseExited

    private void btn_foodMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_foodMouseExited
        resetColor1(btn_food);
    }//GEN-LAST:event_btn_foodMouseExited

    private void btn_helpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_helpMouseExited
        resetColor1(btn_help);
    }//GEN-LAST:event_btn_helpMouseExited

    private void btn_soonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_soonMouseExited
        resetColor1(btn_soon);
    }//GEN-LAST:event_btn_soonMouseExited
    
    void setColor(JPanel panel){
        panel.setBackground(new Color(153,92,255));
        
    }
     void setColor1(JPanel panel){
        panel.setBackground(new Color(153,51,255));
        
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(153,0,255));
    }
     void resetColor1(JPanel panel){
        panel.setBackground(new Color(153,0,255));
    }
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SmartCityGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SmartCityGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SmartCityGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SmartCityGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SmartCityGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel btn_accommodation;
    private javax.swing.JLabel btn_close;
    private javax.swing.JPanel btn_food;
    private javax.swing.JPanel btn_help;
    private javax.swing.JPanel btn_landmark;
    private javax.swing.JPanel btn_soon;
    private javax.swing.JPanel header_panel;
    private javax.swing.JPanel information_panel;
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
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel menu_panel;
    // End of variables declaration//GEN-END:variables
}