package com.hoodwink.hoodwinkbeerservice.repositories;

import com.hoodwink.hoodwinkbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository  extends PagingAndSortingRepository<Beer, UUID> {

}
