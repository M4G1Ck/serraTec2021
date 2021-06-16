package com.residencia.dell.services;

import com.residencia.dell.entities.Orderlines;
import com.residencia.dell.repositories.OrderlinesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderlinesService {

    @Autowired
    public OrderlinesRepository orderlinesRepository;

    //Create
    public Orderlines create (Orderlines orderlines) {
        Orderlines newOrderline = orderlinesRepository.save(orderlines);
        if (newOrderline.getOrderlineId() != null) {
            return newOrderline;
        }
        else {
            return null;
        }
    }

    //Update
    public Orderlines update(Orderlines orderlines, Integer id) {
        orderlines.setOrderlineId(id);
        return orderlinesRepository.save(orderlines);
    }

    //Delete
    public boolean delete (Integer id) {
        if (id != null) {
            orderlinesRepository.deleteById(id);
            return true;
        }
        else {
            return false;
        }
    }

    //Find by ID
    public Orderlines findById (Integer id) {
        return orderlinesRepository.findById(id).get();
    }

    //Find all
    public List<Orderlines> findAll(Integer page, Integer registersQuantity) throws Exception {
        PageRequest pages = null;
        List<Orderlines> listOrders = null;
        List<Orderlines> listOrdersPageable = null;

        try {
            if (null != page && null != registersQuantity){
                pages = PageRequest.of(page, registersQuantity);
                listOrdersPageable = orderlinesRepository.findAll(pages).getContent();

                return  listOrdersPageable;
            }
            else {
                listOrders = orderlinesRepository.findAll();

                return listOrders;
            }
        }
        catch (Exception e) {
            throw new Exception("Não foi possível recuperar a lista de pedidos ::" + e.getMessage());
        }
    }

    //Count
    public Long count() {
        return orderlinesRepository.count();
    }
}
