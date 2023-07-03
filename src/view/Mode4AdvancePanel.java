
package view;

import controller.Mode4AdvanceController;
import model.ComplexNumber;

public class Mode4AdvancePanel extends javax.swing.JPanel {
   
    private final Mode4AdvanceController controller;
    private Mode4AdvancePanel view;
    private final ComplexNumber model;
    /**
     * Creates new form Mode4AdvancePanel
     */
    public Mode4AdvancePanel() {
        initComponents();
        model=new ComplexNumber();
        controller=new Mode4AdvanceController(this, model);
        calcMode4Btn.addActionListener(controller);
    }
    
     public double getRealValueMode4(){
        return Double.parseDouble(real1Mode4Input.getText());
    }
    
    public double getImagValueMode4(){
        return Double.parseDouble(imag1Mode4Input.getText());
    }
    
    public int getExplValueMode4(){
        return Integer.parseInt(exp1Mode4Input.getText());
    }

    public void alert(String text){
        alert1Mode4Label.setText(text);
    }
    public void setLabel1(String text) {
        z1Mode4Label.setText(text);
    }
    
    public void setLabel2(String text) {
        z2Mode4Label.setText(text);
    }
    
    public void setLabel3(String text) {
        z3Mode4Label.setText(text);
    }
    
    public void setLabel4(String text) {
        z4Mode4Label.setText(text);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel37 = new javax.swing.JLabel();
        z4Mode4Label = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        z3Mode4Label = new javax.swing.JLabel();
        z2Mode4Label = new javax.swing.JLabel();
        z1Mode4Label = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        calcMode4Btn = new javax.swing.JButton();
        exp1Mode4Input = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        imag1Mode4Input = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        alert1Mode4Label = new javax.swing.JLabel();
        real1Mode4Input = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();

        jLabel37.setText("Nhập phần thực (a)");

        jLabel36.setFont(new java.awt.Font("SansSerif", 2, 14)); // NOI18N
        jLabel36.setText("z=a+bi. Tính căn bậc mũ n của z ?");

        jLabel40.setText("---------------------------------------------------------------------------------------------------------");

        calcMode4Btn.setText("Tính toán");

        exp1Mode4Input.setText("5");

        jLabel39.setText("Nhập căn bậc n");

        imag1Mode4Input.setText("4");

        jLabel38.setText("Nhập phần ảo (b)");

        alert1Mode4Label.setForeground(new java.awt.Color(255, 51, 51));

        real1Mode4Input.setText("3");

        jLabel35.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel35.setText("Khai căn bậc cao số phức");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imag1Mode4Input, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(exp1Mode4Input, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(calcMode4Btn)
                                .addGap(18, 18, 18)
                                .addComponent(alert1Mode4Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(real1Mode4Input, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1Mode4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2Mode4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z4Mode4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z3Mode4Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(real1Mode4Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(imag1Mode4Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(exp1Mode4Input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcMode4Btn)
                    .addComponent(alert1Mode4Label))
                .addGap(18, 18, 18)
                .addComponent(jLabel40)
                .addGap(18, 18, 18)
                .addComponent(z1Mode4Label)
                .addGap(24, 24, 24)
                .addComponent(z2Mode4Label)
                .addGap(24, 24, 24)
                .addComponent(z3Mode4Label)
                .addGap(24, 24, 24)
                .addComponent(z4Mode4Label)
                .addContainerGap(177, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alert1Mode4Label;
    private javax.swing.JButton calcMode4Btn;
    private javax.swing.JTextField exp1Mode4Input;
    private javax.swing.JTextField imag1Mode4Input;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JTextField real1Mode4Input;
    private javax.swing.JLabel z1Mode4Label;
    private javax.swing.JLabel z2Mode4Label;
    private javax.swing.JLabel z3Mode4Label;
    private javax.swing.JLabel z4Mode4Label;
    // End of variables declaration//GEN-END:variables
}