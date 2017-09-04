package com.patrikpolacek.processes;

public class Smartphone extends ManufacturingProcess {

    public Smartphone(String name) {
        super(name);
    }

    @Override
    public void assembly() {
        System.out.println("Smartphone assembled");
    }

    @Override
    public void testing() {
        System.out.println("Smartphone tested");
    }

    @Override
    public void packaging() {
        System.out.println("Smartphone packaged");
    }

    @Override
    public void storage() {
        System.out.println("Smartphone storaged");
    }


}
