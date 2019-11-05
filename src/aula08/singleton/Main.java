/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08.singleton;

/**
 *
 * @author felip
 */
public class Main {
    
    
    public static void main(String[] args) {
	Banco b = Banco.getInstance();
        
        b.salvar("Aluno 1", "Ciência da Computação", "10001");
        b.salvar("Aluno 2", "Ciência da Computação", "10002");
        b.salvar("Aluno 3", "Ciência da Computação", "10003");
        
        
        System.out.println("Todos os alunos: ");
        for(Aluno a : b.getAlunos()) {
            System.out.println("Nome: " + a.getNome() + ", RA: " + a.getRA() + ", Curso: " + a.getCurso());
        }
        
        
        Aluno a = b.buscar("10003");
        if (a == null) {
            System.out.println("Aluno não encontrado");
        } else{
            System.out.println("Aluno buscado -> Nome: " + a.getNome() + ", Curso: " + a.getCurso());
        }
        
        b.remover("10003");
        
        System.out.println("Todos os alunos após remover: ");
        for(Aluno c : b.getAlunos()) {
            System.out.println("Nome: " + c.getNome() + ", RA: " + c.getRA() + ", Curso: " + c.getCurso());
        }
    }
}
