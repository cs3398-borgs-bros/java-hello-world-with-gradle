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
   public void newtestDLGreeterPass() 
   {
      g.setName("Daniel is testing");
      assertEquals(g.sayHello(),"Hello Daniel is testing!");
      g.setName("");
      assertEquals(g.sayHello(),"Hello!");
   }

}