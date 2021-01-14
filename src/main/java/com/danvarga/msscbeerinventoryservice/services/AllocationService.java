package com.danvarga.msscbeerinventoryservice.services;

import com.danvarga.brewery.model.BeerOrderDto;

public interface AllocationService {

    Boolean allocateOrder(BeerOrderDto beerOrderDto);
}
