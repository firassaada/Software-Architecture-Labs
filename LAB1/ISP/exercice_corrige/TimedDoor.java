package com.directi.training.isp.exercise;

public class TimedDoor implements Door, ITimed {
    private static final int TIME_OUT = 100;
    private boolean locked;
    private boolean open;

    public TimedDoor(Timer timer) {
        timer.register(TIME_OUT, this);
    }

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
    public void timeOutCallback() {
        locked = true;
    }
}
