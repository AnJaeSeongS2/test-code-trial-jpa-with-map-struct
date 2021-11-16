package com.sonan.tutorial.service;

import com.sonan.tutorial.mapper.HistoryMapper;
import com.sonan.tutorial.model.HistoryDto;
import com.sonan.tutorial.repository.HistoryRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jaeseong on 2021/11/16
 * Git Hub : https://github.com/AnJaeSeongS2
 */
@Service
public class HistoryService {
    private final HistoryRepository repo;

    public HistoryService(HistoryRepository repo) {
        this.repo = repo;
    }

    public List<HistoryDto> getAllHistoriesDesc(Integer startId) {
        List<HistoryDto> result = new ArrayList<>();
        repo.findByIdGreaterThanEqualOrderByIdDesc(startId).forEach(entity -> result.add(HistoryMapper.INSTANCE.fromEntity(entity)));
        return result;
    }

    public void save(HistoryDto dto) {
        repo.save(HistoryMapper.INSTANCE.toEntity(dto));
    }
}
