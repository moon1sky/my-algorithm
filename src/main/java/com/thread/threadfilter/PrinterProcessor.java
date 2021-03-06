package com.thread.threadfilter;

import java.util.concurrent.LinkedBlockingQueue;

public class PrinterProcessor extends Thread implements Processor {


    LinkedBlockingQueue<Request> linkedBlockingQueue = new LinkedBlockingQueue();


    private final Processor processor;

    public PrinterProcessor(Processor processor) {
        this.processor = processor;
    }


    @Override
    public void process(Request request) {
        linkedBlockingQueue.add(request);
    }


    @Override
    public void run() {
        while (true){
            try {
                Request request = linkedBlockingQueue.take();
                System.out.println("我的责任是打印请求:"+request);
                if(processor!=null){
                    processor.process(request);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}
