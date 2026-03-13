package com.company.degenerate.service;

import org.springframework.stereotype.Service;
import com.company.degenerate.dto.ProductRequestDTO;
import com.company.degenerate.dto.ProductResponseDTO;
import com.company.degenerate.entity.Product;
import com.company.degenerate.repository.ProductRepository;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public ProductResponseDTO createProduct(ProductRequestDTO productRequestDTO) {
        Product product = new Product();

        product.setName_product(productRequestDTO.getName_product());
        product.setPrice(productRequestDTO.getPrice());
        product.setSection(productRequestDTO.getSection());
        product.setStock(productRequestDTO.getStock());

        Product savedProduct = productRepository.save(product);

        return productToResponseDTO(savedProduct);
    }
     private ProductResponseDTO productToResponseDTO(Product product) {

        ProductResponseDTO dto = new ProductResponseDTO();

        dto.setCode_product(product.getCode_product());
        dto.setName_product(product.getName_product());
        dto.setPrice(product.getPrice());
        dto.setSection(product.getSection());
        dto.setStock(product.getStock());

        return dto;
    }

}