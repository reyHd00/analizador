package analizador;

import java.io.*;
import java.util.regex.*;
import javax.swing.*;
import java_cup.runtime.Symbol;


/**
 *
 * @author reyna
 */
public class Analizador extends javax.swing.JFrame {

    JFileChooser seleccionar = new JFileChooser();
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;

    public Analizador() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
    } 

  
//Abre el archivo
public String abrirArchivo(File archivo) {
        String documento = "";

        try {
            entrada = new FileInputStream(archivo);
            int ascci;
            while ((ascci = entrada.read()) != -1) {
                char caracter = (char) ascci;
                documento += caracter;
            }
        } catch (Exception ex) {
            System.out.println("ERROR!" + ex);
        }
        return documento;
    }

    //Guarda el archivo
    public String guardarArchivo(File archivo, String documento) {
        String mensaje = null;

        try {
            salida = new FileOutputStream(archivo);
            byte[] bytxt = documento.getBytes();
            salida.write(bytxt);
            mensaje = "Archivo Guardado";
        } catch (Exception ex) {
            System.out.println("ERROR!" + ex);
        }
        return mensaje;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtLiga = new javax.swing.JTextField();
        txtExp = new javax.swing.JTextField();
        btnAbrir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnRegEx = new javax.swing.JButton();
        btnAnalizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEntrada = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtSintaxis = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAbrir.setText("Abrir");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnRegEx.setText("Evaluar RegEx");
        btnRegEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegExActionPerformed(evt);
            }
        });

        btnAnalizar.setText("Analizar");
        btnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarActionPerformed(evt);
            }
        });

        txtEntrada.setColumns(20);
        txtEntrada.setRows(5);
        jScrollPane1.setViewportView(txtEntrada);

        jLabel1.setText("Consola");

        txtSalida.setColumns(20);
        txtSalida.setRows(5);
        jScrollPane2.setViewportView(txtSalida);

        txtSintaxis.setColumns(20);
        txtSintaxis.setRows(5);
        jScrollPane3.setViewportView(txtSintaxis);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtLiga)
                                    .addComponent(txtExp, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnRegEx)
                                        .addGap(36, 36, 36)
                                        .addComponent(btnAnalizar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAbrir)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnGuardar))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar)
                    .addComponent(txtLiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegEx)
                    .addComponent(btnAnalizar)
                    .addComponent(txtExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegExActionPerformed
        String RegEx = txtExp.getText();
        final Pattern pattern = Pattern.compile(RegEx, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(abrirArchivo(archivo));
        String resultado = "";

        while (matcher.find()) {
            //System.out.println("Full match: " + matcher.group(0));
            resultado += matcher.group(0) + "\n";
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }
        txtSalida.setText(resultado);

    }//GEN-LAST:event_btnRegExActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        if (seleccionar.showDialog(null, "Abrir") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            if (archivo.getName().endsWith("txt")) {
                String documento = abrirArchivo(archivo);
                txtEntrada.setText(documento);
            } else {
                JOptionPane.showMessageDialog(null, "Archivo no compatible");
            }
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {
//GEN-FIRST:event_btnAnalizarActionPerformed
        File archivo = new File("archivo.txt");
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            escribir.print(txtEntrada.getText());
            escribir.close();
        

} catch (FileNotFoundException ex) {
// Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            java.util.logging.Logger.getLogger(JFlexPro.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
// try {
        Reader lector;
        try {
            /* lector = new BufferedReader(new FileReader("archivo.txt"));
             Lexer lexer = new Lexer(lector);
             String resultado = "";
             while (true) {
             Tokens tokens = lexer.yylex();
             if (tokens == null) {
             resultado += "FIN";
             txtSalida.setText(resultado);
             return;
             }
             switch (tokens) {
             case ERROR:
             resultado += "Símbolo no definido\n";
             break;
             case Identificador:
             case Numero:
             case Reservadas:
             resultado += lexer.lexeme + ": Es un " + tokens + "\n";
             break;
             default:
             resultado += "Token: " + tokens + "\n";
             break;
             }
             }*/
            analizarLexico();
            analizarSintaxis();
        

} catch (FileNotFoundException ex) {
// Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            java.util.logging.Logger.getLogger(JFlexPro.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (IOException ex) {
// Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            java.util.logging.Logger.getLogger(JFlexPro.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    private void analizarLexico() throws IOException {
        int cont = 1;

        String expr = (String) txtEntrada.getText();
        Lexer lexer = new Lexer(new StringReader(expr));
        String resultad = "LINEA " + cont + "\t\tSIMBOLO\n";
        while (true) {
            Tokens token = lexer.yylex();
            if (token == null) {
                txtSalida.setText(resultad);
                return;
            }
            switch (token) {
                case Linea:
                    cont++;
                    resultad += "LINEA " + cont + "\n";
                    break;
                case Comillas:
                    resultad += "  <Comillas>\t\t" + lexer.lexeme + "\n";
                    break;
                case Cadena:
                    resultad += "  <Tipo de dato>\t" + lexer.lexeme + "\n";
                    break;
                case T_dato:
                    resultad += "  <Tipo de dato>\t" + lexer.lexeme + "\n";
                    break;
                case If:
                    resultad += "  <Reservada if>\t" + lexer.lexeme + "\n";
                    break;
                case Else:
                    resultad += "  <Reservada else>\t" + lexer.lexeme + "\n";
                    break;
                case Do:
                    resultad += "  <Reservada do>\t" + lexer.lexeme + "\n";
                    break;
                case While:
                    resultad += "  <Reservada while>\t" + lexer.lexeme + "\n";
                    break;
                case For:
                    resultad += "  <Reservada while>\t" + lexer.lexeme + "\n";
                    break;
                case Igual:
                    resultad += "  <Operador igual>\t" + lexer.lexeme + "\n";
                    break;
                case Suma:
                    resultad += "  <Operador suma>\t" + lexer.lexeme + "\n";
                    break;
                case Resta:
                    resultad += "  <Operador resta>\t" + lexer.lexeme + "\n";
                    break;
                case Multiplicacion:
                    resultad += "  <Operador multiplicacion>\t" + lexer.lexeme + "\n";
                    break;
                case Division:
                    resultad += "  <Operador division>\t" + lexer.lexeme + "\n";
                    break;
                case Op_logico:
                    resultad += "  <Operador logico>\t" + lexer.lexeme + "\n";
                    break;
                case Op_incremento:
                    resultad += "  <Operador incremento>\t" + lexer.lexeme + "\n";
                    break;
                case Op_relacional:
                    resultad += "  <Operador relacional>\t" + lexer.lexeme + "\n";
                    break;
                case Op_atribucion:
                    resultad += "  <Operador atribucion>\t" + lexer.lexeme + "\n";
                    break;
                case Op_booleano:
                    resultad += "  <Operador booleano>\t" + lexer.lexeme + "\n";
                    break;
                case Parentesis_a:
                    resultad += "  <Parentesis de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Parentesis_c:
                    resultad += "  <Parentesis de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Llave_a:
                    resultad += "  <Llave de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Llave_c:
                    resultad += "  <Llave de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Corchete_a:
                    resultad += "  <Corchete de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Corchete_c:
                    resultad += "  <Corchete de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Main:
                    resultad += "  <Reservada main>\t" + lexer.lexeme + "\n";
                    break;
                case P_coma:
                    resultad += "  <Punto y coma>\t" + lexer.lexeme + "\n";
                    break;
                case Identificador:
                    resultad += "  <Identificador>\t\t" + lexer.lexeme + "\n";
                    break;
                case Numero:
                    resultad += "  <Numero>\t\t" + lexer.lexeme + "\n";
                    break;
                case ERROR:
                    resultad += "  <Simbolo no definido>\n";
                    break;
                default:
                    resultad += "  < " + lexer.lexeme + " >\n";
                    break;
            }
        }
    }

    private void analizarSintaxis() throws IOException {
        String ST = txtEntrada.getText();
        Sintax s = new Sintax(new analizador.LexerCup(new StringReader(ST)));
        try {
            s.parse();
            txtSintaxis.setText("Análisis realizado correctamente");
        } catch (Exception ex) {
            Symbol sym = s.getS();
            txtSintaxis.setText("Error de sintaxis. Línea: " + (sym.right + 1) + " Columna: " + (sym.left + 1) + ", Texto:\"" + sym.value + "\"" );
        }


    }//GEN-LAST:event_btnAnalizarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (seleccionar.showDialog(null, "Guardar") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            if (archivo.getName().endsWith("txt")) {
                String documento = txtEntrada.getText();
                String mensaje = guardarArchivo(archivo, documento);
                if (mensaje != null) {
                    JOptionPane.showMessageDialog(null, mensaje);
                } else {
                    JOptionPane.showMessageDialog(null, "Archivo no compatible");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Guardar documento de texto");
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(Analizador.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Analizador.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Analizador.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 

catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Analizador.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
        public void run() {
                new Analizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegEx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtEntrada;
    private javax.swing.JTextField txtExp;
    private javax.swing.JTextField txtLiga;
    private javax.swing.JTextArea txtSalida;
    private javax.swing.JTextArea txtSintaxis;
    // End of variables declaration//GEN-END:variables
}
