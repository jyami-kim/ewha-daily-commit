package com.jyami.ewhadailycommit.controller;

import com.jyami.ewhadailycommit.crawler.Commit;
import com.jyami.ewhadailycommit.service.CommitService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jyami on 2020/03/17
 */
@RestController
@RequiredArgsConstructor
public class CommitController {

    private static final String GITHUB_URL = "https://github.com/";
    private final CommitService commitService;

    @GetMapping("")
    public ResponseEntity<List<Commit>> getUserCommit(@RequestParam(value = "userName") String userName){
        String userCommitURL = GITHUB_URL + userName;
        List<Commit> userCommits = commitService.getUserCommits(userCommitURL);
        return ResponseEntity.ok().body(userCommits);
    }
}
