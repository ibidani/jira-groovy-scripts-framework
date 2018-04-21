import com.atlassian.jira.component.ComponentAccessor

def myProject = ComponentAccessor.projectManager.getProjectByCurrentKey("SCRUMEXAM")
return myProject.getProperties()