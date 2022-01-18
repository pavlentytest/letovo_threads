package ru.samsung.itschool.mdev;

public class MyThread extends Thread {

    private String m;
    private boolean flag;

    public MyThread(String mess) {
        this.m = mess;
        this.flag = true;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        while(flag) {
            Main.test(this.m);
        }
    }
}
