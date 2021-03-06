package application.model.dto.statistics;

import lombok.AllArgsConstructor;
import lombok.Data;
import application.model.StatusSite;

import java.sql.Timestamp;


@Data
@AllArgsConstructor
public class DetailedStatistics {

    private String url;
    private String name;
    private StatusSite status;
    private Timestamp statusTime;
    private String error;
    private long pages;
    private long lemmas;
}
