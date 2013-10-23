public class Name
{
   private String first, last;
   public Name(String first, String last) {
           this.first = first;
           this.last = last;
   }
   
   public String getFirst() {
           return first;
   }
   
   public String getLast() {
           return last;
   }
   
   public String toString() { 
           return first + " " + last;
   }
   public boolean equals(Object o) {
	   if(o instanceof Name)
	   {
		   Name b = (Name)o;
		   if(b.getFirst().equals(first))
		   {
			   if(b.getLast().equals(last))
			   {
				   return true;
			   }else
			   {
				   return false;
			   }
		   }else
		   {
			   return false;
		   }
	   }else
	   {
		   return false;
	   }
   }
}
