/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import javax.swing.JPanel;
import menu.MenuItem;
import net.proteanit.sql.DbUtils;
import oopproject2.mainPage;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Izhan
 */
public class Mainn extends javax.swing.JFrame {

    int xMouse;
    int yMouse;

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    static String databaseName = "";
    static String url = "jdbc:mysql://localhost:3306/" + databaseName;

    static String username = "root";
    static String password = "khadija123";

    public void playSound1() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:\\Users\\HP\\Downloads\\Button-SoundBible.com-1420500901.wav"));

            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }

    public void showHospitalData() {
        try {
            con = DriverManager.getConnection(url, username, password);

            String sql = "SELECT * FROM admin.hospital";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            hospital.setModel(DbUtils.resultSetToTableModel(rs));
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(Mainn.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Mainn.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }

    }

    public void showHotelData() {
        try {
            con = DriverManager.getConnection(url, username, password);

            String sql = "SELECT * FROM admin.hotel";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            hotel.setModel(DbUtils.resultSetToTableModel(rs));
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(Mainn.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Mainn.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }

    }

    public void showBanksData() {
        try {
            con = DriverManager.getConnection(url, username, password);

            String sql = "SELECT * FROM admin.banks";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            banks.setModel(DbUtils.resultSetToTableModel(rs));
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(Mainn.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Mainn.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }

    }

    public void showAirportData() {
        try {
            con = DriverManager.getConnection(url, username, password);

            String sql = "SELECT * FROM admin.airport";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            airport.setModel(DbUtils.resultSetToTableModel(rs));
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(Mainn.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Mainn.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }

    }

    public void showMallData() {
        try {
            con = DriverManager.getConnection(url, username, password);

            String sql = "SELECT * FROM admin.shopping_mall";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            mall.setModel(DbUtils.resultSetToTableModel(rs));
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(Mainn.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Mainn.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }

    }

    public void showSchoolData() {
        try {
            con = DriverManager.getConnection(url, username, password);

            String sql = "SELECT * FROM admin.school";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            school.setModel(DbUtils.resultSetToTableModel(rs));
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(Mainn.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Mainn.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }

    }

    public void showCollegeData() {
        try {
            con = DriverManager.getConnection(url, username, password);

            String sql = "SELECT * FROM admin.college";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            college.setModel(DbUtils.resultSetToTableModel(rs));
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(Mainn.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Mainn.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }

    }

    public void showUniversityData() {
        try {
            con = DriverManager.getConnection(url, username, password);

            String sql = "SELECT * FROM admin.univeristy";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            university.setModel(DbUtils.resultSetToTableModel(rs));
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(Mainn.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Mainn.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }

    }

    public void showRestData() {
        try {
            con = DriverManager.getConnection(url, username, password);

            String sql = "SELECT * FROM admin.restaurant";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            rest.setModel(DbUtils.resultSetToTableModel(rs));
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(Mainn.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Mainn.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }

    }

    public void showNosData() {
        try {
            con = DriverManager.getConnection(url, username, password);

            String sql = "SELECT * FROM admin.emergency_no";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            nos.setModel(DbUtils.resultSetToTableModel(rs));
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(Mainn.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Mainn.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }

    }

    /**
     * Creates new form Main
     */
    public Mainn() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        execute();
        showHotelData();

        hospital.getTableHeader().setDefaultRenderer(new Mainn.HeaderColor());
        hospital.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 15));
        hospital.getTableHeader().setOpaque(false);
        hospital.setRowHeight(25);
        hospital.getTableHeader().setPreferredSize(new Dimension(35, 35));

        hotel.getTableHeader().setDefaultRenderer(new Mainn.HeaderColor());
        hotel.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 15));
        hotel.getTableHeader().setOpaque(false);
        hotel.setRowHeight(25);
        hotel.getTableHeader().setPreferredSize(new Dimension(35, 35));

        banks.getTableHeader().setDefaultRenderer(new Mainn.HeaderColor());
        banks.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 15));
        banks.getTableHeader().setOpaque(false);
        banks.setRowHeight(25);
        banks.getTableHeader().setPreferredSize(new Dimension(35, 35));

        airport.getTableHeader().setDefaultRenderer(new Mainn.HeaderColor());
        airport.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 15));
        airport.getTableHeader().setOpaque(false);
        airport.setRowHeight(25);
        airport.getTableHeader().setPreferredSize(new Dimension(35, 35));

        mall.getTableHeader().setDefaultRenderer(new Mainn.HeaderColor());
        mall.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 15));
        mall.getTableHeader().setOpaque(false);
        mall.setRowHeight(25);
        mall.getTableHeader().setPreferredSize(new Dimension(35, 35));

        school.getTableHeader().setDefaultRenderer(new Mainn.HeaderColor());
        school.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 15));
        school.getTableHeader().setOpaque(false);
        school.setRowHeight(25);
        school.getTableHeader().setPreferredSize(new Dimension(35, 35));

        college.getTableHeader().setDefaultRenderer(new Mainn.HeaderColor());
        college.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 15));
        college.getTableHeader().setOpaque(false);
        college.setRowHeight(25);
        college.getTableHeader().setPreferredSize(new Dimension(35, 35));

        university.getTableHeader().setDefaultRenderer(new Mainn.HeaderColor());
        university.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 15));
        university.getTableHeader().setOpaque(false);
        university.setRowHeight(25);
        university.getTableHeader().setPreferredSize(new Dimension(35, 35));

        rest.getTableHeader().setDefaultRenderer(new Mainn.HeaderColor());
        rest.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 15));
        rest.getTableHeader().setOpaque(false);
        rest.setRowHeight(25);
        rest.getTableHeader().setPreferredSize(new Dimension(35, 35));

        nos.getTableHeader().setDefaultRenderer(new Mainn.HeaderColor());
        nos.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 15));
        nos.getTableHeader().setOpaque(false);
        nos.setRowHeight(25);
        nos.getTableHeader().setPreferredSize(new Dimension(35, 35));

        hospitalLabel.setForeground(new Color(187, 187, 187));

//        hospital1.getTableHeader().setDefaultRenderer(new Mainn.HeaderColor());
////        setBackgroud(new Color(0,0,0,0));
//        hospital1.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 15));
//        hospital1.getTableHeader().setOpaque(false);
//
//        hospital1.setRowHeight(25);
//
//        hospital1.getTableHeader().setPreferredSize(new Dimension(35, 35));
////        nameLabel.setForeground(new Color(187, 187, 187));
////        addressLabel.setForeground(new Color(187, 187, 187));
////        snoLabel.setForeground(new Color(187, 187, 187));
//
        hotelLabel.setForeground(new Color(187, 187, 187));
        banksLabel.setForeground(new Color(187, 187, 187));
        airportLabel.setForeground(new Color(187, 187, 187));
        mallLabel.setForeground(new Color(187, 187, 187));
        schoolLabel.setForeground(new Color(187, 187, 187));
        collegeLabel.setForeground(new Color(187, 187, 187));
        universityLabel.setForeground(new Color(187, 187, 187));
        nosLabel.setForeground(new Color(187, 187, 187));
        restLabel.setForeground(new Color(187, 187, 187));
        gift.setForeground(new Color(187, 187, 187));
    }

    // this method switches between panels on runtime
    public void switchPanels(JPanel panel) {
        jLayeredPane1.removeAll();
        jLayeredPane1.add(panel);
        jLayeredPane1.repaint();
        jLayeredPane1.revalidate();
    }

    //header color
    public class HeaderColor extends DefaultTableCellRenderer {

        public HeaderColor() {
            setOpaque(true);
        }

        public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
            super.getTableCellRendererComponent(table, value, selected, focused, row, column);

            setBackground(new java.awt.Color(112, 59, 109));
            //Font bigFont = new Font("sansserif", Font.PLAIN, 24); // or whatever
//jTable1.getTableHeader().setFont(bigFont);

//you can change the color that u want 
            return this;
        }

    }

    // object of images from 'menu' folder
    private void execute() {
//        ImageIcon iconAccommodation = new ImageIcon(("/menu/Hotel.png"));
//        ImageIcon iconAccommodation = new ImageIcon(getClass().getResource("\\Users\\HP\\Documents\\NetBeansProjects\\JavaApplication11\\src\\menu\\Hotel.png"));
//        ImageIcon iconAccommodation = new ImageIcon(getClass().getResource("C:\\Users\\HP\\Documents\\NetBeansProjects\\JavaApplication11\\src\\menu\\Hotel.png"));

        ImageIcon iconAccommodation = new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\JavaApplication11\\src\\menu\\Hotel.png");

//        ImageIcon iconLandmark = new ImageIcon(getClass().getResource("/menu/landmark.png"));
//        ImageIcon iconLandmark = new ImageIcon(getClass().getResource("\\Users\\HP\\Documents\\NetBeansProjects\\JavaApplication11\\src\\menu\\landmark.png"));
//        ImageIcon iconLandmark = new ImageIcon(getClass().getResource("C:\\Users\\HP\\Documents\\NetBeansProjects\\JavaApplication11\\src\\menu\\landmark.png"));
        ImageIcon iconLandmark = new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\JavaApplication11\\src\\menu\\landmark.png");
//        ImageIcon iconFood = new ImageIcon(getClass().getResource("/menu/food.png"));        
//        ImageIcon iconFood = new ImageIcon(getClass().getResource("\\Users\\HP\\Documents\\NetBeansProjects\\JavaApplication11\\src\\menu\\food.png"));        
//        ImageIcon iconFood = new ImageIcon(getClass().getResource("C:\\Users\\HP\\Documents\\NetBeansProjects\\JavaApplication11\\src\\menu\\food.png"));        
        ImageIcon iconFood = new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\JavaApplication11\\src\\menu\\food.png");
//        ImageIcon iconHelp = new ImageIcon(getClass().getResource("/menu/information.png"));
//        ImageIcon iconHelp = new ImageIcon(getClass().getResource("\\Users\\HP\\Documents\\NetBeansProjects\\JavaApplication11\\src\\menu\\information.png"));
//        ImageIcon iconHelp = new ImageIcon(getClass().getResource("C:\\Users\\HP\\Documents\\NetBeansProjects\\JavaApplication11\\src\\menu\\information.png"));
        ImageIcon iconHelp = new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\JavaApplication11\\src\\menu\\information.png");
//        ImageIcon iconAdd = new ImageIcon(getClass().getResource("/menu/add.png"));
//        ImageIcon iconAdd = new ImageIcon(getClass().getResource("\\Users\\HP\\Documents\\NetBeansProjects\\JavaApplication11\\src\\menu\\add.png"));
//        ImageIcon iconAdd = new ImageIcon(getClass().getResource("C:\\Users\\HP\\Documents\\NetBeansProjects\\JavaApplication11\\src\\menu\\add.png"));
        ImageIcon iconAdd = new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\JavaApplication11\\src\\menu\\add.png");
//        ImageIcon iconSubMenu = new ImageIcon(getClass().getResource("/menu/subMenu.png"));
//        ImageIcon iconSubMenu = new ImageIcon(getClass().getResource("\\Users\\HP\\Documents\\NetBeansProjects\\JavaApplication11\\src\\menu\\subMenu.png"));
//        ImageIcon iconSubMenu = new ImageIcon(getClass().getResource("C:\\Users\\HP\\Documents\\NetBeansProjects\\JavaApplication11\\src\\menu\\subMenu.png"));
        ImageIcon iconSubMenu = new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\JavaApplication11\\src\\menu\\subMenu.png");

//        ImageIcon iconAdd2 = new ImageIcon(getClass().getResource("/menu/christmas_gift.png"));
//        ImageIcon iconAdd2 = new ImageIcon(getClass().getResource("\\Users\\HP\\Documents\\NetBeansProjects\\JavaApplication11\\src\\menu\\christmas_gift.png"));
//        ImageIcon iconAdd2 = new ImageIcon(getClass().getResource("C:\\Users\\HP\\Documents\\NetBeansProjects\\JavaApplication11\\src\\menu\\christmas_gift.png"));
        ImageIcon iconAdd2 = new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\JavaApplication11\\src\\menu\\christmas_gift.png");

        // gradient 
        class JpanelGradient extends JPanel {

            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                int width = getWidth();
                int height = getHeight();

//            Color color1 = new Color(32,33,35);
                Color color2 = new Color(165, 71, 160);
//            Color color2 = new Color(32,33,35);
                Color color1 = new Color(66, 39, 90);
                GradientPaint gp = new GradientPaint(0, 0, color1, 180, height, color2);
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, width, height);
            }
        }
        // submenus with panel implementation  
        MenuItem menuAccommodation1 = new MenuItem(iconSubMenu, "Hotels", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                switchPanels(Panel1);
                playSound1();
                showHotelData();
            }
        });
        MenuItem menuAccommodation2 = new MenuItem(iconSubMenu, "Motels", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                playSound1();

                switchPanels(Panel2);
            }
        });
        MenuItem menuLandmark1 = new MenuItem(iconSubMenu, "Banks", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                switchPanels(Panel3);
                playSound1();

                showBanksData();
            }
        });
        MenuItem menuLandmark2 = new MenuItem(iconSubMenu, "Airports", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                switchPanels(Panel4);
                playSound1();

                showAirportData();
            }
        });
        MenuItem menuLandmark3 = new MenuItem(iconSubMenu, "Shopping Malls", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                switchPanels(Panel5);
                playSound1();

                showMallData();
            }
        });
        MenuItem menuLandmark4 = new MenuItem(iconSubMenu, "Schools", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                switchPanels(Panel6);
                playSound1();

                showSchoolData();
            }
        });

        MenuItem menuLandmark5 = new MenuItem(iconSubMenu, "College", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                switchPanels(Panel12);
                playSound1();

                showCollegeData();
            }
        });

        MenuItem menuLandmark6 = new MenuItem(iconSubMenu, "University", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                switchPanels(Panel13);
                playSound1();

                showUniversityData();
            }
        });
        MenuItem menuFood1 = new MenuItem(iconSubMenu, "Restaurants", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                switchPanels(Panel7);
                playSound1();

                showRestData();
            }
        });
        MenuItem menuFood2 = new MenuItem(iconSubMenu, "Cafes", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                switchPanels(Panel8);
            }
        });
        MenuItem menuHelp1 = new MenuItem(iconSubMenu, "Emergency Contacts", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                switchPanels(Panel9);
                playSound1();

                showNosData();

            }
        });
        MenuItem menuHelp2 = new MenuItem(iconSubMenu, "Hospital", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                switchPanels(Panel10);
                playSound1();

                showHospitalData();
            }
        });
        MenuItem menuSoon = new MenuItem(iconAdd2, "Gifts And Vouchers", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                switchPanels(Panel11);
                playSound1();

            }
        });

        // main menu + subMenu
        MenuItem menuAccommodation = new MenuItem(iconAccommodation, "Accommodation", null, menuAccommodation1);
        MenuItem menuLandmark = new MenuItem(iconLandmark, "Landmarks", null, menuLandmark1, menuLandmark2, menuLandmark3, menuLandmark4, menuLandmark5, menuLandmark6);
        MenuItem menuFood = new MenuItem(iconFood, "Places To Eat", null, menuFood1);
        MenuItem menuHelp = new MenuItem(iconHelp, "Get Help", null, menuHelp1, menuHelp2);
        MenuItem menuAdd = new MenuItem(iconAdd, "Coming Soon", null, menuSoon);
        addMenu(menuAccommodation, menuLandmark, menuFood, menuHelp, menuAdd);

    }

    private void addMenu(MenuItem... menu) {
        for (int i = 0; i < menu.length; i++) {
            menus.add(menu[i]);
            ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for (MenuItem m : subMenu) {
                addMenu(m);
            }
        }
        menus.revalidate();

    }

    @Override
    public void setExtendedState(int state) {
        super.setExtendedState(NORMAL);
    }

// for gradienty colors
    class JpanelGradient extends JPanel {

        protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();

            Color color1 = new Color(165, 71, 160);
            Color color2 = new Color(66, 39, 90);
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

        panel_header = new JpanelGradient();
        jLabel10 = new javax.swing.JLabel();
        panel_drag = new javax.swing.JPanel();
        btn_close = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panel_body = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        Panel1 = new javax.swing.JPanel();
        hotelLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        hotel = new javax.swing.JTable();
        Panel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Panel3 = new javax.swing.JPanel();
        banksLabel = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        banks = new javax.swing.JTable();
        Panel4 = new javax.swing.JPanel();
        airportLabel = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        airport = new javax.swing.JTable();
        Panel5 = new javax.swing.JPanel();
        mallLabel = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        mall = new javax.swing.JTable();
        Panel6 = new javax.swing.JPanel();
        schoolLabel = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        school = new javax.swing.JTable();
        Panel7 = new javax.swing.JPanel();
        restLabel = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        rest = new javax.swing.JTable();
        Panel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Panel9 = new javax.swing.JPanel();
        nosLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        nos = new javax.swing.JTable();
        Panel10 = new javax.swing.JPanel();
        hospitalLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        hospital = new javax.swing.JTable();
        Panel11 = new javax.swing.JPanel();
        gift = new javax.swing.JLabel();
        Panel12 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        collegeLabel = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        college = new javax.swing.JTable();
        Panel13 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        universityLabel = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        university = new javax.swing.JTable();
        panel_menu = new JpanelGradient();
        jScrollPane1 = new javax.swing.JScrollPane();
        menus = new JpanelGradient();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setSize(new java.awt.Dimension(882, 560));

        panel_header.setBackground(new java.awt.Color(165, 71, 160));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("ہر قدم ساتھ");

        panel_drag.setOpaque(false);
        panel_drag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panel_dragMouseDragged(evt);
            }
        });
        panel_drag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_dragMousePressed(evt);
            }
        });

        btn_close.setBackground(new java.awt.Color(165, 71, 160));
        btn_close.setForeground(new java.awt.Color(255, 255, 255));
        btn_close.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\JavaApplication11\\src\\menu\\icons8_delete_26px.png")); // NOI18N
        btn_close.setBorder(null);
        btn_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_close.setFocusPainted(false);
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_closeMouseExited(evt);
            }
        });
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Downloads\\back_to_50px.png")); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout panel_dragLayout = new javax.swing.GroupLayout(panel_drag);
        panel_drag.setLayout(panel_dragLayout);
        panel_dragLayout.setHorizontalGroup(
            panel_dragLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_dragLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_dragLayout.setVerticalGroup(
            panel_dragLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("ہمسفر");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout panel_headerLayout = new javax.swing.GroupLayout(panel_header);
        panel_header.setLayout(panel_headerLayout);
        panel_headerLayout.setHorizontalGroup(
            panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_drag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_headerLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(759, Short.MAX_VALUE))
        );
        panel_headerLayout.setVerticalGroup(
            panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_headerLayout.createSequentialGroup()
                .addComponent(panel_drag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(panel_header, java.awt.BorderLayout.PAGE_START);

        panel_body.setBackground(new java.awt.Color(255, 255, 255));
        panel_body.setLayout(new java.awt.BorderLayout());

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(760, 460));
        jLayeredPane1.setLayout(new java.awt.CardLayout());

        Panel1.setBackground(new java.awt.Color(32, 33, 35));
        Panel1.setPreferredSize(new java.awt.Dimension(760, 460));

        hotelLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        hotelLabel.setText("Hotels");

        hotel.setBackground(new java.awt.Color(66, 39, 90));
        hotel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(32, 33, 35)));
        hotel.setForeground(new java.awt.Color(204, 204, 204));
        hotel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Sno", "Name", "Address"
            }
        ));
        hotel.setSelectionBackground(new java.awt.Color(94, 57, 127));
        jScrollPane4.setViewportView(hotel);

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hotelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(hotelLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLayeredPane1.add(Panel1, "card2");

        Panel2.setBackground(new java.awt.Color(32, 33, 35));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setText("LABEL 2");

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(484, Short.MAX_VALUE))
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(363, Short.MAX_VALUE))
        );

        jLayeredPane1.add(Panel2, "card3");

        Panel3.setBackground(new java.awt.Color(32, 33, 35));
        Panel3.setPreferredSize(new java.awt.Dimension(760, 460));

        banksLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        banksLabel.setText("Banks");

        banks.setBackground(new java.awt.Color(66, 39, 90));
        banks.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(32, 33, 35)));
        banks.setForeground(new java.awt.Color(204, 204, 204));
        banks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Sno", "Name", "Address"
            }
        ));
        banks.setSelectionBackground(new java.awt.Color(94, 57, 127));
        jScrollPane5.setViewportView(banks);

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(banksLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(banksLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLayeredPane1.add(Panel3, "card4");

        Panel4.setBackground(new java.awt.Color(32, 33, 35));
        Panel4.setPreferredSize(new java.awt.Dimension(760, 460));

        airportLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        airportLabel.setText("Airport");

        airport.setBackground(new java.awt.Color(66, 39, 90));
        airport.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(32, 33, 35)));
        airport.setForeground(new java.awt.Color(204, 204, 204));
        airport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Sno", "Name", "Address"
            }
        ));
        airport.setSelectionBackground(new java.awt.Color(94, 57, 127));
        jScrollPane6.setViewportView(airport);

        javax.swing.GroupLayout Panel4Layout = new javax.swing.GroupLayout(Panel4);
        Panel4.setLayout(Panel4Layout);
        Panel4Layout.setHorizontalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(airportLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        Panel4Layout.setVerticalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(airportLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLayeredPane1.add(Panel4, "card5");

        Panel5.setBackground(new java.awt.Color(32, 33, 35));

        mallLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        mallLabel.setText("Shopping Mall");

        mall.setBackground(new java.awt.Color(66, 39, 90));
        mall.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(32, 33, 35)));
        mall.setForeground(new java.awt.Color(204, 204, 204));
        mall.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Sno", "Name", "Address"
            }
        ));
        mall.setSelectionBackground(new java.awt.Color(94, 57, 127));
        jScrollPane7.setViewportView(mall);

        javax.swing.GroupLayout Panel5Layout = new javax.swing.GroupLayout(Panel5);
        Panel5.setLayout(Panel5Layout);
        Panel5Layout.setHorizontalGroup(
            Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mallLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        Panel5Layout.setVerticalGroup(
            Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(mallLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLayeredPane1.add(Panel5, "card6");

        Panel6.setBackground(new java.awt.Color(32, 33, 35));

        schoolLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        schoolLabel.setText("Schools");

        school.setBackground(new java.awt.Color(66, 39, 90));
        school.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(32, 33, 35)));
        school.setForeground(new java.awt.Color(204, 204, 204));
        school.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Sno", "Name", "Address"
            }
        ));
        school.setSelectionBackground(new java.awt.Color(94, 57, 127));
        jScrollPane11.setViewportView(school);

        javax.swing.GroupLayout Panel6Layout = new javax.swing.GroupLayout(Panel6);
        Panel6.setLayout(Panel6Layout);
        Panel6Layout.setHorizontalGroup(
            Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel6Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(schoolLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        Panel6Layout.setVerticalGroup(
            Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(schoolLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLayeredPane1.add(Panel6, "card7");

        Panel7.setBackground(new java.awt.Color(32, 33, 35));

        restLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        restLabel.setText("Restaurants");

        rest.setBackground(new java.awt.Color(66, 39, 90));
        rest.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(32, 33, 35)));
        rest.setForeground(new java.awt.Color(204, 204, 204));
        rest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Sno", "Name", "Address"
            }
        ));
        rest.setSelectionBackground(new java.awt.Color(94, 57, 127));
        jScrollPane8.setViewportView(rest);

        javax.swing.GroupLayout Panel7Layout = new javax.swing.GroupLayout(Panel7);
        Panel7.setLayout(Panel7Layout);
        Panel7Layout.setHorizontalGroup(
            Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(restLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        Panel7Layout.setVerticalGroup(
            Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(restLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLayeredPane1.add(Panel7, "card8");

        Panel8.setBackground(new java.awt.Color(32, 33, 35));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel11.setText("LABEL 8");

        javax.swing.GroupLayout Panel8Layout = new javax.swing.GroupLayout(Panel8);
        Panel8.setLayout(Panel8Layout);
        Panel8Layout.setHorizontalGroup(
            Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(484, Short.MAX_VALUE))
        );
        Panel8Layout.setVerticalGroup(
            Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(414, Short.MAX_VALUE))
        );

        jLayeredPane1.add(Panel8, "card9");

        Panel9.setBackground(new java.awt.Color(32, 33, 35));

        nosLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        nosLabel.setText("Emergency Numbers");

        nos.setBackground(new java.awt.Color(66, 39, 90));
        nos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(32, 33, 35)));
        nos.setForeground(new java.awt.Color(204, 204, 204));
        nos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Sno", "Name", "Address"
            }
        ));
        nos.setSelectionBackground(new java.awt.Color(94, 57, 127));
        jScrollPane3.setViewportView(nos);

        javax.swing.GroupLayout Panel9Layout = new javax.swing.GroupLayout(Panel9);
        Panel9.setLayout(Panel9Layout);
        Panel9Layout.setHorizontalGroup(
            Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        Panel9Layout.setVerticalGroup(
            Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel9Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(nosLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLayeredPane1.add(Panel9, "card10");

        Panel10.setBackground(new java.awt.Color(32, 33, 35));

        hospitalLabel.setBackground(new java.awt.Color(187, 187, 187));
        hospitalLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        hospitalLabel.setText("Hospitals");

        hospital.setBackground(new java.awt.Color(66, 39, 90));
        hospital.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(32, 33, 35)));
        hospital.setForeground(new java.awt.Color(204, 204, 204));
        hospital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Sno", "Name", "Address"
            }
        ));
        hospital.setFocusable(false);
        hospital.setSelectionBackground(new java.awt.Color(94, 57, 127));
        jScrollPane2.setViewportView(hospital);

        javax.swing.GroupLayout Panel10Layout = new javax.swing.GroupLayout(Panel10);
        Panel10.setLayout(Panel10Layout);
        Panel10Layout.setHorizontalGroup(
            Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel10Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hospitalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        Panel10Layout.setVerticalGroup(
            Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel10Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(hospitalLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLayeredPane1.add(Panel10, "card11");

        Panel11.setBackground(new java.awt.Color(32, 33, 35));

        gift.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        gift.setText("Gifts and Vouchers Coming Soon ! ");

        javax.swing.GroupLayout Panel11Layout = new javax.swing.GroupLayout(Panel11);
        Panel11.setLayout(Panel11Layout);
        Panel11Layout.setHorizontalGroup(
            Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel11Layout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addComponent(gift, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        Panel11Layout.setVerticalGroup(
            Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel11Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(gift)
                .addContainerGap(223, Short.MAX_VALUE))
        );

        jLayeredPane1.add(Panel11, "card12");

        jPanel1.setBackground(new java.awt.Color(32, 33, 35));

        collegeLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        collegeLabel.setText("Colleges");

        college.setBackground(new java.awt.Color(66, 39, 90));
        college.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(32, 33, 35)));
        college.setForeground(new java.awt.Color(204, 204, 204));
        college.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Sno", "Name", "Address"
            }
        ));
        college.setSelectionBackground(new java.awt.Color(94, 57, 127));
        jScrollPane9.setViewportView(college);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(collegeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(collegeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Panel12Layout = new javax.swing.GroupLayout(Panel12);
        Panel12.setLayout(Panel12Layout);
        Panel12Layout.setHorizontalGroup(
            Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Panel12Layout.setVerticalGroup(
            Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel12Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLayeredPane1.add(Panel12, "card13");

        jPanel2.setBackground(new java.awt.Color(32, 33, 35));

        universityLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        universityLabel.setText("University");

        university.setBackground(new java.awt.Color(66, 39, 90));
        university.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(32, 33, 35)));
        university.setForeground(new java.awt.Color(204, 204, 204));
        university.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Sno", "Name", "Address"
            }
        ));
        university.setSelectionBackground(new java.awt.Color(94, 57, 127));
        jScrollPane10.setViewportView(university);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(universityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(universityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Panel13Layout = new javax.swing.GroupLayout(Panel13);
        Panel13.setLayout(Panel13Layout);
        Panel13Layout.setHorizontalGroup(
            Panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Panel13Layout.setVerticalGroup(
            Panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel13Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLayeredPane1.add(Panel13, "card13");

        panel_body.add(jLayeredPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(panel_body, java.awt.BorderLayout.CENTER);

        panel_menu.setBackground(new java.awt.Color(153, 0, 153));

        jScrollPane1.setBorder(null);

        menus.setBackground(new java.awt.Color(204, 204, 255));
        menus.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menus.setLayout(new javax.swing.BoxLayout(menus, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(menus);

        javax.swing.GroupLayout panel_menuLayout = new javax.swing.GroupLayout(panel_menu);
        panel_menu.setLayout(panel_menuLayout);
        panel_menuLayout.setHorizontalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_menuLayout.setVerticalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
        );

        getContentPane().add(panel_menu, java.awt.BorderLayout.LINE_START);

        setSize(new java.awt.Dimension(942, 631));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        dispose();
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseEntered
        btn_close.setBackground(new Color(66, 39, 90));
    }//GEN-LAST:event_btn_closeMouseEntered

    private void btn_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseExited
        btn_close.setBackground(new Color(165, 71, 160));
    }//GEN-LAST:event_btn_closeMouseExited

    private void panel_dragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_dragMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_panel_dragMouseDragged

    private void panel_dragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_dragMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();

    }//GEN-LAST:event_panel_dragMousePressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:

        mainPage obj = new mainPage();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseEntered

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
            java.util.logging.Logger.getLogger(Mainn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel10;
    private javax.swing.JPanel Panel11;
    private javax.swing.JPanel Panel12;
    private javax.swing.JPanel Panel13;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel Panel4;
    private javax.swing.JPanel Panel5;
    private javax.swing.JPanel Panel6;
    private javax.swing.JPanel Panel7;
    private javax.swing.JPanel Panel8;
    private javax.swing.JPanel Panel9;
    private javax.swing.JTable airport;
    private javax.swing.JLabel airportLabel;
    private javax.swing.JTable banks;
    private javax.swing.JLabel banksLabel;
    private javax.swing.JButton btn_close;
    private javax.swing.JTable college;
    private javax.swing.JLabel collegeLabel;
    private javax.swing.JLabel gift;
    private javax.swing.JTable hospital;
    private javax.swing.JLabel hospitalLabel;
    private javax.swing.JTable hotel;
    private javax.swing.JLabel hotelLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable mall;
    private javax.swing.JLabel mallLabel;
    private javax.swing.JPanel menus;
    private javax.swing.JTable nos;
    private javax.swing.JLabel nosLabel;
    private javax.swing.JPanel panel_body;
    private javax.swing.JPanel panel_drag;
    private javax.swing.JPanel panel_header;
    private javax.swing.JPanel panel_menu;
    private javax.swing.JTable rest;
    private javax.swing.JLabel restLabel;
    private javax.swing.JTable school;
    private javax.swing.JLabel schoolLabel;
    private javax.swing.JTable university;
    private javax.swing.JLabel universityLabel;
    // End of variables declaration//GEN-END:variables
}
