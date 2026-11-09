public class Alarm extends Thread {
    public int timer;
    public String name;
    public int id;
    public static int nextId = 1;

    public Alarm (String name, int timer) {
        this.id = nextId++;
        if (name == null || name.isEmpty()) {
            this.name = "Alarm " + id;
        } else {
            this.name = name;
        }
        this.timer = timer * 1000;
    }

    public void run() {
       while (timer > 0) {
            try {
                Thread.sleep(1000);
                timer -= 1000;
                if (timer == 10000) {
                    System.out.println(name + " will go off in 10 seconds.");
                }
            } catch (InterruptedException e) {
                System.out.println(name + " has been interrupted at " + timer / 1000 + " seconds remaining.");
                return;
            }
        }
        System.out.println(name + " is going off now!");


    }

    public String toString() {
        return name + " is currently at " + timer / 1000 + " seconds)";
    }
}