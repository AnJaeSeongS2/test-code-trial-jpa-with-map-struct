package com.sonan.tutorial.repository;

import com.sonan.tutorial.entity.HistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Jaeseong on 2021/11/16
 * Git Hub : https://github.com/AnJaeSeongS2
 */
@Repository
public interface HistoryRepository extends JpaRepository<HistoryEntity, Integer> {
    HistoryEntity save(HistoryEntity entity);
    List<HistoryEntity> findByIdGreaterThanEqualOrderByIdDesc(Integer id);
}
