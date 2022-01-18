package ru.samsung.itschool.mdev;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // процесс (программа)
        // поток
        // многопоточность
        // [+][-][+][-]
        MyThread thread1 = new MyThread("+"); // 1 поток
        thread1.start();
        MyThread thread2 = new MyThread("-"); // 2 поток
        thread2.start();
        Thread.sleep(3000);
        thread2.setFlag(false);
        thread2.join(); // ждет завершения потока (присоедение)
        test("Stopped-2");
    }

    public static Object key = new Object();

    // метод требующий большое количество времени
    public static void test(String message) {
       // synchronized (key) {
            try {
                System.out.print("[");
                Thread.sleep(200);
                System.out.print(message);
                Thread.sleep(200);
                System.out.print("]");
              //  key.notify();// возобновление потока наход в режиме ожидание
              //  key.wait(); // положить поток в режим ожидания
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
       // }
    }

}
