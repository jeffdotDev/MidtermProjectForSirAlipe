
package midtermprojectsiralipe;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;


public class FrameViewPOS extends javax.swing.JFrame {

    POSModel connect = new POSModel();
    public FrameViewPOS() {
        initComponents();
        connect.connectDb();
        connect.showProducts();
        connect.showProductsPr();
    }
    
    public void addBtn(ActionListener a){
        addBtn.addActionListener(a);
    }
    public void deleteBtn(ActionListener a){
        deleteBtn.addActionListener(a);
    }
    public void updateBtn(ActionListener a){
        updateBtn.addActionListener(a);
    }
    public void productTableMouseClicked(MouseListener a){
        proTable.addMouseListener(a);
        
    }
    public void productTableMouseClickedTwo(MouseListener a ){
        productTable.addMouseListener(a);
    }
            
    public void addF(ActionListener a){
        add.addActionListener(a);
    }
    public void changeF(ActionListener a){
        changeBtn.addActionListener(a);
    }
    public void deleteOrderF(ActionListener a){
        deleteOrderBtn.addActionListener(a);
    }
    public void uploadF(ActionListener a){
        uploadBtn.addActionListener(a);
    }
    public void reciept(ActionListener a){
        recieptBtn.addActionListener(a);
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        productsBtn = new javax.swing.JButton();
        posBtn = new javax.swing.JButton();
        firstPanel = new javax.swing.JTabbedPane();
        panelFirst = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        changeField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        codeField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        qtyField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        productNameField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        totalField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cashField1 = new javax.swing.JTextField();
        recieptBtn = new javax.swing.JButton();
        deleteOrderBtn = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        proTable = new javax.swing.JTable();
        add = new javax.swing.JButton();
        changeBtn = new javax.swing.JButton();
        photoLabelInPosPanel = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        stockFld = new javax.swing.JLabel();
        panelSecond = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pProductNField = new javax.swing.JTextField();
        pStockField = new javax.swing.JTextField();
        pPriceField = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        uploadLabel = new javax.swing.JLabel();
        uploadBtn = new javax.swing.JButton();
        codeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Simple POS ");

        productsBtn.setBackground(new java.awt.Color(246, 47, 47));
        productsBtn.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        productsBtn.setForeground(new java.awt.Color(255, 255, 255));
        productsBtn.setText("Products");
        productsBtn.setBorder(null);
        productsBtn.setFocusable(false);
        productsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productsBtnActionPerformed(evt);
            }
        });

        posBtn.setBackground(new java.awt.Color(51, 102, 255));
        posBtn.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        posBtn.setForeground(new java.awt.Color(255, 255, 255));
        posBtn.setText("POS");
        posBtn.setBorder(null);
        posBtn.setFocusable(false);
        posBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productsBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(posBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(productsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(posBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 527, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 780));

        panelFirst.setFocusable(false);
        panelFirst.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Product Name", "Quantity", "Price", "TOTAL"
            }
        ));
        jScrollPane2.setViewportView(orderTable);

        panelFirst.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 440, 350));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Product Name");
        panelFirst.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 130, 30));

        changeField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        changeField.setBorder(null);
        panelFirst.add(changeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 560, 160, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Price");
        panelFirst.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 60, 30));

        priceField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        priceField.setBorder(null);
        panelFirst.add(priceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 130, 40));

        codeField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        codeField.setBorder(null);
        panelFirst.add(codeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 100, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Stocks");
        panelFirst.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 70, 30));

        qtyField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        qtyField1.setBorder(null);
        panelFirst.add(qtyField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 100, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Code ");
        panelFirst.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 60, 30));

        productNameField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        productNameField1.setBorder(null);
        panelFirst.add(productNameField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 150, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel7.setText("Total Price :");
        jLabel7.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jLabel7ComponentRemoved(evt);
            }
        });
        panelFirst.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, 120, 40));

        totalField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        totalField.setBorder(null);
        panelFirst.add(totalField, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 490, 140, 50));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setText("Cash : ");
        jLabel8.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jLabel8ComponentRemoved(evt);
            }
        });
        panelFirst.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 500, -1, 40));

        cashField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cashField1.setBorder(null);
        panelFirst.add(cashField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 490, 150, 50));

        recieptBtn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        recieptBtn.setText("Print Reciept");
        panelFirst.add(recieptBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 600, 180, 120));

        deleteOrderBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deleteOrderBtn.setText("Delete Order");
        panelFirst.add(deleteOrderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 650, 190, 50));

        proTable.setBackground(new java.awt.Color(255, 102, 102));
        proTable.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        proTable.setForeground(new java.awt.Color(255, 255, 255));
        proTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Product Name", "Stocks", "Price", "Picture"
            }
        ));
        jScrollPane4.setViewportView(proTable);

        panelFirst.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 470, 570));

        add.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add.setText("Add");
        panelFirst.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 130, 50));

        changeBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        changeBtn.setText("Change :");
        panelFirst.add(changeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 560, 110, 50));

        photoLabelInPosPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelFirst.add(photoLabelInPosPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 190, 160));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Photo");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelFirst.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 190, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("Qty.");
        panelFirst.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 60, 30));

        stockFld.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelFirst.add(stockFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 80, 40));

        firstPanel.addTab("tab1", panelFirst);

        panelSecond.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Product Name", "Stocks", "Price", "Picture"
            }
        ));
        jScrollPane3.setViewportView(productTable);

        panelSecond.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 261, 1090, 506));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Code");
        panelSecond.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 95, 52, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Product Name");
        panelSecond.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 95, 135, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Stock");
        panelSecond.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 64, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Price");
        panelSecond.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 63, -1));
        panelSecond.add(pProductNField, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 131, 189, 37));
        panelSecond.add(pStockField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 127, 40));

        pPriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pPriceFieldActionPerformed(evt);
            }
        });
        panelSecond.add(pPriceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 111, 37));

        addBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        panelSecond.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 170, 47));

        updateBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        updateBtn.setText("Update");
        panelSecond.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 169, 47));

        deleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        panelSecond.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 169, 47));

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        panelSecond.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 191, 47));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Search Product N.");
        panelSecond.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 200, -1, 49));

        uploadLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelSecond.add(uploadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 190, 120));

        uploadBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        uploadBtn.setText("Upload Photo");
        panelSecond.add(uploadBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 140, 150, 40));

        codeLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelSecond.add(codeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 100, 40));

        firstPanel.addTab("tab2", panelSecond);

        getContentPane().add(firstPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, -34, 1160, 830));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7ComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jLabel7ComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7ComponentRemoved

    private void jLabel8ComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jLabel8ComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8ComponentRemoved

    private void posBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posBtnActionPerformed
        firstPanel.setSelectedIndex(0);
        POSModel.showProducts();
    }//GEN-LAST:event_posBtnActionPerformed

    private void productsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productsBtnActionPerformed
        firstPanel.setSelectedIndex(1);
    }//GEN-LAST:event_productsBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBtnActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void pPriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pPriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pPriceFieldActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBtnActionPerformed
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    public javax.swing.JButton addBtn;
    public javax.swing.JTextField cashField1;
    private javax.swing.JButton changeBtn;
    public javax.swing.JTextField changeField;
    public javax.swing.JTextField codeField;
    public static javax.swing.JLabel codeLabel;
    public javax.swing.JButton deleteBtn;
    public javax.swing.JButton deleteOrderBtn;
    private javax.swing.JTabbedPane firstPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JTable orderTable;
    public javax.swing.JTextField pPriceField;
    public javax.swing.JTextField pProductNField;
    public javax.swing.JTextField pStockField;
    private javax.swing.JPanel panelFirst;
    public javax.swing.JPanel panelSecond;
    public static javax.swing.JLabel photoLabelInPosPanel;
    private javax.swing.JButton posBtn;
    public javax.swing.JTextField priceField;
    public static javax.swing.JTable proTable;
    public javax.swing.JTextField productNameField1;
    public static javax.swing.JTable productTable;
    private javax.swing.JButton productsBtn;
    public javax.swing.JTextField qtyField1;
    public javax.swing.JButton recieptBtn;
    public javax.swing.JTextField searchField;
    public static javax.swing.JLabel stockFld;
    public static javax.swing.JTextField totalField;
    public javax.swing.JButton updateBtn;
    private javax.swing.JButton uploadBtn;
    public static javax.swing.JLabel uploadLabel;
    // End of variables declaration//GEN-END:variables
}
