package br.com.tavares.eventos.controller;

import br.com.tavares.eventos.model.Cliente;
import br.com.tavares.eventos.model.Item;
import br.com.tavares.eventos.model.Pedido;
import br.com.tavares.eventos.venda.RealizaVenda;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RequestMapping("evento")
@RestController
@AllArgsConstructor
public class NotaFiscalController {
    private RealizaVenda realizaVenda;

    @GetMapping
    public void testeVenda(){
        realizaVenda.realizaVenda(Cliente.builder()
                .numeroCliente(100)
                .nomeCliente("Maria")
                .emailCliente("maria@email.com.br")
                .build(),
                 Arrays.asList(Pedido.builder()
                .numeroPedido(10)
                .itemList(Arrays.asList(Item.builder()
                        .codigoItem(45).valorItem(105.10).build(),
                        Item.builder().codigoItem(68).valorItem(204.00).build(),
                        Item.builder().codigoItem(14).valorItem(301.10).build()))
                .build()));
    }
}
