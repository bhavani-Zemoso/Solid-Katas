package org.example;

public class Application {
    public static void main(String[] args) {
        Application app = new Application();

        app.execute(new LightSwitchService());
        app.execute(new LightBrightnessService());
    }

    public void execute(MyLightService lightService) {
        lightService.on(887, 959, 9, 629 );
        lightService.on(454, 844, 398, 448);

        lightService.off(539, 559, 243, 965);
        lightService.off(370, 676, 819, 868);
        lightService.off(145, 370, 40, 997);
        lightService.off(301, 808, 3, 453);

        lightService.toggle(720, 897, 196, 994);
        lightService.toggle(831, 904, 394, 860);

        System.out.println(lightService.count());
    }
}
