package collectionPackage;

import java.util.EnumMap;
import java.util.Map.Entry;

public class enumMap {

	
	enum Days {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
    }
	
	 enum ProjectStatus {
	      ACTIVE, INACTIVE
	   }
	public static void main(String[] args) {
		EnumMap<Days, String> enumMap = new EnumMap<>(Days.class);
		 enumMap.put(Days.SUNDAY, "Its Sunday!!");
         enumMap.put(Days.MONDAY, "Its Monday!!");
         enumMap.put(Days.TUESDAY, "Its Tuesday!!");
         enumMap.put(Days.WEDNESDAY, "Its Wednesday!!");
         enumMap.put(Days.THURSDAY, "Its Thursday!!");
         enumMap.put(Days.FRIDAY, "Its Friday!!");
         enumMap.put(Days.SATURDAY, "Its Saturday!!");
         for(Entry<Days, String> entry : enumMap.entrySet()){
             System.out.println(" Key -> " + entry.getKey());
             //System.out.println(" Key -> " + entry.getKey().SUNDAY);
             System.out.println("Value - >" + entry.getValue());
         }
         
         EnumMap<ProjectStatus, Project> enumMap1 = new EnumMap<>(ProjectStatus.class);
         enumMap1.put(ProjectStatus.ACTIVE, new Project(100, "Customer Management System", "Customer Management System"));
         enumMap1.put(ProjectStatus.INACTIVE,new Project(200, "Employee Management System", "Employee Management System"));
         
         for (final Entry<ProjectStatus, Project> entry : enumMap1.entrySet()) {
             final ProjectStatus projectStatus = entry.getKey();
             System.out.println(" Key -> " + projectStatus.name());
             final Project project = entry.getValue();
             System.out.println("Value - >" + project.toString());

	}
	}
}
