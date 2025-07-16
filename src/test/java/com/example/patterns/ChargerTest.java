package com.example.patterns;

import com.example.patterns.structual.LightningCharger;
import com.example.patterns.structual.LightningToUsbAdapter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChargerTest {

    @Test
    public void testCharger() {

        //iphone lightning зарядка
        LightningCharger lightningCharger = new LightningCharger();
        //iphone lightning зарядка с поддержкой usb-c
        LightningToUsbAdapter adapter = new LightningToUsbAdapter(lightningCharger);
        //ПРОВЕРКА зарядка с помощю нового адаптера + поддержка usbC
        String result = adapter.chargeWithUsbC();
        assertEquals("iphone lightning зарядка", result);
    }
}
