package swabhav.techlabs;

public class StudentManager {

	public StudentManager find(String studentID) throws HimanshuException {

		if (studentID.equals("1344549")) {
			return new StudentManager();

		} else {
			throw new HimanshuException("Could not find student with ID " + studentID);
		}
	}
}
