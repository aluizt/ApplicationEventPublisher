package br.com.tavares.eventos.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class Pedido {
    private Integer numeroPedido;
    private List<Item> itemList;
}
