package Projects;

import java.awt.Event;
import javax.swing.JOptionPane;

public class Waka2 extends javax.swing.JFrame {

 
    public Waka2() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        WakaBerry = new javax.swing.JPanel();
        lblHeading = new javax.swing.JLabel();
        lblFlavour = new javax.swing.JLabel();
        btnChocolate = new javax.swing.JCheckBox();
        btnMB = new javax.swing.JCheckBox();
        btnVanila = new javax.swing.JCheckBox();
        btnStraw = new javax.swing.JCheckBox();
        btnBubble = new javax.swing.JCheckBox();
        lblTopings = new javax.swing.JLabel();
        btnSprinkles = new javax.swing.JCheckBox();
        btnOreo = new javax.swing.JCheckBox();
        btnSour = new javax.swing.JCheckBox();
        btnJelly = new javax.swing.JCheckBox();
        btnChocChips = new javax.swing.JCheckBox();
        lblWeight = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCost = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        jTextPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.SE_RESIZE_CURSOR));
        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        WakaBerry.setBackground(new java.awt.Color(204, 0, 102));
        WakaBerry.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 102, 255), new java.awt.Color(204, 102, 255), new java.awt.Color(204, 51, 255), new java.awt.Color(204, 102, 255)));
        WakaBerry.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        lblHeading.setBackground(new java.awt.Color(255, 255, 255));
        lblHeading.setFont(new java.awt.Font("Juice ITC", 1, 24)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(255, 255, 255));
        lblHeading.setText("WELOCOME TO WAKABERRY");
        lblHeading.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 153, 255)));

        lblFlavour.setFont(new java.awt.Font("Kristen ITC", 1, 11)); // NOI18N
        lblFlavour.setForeground(new java.awt.Color(255, 255, 255));
        lblFlavour.setText("Flavour:");

        btnChocolate.setBackground(new java.awt.Color(255, 255, 255));
        btnChocolate.setFont(new java.awt.Font("Shonar Bangla", 0, 14)); // NOI18N
        btnChocolate.setForeground(new java.awt.Color(204, 0, 153));
        btnChocolate.setText("Chocolate");

        btnMB.setFont(new java.awt.Font("Shonar Bangla", 0, 14)); // NOI18N
        btnMB.setForeground(new java.awt.Color(204, 0, 153));
        btnMB.setText("Mixed berry");

        btnVanila.setFont(new java.awt.Font("Shonar Bangla", 0, 14)); // NOI18N
        btnVanila.setForeground(new java.awt.Color(204, 0, 153));
        btnVanila.setText("Vanilla");

        btnStraw.setFont(new java.awt.Font("Shonar Bangla", 0, 14)); // NOI18N
        btnStraw.setForeground(new java.awt.Color(204, 0, 153));
        btnStraw.setText("Strawberry");

        btnBubble.setFont(new java.awt.Font("Shonar Bangla", 0, 14)); // NOI18N
        btnBubble.setForeground(new java.awt.Color(204, 0, 153));
        btnBubble.setText("Bubblegum");

        lblTopings.setFont(new java.awt.Font("Kristen ITC", 1, 11)); // NOI18N
        lblTopings.setForeground(new java.awt.Color(255, 255, 255));
        lblTopings.setText("Topings:");

        btnSprinkles.setFont(new java.awt.Font("Shonar Bangla", 0, 14)); // NOI18N
        btnSprinkles.setForeground(new java.awt.Color(102, 0, 102));
        btnSprinkles.setText("Sprinkles");

        btnOreo.setFont(new java.awt.Font("Shonar Bangla", 0, 14)); // NOI18N
        btnOreo.setForeground(new java.awt.Color(102, 0, 102));
        btnOreo.setText("Oreo Crumbs");

        btnSour.setFont(new java.awt.Font("Shonar Bangla", 0, 14)); // NOI18N
        btnSour.setForeground(new java.awt.Color(102, 0, 102));
        btnSour.setText("Sour worms");

        btnJelly.setFont(new java.awt.Font("Shonar Bangla", 0, 14)); // NOI18N
        btnJelly.setForeground(new java.awt.Color(102, 0, 102));
        btnJelly.setText("Jelly Babies");

        btnChocChips.setFont(new java.awt.Font("Shonar Bangla", 0, 14)); // NOI18N
        btnChocChips.setForeground(new java.awt.Color(102, 0, 102));
        btnChocChips.setText("Choc Chips");

        lblWeight.setFont(new java.awt.Font("Kristen ITC", 1, 11)); // NOI18N
        lblWeight.setForeground(new java.awt.Color(255, 255, 255));
        lblWeight.setText("Weight:");

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cost:");

        btnSubmit.setBackground(new java.awt.Color(255, 0, 255));
        btnSubmit.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(153, 0, 153));
        btnSubmit.setText("Submit");

        btnClear.setBackground(new java.awt.Color(255, 0, 255));
        btnClear.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        btnClear.setForeground(new java.awt.Color(153, 0, 153));
        btnClear.setText("Clear");

        javax.swing.GroupLayout WakaBerryLayout = new javax.swing.GroupLayout(WakaBerry);
        WakaBerry.setLayout(WakaBerryLayout);
        WakaBerryLayout.setHorizontalGroup(
            WakaBerryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WakaBerryLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(WakaBerryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WakaBerryLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnChocolate)
                        .addGap(18, 18, 18)
                        .addComponent(btnStraw)
                        .addGap(83, 83, 83))
                    .addGroup(WakaBerryLayout.createSequentialGroup()
                        .addGroup(WakaBerryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblHeading)
                            .addGroup(WakaBerryLayout.createSequentialGroup()
                                .addComponent(lblFlavour, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMB)
                                .addGap(18, 18, 18)
                                .addComponent(btnVanila, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnBubble)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(WakaBerryLayout.createSequentialGroup()
                .addGroup(WakaBerryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WakaBerryLayout.createSequentialGroup()
                        .addGroup(WakaBerryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(WakaBerryLayout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(btnJelly)
                                .addGap(29, 29, 29)
                                .addComponent(btnChocChips))
                            .addGroup(WakaBerryLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(WakaBerryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(WakaBerryLayout.createSequentialGroup()
                                        .addComponent(lblTopings, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSprinkles)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnOreo)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSour))
                                    .addGroup(WakaBerryLayout.createSequentialGroup()
                                        .addGroup(WakaBerryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblWeight)
                                            .addComponent(jLabel1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(WakaBerryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtWeight, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                            .addComponent(txtCost))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(WakaBerryLayout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addGroup(WakaBerryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        WakaBerryLayout.setVerticalGroup(
            WakaBerryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WakaBerryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(WakaBerryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFlavour, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMB)
                    .addComponent(btnVanila, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBubble))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(WakaBerryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChocolate)
                    .addComponent(btnStraw))
                .addGap(18, 18, 18)
                .addGroup(WakaBerryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTopings, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSprinkles)
                    .addComponent(btnOreo)
                    .addComponent(btnSour))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(WakaBerryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnJelly)
                    .addComponent(btnChocChips))
                .addGap(18, 18, 18)
                .addGroup(WakaBerryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeight)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmit))
                .addGap(18, 18, 18)
                .addGroup(WakaBerryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(WakaBerry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(WakaBerry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WakaberryForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel WakaBerry;
    private javax.swing.JCheckBox btnBubble;
    private javax.swing.JCheckBox btnChocChips;
    private javax.swing.JCheckBox btnChocolate;
    private javax.swing.JButton btnClear;
    private javax.swing.JCheckBox btnJelly;
    private javax.swing.JCheckBox btnMB;
    private javax.swing.JCheckBox btnOreo;
    private javax.swing.JCheckBox btnSour;
    private javax.swing.JCheckBox btnSprinkles;
    private javax.swing.JCheckBox btnStraw;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JCheckBox btnVanila;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lblFlavour;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblTopings;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
    

    @Override
    public boolean action(Event evt, Object what) {
        btnSubmit(); 
        return super.action(evt, what); //To change body of generated methods, choose Tools | Templates.
    }
    private void btnSubmit() {
        
        final double MB = 12; 
        final double STRAW = 10; 
        final double VANILA = 10; 
        final double CHOCOLATE = 11; 
        final double BUBBLE = 12; 
        
        final double CHOCCHIPS = 7; 
        final double JELLY = 7; 
        final double OREO = 5; 
        final double SOUR = 4; 
        final double SPRINKLES = 2; 
       JOptionPane.showMessageDialog(null, "Dont be greedy choose one Flavour and one Toping!!!");  
        if (btnMB.isSelected()==true&&btnSprinkles.isSelected()){
        JOptionPane.showMessageDialog(null, "You have Chosen:" + btnMB + " " + "The price is:" + MB);
        } else 
        if (btnStraw.isSelected()==true&&btnStraw.isSelected()==true){
        JOptionPane.showMessageDialog(null, "You have Chosen:" + btnStraw + " " + "The price is:" + STRAW);
        }else 
        if (btnVanila.isSelected()==true&&btnVanila.isSelected()==true){
        JOptionPane.showMessageDialog(null, "You have Chosen:" + btnVanila + " " + "The price is:" + VANILA);
        }else 
        if (btnChocolate.isSelected()==true&&btnChocolate.isSelected()==true){
        JOptionPane.showMessageDialog(null, "You have Chosen:" + btnChocolate + " " + "The price is:" + CHOCOLATE);
        }else 
        if (btnBubble.isSelected()==true&&btnBubble.isSelected()==true){
        JOptionPane.showMessageDialog(null, "You have Chosen:" + btnBubble + " " + "The price is:" + BUBBLE);
        }else
        if (btnChocChips.isSelected()==true&&btnChocChips.isSelected()==true){
        JOptionPane.showMessageDialog(null, "You have Chosen:" + btnChocChips + " " + "The price is:" + CHOCCHIPS);
        }else
        if (btnJelly.isSelected()==true&&btnJelly.isSelected()==true){
        JOptionPane.showMessageDialog(null, "You have Chosen:" + btnJelly + " " + "The price is:" + JELLY);
        }else    
        if (btnOreo.isSelected()==true&&btnOreo.isSelected()==true){
        JOptionPane.showMessageDialog(null, "You have Chosen:" + btnOreo + " " + "The price is:" + OREO);
        }else
        if (btnSour.isSelected()==true&&btnSour.isSelected()==true){
        JOptionPane.showMessageDialog(null, "You have Chosen:" + btnSour + " " + "The price is:" + SOUR);
        }else
         if (btnSprinkles.isSelected()==true&&btnSprinkles.isSelected()==true){
        JOptionPane.showMessageDialog(null, "You have Chosen:" + btnSprinkles + " " + "The price is:" + SPRINKLES);
        }
           
    }
}

