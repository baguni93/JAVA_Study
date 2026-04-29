package ch16.sec01.exam06;

public class Member {
   private String id;
   private String name;

   public Member(String id) {
       this.id = id;
       System.out.println("Member created");
   }


   public Member(String id, String name) {
       this.id = id;
       this.name = name;
       System.out.println("Member created");
   }

   @Override
    public String toString() {
       String info= "{id:" + id + ", name:" + name + "}";
       return  info;
   }
}
