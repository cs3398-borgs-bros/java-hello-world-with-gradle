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
   
   public void newtestWGGreeterPass() 
   {

      g.setName("its your boy Walter follow me at @aguynamewalter");

      assertEquals(g.getName(),"its your boy Walter follow me at @aguynamewalter");

      assertEquals(g.sayHello(),"Hello its your boy Walter follow me at @aguynamewalter!");

   }
   
   @Test
   
   public void newtestWGGreeterFail() 
   {

      g.setName("its your boy Walter follow me at @aguynamewalter");

      assertEquals(g.getName(),"its your boy Walter follow me at ");

      assertEquals(g.sayHello(),"Hello its your boy Walter follow me at ");

   }

}