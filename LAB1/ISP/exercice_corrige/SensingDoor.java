package com.directi.training.isp.exercise;

public class SensingDoor implements Door, ISensing {
    private boolean locked;
    private boolean open;

    @Override
    public void lock() {
        locked = true;
    }

    @Override
    public void unlock() {
        locked = false;
    }

    @Override
    public void open() {
        if (!locked) {
            open = true;
        }
    }

    @Override
    public void close() {
        open = false;
    }

    @Override
    public void proximityCallback() {
        open = true;
    }
}