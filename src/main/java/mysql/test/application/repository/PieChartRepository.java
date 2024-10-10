package mysql.test.application.repository;


import mysql.test.application.entity.PieChart;
import org.springframework.data.jpa.repository.JpaRepository;


//@RepositoryRestResource(path = "index")
public interface PieChartRepository extends JpaRepository <PieChart, Integer> {
}
