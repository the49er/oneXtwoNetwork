package com.onetwonet.mapper;

import com.onetwonet.dto.BetResponse;
import com.onetwonet.jpa.model.Bet;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = BetMapper.class)
public interface BetMapper {
    BetMapper INSTANCE = Mappers.getMapper(BetMapper.class);
    BetResponse toDto(Bet bet);
}
