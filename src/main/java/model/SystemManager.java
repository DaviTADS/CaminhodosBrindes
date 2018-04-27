
package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SystemManager {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Produto produto = new Produto();

        preencherCliente(cliente);
        preencherProduto(produto);
        EntityManagerFactory emf = null;
        EntityManager em = null;
        EntityTransaction et = null;
        try {
            //EntityManagerFactory realiza a leitura das informações relativas à "persistence-unit".
            emf = Persistence.createEntityManagerFactory("caminho");
            em = emf.createEntityManager(); //Criação do EntityManager.
            et = em.getTransaction(); //Recupera objeto responsável pelo gerenciamento de transação.
            et.begin();
            em.persist(cliente);
            em.persist(produto);
            et.commit();
        } catch (Exception ex) {
            if (et != null && et.isActive()) {
                et.rollback();
            }
        } finally {
            if (em != null) {
                em.close();
            }
            if (emf != null) {
                emf.close();
            }
        }
    }

    private static void preencherCliente(Cliente cliente) {

        cliente.setNome("fulano");
        /*
        cliente.setLogincliente("fulano");
        cliente.setSobrenome("Da Silva");
        cliente.setCelular(997457785);
        cliente.setTelefone(32574469);
        cliente.setCidade("Recife");
        cliente.setBairro("Boa Viagem");
         */

    }

    private static void preencherProduto(Produto produto) {

        produto.setNome("caneca");

    }

}
