/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import org.w3c.dom.css.RGBColor;

/**
 *
 * @author root
 */
public class Main extends javax.swing.JFrame {

    char type;
    Suhu suhu = new Suhu();
    Kalkulator kal = new Kalkulator();

    public Main() {
        initComponents();
        swap_tip.setVisible(false);
        input1.requestFocus();
        select2.setSelectedIndex(1);
    }

    public void keyTyped(KeyEvent e) {
        char caracter = e.getKeyChar();
        if (!(((caracter < '0') || (caracter > '9')) || e.getKeyCode() == KeyEvent.VK_MINUS)) {
            e.consume();
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Suhu = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        input1 = new javax.swing.JTextField();
        select1 = new javax.swing.JComboBox<>();
        select2 = new javax.swing.JComboBox<>();
        input2 = new javax.swing.JTextField();
        reverse = new javax.swing.JLabel();
        swap_tip = new javax.swing.JLabel();
        Kalkulator = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        angka2 = new javax.swing.JTextField();
        angka1 = new javax.swing.JTextField();
        aritmatik = new javax.swing.JComboBox<>();
        btnHitung = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        displayHasil = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tugas TBO Kelompok 2 CIDB");
        setBackground(new java.awt.Color(75, 75, 75));
        setLocationByPlatform(true);
        setResizable(false);

        Suhu.setBackground(new java.awt.Color(59, 59, 59));
        Suhu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Ubuntu Light", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Konversi Suhu");
        Suhu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 12, 568, -1));

        input1.setBackground(new java.awt.Color(59, 59, 59));
        input1.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        input1.setForeground(new java.awt.Color(254, 254, 254));
        input1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));
        input1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                input1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input1KeyTyped(evt);
            }
        });
        Suhu.add(input1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 74, 373, 42));

        select1.setBackground(new java.awt.Color(59, 59, 59));
        select1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Fahrenheit", "Kelvin", "Reamur" }));
        Suhu.add(select1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 122, 178, 42));

        select2.setBackground(new java.awt.Color(59, 59, 59));
        select2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Fahrenheit", "Kelvin", "Reamur" }));
        Suhu.add(select2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 270, 178, 42));

        input2.setEditable(false);
        input2.setBackground(new java.awt.Color(59, 59, 59));
        input2.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        input2.setForeground(new java.awt.Color(254, 254, 254));
        input2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(254, 254, 254)));
        Suhu.add(input2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 222, 373, 42));

        reverse.setForeground(new java.awt.Color(50, 219, 198));
        reverse.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        reverse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas/swap_icon.png"))); // NOI18N
        reverse.setToolTipText("Menukar Posisi konversi");
        reverse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reverse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reverseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reverseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reverseMouseExited(evt);
            }
        });
        Suhu.add(reverse, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 180, -1, -1));

        swap_tip.setForeground(new java.awt.Color(50, 219, 198));
        swap_tip.setText("Swap Convertion");
        Suhu.add(swap_tip, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 220, -1, -1));

        jTabbedPane1.addTab("Konversi Suhu", Suhu);

        Kalkulator.setBackground(new java.awt.Color(59, 59, 59));

        jLabel5.setFont(new java.awt.Font("Ubuntu Light", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Kalkulator Sederhana");

        angka2.setBackground(new java.awt.Color(59, 59, 59));
        angka2.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        angka2.setForeground(new java.awt.Color(254, 254, 254));
        angka2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));

        angka1.setBackground(new java.awt.Color(59, 59, 59));
        angka1.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        angka1.setForeground(new java.awt.Color(254, 254, 254));
        angka1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(254, 254, 254)));

        aritmatik.setBackground(new java.awt.Color(59, 59, 59));
        aritmatik.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tambah", "Kurang", "Kali", "Bagi" }));

        btnHitung.setBackground(new java.awt.Color(73, 190, 183));

        jLabel12.setFont(new java.awt.Font("Ubuntu Light", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(63, 64, 66));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Hitung");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnHitungLayout = new javax.swing.GroupLayout(btnHitung);
        btnHitung.setLayout(btnHitungLayout);
        btnHitungLayout.setHorizontalGroup(
            btnHitungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
        );
        btnHitungLayout.setVerticalGroup(
            btnHitungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        displayHasil.setFont(new java.awt.Font("Ubuntu Light", 0, 28)); // NOI18N
        displayHasil.setForeground(new java.awt.Color(254, 254, 254));
        displayHasil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        displayHasil.setText("0");

        jLabel4.setText("Hasil");

        javax.swing.GroupLayout KalkulatorLayout = new javax.swing.GroupLayout(Kalkulator);
        Kalkulator.setLayout(KalkulatorLayout);
        KalkulatorLayout.setHorizontalGroup(
            KalkulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KalkulatorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(KalkulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KalkulatorLayout.createSequentialGroup()
                        .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KalkulatorLayout.createSequentialGroup()
                        .addGroup(KalkulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(displayHasil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(KalkulatorLayout.createSequentialGroup()
                                .addComponent(aritmatik, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(angka2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22))))
            .addGroup(KalkulatorLayout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(KalkulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(KalkulatorLayout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(angka1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(410, Short.MAX_VALUE)))
        );
        KalkulatorLayout.setVerticalGroup(
            KalkulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KalkulatorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(46, 46, 46)
                .addGroup(KalkulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angka2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aritmatik, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayHasil)
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(KalkulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(KalkulatorLayout.createSequentialGroup()
                    .addGap(88, 88, 88)
                    .addComponent(angka1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(265, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Kalkulator", Kalkulator);

        jPanel1.setBackground(new java.awt.Color(59, 59, 59));

        jLabel6.setFont(new java.awt.Font("Ubuntu Light", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("KELOMPOK 2");

        jLabel1.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Andri Ilham");

        jLabel7.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("17111322");

        jLabel8.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel8.setText("17111328");

        jLabel9.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(254, 254, 254));
        jLabel9.setText("Hesti Sugesty");

        jLabel10.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(254, 254, 254));
        jLabel10.setText("17111139");

        jLabel11.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(254, 254, 254));
        jLabel11.setText("Siti Muayanah");

        jLabel13.setFont(new java.awt.Font("Ubuntu Light", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(254, 254, 254));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("TIF RP 17 CIDB");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(51, 51, 51))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)))
                .addGap(120, 120, 120)
                .addComponent(jLabel6)
                .addGap(67, 67, 67))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jLabel13)
                    .addContainerGap(344, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("About", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void input1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input1KeyReleased
        type =evt.getKeyChar();
        if (!input1.getText().isEmpty()) {
            if (select1.getSelectedIndex() == 0 && select2.getSelectedIndex() == 0) {
                input2.setText(String.valueOf(suhu.celcius("c", Double.parseDouble(input1.getText()))));
            } else if (select1.getSelectedIndex() == 0 && select2.getSelectedIndex() == 1) {
                input2.setText(String.valueOf(suhu.celcius("f", Double.parseDouble(input1.getText()))));
            } else if (select1.getSelectedIndex() == 0 && select2.getSelectedIndex() == 2) {
                input2.setText(String.valueOf(suhu.celcius("k", Double.parseDouble(input1.getText()))));
            } else if (select1.getSelectedIndex() == 0 && select2.getSelectedIndex() == 3) {
                input2.setText(String.valueOf(suhu.celcius("r", Double.parseDouble(input1.getText()))));
            } else if (select1.getSelectedIndex() == 1 && select2.getSelectedIndex() == 0) {
                input2.setText(String.valueOf(suhu.fahrenheit("c", Double.parseDouble(input1.getText()))));
            } else if (select1.getSelectedIndex() == 1 && select2.getSelectedIndex() == 1) {
                input2.setText(String.valueOf(suhu.fahrenheit("f", Double.parseDouble(input1.getText()))));
            } else if (select1.getSelectedIndex() == 1 && select2.getSelectedIndex() == 2) {
                input2.setText(String.valueOf(suhu.fahrenheit("k", Double.parseDouble(input1.getText()))));
            } else if (select1.getSelectedIndex() == 1 && select2.getSelectedIndex() == 3) {
                input2.setText(String.valueOf(suhu.fahrenheit("r", Double.parseDouble(input1.getText()))));
            } else if (select1.getSelectedIndex() == 2 && select2.getSelectedIndex() == 0) {
                input2.setText(String.valueOf(suhu.kelvin("c", Double.parseDouble(input1.getText()))));
            } else if (select1.getSelectedIndex() == 2 && select2.getSelectedIndex() == 1) {
                input2.setText(String.valueOf(suhu.kelvin("f", Double.parseDouble(input1.getText()))));
            } else if (select1.getSelectedIndex() == 2 && select2.getSelectedIndex() == 2) {
                input2.setText(String.valueOf(suhu.kelvin("k", Double.parseDouble(input1.getText()))));
            } else if (select1.getSelectedIndex() == 2 && select2.getSelectedIndex() == 3) {
                input2.setText(String.valueOf(suhu.kelvin("r", Double.parseDouble(input1.getText()))));
            } else if (select1.getSelectedIndex() == 3 && select2.getSelectedIndex() == 0) {
                input2.setText(String.valueOf(suhu.reamur("c", Double.parseDouble(input1.getText()))));
            } else if (select1.getSelectedIndex() == 3 && select2.getSelectedIndex() == 1) {
                input2.setText(String.valueOf(suhu.reamur("f", Double.parseDouble(input1.getText()))));
            } else if (select1.getSelectedIndex() == 3 && select2.getSelectedIndex() == 2) {
                input2.setText(String.valueOf(suhu.reamur("k", Double.parseDouble(input1.getText()))));
            } else if (select1.getSelectedIndex() == 3 && select2.getSelectedIndex() == 3) {
                input2.setText(String.valueOf(suhu.reamur("r", Double.parseDouble(input1.getText()))));
            }
        } else {
            System.err.println("Inputan Kosong!");
        }
    }//GEN-LAST:event_input1KeyReleased

    private void input1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input1KeyTyped

    }//GEN-LAST:event_input1KeyTyped

    private void input1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input1KeyPressed


    }//GEN-LAST:event_input1KeyPressed

    private void reverseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reverseMouseClicked
        String in1 = input1.getText();
        String in2 = input2.getText();
        input2.setText(in1);
        input1.setText(in2);

        int sel1 = select1.getSelectedIndex();
        int sel2 = select2.getSelectedIndex();
        select2.setSelectedIndex(sel1);
        select1.setSelectedIndex(sel2);
    }//GEN-LAST:event_reverseMouseClicked

    private void reverseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reverseMouseEntered
        ImageIcon AS = new ImageIcon(getClass().getResource("swap_icon_hov.png"));
        reverse.setIcon(AS);
        
        swap_tip.setVisible(true);
    }//GEN-LAST:event_reverseMouseEntered

    private void reverseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reverseMouseExited
        ImageIcon AS = new ImageIcon(getClass().getResource("swap_icon.png"));
        reverse.setIcon(AS);
        swap_tip.setVisible(false);
    }//GEN-LAST:event_reverseMouseExited

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
         if(angka1.getText().isEmpty() || angka2.getText().isEmpty()) {
            System.err.println("Inputan ada yang Kosong");
        } else {
            switch (aritmatik.getSelectedIndex()){
                case 0:
                    kal.setHasil(kal.penjumlahan(Double.parseDouble(angka1.getText()), Double.parseDouble(angka2.getText())));
                    break;
                case 1:
                    kal.setHasil(kal.pengurangan(Double.parseDouble(angka1.getText()), Double.parseDouble(angka2.getText())));
                    break;
                case 2:
                    kal.setHasil(kal.perkalian(Double.parseDouble(angka1.getText()), Double.parseDouble(angka2.getText())));
                    break;
                case 3:
                    kal.setHasil(kal.pembagian(Double.parseDouble(angka1.getText()), Double.parseDouble(angka2.getText())));
                    break;
            }
            
            displayHasil.setText(String.valueOf(kal.getHasil()));
            System.out.println("Hasil = "+ kal.getHasil());
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
         btnHitung.setBackground(new Color(50,219,198));
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
         btnHitung.setBackground(new Color(73,190,183));
    }//GEN-LAST:event_jLabel12MouseExited

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
    private javax.swing.JPanel Kalkulator;
    private javax.swing.JPanel Suhu;
    private javax.swing.JTextField angka1;
    private javax.swing.JTextField angka2;
    private javax.swing.JComboBox<String> aritmatik;
    private javax.swing.JPanel btnHitung;
    private javax.swing.JLabel displayHasil;
    private javax.swing.JTextField input1;
    private javax.swing.JTextField input2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel reverse;
    private javax.swing.JComboBox<String> select1;
    private javax.swing.JComboBox<String> select2;
    private javax.swing.JLabel swap_tip;
    // End of variables declaration//GEN-END:variables
}
