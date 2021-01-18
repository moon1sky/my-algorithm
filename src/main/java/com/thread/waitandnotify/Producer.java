package com.thread.waitandnotify;

public class Producer extends Thread {
    private Ticket ticket;

    Producer(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        synchronized (ticket) {
            while (true) {
                if (ticket.ticket < 10) {
                    ticket.add();
                    System.out.println("生产 start== " + ticket);
                } else {
                    try {
                        System.out.println("ticket是" + ticket + " 暂停生产");
                        ticket.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                ticket.notifyAll();
            }
        }
    }

}
