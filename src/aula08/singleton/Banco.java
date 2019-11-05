/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08.singleton;

import java.util.ArrayList;

/**
 *
 * @author felip
 */
public class Banco {
    private static Banco instancia = null;
    private ArrayList<Aluno> alunos;
    
    
    
    private Banco () {
        alunos = new ArrayList<Aluno>();
    }
    
    
    public static Banco getInstance(){
        if (instancia == null){
            instancia = new Banco();
        }
        
        return instancia;
    }
    
    public void salvar (String nome, String curso, String RA){
        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setCurso(curso);
        aluno.setRA(RA);
        alunos.add(aluno);
    }
    
    public void remover (String RA){
        Aluno aluno = new Aluno();
        
        for(Aluno a : alunos) {
            if (a.getRA() == RA){
                aluno = a;
            }
        }
        
        alunos.remove(aluno);  
    }
    
    public Aluno buscar (String RA){
        for(Aluno a : alunos) {
            if (a.getRA() == RA){
                return a;
            }
        }
        return null;
    }
    
    public ArrayList<Aluno> getAlunos(){
        return alunos;
    }
    
}
