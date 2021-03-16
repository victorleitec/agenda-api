package br.com.victorleitecosta.agendaapi.model.repository;

import br.com.victorleitecosta.agendaapi.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository  extends JpaRepository<Contato, Integer> {
}
