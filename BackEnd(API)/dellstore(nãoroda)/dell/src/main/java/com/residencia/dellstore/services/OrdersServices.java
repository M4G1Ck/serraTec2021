package com.residencia.dellstore.services;

import com.residencia.dellstore.vo.OrderlinesVO;
import com.residencia.dellstore.vo.ReceiptVO;
import com.residencia.dellstore.entities.Orderlines;
import com.residencia.dellstore.entities.Orders;
import com.residencia.dellstore.repositories.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrdersServices {

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
    public ReceiptVO receipt (Integer orderID) {

        Orders orders = ordersRepository.getById(orderID);
        List<Orderlines> orderlinesList = orders.getOrderlines();
        ReceiptVO receiptVO = new ReceiptVO();

        receiptVO.setFirstName(orders.getCustomerId().getFirstName());
        receiptVO.setLastName(orders.getCustomerId().getLastName());
        receiptVO.setNetAmount(orders.getNetAmount());
        receiptVO.setOrderDate(orders.getOrderDate());
        receiptVO.setOrderId(orders.getOrderId());
        receiptVO.setTotalAmount(orders.getTotalAmount());

        List<OrderlinesVO> ordelineItemsList = new ArrayList<>();

        for (Orderlines orderlines : orderlinesList){

            OrderlinesVO orderlinesVO = new OrderlinesVO();

            orderlinesVO.setProductId(orderlines.getProdId().getProductId());
            orderlinesVO.setQuantity(orderlines.getQuantity());
            orderlinesVO.setTitle(orderlines.getProdId().getTitle());

            ordelineItemsList.add(orderlinesVO);
        }

        receiptVO.setOrderlinesVOList(ordelineItemsList);
        return receiptVO;
    }

}
