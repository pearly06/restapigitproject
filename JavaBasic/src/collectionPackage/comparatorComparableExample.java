package collectionPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Project1 implements Comparable{

	private int projectId;
    private String projectName;
    
    public void setProjectId(int projectId) {
        this.projectId = projectId;
     }


    public int getProjectId() {
        return projectId;
     }
    public void setprojectName(String projectName) {
        this.projectName = projectName;
     }


    public String getprojectName() {
        return projectName;
     }

    public int compareTo(Project1 o) {
		
		return this.projectId = o.getProjectId();
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return o.hashCode();
		
	}


	
}


public class comparatorComparableExample {

	public static void main(String[] args) {
		
		sortingCustomObjectsByComparable();
	}
	
	private static void sortingCustomObjectsByComparable() {
		// Sort Projects by project id in ascending order.
		List<Project1> Projects = new ArrayList<>();
		Project1 project = new Project1();
		project.setProjectId(100);
        project.setprojectName("project 100");
        Projects.add(project);
        Project1 project2 = new Project1();
        project2.setProjectId(200);
        project2.setprojectName("project 200");
        Projects.add(project2);
        Project1 project3 = new Project1();
        project3.setProjectId(50);
        project3.setprojectName("project 50");
        Projects.add(project3);
        // // Sorting project by project id in ascending order in Java
    Collections.sort(Projects);
        System.out.println("Sorting project by project id in ascending order in Java");
        printList(Projects);
     // Sorting project by project id in descending order in Java
        Collections.sort(Projects, Collections.reverseOrder());
        Collections.reverse(Projects);
        System.out.println("Sorting project by project id in descending order in Java");
        printList(Projects);
        //shuffle
        System.out.println("shuffle");
        Collections.shuffle(Projects);
        printList(Projects);
     // Sorting project by project name in ascending order in Java
        Comparator comparator = new Comparator(){
        	public int compare(Project1 o1, Project1 o2) {
				
				 return o1.getprojectName().compareTo(o2.getprojectName());
			}

			@Override
			public int compare(Object o1, Object o2) {
				
				return 0;
			}

        };
        	
        }

			
			
			public static void printList(List<Project1> Projectsna) {
				for ( Project1 projectex : Projectsna) {
					   System.out.println(projectex.getProjectId());
					   System.out.println(projectex.getprojectName());
					  }
			}

	}

