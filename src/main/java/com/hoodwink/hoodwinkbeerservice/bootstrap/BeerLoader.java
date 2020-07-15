package com.hoodwink.hoodwinkbeerservice.bootstrap;

import com.hoodwink.hoodwinkbeerservice.domain.Beer;
import com.hoodwink.hoodwinkbeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if (beerRepository.count() == 0) {

            beerRepository.save(Beer.builder()
                    .beerName("KJ IPA")
                    .beerStyle("IPA")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .upc(337010000001L)
                    .price(new BigDecimal("12.95"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("KJ Lager")
                    .beerStyle("Lager")
                    .quantityToBrew(150)
                    .minOnHand(25)
                    .upc(337010000002L)
                    .price(new BigDecimal("9.75"))
                    .build());
        }
    }
}
