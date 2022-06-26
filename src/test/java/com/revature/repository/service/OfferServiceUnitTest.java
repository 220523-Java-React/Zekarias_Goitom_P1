/*
package com.revature.repository.service;

import com.revature.model.Offer;
import com.revature.service.OfferService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class OfferServiceUnitTest {
    List<Offer> mockList = Mockito.mock(List.class);

    @Test
    public void whenGivenOfferObjectCreateOfferDoesNotThrowAnException(){
        Offer offer = new Offer();
        OfferService service = new OfferService();

        // we've turned our service invocation into an executable that can be called by the assertion
        Assertions.assertDoesNotThrow(() -> service.createOffer(offer));
    }

//    @Test
//    public void whenGivenOfferObjectCreateOfferReturnsTrue(){
//        Offer offer = new Offer();
//        OfferService service = new OfferService();
//        Mockito.when(mockList.add(offer)).thenReturn(true);
//        boolean result = service.createOffer(offer);
//        Assertions.assertTrue(result);
//    }

    @Test
    public void whenGetAllOffersIsCalledReturnsListOfOffers(){
        // this method is also tricky as we can't really ensure the list returns itself
        // so instead, we once again just assert that this execution doesn't throw an exception

        OfferService service = new OfferService();
        Assertions.assertDoesNotThrow(() -> service.getAllOffers());
    }


//    @Test
//    public void whenGivenValidIdGetOfferByIdReturnsWithThatOfferId(){
//        Offer offer = new Offer(0, "approved", "open" "rejected");
//
//        // fake the size of the list when it is called
//        Mockito.when(mockList.size()).thenReturn(1);
//        Mockito.when(mockList.get(0)).thenReturn(offer);
//        OfferService service = new OfferService(mockList);
//        Offer result = service.getOfferById(0);
//        Assertions.assertEquals(offer, result);
//    }

}

*/