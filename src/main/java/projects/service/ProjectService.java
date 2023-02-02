package projects.service;

import projects.dao.ProjectDoa;
import projects.entity.Project;

public class ProjectService {

	private ProjectDoa projectDoa = new ProjectDoa();
	
	public Project addProject(Project project) {
		// TODO Auto-generated method stub
		return projectDoa.insertProject(project);
	}

}
