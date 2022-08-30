class Manager {
  @Delegate TirelessWorker worker = new TirelessWorker()
  
  void schedule() {
    println "Scheduling"
  }
}
