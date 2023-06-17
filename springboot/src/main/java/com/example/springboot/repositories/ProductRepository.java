package com.example.springboot.repositories;

import com.example.springboot.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {

}

/* COMENTÁRIOS:
- Como estamos estendendo da JpaRepository, não há a necessidade de explicitar com a annotation @Repository, porém é
padrão colocar essa indicação.
 */