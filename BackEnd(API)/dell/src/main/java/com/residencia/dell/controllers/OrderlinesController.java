package com.residencia.dell.controllers;

import com.residencia.dell.entities.Orderlines;
import com.residencia.dell.services.OrderlinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orderlines")
public class OrderlinesController {

    @Autowired
    private OrderlinesService orderlinesService;

    //Find by ID
    @GetMapping("/find/{id}")
    public ResponseEntity<Orderlines> findById(@PathVariable Integer id) {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(orderlinesService.findById(id), headers, HttpStatus.OK);
    }

    //Find all
    @GetMapping("/findall/{page}/{registersQuantity}")
    public ResponseEntity<List<Orderlines>> findAll(@PathVariable Integer page, @PathVariable Integer registersQuantity) throws Exception {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(orderlinesService.findAll(page, registersQuantity), headers, HttpStatus.OK);
    }

    //Count
    @GetMapping("/count")
    public Long count() {
        return orderlinesService.count();
    }

    //Update
    @PutMapping("/update/{id}")
    public Orderlines update(@RequestBody Orderlines orderline, @PathVariable Integer id){
        return orderlinesService.update(orderline, id);
    }

    //Create
    @PostMapping("/create")
    public ResponseEntity<Orderlines> save(@RequestBody Orderlines orderline){
        HttpHeaders headers = new HttpHeaders();
        if(null != orderlinesService.create(orderline))
            return new ResponseEntity<>(orderlinesService.create(orderline), headers, HttpStatus.OK);
        else
            return new ResponseEntity<>(orderlinesService.create(orderline), headers, HttpStatus.BAD_REQUEST);
    }

    //Delete
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Orderlines> delete(@PathVariable Integer id){
        HttpHeaders headers = new HttpHeaders();
        boolean isRemoved = orderlinesService.delete(id);
        if (isRemoved) {
            return new ResponseEntity<>(headers, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
    }


}
