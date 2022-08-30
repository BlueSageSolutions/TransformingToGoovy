package com.agiledeveloper;

public class Resource {
  private Resource() {
    System.out.println("Allocating resource...");  
  }

  private void close() {
    System.out.println("Cleaingup resource...");  
  }

  public void use1() {
    System.out.println("use1 called...");
  }

  public void use2() {
    System.out.println("use2 called...");
  }

  public static void use(ResourceUser resourceUser) {
    Resource resource = new Resource();
    try {
      resourceUser.useResource(resource);
    } finally {
      resource.close();
    }
  }

  public interface ResourceUser {
    void useResource(Resource resource);
  }
}
