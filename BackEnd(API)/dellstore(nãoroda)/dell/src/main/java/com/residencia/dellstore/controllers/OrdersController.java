package com.residencia.dellstore.controllers;

import com.residencia.dellstore.vo.ReceiptVO;
import com.residencia.dellstore.entities.Orders;
import com.residencia.dellstore.services.OrdersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private OrdersServices ordersServices;

    //Find by ID
    @GetMapping("/find/{id}")
    public ResponseEntity<Orders> findById(@PathVariable Integer id) {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(ordersServices.findById(id), headers, HttpStatus.OK);
    }

    //Receipt
    @GetMapping("/receipt/{id}")
    public ResponseEntity<ReceiptVO> receipt (@PathVariable Integer id) {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(ordersServices.receipt(id), headers, HttpStatus.OK);
    }

    //Find all
    @GetMapping("/findall/{page}/{registersQuantity}")
    public ResponseEntity<List<Orders>> findAll(@PathVariable Integer page, @PathVariable Integer registersQuantity) throws Exception {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(ordersServices.findAll(page, registersQuantity), headers, HttpStatus.OK);
    }

    //Count
    @GetMapping("/count")
    public Long count() {
        return ordersServices.count();
    }

    //Update
    @PutMapping("/update/{id}")
    public Orders update(@RequestBody Orders order, @PathVariable Integer id){
        return ordersServices.update(order, id);
    }

    //Create
    @PostMapping("/create")
    public ResponseEntity<Orders> save(@RequestBody Orders order){
        HttpHeaders headers = new HttpHeaders();
        if(null != ordersServices.create(order))
            return new ResponseEntity<>(ordersServices.create(order), headers, HttpStatus.OK);
        else
            return new ResponseEntity<>(ordersServices.create(order), headers, HttpStatus.BAD_REQUEST);
    }

    //Delete
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Orders> delete(@PathVariable Integer id){
        HttpHeaders headers = new HttpHeaders();
        boolean isRemoved = ordersServices.delete(id);
        if (isRemoved) {
            return new ResponseEntity<>(headers, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
    }
}
