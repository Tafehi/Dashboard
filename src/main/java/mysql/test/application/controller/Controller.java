package mysql.test.application.controller;



import mysql.test.application.entity.PieChart;
import mysql.test.application.entity.WeekTable;
import mysql.test.application.repository.PieChartRepository;
import mysql.test.application.repository.WeekTableRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    private PieChartRepository pieChartRepository;
    private WeekTableRepository weekTableRepository;


    public Controller(PieChartRepository pieChartRepository, WeekTableRepository weekTableRepository) {
        this.pieChartRepository = pieChartRepository;
        this.weekTableRepository = weekTableRepository;
    }



    @GetMapping("/")
    public String weekTable (Model model){
        List<WeekTable> weekTables = weekTableRepository.findAll();
        List<PieChart> pieCharts = pieChartRepository.findAll();


        model.addAttribute("weekTables", weekTables);
        model.addAttribute("pieCharts",pieCharts);

        return "index";
    }

}
