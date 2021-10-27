/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizador;

/**
 *
 * @author reyna
 */
public class JFlexPro {

    public static void generarLexer() throws Exception {
        // Ruta del archivo donde se encuentra el archivo lex.flex
        String[] ruta = {"C:\\Users\\reyna\\OneDrive\\Documentos\\NetBeansProjects\\Analizador\\analizador\\Analizador\\src\\analizador\\lex.flex"};
        try {
            jflex.Main.generate(ruta);
        } catch (Exception e) {
            throw new Exception("Error al crear  Archivo Lexer.java "+e);
        }
    }

    public static void main(String[] args) throws Exception {
        try {
            generarLexer();
        } catch (Exception ex) {
            throw new Exception("Error al generar Archivo Lexer" +ex);
        }
    }
}
