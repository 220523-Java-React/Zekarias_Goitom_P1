package com.revature.controller;

import com.revature.model.Offer;
import com.revature.model.User;
import com.revature.service.OfferService;
import com.revature.service.UserService;
import io.javalin.http.Handler;

public class OfferController {
    OfferService offerService;

    public OfferController() { offerService = new OfferService();}

    public OfferController(OfferService offerService) {this.offerService = offerService;}

    public Handler getAllOffers = context -> {
        context.json(offerService.getAllOffers());
    };

    public Handler createOffer = context -> {
        Offer offer = context.bodyAsClass(Offer.class);
        offerService.createOffer(offer);
    };


}
