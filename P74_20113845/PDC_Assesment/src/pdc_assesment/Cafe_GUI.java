/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdc_assesment;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Hampton1
 */
public class Cafe_GUI extends javax.swing.JFrame {

    public Controller controller;

    /**
     * Creates new form Cafe_GUI
     *
     * @param controller
     */
    //creating the constructor for the GUI
    public Cafe_GUI(Controller controller) {
        this.controller = controller;
        initComponents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
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

        jPanel3 = new javax.swing.JPanel();
        welcome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        payment = new javax.swing.JPanel();
        customerCardName = new javax.swing.JTextField();
        customerCardNumber = new javax.swing.JTextField();
        customerCardPin = new javax.swing.JTextField();
        cardName = new javax.swing.JLabel();
        cardNumber = new javax.swing.JLabel();
        pin = new javax.swing.JLabel();
        confirmPayment = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        chicken = new javax.swing.JCheckBox();
        smallHotChocolate = new javax.swing.JCheckBox();
        pie = new javax.swing.JCheckBox();
        cake = new javax.swing.JCheckBox();
        mediumHotchocolate = new javax.swing.JCheckBox();
        largeCoffee = new javax.swing.JCheckBox();
        confirmOrder = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        restart = new javax.swing.JButton();
        order = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewOrder = new javax.swing.JTextArea();
        total = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        details = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        customerName = new javax.swing.JTextField();
        confirm = new javax.swing.JButton();
        guests = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcome.setBackground(new java.awt.Color(204, 255, 255));
        welcome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Modern No. 20", 0, 48)); // NOI18N
        jLabel1.setText("Welcome to the Cafe");

        javax.swing.GroupLayout welcomeLayout = new javax.swing.GroupLayout(welcome);
        welcome.setLayout(welcomeLayout);
        welcomeLayout.setHorizontalGroup(
            welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomeLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        welcomeLayout.setVerticalGroup(
            welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 570, 60));

        payment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        customerCardName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                customerCardNameKeyPressed(evt);
            }
        });

        customerCardNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerCardNumberActionPerformed(evt);
            }
        });
        customerCardNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                customerCardNumberKeyPressed(evt);
            }
        });

        customerCardPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerCardPinActionPerformed(evt);
            }
        });
        customerCardPin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                customerCardPinKeyPressed(evt);
            }
        });

        cardName.setText("First Name:");

        cardNumber.setText("Card No:");

        pin.setText("Pin:");

        confirmPayment.setText("Confirm payment ");
        confirmPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPaymentActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Payment");

        javax.swing.GroupLayout paymentLayout = new javax.swing.GroupLayout(payment);
        payment.setLayout(paymentLayout);
        paymentLayout.setHorizontalGroup(
            paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentLayout.createSequentialGroup()
                        .addComponent(pin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(customerCardPin, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentLayout.createSequentialGroup()
                        .addComponent(cardNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(customerCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentLayout.createSequentialGroup()
                        .addComponent(cardName, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                        .addGap(27, 27, 27)
                        .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(customerCardName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(paymentLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(confirmPayment)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paymentLayout.setVerticalGroup(
            paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerCardName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardNumber))
                .addGap(14, 14, 14)
                .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerCardPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pin))
                .addGap(18, 18, 18)
                .addComponent(confirmPayment)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 260, 220));

        menu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        menu.setToolTipText("");

        chicken.setText("Chicken Sandwhich $9.00");
        chicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chickenActionPerformed(evt);
            }
        });

        smallHotChocolate.setText("Small Hot Chocolate $4.00");

        pie.setText("Pie $10.00");
        pie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pieActionPerformed(evt);
            }
        });

        cake.setText("Red Velvet Cake $7.00");

        mediumHotchocolate.setText("Medium Hot Chocolate $5.00");

        largeCoffee.setText("Large Coffee $6.00");
        largeCoffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                largeCoffeeActionPerformed(evt);
            }
        });

        confirmOrder.setText("Confirm Order");
        confirmOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmOrderActionPerformed(evt);
            }
        });

        jLabel2.setText(" ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Food & Drink Menu");

        restart.setText("Restart Order");
        restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, menuLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, menuLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chicken)
                            .addComponent(pie)
                            .addComponent(cake)
                            .addComponent(smallHotChocolate)
                            .addComponent(mediumHotchocolate)
                            .addGroup(menuLayout.createSequentialGroup()
                                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(menuLayout.createSequentialGroup()
                                        .addComponent(largeCoffee)
                                        .addGap(62, 62, 62))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                                        .addComponent(restart)
                                        .addGap(36, 36, 36)))
                                .addComponent(confirmOrder)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(chicken)
                .addGap(18, 18, 18)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addComponent(pie)
                        .addGap(18, 18, 18)
                        .addComponent(cake)
                        .addGap(18, 18, 18)
                        .addComponent(smallHotChocolate)
                        .addGap(18, 18, 18)
                        .addComponent(mediumHotchocolate)
                        .addGap(18, 18, 18)
                        .addComponent(largeCoffee)
                        .addGap(18, 18, 18)
                        .addComponent(restart))
                    .addComponent(confirmOrder, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 360, 350));

        order.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Your Order");

        viewOrder.setColumns(20);
        viewOrder.setRows(5);
        jScrollPane1.setViewportView(viewOrder);

        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });

        jLabel7.setText("Total:");

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 18)); // NOI18N
        jLabel10.setText("Thank you for Choosing Us!");

        javax.swing.GroupLayout orderLayout = new javax.swing.GroupLayout(order);
        order.setLayout(orderLayout);
        orderLayout.setHorizontalGroup(
            orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(orderLayout.createSequentialGroup()
                .addGroup(orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(orderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(orderLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)))
                    .addGroup(orderLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)))
                .addContainerGap())
        );
        orderLayout.setVerticalGroup(
            orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(34, 34, 34))
        );

        getContentPane().add(order, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 250, 450));

        details.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Name for order:");

        customerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerNameActionPerformed(evt);
            }
        });
        customerName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                customerNameKeyPressed(evt);
            }
        });

        confirm.setText("Confirm");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        guests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guestsActionPerformed(evt);
            }
        });
        guests.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                guestsKeyPressed(evt);
            }
        });

        jLabel6.setText("Phone Number:");

        jLabel9.setText("To Proceed Please Confirm:");

        javax.swing.GroupLayout detailsLayout = new javax.swing.GroupLayout(details);
        details.setLayout(detailsLayout);
        detailsLayout.setHorizontalGroup(
            detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailsLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(detailsLayout.createSequentialGroup()
                        .addGroup(detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(detailsLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(guests, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(detailsLayout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(confirm)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        detailsLayout.setVerticalGroup(
            detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(confirm)
                        .addComponent(jLabel9))
                    .addGroup(detailsLayout.createSequentialGroup()
                        .addGroup(detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guests, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(details, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 380, 90));

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void largeCoffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_largeCoffeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_largeCoffeeActionPerformed

    private void pieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pieActionPerformed

    private void chickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chickenActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_chickenActionPerformed

    private void confirmOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmOrderActionPerformed

        //asking the user to select something if nothing is selected. 
        if (!this.controller.displayOrder(this.chicken.isSelected(), this.pie.isSelected(), this.mediumHotchocolate.isSelected(), this.smallHotChocolate.isSelected(), this.largeCoffee.isSelected(), this.cake.isSelected())) {
            //prompt user to try again by giving message
            JOptionPane.showMessageDialog(this, "You have not Selected anything. Please try again or Exit the Cafe.");
        }

//        if (this.chicken.isSelected() || this.mediumHotchocolate.isSelected() || this.smallHotChocolate.isSelected() || this.pie.isSelected() || this.cake.isSelected() || this.largeCoffee.isSelected()) {
//            this.menu.setVisible(false);
//            this.order.setVisible(true);
//            this.payment.setVisible(true);
//            this.viewOrder.setText(this.controller.displayOrder(this.chicken.isSelected(), this.pie.isSelected(), this.mediumHotchocolate.isSelected(), this.smallHotChocolate.isSelected(), this.largeCoffee.isSelected(), this.cake.isSelected()));
//            this.total.setText("$" + this.controller.totalPrice);
//        } else {
//            //prompt user to try again by giving message
//            JOptionPane.showMessageDialog(this, "You have not Selected anything. Please try again or Exit the Cafe.");
//        }
    }//GEN-LAST:event_confirmOrderActionPerformed

    // user can exit the cafe anytime by using this button 
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.out.println("The user has exited the system");
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    //if user wants to restart, this sets the selected boxes to not being select
    private void restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartActionPerformed
        if (evt.getSource() == restart) {
            this.chicken.setSelected(false);
            this.mediumHotchocolate.setSelected(false);
            this.smallHotChocolate.setSelected(false);
            this.pie.setSelected(false);
            this.cake.setSelected(false);
            this.largeCoffee.setSelected(false);
        }
    }//GEN-LAST:event_restartActionPerformed


    private void customerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerNameActionPerformed

    private void confirmPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPaymentActionPerformed

        //CheckoutDatabase co = new CheckoutDatabase();

        //if these fields are not empty - tell them its been successful 
        if (!this.customerCardName.getText().isEmpty() && !this.customerCardNumber.getText().isEmpty() || !this.customerCardPin.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Thank you for purchasing with us. Your order has been recieved.");
        } else {
            //else tell them they have not completed all fields
            JOptionPane.showMessageDialog(this, "You have not completed all text boxes. All must be filled to complete your order ");

        }


    }//GEN-LAST:event_confirmPaymentActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        // TODO add your handling code here:

        if (!this.customerName.getText().isEmpty() && !this.guests.getText().isEmpty()) {
            this.controller.customer.setName(this.customerName.getText());
            this.controller.customer.setGuests(Integer.parseInt(this.guests.getText()));
            this.controller.db.addCustomer(this.controller.customer);
            this.menu.setVisible(true);
            this.details.setVisible(false);
        }


    }//GEN-LAST:event_confirmActionPerformed

    private void guestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guestsActionPerformed
        // TODO add your handling code her

    }//GEN-LAST:event_guestsActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
        total.setEditable(false);
    }//GEN-LAST:event_totalActionPerformed

    private void customerNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerNameKeyPressed

        //if user tries to enter a letter in the name option it will not let them
        char c = evt.getKeyChar();
        if (Character.isLetter(c) || Character.isWhitespace(c) || c == '\b') {
            customerName.setEditable(true);
        } else {
            customerName.setEditable(false);
        }


    }//GEN-LAST:event_customerNameKeyPressed

    private void guestsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_guestsKeyPressed

        //if user tries to enter a letter in the phone number it will not let them  
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            guests.setEditable(false);
        } else {
            guests.setEditable(true);
        }


    }//GEN-LAST:event_guestsKeyPressed

    private void customerCardNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerCardNameKeyPressed
        //if user tries to enter a letter in the name option it will not let them
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            customerCardName.setEditable(true);
        } else {
            customerCardName.setEditable(false);
        }    }//GEN-LAST:event_customerCardNameKeyPressed

    private void customerCardNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerCardNumberKeyPressed

        //lets users only enter numbers for the card 
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            //cannot enter if letter
            customerCardNumber.setEditable(false);
        } else {
            //numbers can write
            customerCardNumber.setEditable(true);
        }

    }//GEN-LAST:event_customerCardNumberKeyPressed

    private void customerCardNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerCardNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerCardNumberActionPerformed

    private void customerCardPinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerCardPinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerCardPinActionPerformed

    private void customerCardPinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerCardPinKeyPressed
        //lets users only enter numbers for the card 
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            //cannot enter if letter
            customerCardNumber.setEditable(false);
        } else {
            //numbers can write
            customerCardNumber.setEditable(true);
        }     }//GEN-LAST:event_customerCardPinKeyPressed

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
            java.util.logging.Logger.getLogger(Cafe_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cafe_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cafe_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cafe_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cake;
    private javax.swing.JLabel cardName;
    private javax.swing.JLabel cardNumber;
    private javax.swing.JCheckBox chicken;
    private javax.swing.JButton confirm;
    private javax.swing.JButton confirmOrder;
    private javax.swing.JButton confirmPayment;
    private javax.swing.JTextField customerCardName;
    private javax.swing.JTextField customerCardNumber;
    private javax.swing.JTextField customerCardPin;
    private javax.swing.JTextField customerName;
    private javax.swing.JPanel details;
    private javax.swing.JButton exit;
    private javax.swing.JTextField guests;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox largeCoffee;
    private javax.swing.JCheckBox mediumHotchocolate;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel order;
    private javax.swing.JPanel payment;
    private javax.swing.JCheckBox pie;
    private javax.swing.JLabel pin;
    private javax.swing.JButton restart;
    private javax.swing.JCheckBox smallHotChocolate;
    private javax.swing.JTextField total;
    private javax.swing.JTextArea viewOrder;
    private javax.swing.JPanel welcome;
    // End of variables declaration//GEN-END:variables

    //databases
    public void addActionListener(ActionListener listener) {
        this.customerName.addActionListener(listener);
        this.confirm.addActionListener(listener);
        this.confirmOrder.addActionListener(listener);
        this.chicken.addActionListener(listener);
        this.pie.addActionListener(listener);
        this.cake.addActionListener(listener);
        this.smallHotChocolate.addActionListener(listener);
        this.largeCoffee.addActionListener(listener);
        this.cake.addActionListener(listener);
        this.cake.addActionListener(listener);
        this.cake.addActionListener(listener);
        this.cake.addActionListener(listener);

    }

    //Getters
    public JPanel getDetails() {

        return this.details;
    }

    public JPanel getOrder() {

        return this.order;
    }

    public JPanel getPayment() {

        return this.payment;
    }

    public JPanel getMenu() {

        return this.menu;
    }

    public JTextArea getViewOrder() {

        return this.viewOrder;
    }

    public JTextField getTotal() {

        return this.total;
    }

}
