package wot.giannoulo.ppmtool.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import wot.giannoulo.ppmtool.domain.Project;

/**
 * Created by George Giannoulopoulos
 * on 24/4/2019.
 */

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

    Project findByProjectIdentifier(String projectId);

    @Override
    Iterable<Project> findAll();
}
