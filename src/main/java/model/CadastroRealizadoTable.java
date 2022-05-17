/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Cadastrorealizado;

/**
 *
 * @author Darian
 */
public class CadastroRealizadoTable extends AbstractTableModel{
    private List<Cadastrorealizado> list = new ArrayList<>();
    private final String[] columnNames = {" Aluno", "NomedoLivro", "Editora", "DatadeEmprestimo", "DatadaDevolucao"};
    
   public void setList (List<Cadastrorealizado> list) {
    this.list = list;
    fireTableDataChanged();
    
}
   
   @Override
        public String getColumnName(int column) {
             return columnNames[column]; //To change body of generated methods, choose Tools | Templates
    }
    
    
    @Override
    public int getRowCount() {
        return list.size();
        
        
        
        
        }

    @Override
    public int getColumnCount() {
     return columnNames.length;
    
    
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getAluno();
            case 1:
                return list.get(rowIndex).getNomedoLivro();
            case 2: 
                return
                       list.get(rowIndex).getEditora();
            case 3:
                return
                       list.get(rowIndex).getDatadeEmprestimo();
            case 4:
                return list.get(rowIndex).getDatadaDevolucao(); 
            default:
                return null;}
        
        }
    
}
    
    