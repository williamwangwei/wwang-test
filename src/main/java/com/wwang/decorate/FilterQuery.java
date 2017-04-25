package com.wwang.decorate;

import java.util.ArrayList;
import java.util.List;

public class FilterQuery implements Query {

	private Query query;
    private List<String> words = new ArrayList<>();
    public FilterQuery(Query query) {
        this.query = query;
        words.add("fuck");
        words.add("sex");
    }
    @Override
    public Result query(String sql) {
        for(String word : words) {
            if(sql.contains(word)) return null;
        }
        return query.query(sql);
    }

}
