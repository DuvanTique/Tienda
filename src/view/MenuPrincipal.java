package view;

/**
 *
 * @author Duvan
 */
public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaMenu = new javax.swing.JTextArea();
        ButtonCarnes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ButtonAseo = new javax.swing.JButton();
        ButtonBebidas = new javax.swing.JButton();
        TextFieldProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextFieldAmout = new javax.swing.JTextField();
        ButtonAddProducto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextAreaFactura = new javax.swing.JTextArea();
        ButtonPedido = new javax.swing.JButton();
        TextFieldPrice = new javax.swing.JTextField();
        ButtonShowFacturas = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        RadioButtonMala = new javax.swing.JRadioButton();
        RadioButtonBuena = new javax.swing.JRadioButton();

        buttonGroup1.add(RadioButtonMala);
        buttonGroup1.add(RadioButtonBuena);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Restaurante");
        setSize(new java.awt.Dimension(800, 800));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Menu de Compras");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        TextAreaMenu.setEditable(false);
        TextAreaMenu.setBackground(new java.awt.Color(204, 204, 204));
        TextAreaMenu.setColumns(20);
        TextAreaMenu.setRows(5);
        jScrollPane1.setViewportView(TextAreaMenu);

        ButtonCarnes.setBackground(new java.awt.Color(51, 102, 255));
        ButtonCarnes.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCarnes.setText("Carnes");
        ButtonCarnes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonCarnesMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Productos");

        ButtonAseo.setBackground(new java.awt.Color(51, 102, 255));
        ButtonAseo.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAseo.setText("Aseo");
        ButtonAseo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonAseoMouseClicked(evt);
            }
        });

        ButtonBebidas.setBackground(new java.awt.Color(51, 102, 255));
        ButtonBebidas.setForeground(new java.awt.Color(255, 255, 255));
        ButtonBebidas.setText("Bebidas");
        ButtonBebidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonBebidasMouseClicked(evt);
            }
        });

        TextFieldProducto.setText("#");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Cantidad");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Escoja un producto");

        TextFieldAmout.setText("#");

        ButtonAddProducto.setBackground(new java.awt.Color(51, 102, 255));
        ButtonAddProducto.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAddProducto.setText("Añadir");
        ButtonAddProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonAddProductoMouseClicked(evt);
            }
        });

        TextAreaFactura.setEditable(false);
        TextAreaFactura.setBackground(new java.awt.Color(204, 204, 204));
        TextAreaFactura.setColumns(20);
        TextAreaFactura.setLineWrap(true);
        TextAreaFactura.setRows(5);
        jScrollPane2.setViewportView(TextAreaFactura);

        ButtonPedido.setBackground(new java.awt.Color(51, 102, 255));
        ButtonPedido.setForeground(new java.awt.Color(255, 255, 255));
        ButtonPedido.setText("Realizar Pedido");
        ButtonPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonPedidoMouseClicked(evt);
            }
        });

        TextFieldPrice.setBackground(new java.awt.Color(204, 255, 255));
        TextFieldPrice.setText("Total");

        ButtonShowFacturas.setBackground(new java.awt.Color(51, 102, 255));
        ButtonShowFacturas.setForeground(new java.awt.Color(255, 255, 255));
        ButtonShowFacturas.setText("Ver Facturas");
        ButtonShowFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonShowFacturasMouseClicked(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Calificar Experiencia:");

        RadioButtonMala.setText("Mala");
        RadioButtonMala.setActionCommand("Mala");

        RadioButtonBuena.setText("Buena");
        RadioButtonBuena.setActionCommand("Buena");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ButtonAddProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonShowFacturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonCarnes, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(ButtonAseo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(TextFieldProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(TextFieldAmout, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(ButtonPedido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFieldPrice)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(RadioButtonMala, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RadioButtonBuena, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonCarnes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonAseo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonBebidas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldAmout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonAddProducto)
                            .addComponent(ButtonShowFacturas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(RadioButtonMala)
                            .addComponent(RadioButtonBuena))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonPedido)
                            .addComponent(TextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCarnesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCarnesMouseClicked

    }//GEN-LAST:event_ButtonCarnesMouseClicked

    private void ButtonAseoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAseoMouseClicked

    }//GEN-LAST:event_ButtonAseoMouseClicked

    private void ButtonBebidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonBebidasMouseClicked

    }//GEN-LAST:event_ButtonBebidasMouseClicked

    private void ButtonAddProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAddProductoMouseClicked
        
    }//GEN-LAST:event_ButtonAddProductoMouseClicked

    private void ButtonPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonPedidoMouseClicked

    }//GEN-LAST:event_ButtonPedidoMouseClicked

    private void ButtonShowFacturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonShowFacturasMouseClicked

    }//GEN-LAST:event_ButtonShowFacturasMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton ButtonAddProducto;
    public javax.swing.JButton ButtonAseo;
    public javax.swing.JButton ButtonBebidas;
    public javax.swing.JButton ButtonCarnes;
    public javax.swing.JButton ButtonPedido;
    public javax.swing.JButton ButtonShowFacturas;
    public javax.swing.JRadioButton RadioButtonBuena;
    public javax.swing.JRadioButton RadioButtonMala;
    public javax.swing.JTextArea TextAreaFactura;
    public javax.swing.JTextArea TextAreaMenu;
    public javax.swing.JTextField TextFieldAmout;
    public javax.swing.JTextField TextFieldPrice;
    public javax.swing.JTextField TextFieldProducto;
    public javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
