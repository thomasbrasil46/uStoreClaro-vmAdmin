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
    private double memoria;

    @Column(name = "VMdisc", nullable = false)
    private double disco;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime dataCriacao;
}
