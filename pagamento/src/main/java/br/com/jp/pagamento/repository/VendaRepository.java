package br.com.jp.pagamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jp.pagamento.entity.Venda;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long> {

}
