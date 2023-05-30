package day2;

public class OverLoading {
		public void getStudentDetails(int ID) {
			System.out.println(ID);
		}
		public void getStudentDetails(String name) {
			System.out.println(name);
		}
		public void getStudentDetails(boolean backLogs) {
			System.out.println(backLogs);
		}
		public void getStudentDetails(String email, String linkedinID) {
			System.out.println(email);
			System.out.println(linkedinID);
		}
		public void getStudentDetails(int countryCode, long mobileNo) {
			System.out.println(countryCode + mobileNo);
		}
		public void main(String[] args) {

			OverLoading details = new OverLoading();
			details.getStudentDetails("Navin");
			details.getStudentDetails(32);
			details.getStudentDetails(91, 8838071780L);
			details.getStudentDetails("NavinSandy007@hotmail.com", "navinsandy");
			details.getStudentDetails(true);

		}

	}


