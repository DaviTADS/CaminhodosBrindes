/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.caminhodosbrindes;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author alunof16
 */
public class SystemManager {
    
    

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        preencherUsuario(cliente);
        EntityManagerFactory emf = null;
        EntityManager em = null;
        EntityTransaction et = null;
        try {
            //EntityManagerFactory realiza a leitura das informações relativas à "persistence-unit".
            emf = Persistence.createEntityManagerFactory("caminhodosbrindes");
            em = emf.createEntityManager(); //Criação do EntityManager.
            et = em.getTransaction(); //Recupera objeto responsável pelo gerenciamento de transação.
            et.begin();
            em.persist(cliente);
            et.commit();
        } catch (Exception ex) {
            if (et != null && et.isActive())
                et.rollback();
        } finally {
            if (em != null)
                em.close();       
            if (emf != null)
                emf.close();
        }
    }

    private static void preencherUsuario(Usuario usuario) {
        
        Cliente cliente = new Cliente();
        cliente.setNome("Fulano");
        cliente.setEmail("fulano@gmail.com");
        cliente.setLogincliente("fulano");
        cliente.setSenha("teste");
        cliente.setSobrenome("Da Silva");
        cliente.setCelular(997457785);
        cliente.setTelefone(32574469);
        cliente.setCidade("Recife");
        cliente.setBairro("Boa Viagem");
        
        
    }
    
}
