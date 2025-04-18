package com.retail.walmart.Controller;
import com.retail.walmart.Model.User;
import com.retail.walmart.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bidding")
public class BiddingController {
    /*
     * This is a controller would be responsible for the BiddingController endpoints.
     * Add the required annotations and create the endpoints.
    */
    @Autowired
    private BiddingService service;

    //To create a bidding using biddingModel object
    @PostMapping
    public ResponseEntity<Object> postBidding(BiddingModel biddingModel) {
        return null;
    }
    //to get the bidding which are greater than the given bid amount
    @GetMapping("/list")
    public ResponseEntity<Object> getBidding(double bidAmount) {
        return null;
    }
    //to update the bidding by id as Path variable and bidding Object
    @PatchMapping("/update/{id}")
    public ResponseEntity<Object> updateBidding(int id,BiddingModel biddingModel) {
        return null;
    }
    //to delete the bidding by using id as Path variable
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteBidding(int id) {
        return null;
    }
}

