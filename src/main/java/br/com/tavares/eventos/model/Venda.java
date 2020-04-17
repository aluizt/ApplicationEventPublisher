package br.com.tavares.eventos.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class Venda {
    private Cliente cliente;
    private List<Pedido> pedidoList;
}
