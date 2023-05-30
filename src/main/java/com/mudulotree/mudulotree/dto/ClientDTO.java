package com.mudulotree.mudulotree.dto;

import java.time.LocalDate;

import com.mudulotree.mudulotree.entities.Client;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class ClientDTO {

    private Long id;

    @Size(min = 3, max = 25, message = "Nome precisa ter entre 3 á 25 caracteres")
    @NotBlank(message = "Campo Requerido")
    private String name;

    @Positive
    @Size(min = 11, max = 11, message = "CPF invalido")
    @NotBlank(message = "Campo Requerido")
    private String cpf;

    @Positive(message = "Precisa Ser Positivo")
    private Double income;

    @Past(message = "A data de nascimento deve ser uma data passada")
    private LocalDate birthDate;

    @Min(value = 0, message = "O número de filhos deve ser maior ou igual a 0")
    private Integer children;
    
    public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }

    public ClientDTO(Client entity) {
        id = entity.getId();
        name = entity.getName();
        cpf = entity.getCpf();
        income = entity.getIncome();
        birthDate = entity.getBirthDate();
        children = entity.getChildren();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
 
}
