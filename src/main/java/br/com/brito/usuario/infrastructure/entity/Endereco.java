package br.com.brito.usuario.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "endereco")
@Builder
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rua", length = 200)
    private String rua;

    @Column(name = "numero", length = 30)
    private Long numero;

    @Column(name = "complemento", length = 100)
    private String complemento;

    @Column(name = "cidade", length = 150)
    private String cidade;

    @Column(name = "estado", length = 100)
    private String estado;

    @Column(name = "cep", length = 9)
    private String cep;

    @Column(name = "usuario_id")
    private Long usuario_id;
}
