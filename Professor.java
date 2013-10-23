
public class Professor extends Person
{
   private String office;

   public Professor(String firstName, String lastName) { 
	   super(firstName, lastName);
	   this.office = null;
   }
   
   public void setOffice(String office) {
	   this.office = office;
   }
   public String getOffice() {
	   return this.office;
   }
   
}

