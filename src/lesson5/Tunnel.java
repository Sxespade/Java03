package lesson5;

import java.util.concurrent.CyclicBarrier;

public class Tunnel extends Stage {
    private static int count = 1;
    public static final Object mon = new Object();

    public Tunnel() {
        this.length = 80;
        this.description = "Тоннель " + length + " метров";
    }

    @Override
    public void go(Car c) {
        try {
            try {
                System.out.println(c.getName() + " готовится к этапу(ждет): " + description);
                Main.smp.acquire();
                System.out.println(c.getName() + " начал этап: " + description);
                Thread.sleep(length / c.getSpeed() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(c.getName() + " закончил этап: " + description);
                if (count == 0) {
                Main.smp.release();}
                count = 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
