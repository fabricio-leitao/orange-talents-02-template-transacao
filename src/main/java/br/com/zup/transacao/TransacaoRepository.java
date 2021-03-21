package br.com.zup.transacao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepository extends JpaRepository<Transacao, String> {

    Page<Transacao> findAllByCartaoId(String cartaoId, Pageable paginacao);

}