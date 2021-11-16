package com.sonan.tutorial.mapper;

import com.sonan.tutorial.entity.HistoryEntity;
import com.sonan.tutorial.model.HistoryDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

/**
 * Created by Jaeseong on 2021/11/16
 * Git Hub : https://github.com/AnJaeSeongS2
 */
@Mapper
public interface HistoryMapper {
    HistoryMapper INSTANCE = Mappers.getMapper(HistoryMapper.class);

    @Mapping(target = "code", qualifiedByName = "toCodeOnEntity")
    HistoryEntity toEntity(HistoryDto historyDto);

    @Mapping(target = "code", qualifiedByName = "fromCodeOnEntity")
    HistoryDto fromEntity(HistoryEntity historyEntity);

    @Named("toCodeOnEntity")
    default Integer toCodeOnEntity(String codeOnDto) {
        return Integer.valueOf(codeOnDto);
    }

    @Named("fromCodeOnEntity")
    default String fromCodeOnEntity(Integer codeOnEntity) {
        return String.valueOf(codeOnEntity);
    }
}
