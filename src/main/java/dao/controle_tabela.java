package dao;


import java.io.*; // isso me causa intensa dor
import java.nio.file.Paths;
import java.nio.file.Files;
import model.Cadastrorealizado;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Darian
 */
public class controle_tabela {
    
    
    String pathFileTemp = "dbTemp.txt";
    String readFile = "";

    public static void salvar_para_arquivo
	(String frase, String nome_do_arquivo) throws
	    FileNotFoundException, IOException {
        
        //Fluxo de saida de um arquivo
        OutputStream os = new FileOutputStream(nome_do_arquivo); // nome do arquivo que será escrito
        Writer wr = new OutputStreamWriter(os); // criação de um escritor
        BufferedWriter br = new BufferedWriter(wr); // adiciono a um escritor de buffer
        
	br.write(frase);
	br.newLine();
	br.close();
    }
    
    public static void mostrar_dados(String pathLivro, String pathAluno)
	throws IOException{
	File dir = new File(pathLivro);
        File[] file = dir.listFiles();
	String[] splitData;
	String[] splitData2;
	for (int i = 0; i < file.length; i++) {
            if(file[i].isFile()) {
                BufferedReader inputStream = null;
                String line;
                try {
                    inputStream = new BufferedReader(new FileReader(file[i]));
                    while ((line = inputStream.readLine()) != null) {
                        splitData = line.split(" ; ");

			// ID ; ALUNO ; NOME DO LIVRO ; EDITORA ; DATA
			// DO EMPRÉSTIMO ; DATA DA DEVOLUÇÃO ;
			// Turma/Curso
			
			String id_Aluno = Files.readAllLines(Paths.get(pathAluno)).get(Integer.parseInt(splitData[0]));
			splitData2 = line.split(" ; ");
			// idAluno ; nomeLivro ; editora ; dataEmprestimo ; dataDevolucao;
			// idAluno ; nomeCompleto ; turma;
			
			Cadastrorealizado rm = new Cadastrorealizado();

			rm.setId(splitData[0]);
			rm.setAluno(splitData2[1]);
			rm.setNomedoLivro(splitData[1]);
			rm.setEditora(splitData[2]);
			rm.setDatadeEmprestimo(splitData[3]);
			rm.setDatadaDevolucao(splitData[4]);
			rm.setTurma(splitData2[2]);
			
			
                    }
                }catch(IOException e) {
		    System.out.println(e);
                }
                finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
	    }
	}
	    

    }
}

