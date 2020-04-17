package br.com.tavares.eventos.venda;

import br.com.tavares.eventos.event.VendaRealizadaEvent;
import br.com.tavares.eventos.model.Cliente;
import br.com.tavares.eventos.model.Pedido;
import br.com.tavares.eventos.model.Venda;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@AllArgsConstructor
public class RealizaVenda {

    private ApplicationEventPublisher applicationEventPublisher;

    public void realizaVenda(Cliente cliente, List<Pedido> pedidoList) {
        applicationEventPublisher
                .publishEvent(new VendaRealizadaEvent(Venda.builder().cliente(cliente).pedidoList(pedidoList).build()));
    }
}
