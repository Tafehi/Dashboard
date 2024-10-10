package mysql.test.application.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "piechart")
public class PieChart {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "usage")
    private int usage;

    public PieChart() {}

    @Override
    public String toString() {
        return "PieChart{" +
                "Id=" + Id +
                ", usage=" + usage +
                '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getUsage() {
        return usage;
    }

    public void setUsage(int usage) {
        this.usage = usage;
    }
}
