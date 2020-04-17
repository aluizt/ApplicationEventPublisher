package br.com.tavares.eventos.listener;

import br.com.tavares.eventos.event.VendaRealizadaEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmailListener {
    @EventListener
    public void enviaEmail(VendaRealizadaEvent venda){
        System.out.println("");
        System.out.println("Enviado e-mail para : "+venda.getVenda().getCliente().getEmailCliente());
        System.out.println("Informado o sr(a) "
                .concat(venda.getVenda().getCliente().getNomeCliente())
                .concat(" que a nota fiscal foi processada !"));
    }
}
