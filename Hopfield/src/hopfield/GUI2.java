/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hopfield;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author joseh
 */
public class GUI2 extends javax.swing.JFrame {

    int dimensX, dimensY, tamX, tamY;
    private JButton[][] MatrizPatron1;
    private JButton[][] MatrizPatron2;
    private JButton[][] MatrizPatronEntrada;
    private JButton[][] MatrizPatronSalida;

    private int[][] matrizPa1, matrizPa2, matrizPE, matrizW;
    private int[][] matrizTransPa1, matrizTransPa2;
    private int[][] matrizIdentidad;

    private int[] vectorPa1, vectorPa2, vectorPE, vectorFuncionE, vectorSalida;

    int num_patronesM = 2;
    double recuBuena = 0;
    double recuExcelente = 0;
    double ortogonalidad = 0;

    /**
     * Creates new form GUI2
     */
    public GUI2() {
        initComponents();
        pnl_patronE.setVisible(false);
        pnl_patronSa.setVisible(false);
        pnl_patronCoincidencia.setVisible(false);
        //btn_funcionamiento.setVisible(false);
        btnEntrenar.setVisible(false);
        this.setTitle("RNA -- Hopfield para reconocimiento de patrones");

        this.setVisible(true);

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
        txtDimensX = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDimensY = new javax.swing.JTextField();
        btnInicio = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pnl_patron1 = new javax.swing.JPanel();
        pnl_patron2 = new javax.swing.JPanel();
        pnl_patronE = new javax.swing.JPanel();
        btnEntrenar = new javax.swing.JButton();
        btn_funcionamiento = new javax.swing.JButton();
        btn_ingresarPatron = new javax.swing.JButton();
        pnl_patronCoincidencia = new javax.swing.JPanel();
        pnl_patronSa = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Dimensión en X:");

        jLabel2.setText("Dimensión en Y:");

        btnInicio.setText("Crear Base de Patrones");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        jButton2.setText("Nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        pnl_patron1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patrón 1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 10))); // NOI18N

        javax.swing.GroupLayout pnl_patron1Layout = new javax.swing.GroupLayout(pnl_patron1);
        pnl_patron1.setLayout(pnl_patron1Layout);
        pnl_patron1Layout.setHorizontalGroup(
            pnl_patron1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );
        pnl_patron1Layout.setVerticalGroup(
            pnl_patron1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnl_patron2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patrón 2", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 10))); // NOI18N

        javax.swing.GroupLayout pnl_patron2Layout = new javax.swing.GroupLayout(pnl_patron2);
        pnl_patron2.setLayout(pnl_patron2Layout);
        pnl_patron2Layout.setHorizontalGroup(
            pnl_patron2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );
        pnl_patron2Layout.setVerticalGroup(
            pnl_patron2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 247, Short.MAX_VALUE)
        );

        pnl_patronE.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patrón de Entrada", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 10))); // NOI18N

        javax.swing.GroupLayout pnl_patronELayout = new javax.swing.GroupLayout(pnl_patronE);
        pnl_patronE.setLayout(pnl_patronELayout);
        pnl_patronELayout.setHorizontalGroup(
            pnl_patronELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnl_patronELayout.setVerticalGroup(
            pnl_patronELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 291, Short.MAX_VALUE)
        );

        btnEntrenar.setText("Entrenar la red");
        btnEntrenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrenarActionPerformed(evt);
            }
        });

        btn_funcionamiento.setText("Funcionamiento");
        btn_funcionamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_funcionamientoActionPerformed(evt);
            }
        });

        btn_ingresarPatron.setText("Ingresar patron de entrada");
        btn_ingresarPatron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarPatronActionPerformed(evt);
            }
        });

        pnl_patronCoincidencia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mejor coincidencia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 10))); // NOI18N

        javax.swing.GroupLayout pnl_patronCoincidenciaLayout = new javax.swing.GroupLayout(pnl_patronCoincidencia);
        pnl_patronCoincidencia.setLayout(pnl_patronCoincidenciaLayout);
        pnl_patronCoincidenciaLayout.setHorizontalGroup(
            pnl_patronCoincidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        pnl_patronCoincidenciaLayout.setVerticalGroup(
            pnl_patronCoincidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnl_patronSa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patrón de salida", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 10))); // NOI18N

        javax.swing.GroupLayout pnl_patronSaLayout = new javax.swing.GroupLayout(pnl_patronSa);
        pnl_patronSa.setLayout(pnl_patronSaLayout);
        pnl_patronSaLayout.setHorizontalGroup(
            pnl_patronSaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        pnl_patronSaLayout.setVerticalGroup(
            pnl_patronSaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pnl_patronE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnl_patron1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnl_patron2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnl_patronSa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pnl_patronCoincidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDimensX, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDimensY, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnInicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEntrenar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ingresarPatron)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_funcionamiento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDimensX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtDimensY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInicio)
                    .addComponent(jButton2)
                    .addComponent(btnEntrenar)
                    .addComponent(btn_funcionamiento)
                    .addComponent(btn_ingresarPatron))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnl_patron2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_patron1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_patronE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_patronCoincidencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_patronSa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void pintaTableros() {
        validarDimensiones();
        int tam_vector = dimensX * dimensY;

        MatrizPatron1 = new JButton[dimensX][dimensY];
        MatrizPatron2 = new JButton[dimensX][dimensY];
        MatrizPatronEntrada = new JButton[dimensX][dimensY];

        matrizPa1 = new int[dimensX][dimensY];
        matrizPa2 = new int[dimensX][dimensY];
        matrizPE = new int[dimensX][dimensY];
        matrizW = new int[tam_vector][tam_vector];

        vectorPa1 = new int[tam_vector];
        vectorPa2 = new int[tam_vector];
        vectorPE = new int[tam_vector];
        vectorFuncionE = new int[tam_vector];

        pnl_patron1.setLayout(new GridLayout(dimensX, dimensY));
        pnl_patron2.setLayout(new GridLayout(dimensX, dimensY));
        pnl_patronE.setLayout(new GridLayout(dimensX, dimensY));
        pnl_patronSa.setLayout(new GridLayout(dimensX, dimensY));
        pnl_patronCoincidencia.setLayout(new GridLayout(dimensX, dimensY));

        m_tamBotones(dimensX, dimensY);
        int contadorX, contadorY;

        for (contadorX = 0; contadorX < dimensX; contadorX++) {
            for (contadorY = 0; contadorY < dimensY; contadorY++) {
                JButton btnPatron1 = new JButton();
                btnPatron1.setSize(100, 100);
                btnPatron1.setBackground(Color.white);
                btnPatron1.setText("-1");
                btnPatron1.setToolTipText(Integer.toString(contadorX) + "," + Integer.toString(contadorY));
                MatrizPatron1[contadorX][contadorY] = btnPatron1;
                matrizPa1[contadorX][contadorY] = -1;
                MatrizPatron1[contadorX][contadorY].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        m_procesoPatron1(btnPatron1);
                    }
                });

                JButton btnPatron2 = new JButton();
                btnPatron2.setSize(100, 100);
                btnPatron2.setBackground(Color.white);
                btnPatron2.setText("-1");
                btnPatron2.setToolTipText(Integer.toString(contadorX) + "," + Integer.toString(contadorY));
                MatrizPatron2[contadorX][contadorY] = btnPatron2;
                matrizPa2[contadorX][contadorY] = -1;
                MatrizPatron2[contadorX][contadorY].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        m_procesoPatron2(btnPatron2);
                    }

                });

                JButton btnPatronE = new JButton();
                btnPatronE.setSize(100, 100);
                btnPatronE.setBackground(Color.white);
                btnPatronE.setText("-1");
                btnPatronE.setToolTipText(Integer.toString(contadorX) + "," + Integer.toString(contadorY));
                MatrizPatronEntrada[contadorX][contadorY] = btnPatronE;
                matrizPE[contadorX][contadorY] = -1;
                MatrizPatronEntrada[contadorX][contadorY].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        m_procesoPatronE(btnPatronE);
                    }

                });

                pnl_patron1.add(MatrizPatron1[contadorX][contadorY]);
                pnl_patron2.add(MatrizPatron2[contadorX][contadorY]);
                pnl_patronE.add(MatrizPatronEntrada[contadorX][contadorY]);

                repintaTablero();

            }
        }
    }


    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        pintaTableros();
        btnInicio.setVisible(false);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.dispose();
        GUI2 gui2 = new GUI2();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnEntrenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrenarActionPerformed
        // TODO add your handling code here: 
        //Se busca que los patrones sean un 50% ortogonales
        m_generaMatrizIdentidad();

        if ("Excelente".equals(m_recuperacion())) {
            System.out.println("La recuperacion es excelente con un valor de: " + recuExcelente);
            if (m_50percentOrtogo(vectorPa1, vectorPa2)) {
                System.out.println("Los patrones son lo suf. ortogonales con un valor de: " + ortogonalidad);

            } else {
                System.out.println("Los patrones NO son lo suf. ortogonales con un valor de: " + ortogonalidad);
            }

        } else if ("Buena".equals(m_recuperacion())) {
            //Regresar al modelado 
            System.out.println("La recuperacion buena con un valor de: " + recuBuena);

        }

    }//GEN-LAST:event_btnEntrenarActionPerformed

    private void btn_ingresarPatronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarPatronActionPerformed
        // TODO add your handling code here:
        btn_funcionamiento.setVisible(true);
        pnl_patronE.setVisible(true);
        btn_ingresarPatron.setVisible(false);
        this.pack();
    }//GEN-LAST:event_btn_ingresarPatronActionPerformed

    private void btn_funcionamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_funcionamientoActionPerformed
        // TODO add your handling code here:
        System.out.println("PATRON 1:");
        m_muestraVector(vectorPa1);
        System.out.println("");
        System.out.println("PATRON 2:");
        m_muestraVector(vectorPa1);
        System.out.println("");
        System.out.println("MATRIZ IDENTIDAD:");
        m_generaMatrizIdentidad();
        System.out.println("");
        System.out.println("MATRIZ DE PESOS");
        calcula_matriz_pesos(vectorPa1, vectorPa2);
        m_muestraMatriz(matrizW);
        System.out.println("Aprendizaje");
        ejecucion();
        System.out.println("");
        System.out.println("Vector salida (sin funcion escalon)");
        m_muestraVector(vectorFuncionE);
        System.out.println("");
        System.out.println("Vector Salida (Aplicando la funcion escalon)");
        m_aplica_funcionEScalon(vectorFuncionE);
        m_muestraVector(vectorSalida);
        m_muestraResultado(vectorPa1, vectorPa2, vectorSalida);


    }//GEN-LAST:event_btn_funcionamientoActionPerformed

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
            java.util.logging.Logger.getLogger(GUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI2().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrenar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btn_funcionamiento;
    private javax.swing.JButton btn_ingresarPatron;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pnl_patron1;
    private javax.swing.JPanel pnl_patron2;
    private javax.swing.JPanel pnl_patronCoincidencia;
    private javax.swing.JPanel pnl_patronE;
    private javax.swing.JPanel pnl_patronSa;
    private javax.swing.JTextField txtDimensX;
    private javax.swing.JTextField txtDimensY;
    // End of variables declaration//GEN-END:variables

    private boolean validarDimensiones() {
        //definición inicial de variable de retorno
        boolean valido = false;
        //Se obtienen las entradas de texto de las dimensiones ingresadas
        if (isNumeric(txtDimensX.getText())) {
            if (isNumeric(txtDimensY.getText())) {
                //Se obtiene el tamaño en X (ancho) que debe tener el boton
                dimensX = Integer.parseInt(txtDimensX.getText());
                //Se obtiene el tamaño en Y (alto) que debe tener el boton
                dimensY = Integer.parseInt(txtDimensY.getText());
                //Se verifican que las dimensiones ingresadas por el usuario esten entre 1 y 100
                if (((dimensX < 101) && (dimensY < 101)) && ((dimensX > 0) && (dimensY > 0))) {
                    return true;
                }
            }
        }
        return valido;
    }

    private String m_recuperacion() {
        int num_neuronasN = dimensX * dimensY;

        String recuperacion = "";
        recuBuena = 0.138 * num_neuronasN;
        recuExcelente = (num_neuronasN) / (4 * Math.log(num_neuronasN));

        if (num_patronesM <= recuBuena) {
            recuperacion = "Buena";

        }
        if (num_patronesM <= recuExcelente) {
            recuperacion = "Excelente";
        }
        return recuperacion;
    }

    public boolean m_50percentOrtogo(int[] p1, int[] p2) {

        int num_neuronasN = dimensX * dimensY;
        boolean bandera;
        ortogonalidad = 0;
        for (int i = 0; i < p1.length; i++) {
            ortogonalidad += (p1[i] * p2[i]);
        }
        if (ortogonalidad <= 0.4 * num_neuronasN) {
            // if (ortogonalidad <= 0) {
            bandera = true;
        } else {
            bandera = false;
        }

        return bandera;
    }

    public int[][] m_transpuestaP(int[] patron) {
        int num_ne = dimensX * dimensY;
        int cont = 0;
        int[][] matrizTrans = new int[1][num_ne];
        for (int y = 0; y < num_ne; y++) {
            matrizTrans[0][y] = patron[cont];
            cont++;
        }
        return matrizTrans;

    }

    public void m_generaMatrizIdentidad() {
        int num_ne = dimensX * dimensY;
        matrizIdentidad = new int[num_ne][num_ne];
        for (int i = 0; i < num_ne; i++) {
            for (int j = 0; j < num_ne; j++) {
                if (i == j) {
                    matrizIdentidad[i][i] = 1;
                } else {
                    matrizIdentidad[i][i] = 0;
                }
                System.out.print(matrizIdentidad[i][i]);

            }
            System.out.print("\n");
        }
        System.out.println();

    }

    private void m_tamBotones(int cantX, int cantY) {

        tamX = 500 / cantX;
        tamY = 500 / cantY;

    }

    private static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private void m_procesoPatron1(JButton btnNuevo) {

        if (btnNuevo.getBackground() == Color.RED) {
            btnNuevo.setBackground(Color.white);
            btnNuevo.setText("-1");

            String str = btnNuevo.getToolTipText();
            String[] arrOfStr = str.split(",");
            int x = Integer.parseInt(arrOfStr[0]);
            int y = Integer.parseInt(arrOfStr[1]);
            //System.out.println("Patron 1 :" + x + "," + y);
            matrizPa1[x][y] = -1;
            // m_muestraMatriz(matrizPa1);
            vectorPa1 = MatrizToVector(matrizPa1);
            //m_muestraVector(vectorPa1);

        } else {
            btnNuevo.setBackground(Color.RED);
            btnNuevo.setText("1");
            String str = btnNuevo.getToolTipText();
            String[] arrOfStr = str.split(",");
            int x = Integer.parseInt(arrOfStr[0]);
            int y = Integer.parseInt(arrOfStr[1]);
            //System.out.println("Patron 1 :" + x + "," + y);
            matrizPa1[x][y] = 1;
            //m_muestraMatriz(matrizPa1);
            vectorPa1 = MatrizToVector(matrizPa1);
            // m_muestraVector(vectorPa1);
        }

    }

    private void m_procesoPatron2(JButton btnPatron2) {
        if (btnPatron2.getBackground() == Color.RED) {
            btnPatron2.setBackground(Color.white);
            btnPatron2.setText("-1");
            String str = btnPatron2.getToolTipText();
            String[] arrOfStr = str.split(",");
            int x = Integer.parseInt(arrOfStr[0]);
            int y = Integer.parseInt(arrOfStr[1]);
            //System.out.println("Patron 2 :" + x + "," + y);
            matrizPa2[x][y] = -1;
            //m_muestraMatriz(matrizPa2);
            vectorPa2 = MatrizToVector(matrizPa2);
            //m_muestraVector(vectorPa2);
        } else {
            btnPatron2.setBackground(Color.RED);
            btnPatron2.setText("1");
            String str = btnPatron2.getToolTipText();
            String[] arrOfStr = str.split(",");
            int x = Integer.parseInt(arrOfStr[0]);
            int y = Integer.parseInt(arrOfStr[1]);
            // System.out.println("Patron 2 :" + x + "," + y);
            matrizPa2[x][y] = 1;
            //m_muestraMatriz(matrizPa2);
            vectorPa2 = MatrizToVector(matrizPa2);
            //m_muestraVector(vectorPa2);
        }
    }

    private void m_procesoPatronE(JButton btnPatronE) {
        if (btnPatronE.getBackground() == Color.RED) {
            btnPatronE.setBackground(Color.white);
            btnPatronE.setText("-1");
            String str = btnPatronE.getToolTipText();
            String[] arrOfStr = str.split(",");
            int x = Integer.parseInt(arrOfStr[0]);
            int y = Integer.parseInt(arrOfStr[1]);
            //System.out.println("Patron Entrada :" + x + "," + y);
            matrizPE[x][y] = -1;
            vectorPE = MatrizToVector(matrizPE);
            //m_muestraVector(vectorPE);
        } else {
            btnPatronE.setBackground(Color.RED);
            btnPatronE.setText("1");

            String str = btnPatronE.getToolTipText();
            String[] arrOfStr = str.split(",");
            int x = Integer.parseInt(arrOfStr[0]);
            int y = Integer.parseInt(arrOfStr[1]);
            // System.out.println("Patron Entrada :" + x + "," + y);
            matrizPE[x][y] = 1;
            vectorPE = MatrizToVector(matrizPE);
            //m_muestraVector(vectorPE);
        }
    }

    private void repintaTablero() {
        pnl_patron1.revalidate();
        pnl_patron1.repaint();
        pnl_patron2.revalidate();
        pnl_patron2.repaint();
        pnl_patronE.revalidate();
        pnl_patronE.repaint();

        this.pack();

    }

    public int[] MatrizToVector(int[][] p_matriz) {

        int[] array = new int[dimensX * dimensY];
        int cont = 0;
        for (int i = 0; i < p_matriz.length; i++) {
            // remplazamos i por j , condición del for
            for (int j = 0; j < p_matriz[i].length; j++) {
                try {
                    array[cont] = p_matriz[i][j];
                    cont++;
                } catch (Exception e) {
                    System.out.println(e.getCause());
                    System.out.println(e.getMessage());
                }

            }
        }

        return array;
    }

    public void m_muestraVector(int[] p_array) {

        for (int i = 0; i < p_array.length; i++) {
            System.out.print(p_array[i] + ",");
        }

    }

    public void m_muestraMatriz(int[][] p_matriz) {
        for (int x = 0; x < p_matriz.length; x++) {
            for (int y = 0; y < p_matriz[x].length; y++) {
                System.out.print(" | " + p_matriz[x][y] + " | ");
            }
            System.out.println("\n----------------------------------------");

        }
    }

    public void calcula_matriz_pesos(int[] p1, int[] p2) {
        int num_ne = dimensX * dimensY;
        int[][] matrizW1 = new int[num_ne][num_ne];
        int[][] matrizW2 = new int[num_ne][num_ne];
        int[][] matrizW1_I = new int[num_ne][num_ne];
        int[][] matrizW2_I = new int[num_ne][num_ne];

        matrizTransPa1 = m_transpuestaP(p1);
        matrizTransPa2 = m_transpuestaP(p2);
        //m_transpuestaP(p1);
        //Se Calcula la matriz PkT*Pk del patron 1 y patron 2
        for (int i = 0; i < num_ne; i++) {
            for (int j = 0; j < num_ne; j++) {
                matrizW1[i][j] = p1[i] * p1[j];
                matrizW2[i][j] = p2[i] * p2[j];
                ////                matrizW1[i][j] = matrizTransPa1[0][i] * p1[j];
                ////                matrizW2[i][j] = matrizTransPa2[0][j] * p2[j];
            }
        }
        //A la matriz resutlante se le resta la matriz identidad
        for (int i = 0; i < num_ne; i++) {
            for (int j = 0; j < num_ne; j++) {
                matrizW1_I[i][j] = matrizW1[i][j] - matrizIdentidad[i][j];
                matrizW2_I[i][j] = matrizW2[i][j] - matrizIdentidad[i][j];
            }
        }
        //Se obtiene la matriz de pesos W
        for (int i = 0; i < num_ne; i++) {
            for (int j = 0; j < num_ne; j++) {
                matrizW[i][j] = matrizW1_I[i][j] + matrizW2_I[i][j];
            }
        }

    }

    public void ejecucion() {
        //Funciona de entrada
        int suma = 0;
        int num_ne = dimensX * dimensY;
        for (int i = 0; i < num_ne; i++) {
            for (int j = 0; j < num_ne; j++) {
                suma += matrizW[j][i] * vectorPE[j];
            }
            vectorFuncionE[i] = suma;
            suma = 0;
        }
    }

    private int[] m_aplica_funcionEScalon(int[] vectorFuncionE) {
        vectorSalida = new int[vectorFuncionE.length];
        for (int i = 0; i < vectorFuncionE.length; i++) {
            if (vectorFuncionE[i] >= 0) {
                vectorSalida[i] = 1;
            }
            if (vectorFuncionE[i] < 0) {
                vectorSalida[i] = -1;
            }
        }
        return vectorSalida;
    }

    public int[][] vectorToMatriz(int[] p) {

        int matriz[][] = new int[dimensX][dimensY];
        int cont = 0;

        for (int x = 0; x < dimensX; x++) {
            for (int y = 0; y < dimensY; y++) {
                matriz[x][y] = p[cont];
                cont++;
            }
        }
        // m_muestraMatriz(matriz);

        return matriz;

    }

    private void m_muestraResultado(int[] vectorPa1, int[] vectorPa2, int[] vectorSalida) {

        int num_neuronasN = dimensX * dimensY;
        boolean banderaP1PS, banderaP2PS;
        double ortogonP1PS, ortogonP2PS;
        ortogonP1PS = 0;
        ortogonP2PS = 0;
        int contadorX, contadorY;
        MatrizPatronSalida = new JButton[dimensX][dimensY];
        int[][] matrizPatr1 = vectorToMatriz(vectorPa1);
        int[][] matrizPatr2 = vectorToMatriz(vectorPa2);
        int[][] matrizSalida = vectorToMatriz(vectorSalida);

        //Obtener cual de los patrones es 90% parecido al patron de salida
        for (int i = 0; i < vectorPa1.length; i++) {
            ortogonP1PS += (vectorPa1[i] * vectorSalida[i]);
        }
        if (ortogonP1PS >= 0.8 * num_neuronasN) {
            banderaP1PS = true;
            System.out.println("");
            System.out.println("Patron 1 90% parecido ");
            m_muestraVector(vectorPa1);
        } else {
            banderaP1PS = false;
            System.out.println("");
            System.out.println("Patron 1 NO ES 90% parecido ");
            m_muestraVector(vectorPa1);
        }

        for (int i = 0; i < vectorPa2.length; i++) {
            ortogonP2PS += (vectorPa2[i] * vectorSalida[i]);
        }
        if (ortogonP2PS >= 0.8 * num_neuronasN) {
            banderaP2PS = true;
            System.out.println("");
            System.out.println("Patron 2 90% parecido ");
            m_muestraVector(vectorPa2);
        } else {
            banderaP2PS = false;
            System.out.println("");
            System.out.println("Patron 2 NO ES 90% parecido ");
            m_muestraVector(vectorPa2);
        }

        if (banderaP1PS) {
            System.out.println("\nel patron 1 es el mas parecido a la salida");
            for (contadorX = 0; contadorX < dimensX; contadorX++) {
                for (contadorY = 0; contadorY < dimensY; contadorY++) {
                    JButton btnSalida = new JButton();
                    m_tamBotones(dimensX, dimensY);
                    btnSalida.setSize(30, 30);
                    btnSalida.setBackground(Color.white);
                    btnSalida.setText(String.valueOf(matrizPatr1[contadorX][contadorY]));
                    if (btnSalida.getText().equals("1")) {
                        btnSalida.setBackground(Color.red);
                    }
                    MatrizPatronSalida[contadorX][contadorY] = btnSalida;

                    pnl_patronSa.add(MatrizPatronSalida[contadorX][contadorY]);
                    pnl_patronSa.revalidate();
                    pnl_patronSa.repaint();
                    pnl_patronSa.setVisible(true);
                    
                    
                    pnl_patronCoincidencia.add(MatrizPatron1[contadorX][contadorY]);
                    pnl_patronCoincidencia.revalidate();
                    pnl_patronCoincidencia.repaint();
                    pnl_patronCoincidencia.setVisible(true);
                    
                    
                    

                }
            }
        }

        if (banderaP2PS) {
            System.out.println("\nel patron 2 es el mas parecido a la salida");

            for (contadorX = 0; contadorX < dimensX; contadorX++) {
                for (contadorY = 0; contadorY < dimensY; contadorY++) {
                    JButton btnSalida = new JButton();
                    m_tamBotones(dimensX, dimensY);
                    btnSalida.setSize(30, 30);
                    btnSalida.setBackground(Color.white);
                    btnSalida.setText(String.valueOf(matrizPatr2[contadorX][contadorY]));
                    if (btnSalida.getText().equals("1")) {
                        btnSalida.setBackground(Color.red);
                    }
                    MatrizPatronSalida[contadorX][contadorY] = btnSalida;

                    pnl_patronSa.add(MatrizPatronSalida[contadorX][contadorY]);
                    pnl_patronSa.revalidate();
                    pnl_patronSa.repaint();
                    pnl_patronSa.setVisible(true);
                    
                    
                    pnl_patronCoincidencia.add(MatrizPatron2[contadorX][contadorY]);
                    pnl_patronCoincidencia.revalidate();
                    pnl_patronCoincidencia.repaint();
                    pnl_patronCoincidencia.setVisible(true);
                    
                    
                    

                }
            }
        }

    }

}
