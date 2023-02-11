package com.alhadi.ahsproduct.service;

import com.alhadi.ahsproduct.dto.ProductRequest;
import com.alhadi.ahsproduct.dto.ProductResponse;
import com.alhadi.ahsproduct.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IProductService {

    void createProduct(ProductRequest productRequest);

    List<ProductResponse> getAllProducts();

    ProductResponse mapToProductResponse(Product product);
}
