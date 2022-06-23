package com.revature.service;

import com.revature.model.Offer;
import com.revature.repository.OfferRepository;

import java.util.List;

public class OfferService {

    OfferRepository offerRepository;

    // offer constructor
    public OfferService()
    {offerRepository = new OfferRepository();}

    //constructor for offerRepository instance object variable
    public OfferService(OfferRepository offerRepository) {this.offerRepository = offerRepository;}

    public List<Offer>getAllOffers() {
        return offerRepository.getAll();
    };

    public Offer createOffer(Offer offer) {return offerRepository.create(offer);
    }
}
