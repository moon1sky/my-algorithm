package com.thread.waitandnotify;

public class Consumer extends Thread {

    private Ticket ticket;

    Consumer(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        synchronized (ticket) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (ticket.ticket > 0) {
                ticket.sub();
                System.out.println(Thread.currentThread().getName() + " 消费 start :" + ticket);
            } else {
                try {
                    ticket.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            ticket.notifyAll();
        }


    }
}
