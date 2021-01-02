package com.danvarga.msscbeerinventoryservice.web.mappers;

import com.danvarga.msscbeerinventoryservice.domain.BeerInventory;
import com.danvarga.msscbeerinventoryservice.web.model.BeerInventoryDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}