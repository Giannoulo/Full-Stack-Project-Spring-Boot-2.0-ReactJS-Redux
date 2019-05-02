package wot.giannoulo.ppmtool.exceptions;

/**
 * Created by George Giannoulopoulos
 * on 2/5/2019.
 */

public class ProjectIdExceptionResponse {

    private  String projectIdentifier;

    public ProjectIdExceptionResponse(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    public String getProjectIdentifier() {
        return projectIdentifier;
    }

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }
}
