package com.thread.threadfilter;

public class Admin {

    static PrinterProcessor printerProcessor;

    static {
        SaveProcessor saveProcessor = new SaveProcessor(null);
        printerProcessor = new PrinterProcessor(saveProcessor);

        saveProcessor.setName("saveProcessor");
        saveProcessor.start();
        printerProcessor.setName("printerProcessor");
        printerProcessor.start();


    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Request request = new Request("zhang san");
            printerProcessor.process(request);
        }
    }


}
