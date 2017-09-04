package com.patrikpolacek.Clients;

import com.patrikpolacek.processes.Laptop;
import com.patrikpolacek.processes.ManufacturingProcess;

public class DeviceFactory {

    public static void main(String[] args) {

        ManufacturingProcess manufacturer = new Laptop("Asus process");
        manufacturer.launchProrcess();
    }
}
