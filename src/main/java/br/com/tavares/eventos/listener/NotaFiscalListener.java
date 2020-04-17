package br.com.tavares.eventos.listener;

import br.com.tavares.eventos.event.VendaRealizadaEvent;
import br.com.tavares.eventos.model.NotaFiscal;
import br.com.tavares.eventos.service.EmiteNotaFiscal;
import lombok.AllArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class NotaFiscalListener {

    private EmiteNotaFiscal emiteNotaFiscal;

    @EventListener
    public void emiteNotaFiscalListener(VendaRealizadaEvent venda){
        imprimeNota(emiteNotaFiscal.geraNotaFiscal(venda.getVenda().getCliente(),venda.getVenda().getPedidoList()));
    }

    private void imprimeNota(NotaFiscal notaFiscal){
        System.out.println("Codigo Cliente : "+notaFiscal.getNumeroCliente());
        System.out.println("Numero da NF   : "+notaFiscal.getNumeroNotaFiscal());
        System.out.println("Total da NF    : "+notaFiscal.getValorTotal());
    }
}
