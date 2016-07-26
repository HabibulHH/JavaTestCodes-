
public class GenericStack <T>{
	
   private T[] stackContainer;
   private int head=0;
   private final static int  Capacity=10;
   public GenericStack()
   {
	stackContainer=  (T[])new  Object[Capacity]; 
   }
   
   public boolean push(T element)
   {
	 if(head  <=10)
	 {
		 stackContainer[head]=element;
		 head++;

		 return true ;
      }
	 return false;
		 
   }
   
   public  T pop() {
	head--;
	if(stackContainer!=null && head>-1&&head<10)
	{
		return stackContainer[head] ;	
	}
	else {
		return null;
	}
	  
    }

}
