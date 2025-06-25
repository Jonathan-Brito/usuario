package br.com.brito.usuario.business.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TelefoneDTO {

    private Long numero;
    private String ddd;
}
