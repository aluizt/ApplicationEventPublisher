package br.com.tavares.eventos.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Cliente {
    private Integer numeroCliente;
    private String nomeCliente;
    private String emailCliente;
}
