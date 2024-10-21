/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package com.mycompany.sol;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SUPORTE 08
 */
public class teste {

            
        public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<String> code = new ArrayList<>();
        
        boolean op = true;
        File file = new File("arquivo.txt");
        
        try {
            FileWriter fileWriter = new FileWriter(file, false); // "false" sobrescreve o arquivo, limpando-o
            fileWriter.close();
            System.out.println("Arquivo limpo.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
          
            FileWriter escrever = new FileWriter(file, true);
            String input ;
            do {
                System.out.println("Digite o código:");
                input = ler.nextLine();
                code.add(input);

               
                if (input.isEmpty()) {
                    op = false;
                    break;
                }

                escrever.write( input + ";");
            } while (op);

            escrever.flush();  
            escrever.close(); 
            
            System.out.println("Os códigos são: " + code + ";\n");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        } finally {
            ler.close();
            //file.delete();
        }
    }
}