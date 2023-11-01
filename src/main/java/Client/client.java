package Client;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.net.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.Vector;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.table.DefaultTableModel;

//import java.util.Objects;
import Objects.Cinema;

/**
 *
 * @author Admin
 */
public class client extends javax.swing.JFrame {

    private static final String SERVER_IP = "127.0.0.1";
    private static final int SERVER_PORT = 5000;
    private static final int BUFFER_SIZE = 1024;
    private static final String RSA_ALGORITHM = "RSA/ECB/PKCS1Padding";
    private static final String AES_ALGORITHM = "AES/CBC/PKCS5Padding";
    private static final int AES_KEY_SIZE = 128;
    private static final int IV_SIZE = 16;

    private PublicKey serverPublicKey;
    public client() {
        initComponents();
        this.setLocationRelativeTo(null); 
        
        //set Logo icon
        logo_momo.setIcon(new javax.swing.ImageIcon(".\\img\\logo-momo.png"));
        icon_close.setIcon(new javax.swing.ImageIcon(".\\img\\icon-close.png"));
        
        logo_all.setIcon(new javax.swing.ImageIcon(".\\img\\logo-all.png"));
        logo_cgv.setIcon(new javax.swing.ImageIcon(".\\img\\logo-cgv.png"));
        logo_lotte.setIcon(new javax.swing.ImageIcon(".\\img\\logo-lotte.png"));
        logo_galaxy_cinema.setIcon(new javax.swing.ImageIcon(".\\img\\logo-galaxy.png"));
        logo_bhd.setIcon(new javax.swing.ImageIcon(".\\img\\logo-bhd.png"));
        logo_beta_cinema.setIcon(new javax.swing.ImageIcon(".\\img\\logo-beta.png"));
        logo_cinestar.setIcon(new javax.swing.ImageIcon(".\\img\\logo-cinestar.png"));
        logo_mega_gs.setIcon(new javax.swing.ImageIcon(".\\img\\logo-mega-gs.png"));
        logo_dcine.setIcon(new javax.swing.ImageIcon(".\\img\\logo-dcine.png"));
        
        btn_viewShowtimes.setIcon(new javax.swing.ImageIcon(".\\img\\btn-view.png"));
        btn_update.setIcon(new javax.swing.ImageIcon(".\\img\\btn-update.png"));
        btn_viewDetails.setIcon(new javax.swing.ImageIcon(".\\img\\btn-detail.png"));
        
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        logo_momo = new javax.swing.JLabel();
        lbl_header = new javax.swing.JLabel();
        icon_close = new javax.swing.JLabel();
        Workspace = new javax.swing.JPanel();
        CineplexPicker = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_all_theater = new javax.swing.JPanel();
        logo_all = new javax.swing.JLabel();
        btn_cgv = new javax.swing.JPanel();
        logo_cgv = new javax.swing.JLabel();
        btn_lotte = new javax.swing.JPanel();
        logo_lotte = new javax.swing.JLabel();
        btn_galaxy_cine = new javax.swing.JPanel();
        logo_galaxy_cinema = new javax.swing.JLabel();
        btn_bhd_star = new javax.swing.JPanel();
        logo_bhd = new javax.swing.JLabel();
        btn_beta = new javax.swing.JPanel();
        logo_beta_cinema = new javax.swing.JLabel();
        btn_cinestar = new javax.swing.JPanel();
        logo_cinestar = new javax.swing.JLabel();
        btn_mega_gs = new javax.swing.JPanel();
        logo_mega_gs = new javax.swing.JLabel();
        btn_dcine = new javax.swing.JPanel();
        logo_dcine = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        SearchCinema = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_cinema = new javax.swing.JTable();
        SearchBar = new javax.swing.JPanel();
        txt_search = new javax.swing.JTextField();
        btn_search = new javax.swing.JLabel();
        btn_viewShowtimes = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        lbl_date = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_showtimes = new javax.swing.JTable();
        date_date = new com.toedter.calendar.JDateChooser();
        btn_update = new javax.swing.JLabel();
        lbl_cinema = new javax.swing.JLabel();
        pnl_cinema = new javax.swing.JPanel();
        txt_cinema = new javax.swing.JLabel();
        btn_viewDetails = new javax.swing.JLabel();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setFocusTraversalPolicyProvider(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1200, 800));
        setResizable(false);

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        logo_momo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbl_header.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lbl_header.setForeground(new java.awt.Color(204, 0, 153));
        lbl_header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_header.setText("Lịch chiếu phim");
        lbl_header.setDoubleBuffered(true);

        icon_close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icon_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo_momo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_header, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(icon_close)
                .addGap(17, 17, 17))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(icon_close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logo_momo, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(lbl_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Workspace.setBackground(new java.awt.Color(225, 225, 225));
        Workspace.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Workspace.setPreferredSize(new java.awt.Dimension(0, 660));

        CineplexPicker.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setForeground(new java.awt.Color(225, 225, 225));

        btn_all_theater.setBackground(new java.awt.Color(255, 255, 255));
        btn_all_theater.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        logo_all.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo_all.setDoubleBuffered(true);

        javax.swing.GroupLayout btn_all_theaterLayout = new javax.swing.GroupLayout(btn_all_theater);
        btn_all_theater.setLayout(btn_all_theaterLayout);
        btn_all_theaterLayout.setHorizontalGroup(
            btn_all_theaterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_all_theaterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo_all, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btn_all_theaterLayout.setVerticalGroup(
            btn_all_theaterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_all_theaterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo_all, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btn_cgv.setBackground(new java.awt.Color(255, 255, 255));
        btn_cgv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btn_cgvLayout = new javax.swing.GroupLayout(btn_cgv);
        btn_cgv.setLayout(btn_cgvLayout);
        btn_cgvLayout.setHorizontalGroup(
            btn_cgvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_cgvLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo_cgv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_cgvLayout.setVerticalGroup(
            btn_cgvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_cgvLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo_cgv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_lotte.setBackground(new java.awt.Color(255, 255, 255));
        btn_lotte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btn_lotteLayout = new javax.swing.GroupLayout(btn_lotte);
        btn_lotte.setLayout(btn_lotteLayout);
        btn_lotteLayout.setHorizontalGroup(
            btn_lotteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_lotteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo_lotte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_lotteLayout.setVerticalGroup(
            btn_lotteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_lotteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo_lotte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_galaxy_cine.setBackground(new java.awt.Color(255, 255, 255));
        btn_galaxy_cine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btn_galaxy_cineLayout = new javax.swing.GroupLayout(btn_galaxy_cine);
        btn_galaxy_cine.setLayout(btn_galaxy_cineLayout);
        btn_galaxy_cineLayout.setHorizontalGroup(
            btn_galaxy_cineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_galaxy_cineLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo_galaxy_cinema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_galaxy_cineLayout.setVerticalGroup(
            btn_galaxy_cineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_galaxy_cineLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo_galaxy_cinema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_bhd_star.setBackground(new java.awt.Color(255, 255, 255));
        btn_bhd_star.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btn_bhd_starLayout = new javax.swing.GroupLayout(btn_bhd_star);
        btn_bhd_star.setLayout(btn_bhd_starLayout);
        btn_bhd_starLayout.setHorizontalGroup(
            btn_bhd_starLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_bhd_starLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo_bhd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_bhd_starLayout.setVerticalGroup(
            btn_bhd_starLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_bhd_starLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo_bhd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_beta.setBackground(new java.awt.Color(255, 255, 255));
        btn_beta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btn_betaLayout = new javax.swing.GroupLayout(btn_beta);
        btn_beta.setLayout(btn_betaLayout);
        btn_betaLayout.setHorizontalGroup(
            btn_betaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_betaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo_beta_cinema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_betaLayout.setVerticalGroup(
            btn_betaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_betaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo_beta_cinema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_cinestar.setBackground(new java.awt.Color(255, 255, 255));
        btn_cinestar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btn_cinestarLayout = new javax.swing.GroupLayout(btn_cinestar);
        btn_cinestar.setLayout(btn_cinestarLayout);
        btn_cinestarLayout.setHorizontalGroup(
            btn_cinestarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_cinestarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo_cinestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_cinestarLayout.setVerticalGroup(
            btn_cinestarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_cinestarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo_cinestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_mega_gs.setBackground(new java.awt.Color(255, 255, 255));
        btn_mega_gs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
       

        javax.swing.GroupLayout btn_mega_gsLayout = new javax.swing.GroupLayout(btn_mega_gs);
        btn_mega_gs.setLayout(btn_mega_gsLayout);
        btn_mega_gsLayout.setHorizontalGroup(
            btn_mega_gsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_mega_gsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo_mega_gs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_mega_gsLayout.setVerticalGroup(
            btn_mega_gsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_mega_gsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo_mega_gs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_dcine.setBackground(new java.awt.Color(255, 255, 255));
        btn_dcine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btn_dcineLayout = new javax.swing.GroupLayout(btn_dcine);
        btn_dcine.setLayout(btn_dcineLayout);
        btn_dcineLayout.setHorizontalGroup(
            btn_dcineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_dcineLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo_dcine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_dcineLayout.setVerticalGroup(
            btn_dcineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_dcineLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo_dcine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSeparator3.setForeground(new java.awt.Color(225, 225, 225));

        javax.swing.GroupLayout CineplexPickerLayout = new javax.swing.GroupLayout(CineplexPicker);
        CineplexPicker.setLayout(CineplexPickerLayout);
        CineplexPickerLayout.setHorizontalGroup(
            CineplexPickerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CineplexPickerLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btn_all_theater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cgv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_lotte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_galaxy_cine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_bhd_star, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_beta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cinestar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_mega_gs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_dcine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addGroup(CineplexPickerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3)
                .addContainerGap())
        );
        CineplexPickerLayout.setVerticalGroup(
            CineplexPickerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CineplexPickerLayout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(CineplexPickerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_dcine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_mega_gs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cinestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_beta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_bhd_star, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_galaxy_cine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_lotte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cgv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_all_theater, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        SearchCinema.setBackground(new java.awt.Color(250, 250, 250));

        tbl_cinema.setBackground(new java.awt.Color(255, 255, 255));
        tbl_cinema.setFont(new java.awt.Font("San Francisco Display Regular", 0, 16)); // NOI18N
        tbl_cinema.setForeground(new java.awt.Color(51, 51, 51));
        tbl_cinema.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {}
            },
            new String [] {
          
            }
        ));
        tbl_cinema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbl_cinema.setGridColor(new java.awt.Color(102, 102, 102));
        tbl_cinema.setRowHeight(40);
        tbl_cinema.setSelectionBackground(new java.awt.Color(255, 245, 255));
        tbl_cinema.setSelectionForeground(new java.awt.Color(51, 51, 51));
        tbl_cinema.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbl_cinema);

        SearchBar.setBackground(new java.awt.Color(239, 239, 239));

        txt_search.setBackground(new java.awt.Color(239, 239, 239));
        txt_search.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_search.setForeground(new java.awt.Color(102, 102, 102));
        txt_search.setText("Tìm theo tên rạp ...");
        txt_search.setBorder(null);

        btn_search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_search.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\MovieShowtimes\\img\\icon-search.png")); // NOI18N
        btn_search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout SearchBarLayout = new javax.swing.GroupLayout(SearchBar);
        SearchBar.setLayout(SearchBarLayout);
        SearchBarLayout.setHorizontalGroup(
            SearchBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchBarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_search, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );
        SearchBarLayout.setVerticalGroup(
            SearchBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SearchBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_search, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(btn_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btn_viewShowtimes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_viewShowtimes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jSeparator2.setForeground(new java.awt.Color(225, 225, 225));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout SearchCinemaLayout = new javax.swing.GroupLayout(SearchCinema);
        SearchCinema.setLayout(SearchCinemaLayout);
        SearchCinemaLayout.setHorizontalGroup(
            SearchCinemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchCinemaLayout.createSequentialGroup()
                .addGroup(SearchCinemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchCinemaLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(SearchCinemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(SearchBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(SearchCinemaLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btn_viewShowtimes, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SearchCinemaLayout.setVerticalGroup(
            SearchCinemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchCinemaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(SearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_viewShowtimes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
            .addComponent(jSeparator2)
        );

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));

        lbl_date.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_date.setForeground(new java.awt.Color(51, 51, 51));
        lbl_date.setText("Ngày:");

        tbl_showtimes.setFont(new java.awt.Font("San Francisco Text Regular G1", 0, 16)); // NOI18N
        tbl_showtimes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            	{},
                {}
            },
            new String [] {
            		
            }
        ));
        tbl_showtimes.setRowHeight(40);
        tbl_showtimes.setSelectionBackground(new java.awt.Color(255, 245, 255));
        tbl_showtimes.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setViewportView(tbl_showtimes);

        date_date.setDateFormatString("dd/MM/yyyy");
        date_date.setFont(new java.awt.Font("San Francisco Text Regular G1", 0, 16)); // NOI18N
        
        btn_update.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbl_cinema.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_cinema.setForeground(new java.awt.Color(51, 51, 51));
        lbl_cinema.setText("Lịch chiếu tại:");

        pnl_cinema.setBackground(new java.awt.Color(250, 250, 250));

        txt_cinema.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_cinema.setForeground(new java.awt.Color(51, 51, 51));
        txt_cinema.setText("");

        javax.swing.GroupLayout pnl_cinemaLayout = new javax.swing.GroupLayout(pnl_cinema);
        pnl_cinema.setLayout(pnl_cinemaLayout);
        pnl_cinemaLayout.setHorizontalGroup(
            pnl_cinemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cinemaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_cinema, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_cinemaLayout.setVerticalGroup(
            pnl_cinemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cinemaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_cinema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_viewDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_viewDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_viewDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_viewDetailsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_viewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(lbl_cinema)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pnl_cinema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(lbl_date)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(date_date, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn_update))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(date_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_cinema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_cinema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btn_viewDetails)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout WorkspaceLayout = new javax.swing.GroupLayout(Workspace);
        Workspace.setLayout(WorkspaceLayout);
        WorkspaceLayout.setHorizontalGroup(
            WorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(WorkspaceLayout.createSequentialGroup()
                .addComponent(SearchCinema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(CineplexPicker, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        WorkspaceLayout.setVerticalGroup(
            WorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WorkspaceLayout.createSequentialGroup()
                .addComponent(CineplexPicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(WorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SearchCinema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Workspace, javax.swing.GroupLayout.DEFAULT_SIZE, 1205, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Workspace, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE))
        );

        pack();
        
        btn_all_theater.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
        			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        			DatagramSocket socket = new DatagramSocket();

        			InetAddress IPAddress = InetAddress.getByName("localhost");
        		    byte[] sendData = new byte[1048576];
        		    byte[] receiveData = new byte[1048576];
        		 
        				
        				String input = "getCinemaByCineplex;all";
        				
        			    sendData = input.getBytes();
        					
        				DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 5000);

        			    socket.send(sendPacket);

        			    DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

        			    socket.receive(receivePacket);
        			    
        			    ByteArrayInputStream bais = new ByteArrayInputStream(receiveData);
        			    ObjectInputStream ois = new ObjectInputStream(bais);
        			    
        			    Objects.DataForCinema data = (Objects.DataForCinema) ois.readObject();
        			    
//        			    for(int i = 0; i < data.getDataList().size(); i ++) {
//        			    	System.out.println(data.getDataList().get(i).getName() + "---" + data.getDataList().get(i).getId());
//        			    }
//        			    System.out.println("<------------------------------------->");
        			    
        			    setModelCinema(data.getDataList());
        			    
        			    listCinema = data.getDataList();
        			    
        		    socket.close();
        		} catch (IOException | ClassNotFoundException e) { 
        			System.err.println(e); 
        		}
            }
        });
        
        btn_cgv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
        			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        			DatagramSocket socket = new DatagramSocket();

        			InetAddress IPAddress = InetAddress.getByName("localhost");
        		    byte[] sendData = new byte[1048576];
        		    byte[] receiveData = new byte[1048576];
        		    
        				String input = "getCinemaByCineplex;cgv-cineplex";
        				
        			    sendData = input.getBytes();
        					
        				DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 5000);

        			    socket.send(sendPacket);

        			    DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

        			    socket.receive(receivePacket);
        			    
        			    ByteArrayInputStream bais = new ByteArrayInputStream(receiveData);
        			    ObjectInputStream ois = new ObjectInputStream(bais);
        			    
        			    Objects.DataForCinema data = (Objects.DataForCinema) ois.readObject();
        			    
//        			    for(int i = 0; i < data.getDataList().size(); i ++) {
//        			    	System.out.println(data.getDataList().get(i).getName() + "---" + data.getDataList().get(i).getId());
//        			    }
//        			    System.out.println("<------------------------------------->");
        			    
        			    setModelCinema(data.getDataList());
        			    listCinema = data.getDataList();
        			    
        		    socket.close();
        		} catch (IOException | ClassNotFoundException e) { 
        			System.err.println(e); 
        		}
            }
        });
        
        btn_lotte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
        			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        			DatagramSocket socket = new DatagramSocket();

        			InetAddress IPAddress = InetAddress.getByName("localhost");
        		    byte[] sendData = new byte[1048576];
        		    byte[] receiveData = new byte[1048576];
        		    
        				String input = "getCinemaByCineplex;lotte-cineplex";
        				
        			    sendData = input.getBytes();
        					
        				DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 5000);

        			    socket.send(sendPacket);

        			    DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

        			    socket.receive(receivePacket);
        			    
        			    ByteArrayInputStream bais = new ByteArrayInputStream(receiveData);
        			    ObjectInputStream ois = new ObjectInputStream(bais);
        			    
        			    Objects.DataForCinema data = (Objects.DataForCinema) ois.readObject();
        			    
//        			    for(int i = 0; i < data.getDataList().size(); i ++) {
//        			    	System.out.println(data.getDataList().get(i).getName() + "---" + data.getDataList().get(i).getId());
//        			    }
//        			    System.out.println("<------------------------------------->");
        			    
        			    setModelCinema(data.getDataList());
        			    
        			    listCinema = data.getDataList();
        			    
        			 socket.close();
        		} catch (IOException | ClassNotFoundException e) { 
        			System.err.println(e); 
        		}
            }
        });
        
        btn_galaxy_cine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
        			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        			DatagramSocket socket = new DatagramSocket();

        			InetAddress IPAddress = InetAddress.getByName("localhost");
        		    byte[] sendData = new byte[1048576];
        		    byte[] receiveData = new byte[1048576];
        		    
        				String input = "getCinemaByCineplex;galaxy-cineplex";
        				
        			    sendData = input.getBytes();
        					
        				DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 5000);

        			    socket.send(sendPacket);

        			    DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

        			    socket.receive(receivePacket);
        			    
        			    ByteArrayInputStream bais = new ByteArrayInputStream(receiveData);
        			    ObjectInputStream ois = new ObjectInputStream(bais);
        			    
        			    Objects.DataForCinema data = (Objects.DataForCinema) ois.readObject();
        			    
//        			    for(int i = 0; i < data.getDataList().size(); i ++) {
//        			    	System.out.println(data.getDataList().get(i).getName() + "---" + data.getDataList().get(i).getId());
//        			    }
//        			    System.out.println("<------------------------------------->");
        			    
        			    setModelCinema(data.getDataList());
        			    
        			    listCinema = data.getDataList();
        			    
        		    socket.close();
        		} catch (IOException | ClassNotFoundException e) { 
        			System.err.println(e); 
        		}
            }
        });
        
        btn_bhd_star.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
        			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        			DatagramSocket socket = new DatagramSocket();

        			InetAddress IPAddress = InetAddress.getByName("localhost");
        		    byte[] sendData = new byte[1048576];
        		    byte[] receiveData = new byte[1048576];
        		    
        				
        				String input = "getCinemaByCineplex;bhd-cineplex";
        				
        			    sendData = input.getBytes();
        					
        				DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 5000);

        			    socket.send(sendPacket);

        			    DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

        			    socket.receive(receivePacket);
        			    
        			    ByteArrayInputStream bais = new ByteArrayInputStream(receiveData);
        			    ObjectInputStream ois = new ObjectInputStream(bais);
        			    
        			    Objects.DataForCinema data = (Objects.DataForCinema) ois.readObject();
        			    
//        			    for(int i = 0; i < data.getDataList().size(); i ++) {
//        			    	System.out.println(data.getDataList().get(i).getName() + "---" + data.getDataList().get(i).getId());
//        			    }
//        			    System.out.println("<------------------------------------->");
        			    
        			    setModelCinema(data.getDataList());
        			    
        			    listCinema = data.getDataList();
        			    
        		    socket.close();
        		} catch (IOException | ClassNotFoundException e) { 
        			System.err.println(e); 
        		}
            }
        });
        
        btn_beta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
        			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        			DatagramSocket socket = new DatagramSocket();

        			InetAddress IPAddress = InetAddress.getByName("localhost");
        		    byte[] sendData = new byte[1048576];
        		    byte[] receiveData = new byte[1048576];
        		    
        				
        				String input = "getCinemaByCineplex;beta-cineplex";
        				
        			    sendData = input.getBytes();
        					
        				DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 5000);

        			    socket.send(sendPacket);

        			    DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

        			    socket.receive(receivePacket);
        			    
        			    ByteArrayInputStream bais = new ByteArrayInputStream(receiveData);
        			    ObjectInputStream ois = new ObjectInputStream(bais);
        			    
        			    Objects.DataForCinema data = (Objects.DataForCinema) ois.readObject();
        			    
//        			    for(int i = 0; i < data.getDataList().size(); i ++) {
//        			    	System.out.println(data.getDataList().get(i).getName() + "---" + data.getDataList().get(i).getId());
//        			    }
//        			    System.out.println("<------------------------------------->");
        			    
        			    setModelCinema(data.getDataList());
        			    
        			    listCinema = data.getDataList();
        			    
        		    socket.close();
        		} catch (IOException | ClassNotFoundException e) { 
        			System.err.println(e); 
        		}
            }
        });
        
        btn_cinestar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
        			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        			DatagramSocket socket = new DatagramSocket();

        			InetAddress IPAddress = InetAddress.getByName("localhost");
        		    byte[] sendData = new byte[1048576];
        		    byte[] receiveData = new byte[1048576];
        		    
        				
        				String input = "getCinemaByCineplex;cinestar";
        				
        			    sendData = input.getBytes();
        					
        				DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 5000);

        			    socket.send(sendPacket);

        			    DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

        			    socket.receive(receivePacket);
        			    
        			    ByteArrayInputStream bais = new ByteArrayInputStream(receiveData);
        			    ObjectInputStream ois = new ObjectInputStream(bais);
        			    
        			    Objects.DataForCinema data = (Objects.DataForCinema) ois.readObject();
        			    
//        			    for(int i = 0; i < data.getDataList().size(); i ++) {
//        			    	System.out.println(data.getDataList().get(i).getName() + "---" + data.getDataList().get(i).getId());
//        			    }
//        			    System.out.println("<------------------------------------->");
        			    
        			    setModelCinema(data.getDataList());
        			    
        			    listCinema = data.getDataList();
        			    
        		    socket.close();
        		} catch (IOException | ClassNotFoundException e) { 
        			System.err.println(e); 
        		}
            }
        });
        
        btn_mega_gs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
        			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        			DatagramSocket socket = new DatagramSocket();

        			InetAddress IPAddress = InetAddress.getByName("localhost");
        		    byte[] sendData = new byte[1048576];
        		    byte[] receiveData = new byte[1048576];
        		    
        				
        				String input = "getCinemaByCineplex;mega-gs-cinemas";
        				
        			    sendData = input.getBytes();
        					
        				DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 5000);

        			    socket.send(sendPacket);

        			    DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

        			    socket.receive(receivePacket);
        			    
        			    ByteArrayInputStream bais = new ByteArrayInputStream(receiveData);
        			    ObjectInputStream ois = new ObjectInputStream(bais);
        			    
        			    Objects.DataForCinema data = (Objects.DataForCinema) ois.readObject();
        			    
//        			    for(int i = 0; i < data.getDataList().size(); i ++) {
//        			    	System.out.println(data.getDataList().get(i).getName() + "---" + data.getDataList().get(i).getId());
//        			    }
//        			    System.out.println("<------------------------------------->");
        			    
        			    setModelCinema(data.getDataList());
        			    
        			    listCinema = data.getDataList();
        			    
        		    socket.close();
        		} catch (IOException | ClassNotFoundException e) { 
        			System.err.println(e); 
        		}
            }
        });
        
        btn_dcine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
        			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        			DatagramSocket socket = new DatagramSocket();

        			InetAddress IPAddress = InetAddress.getByName("localhost");
        		    byte[] sendData = new byte[1048576];
        		    byte[] receiveData = new byte[1048576];
        		    
        				
        				String input = "getCinemaByCineplex;dcine";
        				
        			    sendData = input.getBytes();
        					
        				DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 5000);

        			    socket.send(sendPacket);

        			    DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

        			    socket.receive(receivePacket);
        			    
        			    ByteArrayInputStream bais = new ByteArrayInputStream(receiveData);
        			    ObjectInputStream ois = new ObjectInputStream(bais);
        			    
        			    Objects.DataForCinema data = (Objects.DataForCinema) ois.readObject();
        			    
//        			    for(int i = 0; i < data.getDataList().size(); i ++) {
//        			    	System.out.println(data.getDataList().get(i).getName() + "---" + data.getDataList().get(i).getId());
//        			    }
//        			    
//        			    System.out.println("<------------------------------------->");
        			    setModelCinema(data.getDataList());
        			    
        			    listCinema = data.getDataList();
        			    
        		    socket.close();
        		} catch (IOException | ClassNotFoundException e) { 
        			System.err.println(e); 
        		}
            }
        });
        
      //Thêm sự kiện cho bảng cinema
        tbl_cinema.addMouseListener(new java.awt.event.MouseAdapter() {
    		public void mouseClicked(java.awt.event.MouseEvent evt) {
    			tblCinemaMouseClicked(evt);
    		}
    	});
        
        //thêm sự kiện cho bảng ds phim
        tbl_showtimes.addMouseListener(new java.awt.event.MouseAdapter() {
    		public void mouseClicked(java.awt.event.MouseEvent evt) {
    			tblShowTimesMouseClicked(evt);
    		}
    	});
        
        //Thêm sự kiện cho nút "Xem lịch chiếu"
        
        btn_viewShowtimes.addMouseListener(new java.awt.event.MouseAdapter() {
        	
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	getCurrentDate();
                try {
        			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        			DatagramSocket socket = new DatagramSocket();

        			InetAddress IPAddress = InetAddress.getByName("localhost");
        		    byte[] sendData = new byte[1048576];
        		    byte[] receiveData = new byte[1048576];
        		    
        				String input = "getFilmByDay;" + String.valueOf(idCinemaChosen) + ";" + currentDay;
        				
        			    sendData = input.getBytes();
        					
        				DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 5000);

        			    socket.send(sendPacket);

        			    DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

        			    socket.receive(receivePacket);
        			    
        			    ByteArrayInputStream bais = new ByteArrayInputStream(receiveData);
        			    ObjectInputStream ois = new ObjectInputStream(bais);
        			    
//        			    Objects.DataForCinema data = (Objects.DataForCinema) ois.readObject();
        			    ArrayList<String> list = (ArrayList<String>) ois.readObject();
//        			    System.out.println(currentDay);
        			    setModelFilm(list);
        			    listFilm = list;
        			   
//        			    date = String.valueOf(date_date.getDate().getYear() + 1900) + "-" + date_date.getDate().getMonth() + "-" + date_date.getDate().getDate();
//        			    listCinema = data.getDataList();
        			    
        		    socket.close();
        		} catch (IOException | ClassNotFoundException e) { 
        			System.err.println(e); 
        		}
            }
        });
        
        //Thêm sự kiện cho nút cập nhật
        btn_update.addMouseListener(new java.awt.event.MouseAdapter() {
        	
            public void mouseClicked(java.awt.event.MouseEvent evt) {
//            	getCurrentDate();
                try {
        			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        			DatagramSocket socket = new DatagramSocket();

        			InetAddress IPAddress = InetAddress.getByName("localhost");
        		    byte[] sendData = new byte[1048576];
        		    byte[] receiveData = new byte[1048576];
        				
        				String input = "getFilmByDay;" + String.valueOf(idCinemaChosen) + ";" + String.valueOf(date_date.getDate().getYear() + 1900) + "-" + String.valueOf(date_date.getDate().getMonth() + 1) + "-" + date_date.getDate().getDate();
        				System.out.println(input);

        			    sendData = input.getBytes();
        					
        				DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 5000);

        			    socket.send(sendPacket);

        			    DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

        			    socket.receive(receivePacket);
        			    
        			    ByteArrayInputStream bais = new ByteArrayInputStream(receiveData);
        			    ObjectInputStream ois = new ObjectInputStream(bais);
        			    
//        			    Objects.DataForCinema data = (Objects.DataForCinema) ois.readObject();
        			    ArrayList<String> list = (ArrayList<String>) ois.readObject();
        			    
        			    listFilm = list;
        			    setModelFilm(list);
        			    date = String.valueOf(date_date.getDate().getYear() + 1900) + "-" + String.valueOf(date_date.getDate().getMonth() + 1) + "-" + date_date.getDate().getDate();
//        			    System.out.println(list);
//        			    listCinema = data.getDataList();
        			    
        		    socket.close();
        		} catch (IOException | ClassNotFoundException e) { 
        			System.err.println(e); 
        		}
            }
        });
        
        btn_search.addMouseListener(new java.awt.event.MouseAdapter() {
    		public void mouseClicked(java.awt.event.MouseEvent evt) {
    			searchCinema(evt);
//    			System.out.println("clicked");
    		}
    	});
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    //sự kiện cho việc xác định rạp nào đang được chọn 
    private void tblCinemaMouseClicked(java.awt.event.MouseEvent evt) {
		int i = tbl_cinema.getSelectedRow();
		if (i >= 0) {
//			System.out.println("id duoc chon: " + listCinema.get(i).getId());
			idCinemaChosen = listCinema.get(i).getId();
			txt_cinema.setText(listCinema.get(i).getName());
		}
	}
    
    //thêm cinema vào bảng khi bấm chọn cụm rạp
    private void setModelCinema(ArrayList<Cinema> kq) {
		Vector<String> header = new Vector<String>();
		header.add("");
		model_tbl_cinema = new DefaultTableModel(header, 0);
		for (Cinema c : kq) {
			Vector<String> row = new Vector<String>();
			row.add(c.getName());
			model_tbl_cinema.addRow(row);
			tbl_cinema.setModel(model_tbl_cinema);
		}
	}
    
  //thêm phim vào bảng khi bấm chọn rạp
    private void setModelFilm(ArrayList<String> kq) {
		Vector<String> header = new Vector<String>();
		header.add("");
		model_tbl_film = new DefaultTableModel(header, 0);
		for (String c : kq) {
			Vector<String> row = new Vector<String>();
			row.add(c);
			model_tbl_film.addRow(row);
			tbl_showtimes.setModel(model_tbl_film);
		}
	}
    
    private void searchCinema(java.awt.event.MouseEvent evt) {
    	Vector<String> header = new Vector<String>();
		header.add("");
		model_tbl_cinema = new DefaultTableModel(header, 0);
		
		if(txt_search.getText().equals("")) {
			try {
    			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    			DatagramSocket socket = new DatagramSocket();

    			InetAddress IPAddress = InetAddress.getByName("localhost");
    		    byte[] sendData = new byte[1048576];
    		    byte[] receiveData = new byte[1048576];
    		 
    				
    				String input = "getCinemaByCineplex;all";
    				
    			    sendData = input.getBytes();
    					
    				DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 5000);

    			    socket.send(sendPacket);

    			    DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

    			    socket.receive(receivePacket);
    			    
    			    ByteArrayInputStream bais = new ByteArrayInputStream(receiveData);
    			    ObjectInputStream ois = new ObjectInputStream(bais);
    			    
    			    Objects.DataForCinema data = (Objects.DataForCinema) ois.readObject();
    			    
//    			    for(int i = 0; i < data.getDataList().size(); i ++) {
//    			    	System.out.println(data.getDataList().get(i).getName() + "---" + data.getDataList().get(i).getId());
//    			    }
//    			    System.out.println("<------------------------------------->");
    			    
    			    setModelCinema(data.getDataList());
    			    
    			    listCinema = data.getDataList();
    			    
    		    socket.close();
    		} catch (IOException | ClassNotFoundException e) { 
    			System.err.println(e); 
    		}
		} else {
			ArrayList<Cinema> res = new ArrayList<>();
			
			for(int i = 0; i < listCinema.size(); i ++) {
				if(listCinema.get(i).getName().toLowerCase().contains(txt_search.getText().toLowerCase())) {
					res.add(listCinema.get(i));
				}
			}
			for (int i = 0; i < res.size(); i ++) {
				Vector<String> row = new Vector<String>();
				row.add(res.get(i).getName());
				model_tbl_cinema.addRow(row);
				tbl_cinema.setModel(model_tbl_cinema);
			}
			
			listCinema = res;
		}
	}
    
    //thêm sự kiện chọn film để lấy id phim từ Momo
    private void tblShowTimesMouseClicked(java.awt.event.MouseEvent evt) {
		int i = tbl_showtimes.getSelectedRow();
		if (i >= 0) {
			System.out.println("id duoc chon: " + listCinema.get(i).getId());
//			idCinemaChosen = listCinema.get(i).getId();
//			txt_cinema.setText(listCinema.get(i).getName());
			
			try {
    			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    			DatagramSocket socket = new DatagramSocket();

    			InetAddress IPAddress = InetAddress.getByName("localhost");
    		    byte[] sendData = new byte[1048576];
    		    byte[] receiveData = new byte[1048576];
    		    
    				
    				String input = "getIdFilm;" + listFilm.get(i);
    				System.out.println(input);
    			    sendData = input.getBytes();
    					
    				DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 5000);

    			    socket.send(sendPacket);

    			    DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

    			    socket.receive(receivePacket);
    			    
    			    ByteArrayInputStream bais = new ByteArrayInputStream(receiveData);
    			    ObjectInputStream ois = new ObjectInputStream(bais);
    			    
//    			    ArrayList<String> list = (ArrayList<String>) ois.readObject();
    			    
    			    idFilmChosen = (int) ois.readObject();
//    			    setModelFilm(list);
    			    filmNameChosen = listFilm.get(i);
    			    
//    			    System.out.println(idFilmChosen);
//    			    System.out.println(filmNameChosen);
//    			    listCinema = data.getDataList();
    			    
    		    socket.close();
    		} catch (IOException | ClassNotFoundException e) { 
    			System.err.println(e); 
    		}
		}
	}
    
    private void icon_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_icon_closeMouseClicked

    private void btn_viewDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_viewDetailsMouseClicked
		System.out.println(idFilmChosen);

        if(idFilmChosen == 0) {
        	System.out.println("Không tìm thấy dữ liệu!");
        } else {
        	Details details = new Details(client.this, true);
        	
        	details.setVisible(true);
        }
        
//        System.out.println(date_date.getDateEditor());
    }//GEN-LAST:event_btn_viewDetailsMouseClicked
    
	private void getCurrentDate() {
    	LocalDate currentDate = LocalDate.now();
        int day = currentDate.getDayOfMonth();
        int month = currentDate.getMonthValue();
        int year = currentDate.getYear();
        currentDay = String.valueOf(year) + "-" + String.valueOf(month) + "-" + String.valueOf(day);
//	    Date date = new Date(currentDate.getYear() - 1900, currentDate.getMonthValue(), currentDate.getDayOfMonth());
	    Date date1 = new Date();
	    date = currentDay;
	    date_date.setDate(date1);
	    date_date.setMinSelectableDate(date1);
    }

    private byte[] encryptAES(byte[] data) {
        try {
            // Tạo khóa mã hóa AES và vector khởi tạo IV
            byte[] aesKeyBytes = new byte[AES_KEY_SIZE / 8];
            SecureRandom random = SecureRandom.getInstanceStrong();
            random.nextBytes(aesKeyBytes);
            SecretKeySpec aesKeySpec = new SecretKeySpec(aesKeyBytes, "AES");
            byte[] iv = new byte[IV_SIZE];
            random.nextBytes(iv);
            IvParameterSpec ivSpec = new IvParameterSpec(iv);

            // Mã hóa dữ liệu sử dụng khóa AES và vector IV
            Cipher aesCipher = Cipher.getInstance(AES_ALGORITHM);
            aesCipher.init(Cipher.ENCRYPT_MODE, aesKeySpec, ivSpec);
            byte[] encryptedData = aesCipher.doFinal(data);

            // Gửi khóa AES và vector IV đã mã hóa đến client
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(aesKeyBytes);
            oos.writeObject(iv);
            byte[] keyAndIV = baos.toByteArray();

            // Kết hợp khóa AES, vector IV và dữ liệu đã mã hóa thành một byte array
            byte[] sendData = new byte[keyAndIV.length + encryptedData.length];
            System.arraycopy(keyAndIV, 0, sendData, 0, keyAndIV.length);
            System.arraycopy(encryptedData, 0, sendData, keyAndIV.length, encryptedData.length);

            return sendData;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private byte[] decryptAES(byte[] data, byte[] aesKeyBytes, byte[] iv) {
        try {
            SecretKeySpec aesKeySpec = new SecretKeySpec(aesKeyBytes, "AES");
            IvParameterSpec ivSpec = new IvParameterSpec(iv);

            // Tách khóa AES và vector IV từ dữ liệu nhận được
            int keyAndIVSize = (AES_KEY_SIZE / 8) + IV_SIZE;
            byte[] keyAndIV = new byte[keyAndIVSize];
            System.arraycopy(data, 0, keyAndIV, 0, keyAndIVSize);
            byte[] encryptedData = new byte[data.length - keyAndIVSize];
            System.arraycopy(data, keyAndIVSize, encryptedData, 0, encryptedData.length);

            // Giải mã khóa AES và vector IV
            Cipher aesCipher = Cipher.getInstance(AES_ALGORITHM);
            aesCipher.init(Cipher.DECRYPT_MODE, aesKeySpec, ivSpec);
            byte[] decryptedKeyAndIV = aesCipher.doFinal(keyAndIV);

            // Mã hóa dữ liệu sử dụng khóa AES và vector IV
            aesKeySpec = new SecretKeySpec(decryptedKeyAndIV, 0, AES_KEY_SIZE / 8, "AES");
            ivSpec = new IvParameterSpec(decryptedKeyAndIV, AES_KEY_SIZE / 8, IV_SIZE);
            aesCipher.init(Cipher.DECRYPT_MODE, aesKeySpec, ivSpec);
            return aesCipher.doFinal(encryptedData);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

//    private void GetKey() throws IOException {
//            String publickeyString = publicKey;
//            try {
//                // Chuyển đổi chuỗi Base64 thành mảng byte
//                byte[] publicKeyBytes = Base64.getDecoder().decode(publickeyString);
//                // Chuyển đổi mảng byte thành đối tượng PublicKey
//                X509EncodedKeySpec keySpec = new X509EncodedKeySpec(publicKeyBytes);
//                KeyFactory keyFactory = KeyFactory.getInstance("RSA");
//                PublicKey publicKey = keyFactory.generatePublic(keySpec);
//
//                // Mã hóa khóa AES sử dụng khóa công khai RSA
//                Cipher rsaCipher = Cipher.getInstance("RSA");
//                rsaCipher.init(Cipher.ENCRYPT_MODE, publicKey);
//                byte[] encryptedAESKey = rsaCipher.doFinal(secretKey.getEncoded());
//                String base64EncryptedAESKey = Base64.getEncoder().encodeToString(encryptedAESKey);
//
//// Tạo socket UDP
//                DatagramSocket clientSocket = new DatagramSocket();
//
//                // Lấy địa chỉ IP của server
//                InetAddress serverAddress = InetAddress.getByName("localhost");
//
//                // Chuỗi cần gửi tới server
//                String sentence = "sendAES;";
//
//                // Chuyển chuỗi thành mảng byte
//                byte[] sendData = sentence.getBytes();
//
//                // Tạo packet chứa dữ liệu và địa chỉ của server
//                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, 5000);
//
//                // Gửi packet tới server
//                clientSocket.send(sendPacket);
//
//                // Khởi tạo mảng byte để nhận dữ liệu từ server
//                byte[] receiveData = new byte[1024];
//
//                // Tạo packet để nhận dữ liệu từ server
//                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
//
//                // Nhận dữ liệu từ server
//                clientSocket.receive(receivePacket);
//
//                // Chuyển dữ liệu từ dạng byte thành chuỗi
//                String receivedString = new String(receivePacket.getData()).trim();
//                System.out.println("Dữ liệu nhận được từ server: " + receivedString);
////                publicKey = receivedString;
//                // Đóng socket
//                clientSocket.close();
//
//                // Nhận khóa AES đã mã hóa từ client
//                String encryptedAESKeyString = in.readLine();
//                byte[] encryptedAESKeyBytes = Base64.getDecoder().decode(encryptedAESKeyString);
//
//                // Giải mã khóa AES sử dụng khóa riêng tư RSA
//                Cipher rsaDecryptionCipher = Cipher.getInstance("RSA");
//                rsaDecryptionCipher.init(Cipher.DECRYPT_MODE, privateKey);
//                byte[] decryptedAESKey = rsaDecryptionCipher.doFinal(encryptedAESKeyBytes);
//
//                // Mã hóa dữ liệu sử dụng khóa AES và gửi cho client
//                byte[] encryptedData = encryptAES(dataToEncrypt, decryptedAESKey);
//                out.write(Base64.getEncoder().encodeToString(encryptedData) + "\n");
//                out.flush();
//            } catch (NoSuchPaddingException | NoSuchAlgorithmException | InvalidKeySpecException |
//                     InvalidKeyException | BadPaddingException | IllegalBlockSizeException e) {
//                throw new RuntimeException(e);
//            }
//
//    }


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
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        //</editor-fold>




        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    // Tạo socket UDP
                    DatagramSocket clientSocket = new DatagramSocket();

                    // Lấy địa chỉ IP của server
                    InetAddress serverAddress = InetAddress.getByName("localhost");

                    // Chuỗi cần gửi tới server
                    String sentence = "getPublicKey;";

                    // Chuyển chuỗi thành mảng byte
                    byte[] sendData = sentence.getBytes();

                    // Tạo packet chứa dữ liệu và địa chỉ của server
                    DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, 5000);

                    // Gửi packet tới server
                    clientSocket.send(sendPacket);

                    // Khởi tạo mảng byte để nhận dữ liệu từ server
                    byte[] receiveData = new byte[1024];

                    // Tạo packet để nhận dữ liệu từ server
                    DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

                    // Nhận dữ liệu từ server
                    clientSocket.receive(receivePacket);

                    // Chuyển dữ liệu từ dạng byte thành chuỗi
                    String receivedString = new String(receivePacket.getData()).trim();
                    System.out.println("Dữ liệu nhận được từ server: " + receivedString);
                    publicKey = receivedString;
                    // Đóng socket
                    clientSocket.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                secretKey = new SecretKeySpec("KEY".getBytes(), "AES");

                new client().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    DefaultTableModel model_tbl_cinema = new DefaultTableModel();
    DefaultTableModel model_tbl_film = new DefaultTableModel();
    private javax.swing.JPanel CineplexPicker;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel SearchBar;
    private javax.swing.JPanel SearchCinema;
    private javax.swing.JPanel Workspace;
    private javax.swing.JPanel btn_all_theater;
    private javax.swing.JPanel btn_beta;
    private javax.swing.JPanel btn_bhd_star;
    private javax.swing.JPanel btn_cgv;
    private javax.swing.JPanel btn_cinestar;
    private javax.swing.JPanel btn_dcine;
    private javax.swing.JPanel btn_galaxy_cine;
    private javax.swing.JPanel btn_lotte;
    private javax.swing.JPanel btn_mega_gs;
    private javax.swing.JLabel btn_search;
    private javax.swing.JLabel btn_update;
    private javax.swing.JLabel btn_viewDetails;
    private javax.swing.JLabel btn_viewShowtimes;
    private com.toedter.calendar.JDateChooser date_date;
    private javax.swing.JLabel icon_close;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbl_cinema;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_header;
    private javax.swing.JLabel logo_all;
    private javax.swing.JLabel logo_beta_cinema;
    private javax.swing.JLabel logo_bhd;
    private javax.swing.JLabel logo_cgv;
    private javax.swing.JLabel logo_cinestar;
    private javax.swing.JLabel logo_dcine;
    private javax.swing.JLabel logo_galaxy_cinema;
    private javax.swing.JLabel logo_lotte;
    private javax.swing.JLabel logo_mega_gs;
    private javax.swing.JLabel logo_momo;
    private javax.swing.JPanel pnl_cinema;
    private javax.swing.JTable tbl_cinema;
    private javax.swing.JTable tbl_showtimes;
    private javax.swing.JLabel txt_cinema;
    private javax.swing.JTextField txt_search;

    private static SecretKeySpec secretKey;

    private static String publicKey;
    
    public static ArrayList<String> showtimes;
    public static String filmNameChosen;
    public static String date;
    public static int idFilmChosen;
    private static ArrayList<String> listFilm;
    public static int idCinemaChosen;
    public static String currentDay;
    private static ArrayList<Cinema> listCinema;
    // End of variables declaration//GEN-END:variables
}
