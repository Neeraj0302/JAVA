class Student{
	String name;
	int studentClass;
	float result;
	
	// Constructor of class Student created;
	Student(String S,int sClass){
		name =S;
		studentClass = sClass;
		System.out.println("Added Student "+ name + " of the roll of class : "+ studentClass);
		}
		
		//This function/method returns name;
		public String getName(){
			return name;
			}
			//This function calculate promoted or not promoted to nex class;
		public void  Publish( ){
			if(result>=33.33){
				   System.out.println(name +" has been promoted to class "+ (studentClass+1));
				   }
			else{
					System.out.println(name +" has been retained to class "+ studentClass);
			       }
			              
			}
			
}
//New class Rwsults derived for class Student;				
class Result extends Student{
		  float subject1;
		  float subject2;
		  float subject3;
		  
		  // Constructor of class Result created;
		  Result(int a,int b,int c,String s,int sClass){
		  	super(s,sClass);
		  	subject1=a;
		      subject2=b;
		      subject3=c;
		      System.out.println( name +" obtain " + subject1+ " marks in subject1");
		  	System.out.println( name +" obtain " + subject2+ " marks in subject2");
		  	System.out.println( name +" obtain " + subject3+ " marks in subject3");
		  	calculate();
		  	}
		  	
		  	// Function calculate the result using variable of super class(Student);
		  	public void calculate(){
		  	super.result=(((subject1+subject1+subject1)*100)/300);
		  	Publish();
		  	System.out.println("***********************************************");
		  	
		  	}
		  
		  } 
//Main class for Solution;		  
class solve{
	
	public static void main(String[] args) {
		Result r=new Result( 96, 95 ,90 , " Neeraj " , 10);
		Result r1=new Result( 50, 60 ,90 , " Riya " , 10);
		Result r2=new Result( 40, 60 ,71 , " Harsh " , 10);
		Result r3=new Result( 50, 60 ,70 , " Soumya " , 10);
		Result r4=new Result( 50, 60 ,89 , " Raksha " , 10);
      }
}
