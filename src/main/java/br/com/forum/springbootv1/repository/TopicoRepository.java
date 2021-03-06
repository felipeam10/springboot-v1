package br.com.forum.springbootv1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.forum.springbootv1.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{

	List<Topico> findByCursoNome(String nomeCurso); //eh soh declarar a assinatura do metodo que o spring data gera a consulta. Nao precisa montar a query manualmente 
		//na classe Curso temos um atributo nome 
		//como que fazemos para filtrar nao por um atributo da entidade? no caso a entidade topico
		//mas quero filtrar por um atributo que eh de um relacionamento que eh da minha entidade ?
		//para que o spring filtre, precisa montar da seguinte maneira: findBy + Curso + Nome
		//curso eh a entidade de relacionamento
		//nome eh o atributo dentro desta entidade de relacionamento 
	
		//findByCurso_Nome pode fazer assim, caso tenhamos conflito de nomes na classe topico
	
	
	/*
	 * poderia fazer diferente, sem seguir o padrao
	 * 
	 * @Query("select t from Topico t where t.curso.nome = :nomeCurso") List<Topico>
	 * carregarPorNomeDoCurso(@Param("nomeCurso") String nomeCurso);
	 */
	
	
}
