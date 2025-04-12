package _08_mocking.models;

import _07_intro_to_mocking.models.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class DeliveryDriverTest {

    DeliveryDriver deliveryDriver;

    @Mock
    CellPhone cellphone;
    @Mock
    Car car;
    @BeforeEach
    void setUp() {
    	MockitoAnnotations.openMocks(this);
    	
    	deliveryDriver = new DeliveryDriver("John", car, cellphone);
    }

    @Test
    void itShouldWasteTime() {
        //given
    	boolean expectedwastetime = true;
    	
    	when(deliveryDriver.wasteTime()).thenReturn(true);
    	
    	boolean actualwastetime = deliveryDriver.wasteTime();
    	
        //when
    	
        //then
    	
    	assertEquals(expectedwastetime, actualwastetime);
    }

    @Test
    void itShouldRefuel() {
        //given
    	boolean expectedRefuel = true;
    	
    	int octaneLevel = 99;
        //when
    	when(deliveryDriver.refuel(octaneLevel)).thenReturn(true);
    	
    	boolean actualRefuel = deliveryDriver.refuel(octaneLevel);
    	
        //then
    	
    	assertEquals(expectedRefuel, actualRefuel);
    }

    @Test
    void itShouldContactCustomer() {
        //given
    	boolean expectedContact = true;
    	
    	String phoneNumber = "911";
    	
    	when(deliveryDriver.contactCustomer(phoneNumber)).thenReturn(true);
    	
    	boolean actualContact = deliveryDriver.contactCustomer(phoneNumber);
    	
    	assertEquals(expectedContact, actualContact);
    	
        //when

        //then
    }

}