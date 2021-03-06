package application.response;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import application.model.dto.search.PageSearch;

import java.util.List;

@Data
@RequiredArgsConstructor
public class SearchResponse {

    private String result = "true";
    private int count;
    private List<PageSearch> data;

    public SearchResponse(int count, List<PageSearch> searchResult) {
        this.count = count;
        this.data = searchResult;
    }
}
