package com.agiledeveloper;

public class UseResource {
  public static void main(String[] args) {
    Resource.use(new Resource.ResourceUser() {
      public void useResource(Resource resource) {
        resource.use1();
        resource.use2();
      }
    });
  }
}
