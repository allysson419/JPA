package br.testes.com.br.Teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.test.com.bean.Categoria.Categoria;

public class CategoriaTest {

	public static void main(String[] args) {
		Categoria c  = new Categoria();
			c.setDescricao("Bebidas");
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("testando");
			EntityManager em = emf.createEntityManager();
			
			em.getTransaction().begin();
			em.persist(c);
			em.getTransaction().commit();
			
			em.close();
			em.close();
			
			}

}
