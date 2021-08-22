
public class Students {

	public void getStudentinfo(int id) {
		System.out.println(" Id of the Student is " + id);
		System.out.println(" ");
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println(" Student Id is " + id);
		System.out.println(" ");
		System.out.println(" Student Name is " + name);
	}
	
	public void getStudentInfo(String email, long phoneNo) {
		System.out.println(" Student mail Id" + email);
		System.out.println(" ");
		System.out.println(" Student Phone No is " + phoneNo);
		System.out.println(" ");
	}

	public static void main(String[] args) {
		
		Students info = new Students();
		
		info.getStudentInfo(101, "Gokul");

		info.getStudentInfo(" gokul.raj600@gmaill.com ", 9094139950l);

		info.getStudentinfo(101);
	}

}
