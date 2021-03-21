package br.com.zup.transacao;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Component
public class TransacaoListener {

    @PersistenceContext
    private EntityManager manager;

    @Transactional
    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void listener(TransactionMessage request) {
        System.out.println("============================================");
        System.out.println("Recebendo uma mensagem!!");
        Transacao transacao = request.toModel();
        System.out.println(transacao.toString());
        manager.merge(transacao);
        System.out.println("Mensagem finalizada!!");
        System.out.println("============================================");

    }
}
