package application.model.dto.statistics;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;


@Data
@AllArgsConstructor
public class Statistics {

    private TotalStatistics total;
    private List<DetailedStatistics> detailed;
}
