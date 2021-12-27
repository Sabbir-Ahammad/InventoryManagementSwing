/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.gui;

import com.inventory.dao.CategoryDAO;
import com.inventory.dao.ProductDAO;
import com.inventory.model.Category;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sabbir
 */
public class CategoryApp extends javax.swing.JFrame {

    /**
     * Creates new form Category
     */
    public CategoryApp() {
        initComponents();
        getAllCategory();
        getTabledata();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        dashboard = new javax.swing.JLabel();
        supplier = new javax.swing.JLabel();
        branch = new javax.swing.JLabel();
        products = new javax.swing.JLabel();
        category = new javax.swing.JLabel();
        purchaseorder = new javax.swing.JLabel();
        sales = new javax.swing.JLabel();
        pricing = new javax.swing.JLabel();
        report = new javax.swing.JLabel();
        invoices = new javax.swing.JLabel();
        settings = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        addCategoryBtn = new javax.swing.JButton();
        updateCategoryBtn = new javax.swing.JButton();
        deleteCategoryBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableShowCategory = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        catCode = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        catName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(218, 221, 252));
        jLabel1.setFont(new java.awt.Font("Source Code Pro ExtraLight", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("IV");
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(236, 245, 248));
        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(16, 76, 82));

        dashboard.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        dashboard.setForeground(new java.awt.Color(255, 255, 255));
        dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/iconsImages/web-house-.png"))); // NOI18N
        dashboard.setText("Dashboard");
        dashboard.setIconTextGap(8);
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
        });

        supplier.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        supplier.setForeground(new java.awt.Color(255, 255, 255));
        supplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/iconsImages/supplier.png"))); // NOI18N
        supplier.setText("Supplier");
        supplier.setIconTextGap(8);
        supplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supplierMouseClicked(evt);
            }
        });

        branch.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        branch.setForeground(new java.awt.Color(255, 255, 255));
        branch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/iconsImages/branch.png"))); // NOI18N
        branch.setText("Branch");
        branch.setIconTextGap(8);
        branch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                branchMouseClicked(evt);
            }
        });

        products.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        products.setForeground(new java.awt.Color(255, 255, 255));
        products.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/iconsImages/product.png"))); // NOI18N
        products.setText("Products");
        products.setIconTextGap(8);
        products.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productsMouseClicked(evt);
            }
        });

        category.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        category.setForeground(new java.awt.Color(255, 255, 255));
        category.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/iconsImages/list.png"))); // NOI18N
        category.setText("Category");
        category.setIconTextGap(8);
        category.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryMouseClicked(evt);
            }
        });

        purchaseorder.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        purchaseorder.setForeground(new java.awt.Color(255, 255, 255));
        purchaseorder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/iconsImages/choices.png"))); // NOI18N
        purchaseorder.setText("Purchase Order");
        purchaseorder.setIconTextGap(8);
        purchaseorder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                purchaseorderMouseClicked(evt);
            }
        });

        sales.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sales.setForeground(new java.awt.Color(255, 255, 255));
        sales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/iconsImages/sale.png"))); // NOI18N
        sales.setText("Sales");
        sales.setIconTextGap(8);
        sales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesMouseClicked(evt);
            }
        });

        pricing.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pricing.setForeground(new java.awt.Color(255, 255, 255));
        pricing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/iconsImages/dollar-tag.png"))); // NOI18N
        pricing.setText("Pricing");
        pricing.setIconTextGap(8);
        pricing.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pricingMouseClicked(evt);
            }
        });

        report.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        report.setForeground(new java.awt.Color(255, 255, 255));
        report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/iconsImages/report.png"))); // NOI18N
        report.setText("Report");
        report.setIconTextGap(8);
        report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportMouseClicked(evt);
            }
        });

        invoices.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        invoices.setForeground(new java.awt.Color(255, 255, 255));
        invoices.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/iconsImages/invoice.png"))); // NOI18N
        invoices.setText("Invoices");
        invoices.setIconTextGap(8);
        invoices.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                invoicesMouseClicked(evt);
            }
        });

        settings.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        settings.setForeground(new java.awt.Color(255, 255, 255));
        settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/iconsImages/wrench.png"))); // NOI18N
        settings.setText("Settings");
        settings.setIconTextGap(8);
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dashboard, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(supplier, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(branch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(products, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(category, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(purchaseorder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sales, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pricing, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(report, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(invoices, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(settings, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(branch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(products, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(purchaseorder, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sales, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pricing, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(report, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(invoices, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(settings, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Category");

        addCategoryBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addCategoryBtn.setText("Add Ctegory");
        addCategoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCategoryBtnActionPerformed(evt);
            }
        });

        updateCategoryBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        updateCategoryBtn.setText("Update Category");
        updateCategoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCategoryBtnActionPerformed(evt);
            }
        });

        deleteCategoryBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        deleteCategoryBtn.setText("Delete Category");
        deleteCategoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCategoryBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addCategoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateCategoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteCategoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
            .addComponent(addCategoryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(updateCategoryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(deleteCategoryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tableShowCategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableShowCategory);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Category Code");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(catCode, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(catCode, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Category Name");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(catName)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(catName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new DashboardApp().setVisible(true);
    }//GEN-LAST:event_dashboardMouseClicked

    private void supplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new SupplierApp().setVisible(true);
    }//GEN-LAST:event_supplierMouseClicked

    private void branchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_branchMouseClicked
        this.setVisible(false);
        new InventoryInfoApp().setVisible(true);
    }//GEN-LAST:event_branchMouseClicked

    private void productsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsMouseClicked
        this.setVisible(false);
        new ProductApp().setVisible(true);
    }//GEN-LAST:event_productsMouseClicked

    private void categoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryMouseClicked
        this.setVisible(false);
        new CategoryApp().setVisible(true);
    }//GEN-LAST:event_categoryMouseClicked

    private void purchaseorderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseorderMouseClicked
        this.setVisible(false);
        new PurchaseOrderApp().setVisible(true);
    }//GEN-LAST:event_purchaseorderMouseClicked

    private void salesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesMouseClicked
        this.setVisible(false);
        new SalesApp().setVisible(true);
    }//GEN-LAST:event_salesMouseClicked

    private void pricingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pricingMouseClicked
        this.setVisible(false);
        new PricingApp().setVisible(true);
    }//GEN-LAST:event_pricingMouseClicked

    private void reportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMouseClicked
        this.setVisible(false);
        new ReportApp().setVisible(true);
    }//GEN-LAST:event_reportMouseClicked

    private void invoicesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invoicesMouseClicked
        this.setVisible(false);
        new InvoiceApp().setVisible(true);
    }//GEN-LAST:event_invoicesMouseClicked

    private void settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseClicked
        this.setVisible(false);
        new SettingsApp().setVisible(true);
    }//GEN-LAST:event_settingsMouseClicked

    private void addCategoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCategoryBtnActionPerformed
        Category c = new Category();
        c.setCategoryCode(catCode.getText());
        c.setCategoryName(catName.getText());
        int status = new CategoryDAO().save(c);
        if (status > 0) {
            JOptionPane.showMessageDialog(rootPane, "Category Saved!");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Category Not Saved!");

        }
        getAllCategory();
    }//GEN-LAST:event_addCategoryBtnActionPerformed

    private void updateCategoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCategoryBtnActionPerformed
        Category cat = new Category();
        cat.setCategoryCode(catCode.getText());
        cat.setCategoryName(catName.getText());
        int status = new CategoryDAO().update(cat);
        if(status > 0 ) JOptionPane.showMessageDialog(rootPane, "Category Saved!");
        else JOptionPane.showMessageDialog(rootPane, "Category not Saved!");
    }//GEN-LAST:event_updateCategoryBtnActionPerformed

    private void deleteCategoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCategoryBtnActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Do you want to delete ?");
        if (option == 0) {
            Category cc = new Category();
            cc.setCategoryCode(catCode.getText());
            int status = new CategoryDAO().delete(cc);
            if (status > 0) {
                JOptionPane.showMessageDialog(rootPane, "Category delete!");
                getAllCategory();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Category Not delete!");
            }
        }
    }//GEN-LAST:event_deleteCategoryBtnActionPerformed
    
    public void getAllCategory(){
        List<Category> categories = new CategoryDAO().getAll();
        for (Category category1 : categories) {
            System.out.println(category1.getCategoryName());
        }
        String columns[] = {"Category name", "Category Code"};
        String data[][] = new String[categories.size()][5];
        int i =0;
        for (Category ss : categories) {
                data[i][0] = ss.getCategoryCode();
                data[i][1] = ss.getCategoryName();
                i++;
            }
        DefaultTableModel model = new DefaultTableModel(data, columns);
        tableShowCategory.setModel(model);
    }
    String catCodeVar;
    String catNameVar;
    public void getTabledata(){
        tableShowCategory.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                catCodeVar = (tableShowCategory.getValueAt(tableShowCategory.getSelectedRow(), 0)).toString();
                catNameVar = (tableShowCategory.getValueAt(tableShowCategory.getSelectedRow(), 1)).toString();
                catCode.setText(catCodeVar);
                catName.setText(catNameVar);
            }
        });
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CategoryApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategoryApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategoryApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategoryApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CategoryApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCategoryBtn;
    private javax.swing.JLabel branch;
    private javax.swing.JTextField catCode;
    private javax.swing.JTextField catName;
    private javax.swing.JLabel category;
    private javax.swing.JLabel dashboard;
    private javax.swing.JButton deleteCategoryBtn;
    private javax.swing.JLabel invoices;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pricing;
    private javax.swing.JLabel products;
    private javax.swing.JLabel purchaseorder;
    private javax.swing.JLabel report;
    private javax.swing.JLabel sales;
    private javax.swing.JLabel settings;
    private javax.swing.JLabel supplier;
    private javax.swing.JTable tableShowCategory;
    private javax.swing.JButton updateCategoryBtn;
    // End of variables declaration//GEN-END:variables
}
