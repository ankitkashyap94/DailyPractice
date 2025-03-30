package OOPsConcepts;

import com.sun.security.jgss.GSSUtil;

public interface Device {
    public void turnOn();
    public void turnOff();
    public void call();
    public void music();
    public void gps();
    public void bluetooth();
    public void wifi();
}


class xiaomi implements Device{

    @Override
    public void turnOn() {
        System.out.println("Xiaomi phone turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("xiaomi phone turning off");
    }

    @Override
    public void call() {
        System.out.println("xiaomi phone making call");
    }

    @Override
    public void music() {
        System.out.println("xiaomi phone playing music");
    }

    @Override
    public void gps() {
        System.out.println("Xiaomi phone getting location");
    }

    @Override
    public void bluetooth() {
        System.out.println("Xiaomi phone looking for pairing devices");
    }

    @Override
    public void wifi() {
        System.out.println("Xiaomi phone searching for wifi network");
    }
}


