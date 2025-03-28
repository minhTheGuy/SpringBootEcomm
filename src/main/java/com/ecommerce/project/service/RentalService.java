package com.ecommerce.project.service;

import com.ecommerce.project.model.Rental;
import com.ecommerce.project.payload.ProductDTO;

import java.util.List;

public interface RentalService {
    void addRental(Rental rental);
    void updateRental(Rental rental);
    void deleteRental(int rentalId);
    List<Rental> getAllRentals();
    Rental getRentalById(int rentalId);
}