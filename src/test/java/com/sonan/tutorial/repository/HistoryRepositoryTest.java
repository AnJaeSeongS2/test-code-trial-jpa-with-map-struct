package com.sonan.tutorial.repository;

import com.sonan.tutorial.entity.HistoryEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Jaeseong on 2021/11/16
 * Git Hub : https://github.com/AnJaeSeongS2
 */
@SpringBootTest
class HistoryRepositoryTest {
    @Autowired
    private HistoryRepository repo;

    @Test
    void findByIdOrderByIdDesc() {
        HistoryEntity entity1 = new HistoryEntity();
        HistoryEntity entity2 = new HistoryEntity();
        entity1.setId(1);
        entity1.setUsername("asdf");
        entity1.setCode(123);
        entity2.setId(2);
        entity2.setUsername("asdf2");
        entity2.setCode(234);
        System.out.println(repo.save(entity1).toString());
        System.out.println(repo.save(entity2).toString());
        assertEquals(2, repo.findByIdGreaterThanEqualOrderByIdDesc(1).size());
        assertEquals(1, repo.findByIdGreaterThanEqualOrderByIdDesc(2).size());
    }
}