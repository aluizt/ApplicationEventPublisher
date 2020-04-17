package br.com.tavares.eventos.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class NotaFiscal {
    private Integer numeroNotaFiscal;
    private Integer numeroCliente;
    private List<Pedido> pedidoList;
    private Double valorTotal;
}
