package br.com.tavares.eventos.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Item {
    private Integer codigoItem;
    private Double valorItem;
}
