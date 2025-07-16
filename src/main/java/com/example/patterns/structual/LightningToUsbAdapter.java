package com.example.patterns.structual;

public class LightningToUsbAdapter {

    private LightningCharger lightningCharger; //используем LightningCharger как поле для LightningToUsbAdapter

    //конструктор, принимающий LightningCharger для адаптации в старое З/У
    public LightningToUsbAdapter(LightningCharger lightningCharger) {
        this.lightningCharger = lightningCharger;
    }

    //адаптируемый метод зарядки для usb-c для зарядки lightning
    public String chargeWithUsbC() {
        return lightningCharger.chargeWithLightning();
    }
}
