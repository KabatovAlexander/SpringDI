package com.test.lookupInjection;

public class CoreSecond {
    String process = "Calculating";

    public CoreSecond() {
        System.out.println("coreSecond was created.");
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    @Override
    public String toString() {
        return "CoreSecond is" + process;
    }
}
