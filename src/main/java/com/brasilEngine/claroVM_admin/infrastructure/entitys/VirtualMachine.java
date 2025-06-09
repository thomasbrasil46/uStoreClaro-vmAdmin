package com.brasilEngine.claroVM_admin.infrastructure.entitys;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "VirtualMachine")
@Entity
public class VirtualMachine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "VMname", unique = true, nullable = false)
    private String nome;

    @Column(name = "VMmemory", nullable = false)
    private Double memoria;

    @Column(name = "VMdisc", nullable = false)
    private Double disco;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime dataCriacao;
}
