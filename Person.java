import java.util.ArrayList;
public class Person
{
   private Name name;
   private Address address;
   private ArrayList<Course> courses;
   
   public Person( String first, String last) {
           this.name = new Name(first, last);
           this.address = null;
           this.courses = null;
   }
   
   public void setLastName( String name) {
           this.name = new Name(this.name.getFirst(), name);
   }
   
   public String getLastName() {
           return this.name.getLast();
   }
   
   public String getFirstName() { 
           return this.name.getFirst();
   }
   public String getFullName() { 
           return this.name.toString();
   }

   public void setAddress(Address address) {
           this.address = address;
   }
   public Address getAddress() { 
           return this.address;
   }

   public Course[] getCourses() { 
           return (Course[])this.courses.toArray();
   }
   public void addCourse( Course course ) {
           this.courses.add(course);
   }
   public void remove(Course course) {
           this.courses.remove(course);
   }

    public String toString() { 
            return "Name: " + this.name.toString() + " Address: " + this.address.toString() + " Courses: " + courses.toString(); }
    
    public boolean equals(Object o) 
    { 
    	if(o instanceof Person)
	   {
		   Person b = (Person)o;
		   if(b.toString().equals(toString()))
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
    }
}     
