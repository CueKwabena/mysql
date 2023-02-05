package projects.service;

import java.util.List;
import java.util.NoSuchElementException;

import projects.dao.ProjectDoa;
import projects.entity.Project;

public class ProjectService {

	private ProjectDoa projectDoa = new ProjectDoa();
	
	public Project addProject(Project project) {		
		return projectDoa.insertProject(project);
	}

	/**
	 * This method calls the project DOA to retrieve all project rows without accompanying details
	 * (materials, steps and categories).
	 * 
	 * @return A list of project records.
	 */
	public List<Project> fetchAllProjects() {		
		return projectDoa.fetchAllProjects();
	}

	/**
	 * This method calls the project DAO to get all project details, including materials, steps, and 
	 * categories. If the project ID is invalid, it throws an exception.
	 * 
	 * @param projectId The project ID
	 * @return A Project object if successful.
	 * @throws NoSuchElementException Thrown if the project with the given ID does not exist.
	 */
	public Project fetchProjectById(Integer projectId) {	
		return projectDoa.fetchProjectById(projectId).orElseThrow(() -> new NoSuchElementException(
				"Project with project ID=" + projectId + " does not exist."));
	}
}
