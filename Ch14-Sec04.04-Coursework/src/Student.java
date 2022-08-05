
public class Student {
	
	private final String name;
	private final int mark;
	
	public Student(String requiredName, int requiredMark) {
		name = requiredName;
		mark = requiredMark;
	}
	
	public String getName() {
		return name;
	}
	
	public int getMark() {
	   return mark;
	}
	
	public int compareTo(Student other) {
		if(mark==other.mark)
			return name.compareTo(other.name);
		else
			return mark - other.mark;
	}
	
	//public String toString() {
	//	return String.format("%-10s got %3d", name, mark);
	//}
}
