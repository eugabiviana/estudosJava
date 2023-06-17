package com.example.springboot.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "TB_PRODUCTS")
public class ProductModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProduct;
    private String name;
    private BigDecimal value;

    public UUID getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(UUID idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}

/* COMENTÁRIOS:
- Serializable é uma interface de marcação, ou seja, não tem nada para implementar (É apenas para mostrar para a JVM).
Essa interface mostra para o Java que essa classe está habilitada a passar por serializações.
- UUID: são marcadores que geram valores únicos, o que evita que sejam criados valores semelhantes, o que poderia
acontecer, caso fosse criado um valor sequencial.

 */
