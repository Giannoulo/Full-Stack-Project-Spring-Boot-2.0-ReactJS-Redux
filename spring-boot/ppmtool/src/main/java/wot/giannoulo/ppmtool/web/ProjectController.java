package wot.giannoulo.ppmtool.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wot.giannoulo.ppmtool.domain.Project;
import wot.giannoulo.ppmtool.services.ProjectService;

import javax.validation.Valid;

/**
 * Created by George Giannoulopoulos
 * on 24/4/2019.
 */

@RestController
@RequestMapping("/api/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping("")
    public ResponseEntity<?> createNewProject(@Valid @RequestBody Project project, BindingResult result){

        if(result.hasErrors()){
            return new ResponseEntity<String>( "Invalid Project Object", HttpStatus.BAD_REQUEST);
        }
        projectService.saveOrUpdateProject(project);
        return new ResponseEntity<Project>(project, HttpStatus.CREATED);
    }
}
