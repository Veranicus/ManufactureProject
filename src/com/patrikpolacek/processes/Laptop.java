package com.patrikpolacek.processes;

public class Laptop extends ManufacturingProcess {

    public Laptop(String name) {
        super(name);
    }

    @Override
    public void assembly() {
        System.out.println("Laptop assembled");
    }

    @Override
    public void testing() {
        System.out.println("Laptop tested");
    }

    @Override
    public void packaging() {
        System.out.println("Laptop packaged");
    }

    @Override
    public void storage() {
        System.out.println("Laptop storaged");
    }
}
