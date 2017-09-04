package com.patrikpolacek.processes;

public abstract class ManufacturingProcess {

    private String processName;

    public ManufacturingProcess(String name) {
        processName = name;

    }

    protected abstract void assembly();

    protected abstract void testing();

    protected abstract void packaging();

    protected abstract void storage();

//    template method
    public void launchProrcess(){

        if(processName!= null && !processName.isEmpty()) {
            assembly();
            testing();
            packaging();
            storage();
        }else {
            System.out.println("no process name was specified");
        }
    }


}

