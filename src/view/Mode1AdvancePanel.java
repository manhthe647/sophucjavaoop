
package view;

import controller.Mode1AdvanceController;
import java.awt.event.ActionListener;
import model.ComplexNumber;

public class Mode1AdvancePanel extends javax.swing.JPanel {

    private final Mode1AdvanceController controller;
    private Mode1AdvancePanel view;
    private final ComplexNumber model;
    
    public Mode1AdvancePanel() {
        initComponents();
        model=new ComplexNumber();
        controller=new Mode1AdvanceController(this, model);
        calcMode1Btn.addActionListener(controller);
    }
    
     public double getRealValueMode1(){
        return Double.parseDouble(real1Mode1Input.getText());
    }
    
    public double getImagValueMode1(){
        return Double.parseDouble(real1Mode1Input.getText());
    }
    
    public void alert(String text){
        alertLabel.setText(text);
    }
    public void setLabel1(String text) {
        complexNumberLabel.setText(text);
    }
    
    public void setLabel2(String text) {
        phasorLabel.setText(text);
    }
    
    public void setLabel3(String text) {
        polarFormLabel.setText(text);
    }
    
    public void setLabel4(String text) {
        expFormLabel.setText(text);
    }
    
    public void setLabel5(String text) {
        modulusLabel.setText(text);
    }
    
    public void setLabel6(String text) {
       argumentLabel.setText(text);
    }
    
    public void setLabel7(String text) {
        getRealLabel.setText(text);
    }
    
    public void setLabel8(String text) {
        getImagLabel.setText(text);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mode1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        real1Mode1Input = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        imag1Mode1Input = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        calcMode1Btn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        complexNumberLabel = new javax.swing.JLabel();
        phasorLabel = new javax.swing.JLabel();
        polarFormLabel = new javax.swing.JLabel();
        getRealLabel = new javax.swing.JLabel();
        getImagLabel = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        expFormLabel = new javax.swing.JLabel();
        alertLabel = new javax.swing.JLabel();
        modulusLabel = new javax.swing.JLabel();
        argumentLabel = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();

        mode1.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("Phân tích số phức");

        real1Mode1Input.setText("4");

        jLabel5.setText("Nhập phần thực (a)");

        jLabel6.setText("Nhập phần ảo (b)");

        imag1Mode1Input.setText("4");

        jLabel7.setText("--------------------------------------------------------------------------------------------------------------");

        calcMode1Btn.setText("Tính toán");
        calcMode1Btn.setActionCommand("=");
        calcMode1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcMode1BtnActionPerformed(evt);
            }
        });

        jLabel14.setText("i");

        jLabel15.setText("Phần thực: ");

        jLabel16.setText("Phần ảo:");

        jLabel17.setText("Dạng cực:");

        jLabel18.setText("Ký hiệu góc (pha):");

        jLabel19.setText("Tọa độ cực:");

        jLabel20.setText("Số phức:");

        jLabel21.setText("Tọa độ Descartes:");

        complexNumberLabel.setToolTipText("");

        jLabel23.setText("Dạng mũ:");

        alertLabel.setForeground(new java.awt.Color(255, 51, 51));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel32.setText("z=a+bi");

        javax.swing.GroupLayout mode1Layout = new javax.swing.GroupLayout(mode1);
        mode1.setLayout(mode1Layout);
        mode1Layout.setHorizontalGroup(
            mode1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mode1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(mode1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mode1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(mode1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mode1Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(complexNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mode1Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(phasorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mode1Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(polarFormLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mode1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(modulusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(mode1Layout.createSequentialGroup()
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(expFormLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(mode1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(mode1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mode1Layout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(getImagLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(mode1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(getRealLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(argumentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(mode1Layout.createSequentialGroup()
                        .addGroup(mode1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(mode1Layout.createSequentialGroup()
                                .addComponent(calcMode1Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(alertLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mode1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(real1Mode1Input, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imag1Mode1Input, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        mode1Layout.setVerticalGroup(
            mode1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mode1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mode1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(real1Mode1Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(imag1Mode1Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mode1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calcMode1Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alertLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(16, 16, 16)
                .addGroup(mode1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(complexNumberLabel))
                .addGap(16, 16, 16)
                .addGroup(mode1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(phasorLabel))
                .addGap(16, 16, 16)
                .addGroup(mode1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(polarFormLabel))
                .addGap(16, 16, 16)
                .addGroup(mode1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(expFormLabel))
                .addGap(16, 16, 16)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modulusLabel)
                .addGap(10, 10, 10)
                .addComponent(argumentLabel)
                .addGap(16, 16, 16)
                .addComponent(jLabel21)
                .addGap(16, 16, 16)
                .addGroup(mode1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(getRealLabel))
                .addGap(12, 12, 12)
                .addGroup(mode1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(getImagLabel))
                .addGap(0, 43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 769, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mode1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mode1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void calcMode1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcMode1BtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calcMode1BtnActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alertLabel;
    private javax.swing.JLabel argumentLabel;
    private javax.swing.JButton calcMode1Btn;
    private javax.swing.JLabel complexNumberLabel;
    private javax.swing.JLabel expFormLabel;
    private javax.swing.JLabel getImagLabel;
    private javax.swing.JLabel getRealLabel;
    private javax.swing.JTextField imag1Mode1Input;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel mode1;
    private javax.swing.JLabel modulusLabel;
    private javax.swing.JLabel phasorLabel;
    private javax.swing.JLabel polarFormLabel;
    private javax.swing.JTextField real1Mode1Input;
    // End of variables declaration//GEN-END:variables

  
}