package enumabstract;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountTest {

    @Test
    void testSpecialOffer(){
        assertEquals(8000,Discount.SPECIAL_OFFER.getAmountToPay(1000,10));
    }

    @Test
    void testBlackFridayWithTwoPieces(){
        assertEquals(750,Discount.BLACK_FRIDAY_OFFER.getAmountToPay(500,2));
    }

    @Test
    void testBlackFridayWithElevenPieces(){
        assertEquals(8000,Discount.BLACK_FRIDAY_OFFER.getAmountToPay(1000,11));
    }

}