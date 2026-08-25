interface sportperson{
	void playsports();
}
interface nssvolunteer{
	void dosocialwork();
}
class student implements sportperson,nssvolunteer{
	String name;
	student(String name){
		this.name=name;
	}
	public void playsports(){
		System.out.println(name+" is at playground");
	}
	public void dosocialwork(){
		System.out.println(name+" is at blood donation champ");
	}
}
class IntefaceEx{
	public static void main(String args[]){
		student s1=new student("Praveena");
		s1.playsports();
		s1.dosocialwork();
	}
}