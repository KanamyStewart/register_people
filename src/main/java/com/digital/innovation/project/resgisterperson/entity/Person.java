package com.digital.innovation.project.resgisterperson.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gera o ID do campo automatico
    private Long id;

    @Column(nullable = false) // torna o preenchimento do campo obrigatorio
    private String firstName;

    @Column(nullable = false) // torna o preenchimento do campo obrigatorio
    private String lastName;

    @Column(nullable = false, unique = true) // torna o preenchimento do campo unico não pode existe CPF iguais
    private String cpf;

    private LocalDate birthDate;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}) // relacionamento de tabela de 1 para N
    private List<Phone> phones;
}