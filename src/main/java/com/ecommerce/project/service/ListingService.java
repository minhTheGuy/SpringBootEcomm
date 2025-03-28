package com.ecommerce.project.service;

import com.ecommerce.project.payload.ProductDTO;

import java.util.List;

public interface ListingService {

    List<ProductDTO> getAllProducts();

    ProductDTO addProduct(ProductDTO productDTO);

    void updateProductInfo(ProductDTO productDTO);
}
