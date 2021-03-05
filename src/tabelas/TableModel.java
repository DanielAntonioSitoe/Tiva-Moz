/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelas;

import classes.perguntas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author danny
 * Modelo de Tabela de clientes
 */
public class TableModel extends AbstractTableModel {
    private List<perguntas> dados = new ArrayList<>();
    private String[]colunas = {"pergunta","OpcaoA","OpcaoB","OpcaoC","OpcaoD","resposta","nivel","categoria","Processado"};

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
     @Override
    public int getRowCount() {
       return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
       switch(coluna){
           case 0 : return dados.get(linha).getPergunta();
           case 1 : return dados.get(linha).getOpcaoA();
           case 2 : return dados.get(linha).getOpcaoB();
           case 3 : return dados.get(linha).getOpcaoC();
           case 4 : return dados.get(linha).getOpcaoD();
           case 5 : return dados.get(linha).getResposta();
           case 6 : return dados.get(linha).getNivel();
           case 7 : return dados.get(linha).getCategoria();
           case 8 : return dados.get(linha).getProcessada();
       }return null;
    }
    
    public void addrow(perguntas p){
        this.dados.add(p);
        this.fireTableDataChanged();
    }
    
    
}
