package wilp.dbms.attendancemanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import wilp.dbms.attendancemanagement.model.Login;

@CrossOrigin("*")
@RepositoryRestResource(collectionResourceRel = "login", path = "login")
public interface LoginRepo extends JpaRepository<Login, Integer> {

}
