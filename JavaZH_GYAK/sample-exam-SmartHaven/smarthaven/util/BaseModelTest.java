package smarthaven.util;
import static org.junit.jupiter.api.Assertions.*;

import smarthaven.device.Category;
//      .testWith(testCase("testInitialization"), "Ellenőrizzük a fenti viselkedést.");
//      .testWith(testCase("testTurnOnAndOff"), "Ellenőrzi a ki- és bekapcsolást.");
//      .testWith(testCase("testText"), Ellenőrizzük az alábbiakat:
//          Device: BaseModel, Type: FRIDGE, Identifier: FRIDGE1-IDx, PowerStatus: true
    
public class BaseModelTest{
    @Test
    public void testInitialization(){
        BaseModel teszt = new BaseModel("id1", Category.FRIDGE);
        assertTrue(teszt instanceof BaseModel);
        assertThrows(IllegalArgumentException, () -> new BaseModel(null, Category.FRIDGE));
    }
}