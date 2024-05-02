package Calculadora;

public class Screen extends javax.swing.JFrame {

    private double num1, num2;
    private Operations operations;
    private String sign;

    public Screen() {

        setUndecorated(false);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        operations = new Operations(0, 0);
        operations.setNum1(num1);
        operations.setNum2(num2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnAc = new javax.swing.JButton();
        btnExponentiation = new javax.swing.JButton();
        btnPercentage = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btnMultiplication = new javax.swing.JButton();
        btnComma = new javax.swing.JButton();
        btnEquals = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtLcd = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(12, 12, 12));

        jPanel2.setBackground(new java.awt.Color(12, 12, 12));

        btnAc.setBackground(new java.awt.Color(12, 12, 12));
        btnAc.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnAc.setForeground(new java.awt.Color(255, 255, 255));
        btnAc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AC (2).png"))); // NOI18N
        btnAc.setText("AC"); // NOI18N
        btnAc.setBorder(null);
        btnAc.setBorderPainted(false);
        btnAc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAc.setMaximumSize(new java.awt.Dimension(50, 50));
        btnAc.setMinimumSize(new java.awt.Dimension(50, 50));
        btnAc.setPreferredSize(new java.awt.Dimension(80, 80));
        btnAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcActionPerformed(evt);
            }
        });

        btnExponentiation.setBackground(new java.awt.Color(12, 12, 12));
        btnExponentiation.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnExponentiation.setForeground(new java.awt.Color(255, 255, 255));
        btnExponentiation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Operator.png"))); // NOI18N
        btnExponentiation.setText("^");
        btnExponentiation.setBorder(null);
        btnExponentiation.setBorderPainted(false);
        btnExponentiation.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnExponentiation.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExponentiation.setMaximumSize(new java.awt.Dimension(50, 50));
        btnExponentiation.setMinimumSize(new java.awt.Dimension(50, 50));
        btnExponentiation.setPreferredSize(new java.awt.Dimension(80, 80));
        btnExponentiation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExponentiationActionPerformed(evt);
            }
        });

        btnPercentage.setBackground(new java.awt.Color(12, 12, 12));
        btnPercentage.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnPercentage.setForeground(new java.awt.Color(255, 255, 255));
        btnPercentage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Operator.png"))); // NOI18N
        btnPercentage.setText("%");
        btnPercentage.setBorder(null);
        btnPercentage.setBorderPainted(false);
        btnPercentage.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPercentage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPercentage.setMaximumSize(new java.awt.Dimension(50, 50));
        btnPercentage.setMinimumSize(new java.awt.Dimension(50, 50));
        btnPercentage.setPreferredSize(new java.awt.Dimension(80, 80));
        btnPercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPercentageActionPerformed(evt);
            }
        });

        btnDivide.setBackground(new java.awt.Color(12, 12, 12));
        btnDivide.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnDivide.setForeground(new java.awt.Color(255, 255, 255));
        btnDivide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Operator.png"))); // NOI18N
        btnDivide.setText("÷");
        btnDivide.setBorder(null);
        btnDivide.setBorderPainted(false);
        btnDivide.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDivide.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDivide.setMaximumSize(new java.awt.Dimension(50, 50));
        btnDivide.setMinimumSize(new java.awt.Dimension(50, 50));
        btnDivide.setPreferredSize(new java.awt.Dimension(80, 80));
        btnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivideActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(12, 12, 12));
        btn1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Numbers.png"))); // NOI18N
        btn1.setText("1");
        btn1.setBorderPainted(false);
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1.setMaximumSize(new java.awt.Dimension(50, 50));
        btn1.setMinimumSize(new java.awt.Dimension(50, 50));
        btn1.setPreferredSize(new java.awt.Dimension(80, 80));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btnPlus.setBackground(new java.awt.Color(12, 12, 12));
        btnPlus.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnPlus.setForeground(new java.awt.Color(255, 255, 255));
        btnPlus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Operator.png"))); // NOI18N
        btnPlus.setText("+");
        btnPlus.setBorder(null);
        btnPlus.setBorderPainted(false);
        btnPlus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPlus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPlus.setMaximumSize(new java.awt.Dimension(50, 50));
        btnPlus.setMinimumSize(new java.awt.Dimension(50, 50));
        btnPlus.setPreferredSize(new java.awt.Dimension(80, 80));
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(12, 12, 12));
        btn7.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Numbers.png"))); // NOI18N
        btn7.setText("7");
        btn7.setBorderPainted(false);
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn7.setMaximumSize(new java.awt.Dimension(50, 50));
        btn7.setMinimumSize(new java.awt.Dimension(50, 50));
        btn7.setPreferredSize(new java.awt.Dimension(80, 80));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(12, 12, 12));
        btn4.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Numbers.png"))); // NOI18N
        btn4.setText("4");
        btn4.setBorderPainted(false);
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn4.setMaximumSize(new java.awt.Dimension(50, 50));
        btn4.setMinimumSize(new java.awt.Dimension(50, 50));
        btn4.setPreferredSize(new java.awt.Dimension(80, 80));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(12, 12, 12));
        btn6.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Numbers.png"))); // NOI18N
        btn6.setText("6");
        btn6.setBorderPainted(false);
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn6.setMaximumSize(new java.awt.Dimension(50, 50));
        btn6.setMinimumSize(new java.awt.Dimension(50, 50));
        btn6.setPreferredSize(new java.awt.Dimension(80, 80));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(12, 12, 12));
        btn8.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Numbers.png"))); // NOI18N
        btn8.setText("8");
        btn8.setBorderPainted(false);
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn8.setMaximumSize(new java.awt.Dimension(50, 50));
        btn8.setMinimumSize(new java.awt.Dimension(50, 50));
        btn8.setPreferredSize(new java.awt.Dimension(80, 80));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btnMultiplication.setBackground(new java.awt.Color(12, 12, 12));
        btnMultiplication.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnMultiplication.setForeground(new java.awt.Color(255, 255, 255));
        btnMultiplication.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Operator.png"))); // NOI18N
        btnMultiplication.setText("×");
        btnMultiplication.setBorder(null);
        btnMultiplication.setBorderPainted(false);
        btnMultiplication.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMultiplication.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMultiplication.setMaximumSize(new java.awt.Dimension(50, 50));
        btnMultiplication.setMinimumSize(new java.awt.Dimension(50, 50));
        btnMultiplication.setPreferredSize(new java.awt.Dimension(80, 80));
        btnMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicationActionPerformed(evt);
            }
        });

        btnComma.setBackground(new java.awt.Color(12, 12, 12));
        btnComma.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnComma.setForeground(new java.awt.Color(255, 255, 255));
        btnComma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Numbers.png"))); // NOI18N
        btnComma.setText(",");
        btnComma.setBorderPainted(false);
        btnComma.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnComma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnComma.setMaximumSize(new java.awt.Dimension(50, 50));
        btnComma.setMinimumSize(new java.awt.Dimension(50, 50));
        btnComma.setPreferredSize(new java.awt.Dimension(80, 80));
        btnComma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommaActionPerformed(evt);
            }
        });

        btnEquals.setBackground(new java.awt.Color(12, 12, 12));
        btnEquals.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnEquals.setForeground(new java.awt.Color(255, 255, 255));
        btnEquals.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Operator.png"))); // NOI18N
        btnEquals.setText("=");
        btnEquals.setBorder(null);
        btnEquals.setBorderPainted(false);
        btnEquals.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEquals.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEquals.setMaximumSize(new java.awt.Dimension(50, 50));
        btnEquals.setMinimumSize(new java.awt.Dimension(50, 50));
        btnEquals.setPreferredSize(new java.awt.Dimension(80, 80));
        btnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualsActionPerformed(evt);
            }
        });

        btnMinus.setBackground(new java.awt.Color(12, 12, 12));
        btnMinus.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnMinus.setForeground(new java.awt.Color(255, 255, 255));
        btnMinus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Operator.png"))); // NOI18N
        btnMinus.setText("−");
        btnMinus.setBorder(null);
        btnMinus.setBorderPainted(false);
        btnMinus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMinus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMinus.setMaximumSize(new java.awt.Dimension(50, 50));
        btnMinus.setMinimumSize(new java.awt.Dimension(50, 50));
        btnMinus.setPreferredSize(new java.awt.Dimension(80, 80));
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(12, 12, 12));
        btn3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Numbers.png"))); // NOI18N
        btn3.setText("3");
        btn3.setBorderPainted(false);
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn3.setMaximumSize(new java.awt.Dimension(50, 50));
        btn3.setMinimumSize(new java.awt.Dimension(50, 50));
        btn3.setPreferredSize(new java.awt.Dimension(80, 80));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(12, 12, 12));
        btn9.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Numbers.png"))); // NOI18N
        btn9.setText("9");
        btn9.setBorderPainted(false);
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn9.setMaximumSize(new java.awt.Dimension(50, 50));
        btn9.setMinimumSize(new java.awt.Dimension(50, 50));
        btn9.setPreferredSize(new java.awt.Dimension(80, 80));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(12, 12, 12));
        btn5.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Numbers.png"))); // NOI18N
        btn5.setText("5");
        btn5.setBorderPainted(false);
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn5.setMaximumSize(new java.awt.Dimension(50, 50));
        btn5.setMinimumSize(new java.awt.Dimension(50, 50));
        btn5.setPreferredSize(new java.awt.Dimension(80, 80));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(12, 12, 12));
        btn2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Numbers.png"))); // NOI18N
        btn2.setText("2");
        btn2.setBorderPainted(false);
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.setMaximumSize(new java.awt.Dimension(50, 50));
        btn2.setMinimumSize(new java.awt.Dimension(50, 50));
        btn2.setPreferredSize(new java.awt.Dimension(80, 80));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(12, 12, 12));
        btn0.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Numbers.png"))); // NOI18N
        btn0.setText("0");
        btn0.setBorderPainted(false);
        btn0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn0.setMaximumSize(new java.awt.Dimension(50, 50));
        btn0.setMinimumSize(new java.awt.Dimension(50, 50));
        btn0.setPreferredSize(new java.awt.Dimension(80, 80));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExponentiation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(btnPercentage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnComma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMultiplication, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMinus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEquals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExponentiation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPercentage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDivide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMultiplication, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMinus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPlus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnComma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEquals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(46, 47, 52));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        txtLcd.setBackground(new java.awt.Color(46, 47, 52));
        txtLcd.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        txtLcd.setForeground(new java.awt.Color(255, 255, 255));
        txtLcd.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtLcd.setBorder(null);
        txtLcd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLcdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtLcd)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtLcd, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualsActionPerformed
        this.num2 = Double.parseDouble(this.txtLcd.getText());
        switch (this.sign) {
            case "+":
                this.txtLcd.setText(Double.toString(operations.addition(num1, num2)));
                break;

            case "-":
                this.txtLcd.setText(Double.toString(operations.subtraction(num1, num2)));
                break;

            case "*":
                this.txtLcd.setText(Double.toString(operations.multiplication(num1, num2)));
                break;

            case "/":
                this.txtLcd.setText(Double.toString(operations.division(num1, num2)));
            
            case "^": 
                this.txtLcd.setText(Double.toString(operations.exponentiation(num1, num2)));
                break;
            case "%":
                this.txtLcd.setText(Double.toString(operations.percentage(num1, num2)));
                break;    
        }
    }//GEN-LAST:event_btnEqualsActionPerformed

    private void btnCommaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommaActionPerformed
        this.txtLcd.setText(this.txtLcd.getText()+".");
    }//GEN-LAST:event_btnCommaActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        this.txtLcd.setText(this.txtLcd.getText() + "0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        this.num1 = Double.parseDouble(this.txtLcd.getText());
        this.sign = "+";
        this.txtLcd.setText("");
    }//GEN-LAST:event_btnPlusActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        this.txtLcd.setText(this.txtLcd.getText() + "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        this.txtLcd.setText(this.txtLcd.getText()+"2");    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        this.txtLcd.setText(this.txtLcd.getText() + "1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        this.num1 = Double.parseDouble(this.txtLcd.getText());
        this.sign = "-";
        this.txtLcd.setText("");
    }//GEN-LAST:event_btnMinusActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        this.txtLcd.setText(this.txtLcd.getText() + "6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        this.txtLcd.setText(this.txtLcd.getText() + "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        this.txtLcd.setText(this.txtLcd.getText() + "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btnMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicationActionPerformed
        this.num1 = Double.parseDouble(this.txtLcd.getText());
        this.sign = "*";
        this.txtLcd.setText("");
    }//GEN-LAST:event_btnMultiplicationActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        this.txtLcd.setText(this.txtLcd.getText() + "9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        this.txtLcd.setText(this.txtLcd.getText() + "8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        this.txtLcd.setText(this.txtLcd.getText() + "7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivideActionPerformed
        this.num1 = Double.parseDouble(this.txtLcd.getText());
        this.sign = "/";
        this.txtLcd.setText("");
    }//GEN-LAST:event_btnDivideActionPerformed

    private void btnPercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPercentageActionPerformed
        this.num1 = Float.parseFloat(this.txtLcd.getText());
        this.sign = "%";
        this.txtLcd.setText("");
    }//GEN-LAST:event_btnPercentageActionPerformed

    private void btnExponentiationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExponentiationActionPerformed
        this.num1 = Double.parseDouble(this.txtLcd.getText());
        this.sign = "^";
        this.txtLcd.setText("");
    }//GEN-LAST:event_btnExponentiationActionPerformed

    private void btnAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcActionPerformed
        this.txtLcd.setText("");
        this.operations.setNum1(0);
        this.operations.setNum2(0);
    }//GEN-LAST:event_btnAcActionPerformed

    private void txtLcdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLcdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLcdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAc;
    private javax.swing.JButton btnComma;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnEquals;
    private javax.swing.JButton btnExponentiation;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMultiplication;
    private javax.swing.JButton btnPercentage;
    private javax.swing.JButton btnPlus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtLcd;
    // End of variables declaration//GEN-END:variables
}
