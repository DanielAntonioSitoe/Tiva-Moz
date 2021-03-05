/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import classes.perguntas;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author danny
 */
public class Gravar_Ler implements Serializable{
    
    /**
     *Recebe um objecto;
     * Copia os objecto no vector do arquivo  existente para um novo vector
     * adiciona o objecto recebido no novo vetor e grava novamente o novo vetor no arquivo perguntas.arq
     * @param v
     * @param tipo
     */
    public void gravar(Object v){       
        
    try{
             Vector<perguntas> lst = new Vector<perguntas>();
    try{ 
        
        FileInputStream arquivo = new FileInputStream("perguntas.arq");
        ObjectInputStream objecto = new ObjectInputStream(arquivo);
        Vector<perguntas> lerObject = (Vector<perguntas>) objecto.readObject();  
        for (int i = 0; i < lerObject.size(); i++) {
           lst.add(lerObject.get(i)); 
        }   
    }catch(Exception erro){           
         JOptionPane.showMessageDialog(null," Erro de Leitura: "+erro.getMessage());   
        }  
        lst.add((perguntas) v);        
        FileOutputStream arquivo = new FileOutputStream("perguntas.arq");
        ObjectOutputStream objecto = new ObjectOutputStream(arquivo);
        objecto.writeObject(lst);
        
        JOptionPane.showMessageDialog(null," Gravacao bem sucedida ");
        }
        catch(Exception erro){
            
         JOptionPane.showMessageDialog(null," Gravacao Falhou "+erro);   
        }
         
     
        
    }
        public void remover(int indice){       
        
    try{
             Vector<perguntas> lst = new Vector<perguntas>();
    try{ 
        
        FileInputStream arquivo = new FileInputStream("perguntas.arq");
        ObjectInputStream objecto = new ObjectInputStream(arquivo);
        Vector<perguntas> lerObject = (Vector<perguntas>) objecto.readObject();  
        for (int i = 0; i < lerObject.size(); i++) {
           lst.add(lerObject.get(i)); 
        }   
    }catch(Exception erro){           
         JOptionPane.showMessageDialog(null," Erro de Leitura: "+erro.getMessage());   
        }  
        lst.remove(indice);        
        FileOutputStream arquivo = new FileOutputStream("perguntas.arq");
        ObjectOutputStream objecto = new ObjectOutputStream(arquivo);
        objecto.writeObject(lst);        
        JOptionPane.showMessageDialog(null," Remocao bem sucedida ");
        }
        catch(Exception erro){
            
         JOptionPane.showMessageDialog(null," Remocao Falhou "+erro.getMessage());   
        }
         
     
        
    }
 
  
    
    
}
