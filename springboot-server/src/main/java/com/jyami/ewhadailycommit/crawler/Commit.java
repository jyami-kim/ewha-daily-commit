package com.jyami.ewhadailycommit.crawler;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.jsoup.select.Elements;

/**
 * Created by jyami on 2020/03/16
 */
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Commit {

    private static final String EMPTY_FILL_COLOR = "#ebedf0";

    private String date;
    private Boolean check;

    private Commit(){}

    public static Commit of(Elements elements){
        String date = elements.attr("data-date");
        String fillColor = elements.attr("fill");

        return Commit.builder()
                .date(date)
                .check(EMPTY_FILL_COLOR.equals(fillColor))
                .build();
    }

    @Override
    public String toString() {
        return "Commit{" +
                "date='" + date + '\'' +
                ", check=" + check +
                '}';
    }
}
