package wot.giannoulo.ppmtool.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import wot.giannoulo.ppmtool.domain.Project;
import wot.giannoulo.ppmtool.services.MapValidationErrorService;
import wot.giannoulo.ppmtool.services.ProjectService;

import javax.validation.Valid;
import javax.xml.ws.Response;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by George Giannoulopoulos
 * on 24/4/2019.
 */

@RestController
@RequestMapping("/api/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @Autowired
    private MapValidationErrorService mapValidationErrorService;

    @PostMapping("")
    public ResponseEntity<?> createNewProject(@Valid @RequestBody Project project, BindingResult result){

        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
        if(errorMap!=null) return errorMap;

        projectService.saveOrUpdateProject(project);

        return new ResponseEntity<Project>(project, HttpStatus.CREATED);
    }

    @GetMapping("/{projectId}")
    public ResponseEntity<?> getProjectById(@PathVariable String projectId){
        Project project = projectService.findProjectByIdentifier(projectId);

        return new ResponseEntity<Project>(project, HttpStatus.OK);
    }

    @GetMapping("/all")
    public Iterable<Project> getAllProjects(){return projectService.findAllProjects();}
}
