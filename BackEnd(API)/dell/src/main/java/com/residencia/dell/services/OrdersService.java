package com.residencia.dell.services;

import com.residencia.dell.dto.OrderlinesDTO;
import com.residencia.dell.dto.OrdersDTO;
import com.residencia.dell.dto.ReceiptDTO;
import com.residencia.dell.entities.Orderlines;
import com.residencia.dell.entities.Orders;
import com.residencia.dell.repositories.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrdersService {

    @Autowired
    public OrdersRepository ordersRepository;

    //Create
    public Orders create (Orders orders) {
        Orders newOrder = ordersRepository.save(orders);
        if (newOrder.getOrderId() != null) {
            return newOrder;
        }
        else {
            return null;
        }
    }

    //Update
    public Orders update(Orders order, Integer id) {
        order.setOrderId(id);
        return ordersRepository.save(order);
    }

    //Delete
    public boolean delete (Integer id) {
        if (id != null) {
            ordersRepository.deleteById(id);
            return true;
        }
        else {
            return false;
        }
    }

    //Find by ID
    public Orders findById (Integer id) {
        return ordersRepository.findById(id).get();
    }

    //Find all
    public List<Orders> findAll(Integer page, Integer registersQuantity) throws Exception {
        PageRequest pages = null;
        List<Orders> listOrders = null;
        List<Orders> listOrdersPageable = null;

        try {
            if (null != page && null != registersQuantity){
                pages = PageRequest.of(page, registersQuantity);
                listOrdersPageable = ordersRepository.findAll(pages).getContent();

                return  listOrdersPageable;
            }
            else {
                listOrders = ordersRepository.findAll();

                return listOrders;
            }
        }
        catch (Exception e) {
            throw new Exception("Não foi possível recuperar a lista de pedidos ::" + e.getMessage());
        }
    }

    //Count
    public Long count() {
        return ordersRepository.count();
    }

    //Receipt
    public ReceiptDTO receipt (Integer orderID) {

        Orders orders = ordersRepository.getById(orderID);
        List<Orderlines> orderlinesList = orders.getOrderlines();
        ReceiptDTO receiptDTO = new ReceiptDTO();

        receiptDTO.setFirstName(orders.getCustomerId().getFirstName());
        receiptDTO.setLastName(orders.getCustomerId().getLastName());
        receiptDTO.setNetAmount(orders.getNetAmount());
        receiptDTO.setOrderDate(orders.getOrderDate());
        receiptDTO.setOrderId(orders.getOrderId());
        receiptDTO.setTotalAmount(orders.getTotalAmount());

        List<OrderlinesDTO> ordelineItemsList = new ArrayList<>();

        for (Orderlines orderlines : orderlinesList){

            OrderlinesDTO orderlinesDTO = new OrderlinesDTO();

            orderlinesDTO.setProductId(orderlines.getProdId().getProductId());
            orderlinesDTO.setQuantity(orderlines.getQuantity());
            orderlinesDTO.setTitle(orderlines.getProdId().getTitle());

            ordelineItemsList.add(orderlinesDTO);
        }

        receiptDTO.setOrderlinesDTOList(ordelineItemsList);
        return receiptDTO;
    }

}
