/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizador;

import java.io.*;
import java.nio.file.*;

/**
 *
 * @author reyna
 */
public class JFlexPro {

    public static void generar() throws IOException, Exception {
        String rutaProy = "C:\\Users\\reyna\\OneDrive\\Documentos\\NetBeansProjects\\Analizador\\analizador\\Analizador";
        String[] ruta1 = {rutaProy + "/src/analizador/lex.flex"};
        String[] ruta2 = {rutaProy + "/src/analizador/LexerCup.flex"};
        String[] rutaS = {"-parser", "Sintax", rutaProy + "/src/analizador/Sintax.cup"};
        jflex.Main.generate(ruta1);
        jflex.Main.generate(ruta2);
        java_cup.Main.main(rutaS);
        Path rutaSym = Paths.get(rutaProy + "/src/analizador/sym.java");
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        Files.move(
            Paths.get(rutaProy + "/sym.java"),
            Paths.get(rutaProy + "/src/analizador/sym.java")
        );
        Path rutaSin = Paths.get(rutaProy + "/src/analizador/Sintax.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        Files.move(
                Paths.get(rutaProy + "/Sintax.java"),
                Paths.get(rutaProy + "/src/analizador/Sintax.java")
        );
    }

    /*public static void generarLexer() throws Exception {
     // Ruta del archivo donde se encuentra el archivo lex.flex
     String[] ruta = {"C:\\Users\\reyna\\OneDrive\\Documentos\\NetBeansProjects\\Analizador\\analizador\\Analizador\\src\\analizador\\lex.flex"};

     try {
     jflex.Main.generate(ruta);
     } catch (Exception e) {
     throw new Exception("Error al crear  Archivo Lexer.java " + e);
     }
     }*/
    public static void main(String[] args) throws Exception {

        /*try {
         generarLexer();
         } catch (Exception ex) {
         throw new Exception("Error al generar Archivo Lexer" + ex);
         }*/
        try {
            generar();
        } catch (Exception ex) {
            throw new Exception("Error al generar Archivo Lexer" + ex);
        }
    }
}
