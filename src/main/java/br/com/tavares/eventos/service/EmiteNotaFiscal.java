package br.com.tavares.eventos.service;

import br.com.tavares.eventos.model.Cliente;
import br.com.tavares.eventos.model.Item;
import br.com.tavares.eventos.model.NotaFiscal;
import br.com.tavares.eventos.model.Pedido;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class EmiteNotaFiscal {
    public NotaFiscal geraNotaFiscal(Cliente cliente, List<Pedido> pedidoList) {
        return NotaFiscal.builder()
                .numeroNotaFiscal(geraNumero(0, 100))
                .numeroCliente(cliente.getNumeroCliente())
                .pedidoList(pedidoList)
                .valorTotal(calculaTotalDaNota(pedidoList))
                .build();
    }

    private Double calculaTotalDaNota(List<Pedido> pedidoList) {
        return pedidoList.stream().mapToDouble(pedido -> calculaTotalDoPedido(pedido.getItemList())).sum();
    }

    private Double calculaTotalDoPedido(List<Item> itemList) {
        return itemList.stream().mapToDouble(value -> value.getValorItem()).sum();
    }

    private Integer geraNumero(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
