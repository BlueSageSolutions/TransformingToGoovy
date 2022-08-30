package com.agiledeveloper;

public class Manager {
  private TirelessWorker worker = new TirelessWorker();
  
  public void schedule() {
    System.out.println("Scheduling");
  }

  public void doWork() {
    worker.doWork();
  }

  public void writeReport() {
    worker.writeReport();
  }
}
