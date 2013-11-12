/**
 * 
 */

/**
 * @author mwagner4
 *
 */
public class Student {

	/**
	 * @param args
	 */
	int id =0;
	
	String  name;
	
	private Lehrveranstaltungen [] asso;
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		
	}

	public void setName(String name){

		
		
		this.name = name;
		
		
			}
	
	public String getName() {
		
		
		
		
		return name;
		
	}
	
	public void setId(int id){
		
		this.id=id;
		
		
//		private boolean isValidId(){
//			
//			
//			
//			
//			return true;
//		}
		
		
		
		
	
	}
	
	public int getId(){
		
		
		return id;
	}

	
	
	
	
}

public class Lehrveranstaltungen {
	
	String modul;
	String name;
	int semester;
	float note;
	boolean bestanden;
	
	
	public boolean pruefen (float note){
		
		if (note<=4){
			
			bestanden =true;
			
		}
		else {
			bestanden = false;
		}
		
		
		
		return bestanden;
	}
	
	public void setModul(String modul){
		
	}
	public String getModul(){
		
	}
	public void setName(String name){
		
	}
	public String getName(){
		
		
	}
	public void setSemester(int semester){
		
	}
	public int getSemester(){
		
	}
	
	public float getNote(){
		
	}
	
}