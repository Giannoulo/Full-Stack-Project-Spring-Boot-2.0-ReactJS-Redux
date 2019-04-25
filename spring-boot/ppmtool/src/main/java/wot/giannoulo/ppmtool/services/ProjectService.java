package wot.giannoulo.ppmtool.services;

import org.hibernate.validator.constraints.ScriptAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wot.giannoulo.ppmtool.domain.Project;
import wot.giannoulo.ppmtool.repositories.ProjectRepository;

/**
 * Created by George Giannoulopoulos
 * on 24/4/2019.
 */

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){

        //logic
        return projectRepository.save(project);
    }


}
