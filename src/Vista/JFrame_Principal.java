package Vista;

import Control.Operaciones;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.net.URL;

public class JFrame_Principal extends javax.swing.JFrame {

    public JFrame_Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public void Limpiar() {
        textArea.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_Monto = new javax.swing.JTextField();
        cbo_Modena1 = new javax.swing.JComboBox<>();
        lbl_img = new javax.swing.JLabel();
        btn_Convertir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        lbl_result = new javax.swing.JLabel();
        cbo_result = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de Monedas");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("CONVERSOR");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(204, 204, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setText("Ingresa el monto:");

        cbo_Modena1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sol", "Dólar", "Euros", "Libras Esternilas", "Yen Japonés", "Won Sur-Coreano" }));
        cbo_Modena1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_Modena1ActionPerformed(evt);
            }
        });

        btn_Convertir.setBackground(new java.awt.Color(0, 204, 0));
        btn_Convertir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Convertir.setText("Convertir");
        btn_Convertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConvertirActionPerformed(evt);
            }
        });

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        cbo_result.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sol", "Dólar", "Euros", "Libras Esternilas", "Yen Japonés", "Won Sur-Coreano" }));
        cbo_result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_resultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lbl_result, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txt_Monto)
                    .addComponent(cbo_result, 0, 152, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_Convertir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(176, 176, 176))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbo_Modena1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_img, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_Monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbo_Modena1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_img, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Convertir)
                            .addComponent(cbo_result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_result, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbo_Modena1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_Modena1ActionPerformed
        Object seleObject = cbo_Modena1.getSelectedItem();
        if (seleObject.equals("Sol")) {
            ImageIcon sol = new ImageIcon(getClass().getResource("/Imagenes/nuevosol.png"));
            ImageIcon icon = new ImageIcon(sol.getImage().getScaledInstance(lbl_img.getWidth(), lbl_img.getHeight(), Image.SCALE_DEFAULT));
            lbl_img.setIcon(icon);
        } else if (seleObject.equals("Dólar")) {
            ImageIcon dolar = new ImageIcon(getClass().getResource("/Imagenes/dolares.png"));
            ImageIcon icon2 = new ImageIcon(dolar.getImage().getScaledInstance(lbl_img.getWidth(), lbl_img.getHeight(), Image.SCALE_DEFAULT));
            lbl_img.setIcon(icon2);
        } else if (seleObject.equals("Euros")) {
            ImageIcon euro = new ImageIcon(getClass().getResource("/Imagenes/euro2.png"));
            ImageIcon icon3 = new ImageIcon(euro.getImage().getScaledInstance(lbl_img.getWidth(), lbl_img.getHeight(), Image.SCALE_DEFAULT));
            lbl_img.setIcon(icon3);
        } else if (seleObject.equals("Libras Esternilas")) {
            ImageIcon libra = new ImageIcon(getClass().getResource("/Imagenes/libra2.png"));
            ImageIcon icon4 = new ImageIcon(libra.getImage().getScaledInstance(lbl_img.getWidth(), lbl_img.getHeight(), Image.SCALE_DEFAULT));
            lbl_img.setIcon(icon4);
        } else if (seleObject.equals("Yen Japonés")) {
            ImageIcon yen = new ImageIcon(getClass().getResource("/Imagenes/yen.png"));
            ImageIcon icon5 = new ImageIcon(yen.getImage().getScaledInstance(lbl_img.getWidth(), lbl_img.getHeight(), Image.SCALE_DEFAULT));
            lbl_img.setIcon(icon5);
        } else if (seleObject.equals("Won Sur-Coreano")) {
            ImageIcon won = new ImageIcon(getClass().getResource("/Imagenes/won2.png"));
            ImageIcon icon6 = new ImageIcon(won.getImage().getScaledInstance(lbl_img.getWidth(), lbl_img.getHeight(), Image.SCALE_DEFAULT));
            lbl_img.setIcon(icon6);
        }
    }//GEN-LAST:event_cbo_Modena1ActionPerformed

    private void cbo_resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_resultActionPerformed
        Object select = cbo_result.getSelectedItem();
        if (select.equals("Sol")) {
            ImageIcon sol = new ImageIcon(getClass().getResource("/Imagenes/nuevosol.png"));
            ImageIcon icon = new ImageIcon(sol.getImage().getScaledInstance(lbl_result.getWidth(), lbl_result.getHeight(), Image.SCALE_DEFAULT));
            lbl_result.setIcon(icon);
        } else if (select.equals("Dólar")) {
            ImageIcon dolar = new ImageIcon(getClass().getResource("/Imagenes/dolares.png"));
            ImageIcon icon2 = new ImageIcon(dolar.getImage().getScaledInstance(lbl_result.getWidth(), lbl_result.getHeight(), Image.SCALE_DEFAULT));
            lbl_result.setIcon(icon2);
        } else if (select.equals("Euros")) {
            ImageIcon euro = new ImageIcon(getClass().getResource("/Imagenes/euro2.png"));
            ImageIcon icon3 = new ImageIcon(euro.getImage().getScaledInstance(lbl_result.getWidth(), lbl_result.getHeight(), Image.SCALE_DEFAULT));
            lbl_result.setIcon(icon3);
        } else if (select.equals("Libras Esternilas")) {
            ImageIcon libra = new ImageIcon(getClass().getResource("/Imagenes/libra2.png"));
            ImageIcon icon4 = new ImageIcon(libra.getImage().getScaledInstance(lbl_result.getWidth(), lbl_result.getHeight(), Image.SCALE_DEFAULT));
            lbl_result.setIcon(icon4);
        } else if (select.equals("Yen Japonés")) {
            ImageIcon yen = new ImageIcon(getClass().getResource("/Imagenes/yen.png"));
            ImageIcon icon5 = new ImageIcon(yen.getImage().getScaledInstance(lbl_result.getWidth(), lbl_result.getHeight(), Image.SCALE_DEFAULT));
            lbl_result.setIcon(icon5);
        } else if (select.equals("Won Sur-Coreano")) {
            ImageIcon won = new ImageIcon(getClass().getResource("/Imagenes/won2.png"));
            ImageIcon icon6 = new ImageIcon(won.getImage().getScaledInstance(lbl_result.getWidth(), lbl_result.getHeight(), Image.SCALE_DEFAULT));
            lbl_result.setIcon(icon6);
        }
    }//GEN-LAST:event_cbo_resultActionPerformed

    private void btn_ConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConvertirActionPerformed
        double monto = Double.parseDouble(txt_Monto.getText());
        int divisa = cbo_Modena1.getSelectedIndex();
        int divisa2 = cbo_result.getSelectedIndex();

        Limpiar();

        Operaciones objOperaciones = new Operaciones();
        objOperaciones.setMonto(monto);
        objOperaciones.setDivisa(divisa);
        objOperaciones.setDivisa2(divisa2);

        switch (objOperaciones.getDivisa()) {
            case 0:
                switch (objOperaciones.getDivisa2()) {
                    case 0:
                        textArea.append("" + objOperaciones.solesSoles(objOperaciones.getMonto()));
                        break;
                    case 1:
                        textArea.append("" + objOperaciones.solesDolares(objOperaciones.getMonto()));
                        break;
                    case 2:
                        textArea.append("" + objOperaciones.solesEuros(objOperaciones.getMonto()));
                        break;
                    case 3:
                        textArea.append("" + objOperaciones.solesLibras(objOperaciones.getMonto()));
                        break;
                    case 4:
                        textArea.append("" + objOperaciones.solesYen(objOperaciones.getMonto()));
                        break;
                    case 5:
                        textArea.append("" + objOperaciones.solesWon(objOperaciones.getMonto()));
                        break;
                }
                break;
            case 1:
                switch (objOperaciones.getDivisa2()) {
                    case 0:
                        textArea.append("" + objOperaciones.dolaresSoles(objOperaciones.getMonto()));
                        break;
                    case 1:
                        textArea.append("" + objOperaciones.dolaresDolares(objOperaciones.getMonto()));
                        break;
                    case 2:
                        textArea.append("" + objOperaciones.dolaresEuro(objOperaciones.getMonto()));
                        break;
                    case 3:
                        textArea.append("" + objOperaciones.dolaresLibra(objOperaciones.getMonto()));
                        break;
                    case 4:
                        textArea.append("" + objOperaciones.dolaresYen(objOperaciones.getMonto()));
                        break;
                    case 5:
                        textArea.append("" + objOperaciones.dolaresWon(objOperaciones.getMonto()));
                        break;
                }
                break;
            case 2:
                switch (objOperaciones.getDivisa2()) {
                    case 0:
                        textArea.append("" + objOperaciones.euroSoles(objOperaciones.getMonto()));
                        break;
                    case 1:
                        textArea.append("" + objOperaciones.euroDolar(objOperaciones.getMonto()));
                        break;
                    case 2:
                        textArea.append("" + objOperaciones.euroEuro(objOperaciones.getMonto()));
                        break;
                    case 3:
                        textArea.append("" + objOperaciones.euroLibra(objOperaciones.getMonto()));
                        break;
                    case 4:
                        textArea.append("" + objOperaciones.euroYen(objOperaciones.getMonto()));
                        break;
                    case 5:
                        textArea.append("" + objOperaciones.euroWon(objOperaciones.getMonto()));
                        break;
                }
                break;
            case 3:
                switch (objOperaciones.getDivisa2()) {
                    case 0:
                        textArea.append("" + objOperaciones.libraSoles(objOperaciones.getMonto()));
                        break;
                    case 1:
                        textArea.append("" + objOperaciones.libraDolar(objOperaciones.getMonto()));
                        break;
                    case 2:
                        textArea.append("" + objOperaciones.libraEuro(objOperaciones.getMonto()));
                        break;
                    case 3:
                        textArea.append("" + objOperaciones.libraLibra(objOperaciones.getMonto()));
                        break;
                    case 4:
                        textArea.append("" + objOperaciones.libraYen(objOperaciones.getMonto()));
                        break;
                    case 5:
                        textArea.append("" + objOperaciones.libraWon(objOperaciones.getMonto()));
                        break;
                }
                break;
            case 4:
                switch (objOperaciones.getDivisa2()) {
                    case 0:
                        textArea.append("" + objOperaciones.yenSoles(objOperaciones.getMonto()));
                        break;
                    case 1:
                        textArea.append("" + objOperaciones.yenDolares(objOperaciones.getMonto()));
                        break;
                    case 2:
                        textArea.append("" + objOperaciones.yenEuro(objOperaciones.getMonto()));
                        break;
                    case 3:
                        textArea.append("" + objOperaciones.yenLibra(objOperaciones.getMonto()));
                        break;
                    case 4:
                        textArea.append("" + objOperaciones.yenYen(objOperaciones.getMonto()));
                        break;
                    case 5:
                        textArea.append("" + objOperaciones.yenWon(objOperaciones.getMonto()));
                        break;
                }
                break;
            case 5:
                switch (objOperaciones.getDivisa2()) {
                    case 0:
                        textArea.append("" + objOperaciones.wonSoles(objOperaciones.getMonto()));
                        break;
                    case 1:
                        textArea.append("" + objOperaciones.wonDolar(objOperaciones.getMonto()));
                        break;
                    case 2:
                        textArea.append("" + objOperaciones.wonEuro(objOperaciones.getMonto()));
                        break;
                    case 3:
                        textArea.append("" + objOperaciones.wonLibra(objOperaciones.getMonto()));
                        break;
                    case 4:
                        textArea.append("" + objOperaciones.wonYen(objOperaciones.getMonto()));
                        break;
                    case 5:
                        textArea.append("" + objOperaciones.wonWon(objOperaciones.getMonto()));
                        break;
                }
                break;
        }


    }//GEN-LAST:event_btn_ConvertirActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Convertir;
    private javax.swing.JComboBox<String> cbo_Modena1;
    private javax.swing.JComboBox<String> cbo_result;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_img;
    private javax.swing.JLabel lbl_result;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTextField txt_Monto;
    // End of variables declaration//GEN-END:variables
}
