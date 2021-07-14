package br.com.forum.springbootv1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.forum.springbootv1.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{

}
