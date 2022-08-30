class Resource {
  private Resource() {
    System.out.println("Allocating resource...");  
  }

  private void close() {
    System.out.println("Cleaingup resource...");  
  }

  void use1() {
    System.out.println("use1 called...");
  }

  void use2() {
    System.out.println("use2 called...");
  }

  static void use(closure) {
    def resource = new Resource()
    
    try {
      closure(resource)
    } finally {
      resource.close()
    }
  }
}
