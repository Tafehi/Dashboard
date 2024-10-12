package mysql.test.application.repository;


import mysql.test.application.entity.WeekTable;
import org.springframework.data.jpa.repository.JpaRepository;

//@RepositoryRestResource(path = "index")
public interface WeekTableRepository extends JpaRepository<WeekTable, String> {
}
