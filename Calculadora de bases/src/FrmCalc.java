
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pichau
 */
public class FrmCalc extends javax.swing.JFrame {

    /**
     * Creates new form FrmCalc
     */
    public FrmCalc() {
        initComponents();
        
        
        Panel1.setUI(new PanelFormUI(100, 160, 180, 90, 85, 140));
    }
    
    
     public String decimalToHexadecimal(int number) {

        List<String> vet = new ArrayList<String>();
        StringBuilder result = new StringBuilder();

        do {
            if (number % 16 < 10) {
                String aux = "" + number % 16;
                vet.add(aux);
            } else {
                switch (number % 16) {
                    case 10 :
                        vet.add("A");
                        break;
                    case 11:
                        vet.add("B");
                        break;
                    case 12:
                        vet.add("C");
                        break;
                    case 13:
                        vet.add("D");
                        break;
                    case 14:
                        vet.add("E");
                        break;
                    case 15:
                        vet.add("F");
                        break;
                }
            }
            number = (int) number / 16;
        } while (number != 0);

        for (int i = vet.size() - 1; i >= 0; i--)
            result.append(vet.get(i));

        return String.format("%s", result);
    }
    
     
     public String hexadecimalToDecimal(String hexa) {

        int size = hexa.length();
        int result = 0;

        for (int i = 0; i < hexa.length(); i++) {
            switch (hexa.charAt(i)) {
                case '1':
                    result += (1 * Math.pow(16, --size));
                    break;
                case '2':
                    result += (2 * Math.pow(16, --size));
                    break;
                case '3':
                    result += (3 * Math.pow(16, --size));
                    break;
                case '4':
                    result += (4 * Math.pow(16, --size));
                    break;
                case '5':
                    result += (5 * Math.pow(16, --size));
                    break;
                case '6':
                    result += (6 * Math.pow(16, --size));
                    break;
                case '7':
                    result += (7 * Math.pow(16, --size));
                    break;
                case '8':
                    result += (8 * Math.pow(16, --size));
                    break;
                case '9':
                    result += (9 * Math.pow(16, --size));
                    break;
                case 'A':
                    result += (10 * Math.pow(16, --size));
                    break;
                case 'B':
                    result += (11 * Math.pow(16, --size));
                    break;
                case 'C':
                    result += (12 * Math.pow(16, --size));
                    break;
                case 'D':
                    result += (13 * Math.pow(16, --size));
                    break;
                case 'E':
                    result += (14 * Math.pow(16, --size));
                    break;
                case 'F':
                    result += (15 * Math.pow(16, --size));
            }
        }

        return String.valueOf(result);
    }
     
     
     public String demaisToDecimal(String dema, int base){
         int resul = 0;
         
         int posi = dema.length() - 1;
         
         int num = 0;
         for(int i = 0;i < dema.length();i++){
             try{
             num = Character.getNumericValue(dema.charAt(i));
             } catch(Exception ex){
                 switch(dema.charAt(i)){
                     case 'A':
                         num = 10;
                     break;
                     case 'B':
                         num = 11;
                     break;
                     case 'C':
                         num = 12;
                     break;
                     case 'D':
                         num = 13;
                     break;
                     case 'E':
                         num = 14;
                     break;
                     case 'F':
                         num = 15;
                     break;
                 }
             }
             resul +=  num * Math.pow(base, posi--);
         }
         
         return String.valueOf(resul);
     }
     
     
     public String decimalToDemais(int number, int base) {

        List<String> vet = new ArrayList<String>();
        StringBuilder result = new StringBuilder();
        
        //váriavel auxiliar (armazenara os dados para reverter dps)
        String aux = "";
        
        do {
            if(number % base < 10){
                aux = "" + number % base;
            } else {
                switch(number % base){
                    case 10:
                        aux = "A";
                        break;
                        case 11:
                        aux = "B";
                        break;
                        case 12:
                        aux = "C";
                        break;
                        case 13:
                        aux = "D";
                        break;
                        case 14:
                        aux = "E";
                        break;
                        case 15:
                        aux = "F";
                }
                 
            }
                vet.add(aux);
                number = (int) number / base;
        } while (number >= base - 1);
        
        if (number > 0){
            aux = "" + number;
            vet.add(aux);
        }

        for (int i = vet.size() - 1; i >= 0; i--)
            result.append(vet.get(i));

        return String.format("%s", result);
    }
    
     
     
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CboB1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        CboB2 = new javax.swing.JComboBox<>();
        TxtNume = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        LblResul = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel1.setText("Base");

        CboB1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        CboB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BIN", "PEN", "HEP", "OCT", "DEC", "DOD", "HEX" }));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel2.setText("para");

        CboB2.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        CboB2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BIN", "PEN", "HEP", "OCT", "DEC", "DOD", "HEX" }));

        TxtNume.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/limpar.png"))); // NOI18N
        jButton1.setText("Converter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        LblResul.setEditable(false);
        LblResul.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtNume)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CboB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(CboB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblResul)
                .addContainerGap())
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CboB1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(CboB2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(TxtNume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addGap(35, 35, 35)
                .addComponent(LblResul, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String num = TxtNume.getText().trim();
        if (CboB1.getSelectedItem().equals("BIN") && (CboB2.getSelectedItem().equals("DEC"))){
            try{
                LblResul.setText(String.valueOf(Integer.parseInt(num, 2))); // ou demaisToDecimal(num, 2)
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        }

        else if (CboB1.getSelectedItem().equals("DEC") && (CboB2.getSelectedItem().equals("BIN"))){
            try{
                LblResul.setText(String.valueOf(Integer.toBinaryString(Integer.parseInt(num))));

                /* ou int numr = Integer.parseInt(num);
                String resul = "";
                while (numr > 0){
                    resul = resul + String.valueOf(numr % 2);
                    numr = numr / 2;
                }
                String resulf = new StringBuilder(resul).reverse().toString();
                LblResul.setText(resulf);

                */
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        }

        else if (CboB1.getSelectedItem().equals("HEX") && (CboB2.getSelectedItem().equals("DEC"))){
            try{
                //LblResul.setText(String.valueOf(Integer.parseInt(num, 16)));

                LblResul.setText(hexadecimalToDecimal(num));

            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        }

        else if (CboB1.getSelectedItem().equals("DEC") && (CboB2.getSelectedItem().equals("HEX"))){
            try{
                //LblResul.setText(String.valueOf(Integer.toHexString(Integer.parseInt(num))));

                LblResul.setText(decimalToDemais(Integer.parseInt(num), 16));

            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        } else if (CboB1.getSelectedItem().equals("BIN") && (CboB2.getSelectedItem().equals("HEX"))){
            try{
                int dec = Integer.parseInt(num, 2);
                LblResul.setText(decimalToHexadecimal(dec));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        } else if (CboB1.getSelectedItem().equals("HEX") && (CboB2.getSelectedItem().equals("BIN"))){
            try{
                int dec = Integer.parseInt(num, 16);
                LblResul.setText(String.valueOf(Integer.toBinaryString(dec)));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        } else if (CboB1.getSelectedItem().equals("PEN") && (CboB2.getSelectedItem().equals("DEC"))){
            try{
                LblResul.setText(demaisToDecimal(num, 5));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        } else if (CboB1.getSelectedItem().equals("PEN") && (CboB2.getSelectedItem().equals("HEX"))){
            try{
                LblResul.setText(String.valueOf(decimalToHexadecimal(Integer.parseInt(demaisToDecimal(num, 5)))));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, ex, "Erro", 2);
            }
        } else if (CboB1.getSelectedItem().equals("PEN") && (CboB2.getSelectedItem().equals("BIN"))){
            try{
                LblResul.setText(String.valueOf(Integer.toBinaryString(Integer.parseInt(demaisToDecimal(num, 5)))));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, ex, "Erro", 2);
            }
        } else if (CboB1.getSelectedItem().equals("PEN") && (CboB2.getSelectedItem().equals("HEP"))){
            try{
                LblResul.setText(String.valueOf(decimalToDemais(Integer.parseInt(demaisToDecimal(num, 5)), 7)));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, ex, "Erro", 2);
            }
        } else if (CboB1.getSelectedItem().equals("PEN") && (CboB2.getSelectedItem().equals("OCT"))){
            try{
                LblResul.setText(String.valueOf(decimalToDemais(Integer.parseInt(demaisToDecimal(num, 5)), 8)));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        } else if (CboB1.getSelectedItem().equals("DEC") && (CboB2.getSelectedItem().equals("PEN"))){
            try{
                LblResul.setText(decimalToDemais(Integer.parseInt(num), 5));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        } else if (CboB1.getSelectedItem().equals("BIN") && (CboB2.getSelectedItem().equals("PEN"))){
            try{
                LblResul.setText(decimalToDemais(Integer.parseInt(num, 2), 5));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        } else if (CboB1.getSelectedItem().equals("HEX") && (CboB2.getSelectedItem().equals("PEN"))){
            try{
                int dec = Integer.parseInt(num, 16);
                LblResul.setText(String.valueOf(decimalToDemais(dec, 5)));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        } else if (CboB1.getSelectedItem().equals("HEP") && (CboB2.getSelectedItem().equals("PEN"))){
            try{
                int dec = Integer.parseInt(num, 7);
                LblResul.setText(String.valueOf(decimalToDemais(dec, 5)));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        } else if (CboB1.getSelectedItem().equals("HEP") && (CboB2.getSelectedItem().equals("DEC"))){
            try{
                LblResul.setText(String.valueOf(demaisToDecimal(num, 7)));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        } else if (CboB1.getSelectedItem().equals("HEP") && (CboB2.getSelectedItem().equals("BIN"))){
            try{
                LblResul.setText(String.valueOf(Integer.toBinaryString(Integer.parseInt(demaisToDecimal(num, 7)))));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        } else if (CboB1.getSelectedItem().equals("HEP") && (CboB2.getSelectedItem().equals("HEX"))){
            try{
                LblResul.setText(String.valueOf(decimalToHexadecimal(Integer.parseInt(demaisToDecimal(num, 7)))));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        } else if (CboB1.getSelectedItem().equals("HEP") && (CboB2.getSelectedItem().equals("OCT"))){
            try{
                LblResul.setText(String.valueOf(decimalToDemais(Integer.parseInt(demaisToDecimal(num, 7)), 8)));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        } else if (CboB1.getSelectedItem().equals("OCT") && (CboB2.getSelectedItem().equals("DEC"))){
            try{
                LblResul.setText(String.valueOf(demaisToDecimal(num, 8)));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        } else if (CboB1.getSelectedItem().equals("OCT") && (CboB2.getSelectedItem().equals("BIN"))){
            try{
                LblResul.setText(String.valueOf(Integer.toBinaryString(Integer.parseInt(demaisToDecimal(num, 8)))));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        } else if (CboB1.getSelectedItem().equals("OCT") && (CboB2.getSelectedItem().equals("HEX"))){
            try{
                LblResul.setText(String.valueOf(decimalToHexadecimal(Integer.parseInt(demaisToDecimal(num, 8)))));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        } else if (CboB1.getSelectedItem().equals("OCT") && (CboB2.getSelectedItem().equals("HEP"))){
            try{
                LblResul.setText(String.valueOf(decimalToDemais(Integer.parseInt(demaisToDecimal(num, 8)), 7)));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        } else if (CboB1.getSelectedItem().equals("OCT") && (CboB2.getSelectedItem().equals("PEN"))){
            try{
                int dec = Integer.parseInt(num, 8);
                LblResul.setText(String.valueOf(decimalToDemais(dec, 5)));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        } else if (CboB1.getSelectedItem().equals("BIN") && (CboB2.getSelectedItem().equals("PEN"))){
            try{
                int dec = Integer.parseInt(num, 2);
                LblResul.setText(String.valueOf(decimalToDemais(dec, 5)));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        } else if (CboB1.getSelectedItem().equals("BIN") && (CboB2.getSelectedItem().equals("HEP"))){
            try{
                int dec = Integer.parseInt(num, 2);
                LblResul.setText(String.valueOf(decimalToDemais(dec, 7)));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        } else if (CboB1.getSelectedItem().equals("BIN") && (CboB2.getSelectedItem().equals("OCT"))){
            try{
                int dec = Integer.parseInt(num, 2);
                LblResul.setText(String.valueOf(decimalToDemais(dec, 8)));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        } else if (CboB1.getSelectedItem().equals("HEX") && (CboB2.getSelectedItem().equals("PEN"))){
            try{
                int dec = Integer.parseInt(num, 16);
                LblResul.setText(String.valueOf(decimalToDemais(dec, 5)));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        } else if (CboB1.getSelectedItem().equals("HEX") && (CboB2.getSelectedItem().equals("HEP"))){
            try{
                int dec = Integer.parseInt(num, 16);
                LblResul.setText(String.valueOf(decimalToDemais(dec, 7)));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        } else if (CboB1.getSelectedItem().equals("HEX") && (CboB2.getSelectedItem().equals("OCT"))){
            try{
                int dec = Integer.parseInt(num, 16);
                LblResul.setText(String.valueOf(decimalToDemais(dec, 8)));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        } else if (CboB1.getSelectedItem().equals("DEC") && (CboB2.getSelectedItem().equals("PEN"))){
            try{
                LblResul.setText(String.valueOf(decimalToDemais(Integer.parseInt(num), 5)));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        } else if (CboB1.getSelectedItem().equals("DEC") && (CboB2.getSelectedItem().equals("HEP"))){
            try{
                LblResul.setText(String.valueOf(decimalToDemais(Integer.parseInt(num), 7)));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        } else if (CboB1.getSelectedItem().equals("DEC") && (CboB2.getSelectedItem().equals("OCT"))){
            try{
                LblResul.setText(String.valueOf(decimalToDemais(Integer.parseInt(num), 8)));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        } else if (CboB1.getSelectedItem().equals("DOD") && (CboB2.getSelectedItem().equals("DEC"))){
            try{
                LblResul.setText(String.valueOf(demaisToDecimal(num, 12)));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        } else if (CboB1.getSelectedItem().equals("DEC") && (CboB2.getSelectedItem().equals("DOD"))){
            try{
                LblResul.setText(String.valueOf(decimalToDemais(Integer.parseInt(num), 12)));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        } else if (CboB1.getSelectedItem().equals("DOD") && (CboB2.getSelectedItem().equals("BIN"))){
            try{
                LblResul.setText(String.valueOf(Integer.toBinaryString(Integer.parseInt(demaisToDecimal(num, 12)))));

            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        } else if (CboB1.getSelectedItem().equals("BIN") && (CboB2.getSelectedItem().equals("DOD"))){
            try{
                LblResul.setText(String.valueOf(Integer.toBinaryString(Integer.parseInt(demaisToDecimal(num, 12)))));

            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        } else if (CboB1.getSelectedItem().equals("DOD") && (CboB2.getSelectedItem().equals("HEX"))){
            try{
                LblResul.setText(String.valueOf(decimalToHexadecimal(Integer.parseInt(demaisToDecimal(num, 12)))));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        } else if (CboB1.getSelectedItem().equals("HEX") && (CboB2.getSelectedItem().equals("DOD"))){
            try{
                LblResul.setText(String.valueOf(decimalToDemais(Integer.parseInt(hexadecimalToDecimal(num)), 12)));
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Favor informar um número válido para conversão", "Erro", 2);
            }
        }

        else {
            
            JOptionPane.showMessageDialog(null, "Favor selecionar duas opções distintas", "Aviso", 1);
            
        }

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboB1;
    private javax.swing.JComboBox<String> CboB2;
    private javax.swing.JTextField LblResul;
    private javax.swing.JPanel Panel1;
    private javax.swing.JTextField TxtNume;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
