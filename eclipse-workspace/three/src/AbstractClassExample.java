abstract class MyClass {
   public abstract void display();
   public abstract void setName(String name);
   public abstract void setAge(int age);
}
 class AbstractClassExample extends MyClass{
   public void display(){
      System.out.println("This is the subclass implementation of the displaymethod ");
   }
   public static void main(String args[]) {
	      AbstractClassExample obj =new AbstractClassExample();
	      obj.display();
	   }
@Override
public void setName(String name) {
	// TODO Auto-generated method stub
	
}
@Override
public void setAge(int age) {
	// TODO Auto-generated method stub
	
}
}
