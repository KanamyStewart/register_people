package com.digital.innovation.project.resgisterperson.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.digital.innovation.project.resgisterperson.enums.PhoneType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gera o ID do campo automatico
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false) // torna o preenchimento do campo obrigatorio
    private PhoneType type;

    @Column(nullable = false) // torna o preenchimento do campo obrigatorio
    private String number;


}