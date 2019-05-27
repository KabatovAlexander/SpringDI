package com.test.lookupInjection;

public abstract class RequestProcess {

    private CoreFirst coreFirst;
    private CoreSecond coreSecond;

    public CoreSecond getCoreSecond(){
        return coreSecond;
    }

    public CoreFirst getCoreFirst() {
        return coreFirst;
    }
}
