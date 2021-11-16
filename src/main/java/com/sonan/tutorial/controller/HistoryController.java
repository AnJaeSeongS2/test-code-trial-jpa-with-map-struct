package com.sonan.tutorial.controller;

import com.sonan.tutorial.model.HistoryDto;
import com.sonan.tutorial.service.HistoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Jaeseong on 2021/11/16
 * Git Hub : https://github.com/AnJaeSeongS2
 */
@RestController
@RequestMapping("/histories")
@Slf4j
public class HistoryController {
    private final HistoryService service;

    public HistoryController(HistoryService service) {
        this.service = service;
    }

    @GetMapping("/{startId}")
    public ResponseEntity<List<HistoryDto>> getAllDescStartWithStartId(@PathVariable Integer startId) {
        log.info(String.valueOf(startId));
        return ResponseEntity.ok(service.getAllHistoriesDesc(startId));
    }

}
