package com.test.lookupInjection;

public class CoreFirst {
    String process = "Validating";

    public CoreFirst() {
        System.out.println("coreFirst was created.");
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    @Override
    public String toString() {
        return "CoreFirst is" + process;
    }
}
