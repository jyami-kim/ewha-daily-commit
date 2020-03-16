package com.jyami.ewhadailycommit.crawler;

import org.jsoup.nodes.Document;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jyami on 2020/03/17
 */
class GitHomeCrawlerTest {

    String userCommitURL = "https://github.com/mjung1798";

    @Test
    @DisplayName("mjung1798 잔디 check 가능")
    void getAllBlockOfYears() {

        Document connectionWithUserName = JsoupConnection.getConnectionWithUserName(userCommitURL);
        List<Commit> allBlockOfYears = GitHomeCrawler.getAllBlockOfYears(connectionWithUserName);

        for(Commit c : allBlockOfYears){
            System.out.println(c.toString());
        }
    }
}