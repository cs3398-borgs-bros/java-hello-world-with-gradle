package hello;



import static org.junit.Assert.*;



import org.junit.Before;

import org.junit.Test;





public class TestGreeter {



   private Greeter g;

	

   @Before

   public void setUp() throws Exception 

   {

      g = new Greeter();

   }



   @Test

   public void testGreeterEmpty() 

   {

      assertEquals(g.getName(),"");

      assertEquals(g.sayHello(),"Hello!");

   }

	

   @Test

   public void testGreeter() 

   {

      g.setName("World");

      assertEquals(g.getName(),"World");

      assertEquals(g.sayHello(),"Hello World!");

   }

   @Test 
   public void newtestCKGreeterpass()
   {
      g.setName("Hey its Carter"); 
      assertEquals(g.sayHello(), "Hello Hey its Carter!");


   }   

   @Test 
   public void newtestCKGreeterFail()
   {
      g.setName("Hey its Carter"); 
      assertEquals(g.sayHello(), "hey its Carter");
   }

}