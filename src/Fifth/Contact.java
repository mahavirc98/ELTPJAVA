package Fifth;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class Stack {
    static final int MAX = 1000;
    int top;
    Contact a[] = new Contact[MAX]; // Maximum size of Stack
 
    boolean isEmpty()
    {
        return (top < 0);
    }
    Stack()
    {
        top = -1;
    }

 
    boolean push(Contact x) throws InvalidException
    {
    	
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            throw new InvalidException("Stack Overflow");
            //return false;
        }
        else {
            a[++top] = x;
            System.out.println(" pushed into stack");
            
            return true;
        }
    }
 
    void pop() throws InvalidException
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            throw new InvalidException("Stack Underflow"); 
            
        }
        else {
            Contact x = a[top--];
            System.out.println("popped ");
            x.display();
        }
    }
 
    void peek()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            //return 0;
        }
        else {
            Contact x = a[top];
            x.display();
        }
    }
}

@SuppressWarnings("serial")
class InvalidException extends Exception{  
	 InvalidException(String s){  
	  super(s);  
	 }  
	}  

public class Contact {
	//SimpleDateFormat dob = new SimpleDateFormat("dd-MMM-yyyy");
	//SimpleDateFormat annivarsary = new SimpleDateFormat("dd-MMM-yyyy");
	DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
	Date dob;
	Date anni;
	String fname,mname,lname,address,area,city,state,country,tnumber,mnumber,email,website,date1;
	int zip;

	Contact(String fname, String mname, String lname, String dob, String anii, String address, String area, String city, int zip, String state, String country, String tnumber, String mnumber, String email, String website){
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		//this.dob = dob;
		//Date birth=new SimpleDateFormat("dd/MM/yyyy").parse(dob);
		//Date birthdate=new SimpleDateFormat("dd/MM/yyyy").parse(dob);
		//this.anii = anii;
		//Date aniversary=new SimpleDateFormat("dd/MM/yyyy").parse(anii);
		this.address = address;
		try {
		this.dob = df.parse(dob);
		this.anni = df.parse(anii);}
		catch(java.text.ParseException e){
			e.printStackTrace();
		}
		this.date1 = dob;
		this.area = area;
		this.city = city;
		this.zip = zip;
		this.state = state;
		this.country = country;
		this.tnumber = tnumber;
		this.mnumber = mnumber;
		this.email = email;
		this.website = website;
		
	}
	
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(fname + " " + lname + " " + dob + " " + anni);
		
	}

	void validate() throws InvalidException {
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		if(this.fname!="" && this.lname!="" && this.email!="" && this.date1 != "" && this.email.matches(regex) && (this.tnumber!="" || this.mnumber !="")) {
			System.out.println("Validated");
		}
		else {
			throw new InvalidException("not valid");  
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contact obj = new Contact("mahavir","sanjay","chordiya","04-07-1998","04-07-1998","SHubham Vishwa","Anandwadi","Narayangaon",410504,"Maharashtra","India","784193","784193","mahavirc07@gmail.com","mahavir.com");
		try {
			obj.validate();
		}catch(Exception m) {
			System.out.println("Exception Occured" + m);
		}
		System.out.println("Rest of the code");
		Stack s = new Stack();

		try {
			s.push(obj);
		}catch(Exception m) {
			System.out.println("Exception Occured" + m);
		}
		try {
		s.pop();
	}catch(Exception m) {
		System.out.println("Exception Occured" + m);
	}
		s.peek();
	}

}
