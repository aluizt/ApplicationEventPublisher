package br.com.tavares.eventos.event;


import br.com.tavares.eventos.model.Venda;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class VendaRealizadaEvent {
    private Venda venda;
}
