package com.cancao.ultima_sombra_backend.entidades;

import jakarta.persistence.*;
import lombok.Data;
import java.time.*;

@Data
@Entity
public class Personagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String raca;
    private String classe;
    private String biografia;
    private String imagemUrl;
    private LocalDateTime dataCriacao;
    
}
