/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Darian
 */
public class Cadastrorealizado {
    private String Id;
    private String Aluno;
    private String NomedoLivro;
    private String Editora;
    private String DatadeEmprestimo;
    private String DatadaDevolucao;
    private String turma;

    public String getTurma(){
	return turma;
    }

    public void setTurma(String turma){
	this.turma = turma;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    

    public String getAluno() {
        return Aluno;
    }

    public void setAluno(String Aluno) {
        this.Aluno = Aluno;
    }

    public String getNomedoLivro() {
        return NomedoLivro;
    }

    public void setNomedoLivro(String NomedoLivro) {
        this.NomedoLivro = NomedoLivro;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String Editora) {
        this.Editora = Editora;
    }

    public String getDatadeEmprestimo() {
        return DatadeEmprestimo;
    }

    public void setDatadeEmprestimo(String DatadeEmprestimo) {
        this.DatadeEmprestimo = DatadeEmprestimo;
    }

    public String getDatadaDevolucao() {
        return DatadaDevolucao;
    }

    public void setDatadaDevolucao(String DatadaDevolucao) {
        this.DatadaDevolucao = DatadaDevolucao;
    }
    
}
