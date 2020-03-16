package com.jyami.ewhadailycommit.crawler;


import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by jyami on 2020/03/16
 */
public class GitHomeCrawler {

    private GitHomeCrawler(){}

    public static List<Commit> getAllBlockOfYears(Document document){
        Elements calendal = document.select(".js-calendar-graph-svg");
        return calendal.stream()
                .map(c -> c.select("rect.day"))
                .map(Commit::of)
                .collect(Collectors.toList());
    }
}
