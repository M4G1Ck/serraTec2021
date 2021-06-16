package com.residencia.dell.services;

import com.residencia.dell.entities.Orders;
import com.residencia.dell.entities.Products;
import com.residencia.dell.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {

    @Autowired
    public ProductsRepository productsRepository;

    //Create
    public Products create (Products product) {
        Products newProduct = productsRepository.save(product);
        if (newProduct.getProductId() != null) {
            return newProduct;
        }
        else {
            return null;
        }
    }

    //Update
    public Products update(Products product, Integer id) {
        product.setProductId(id);
        return productsRepository.save(product);
    }

    //Delete
    public boolean delete (Integer id) {
        if (id != null) {
            productsRepository.deleteById(id);
            return true;
        }
        else {
            return false;
        }
    }

    //Find by ID
    public Products findById (Integer id) {
        return productsRepository.findById(id).get();
    }

    //Find all
    public List<Products> findAll() {
        return productsRepository.findAll();

    }

    //Find all
    public List<Products> findAll(Integer page, Integer registersQuantity) throws Exception {
        PageRequest pages = null;
        List<Products> listProducts = null;
        List<Products> listProductsPageable = null;

        try {
            if (null != page && null != registersQuantity){
                pages = PageRequest.of(page, registersQuantity);
                listProductsPageable = productsRepository.findAll(pages).getContent();

                return  listProductsPageable;
            }
            else {
                listProducts = productsRepository.findAll();

                return listProducts;
            }
        }
        catch (Exception e) {
            throw new Exception("Não foi possível recuperar a lista de pedidos ::" + e.getMessage());
        }
    }

    //Count
    public Long count() {
        return productsRepository.count();
    }


}
