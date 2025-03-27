import java.util.ArrayList;
import java.util.List;

public class School {
    	private String name;
    	private String address;
    	private Principal principal;
    	private List<ClassRoom> classRooms;

    	public School(String name, String address, Principal principal) {
        	this.name = name;
        	this.address = address;
        	this.principal = principal;
        	this.classRooms = new ArrayList<>();
    	}

    	public void addClassRoom(ClassRoom classRoom) {
        	classRooms.add(classRoom);
    	}

    	@Override
    	public String toString() {
        	return "School: " + name + "\nAddress: " + address + "\n" + principal.toString() + "\nClasses:\n" + classRooms;
    	}
}