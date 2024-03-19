package com.example.utiltest.mapstruct.mapper;

import com.example.utiltest.mapstruct.domain.Car;
import com.example.utiltest.mapstruct.domain.CarDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {
 
    CarMapper INSTANCE = Mappers.getMapper( CarMapper.class );
 
    @Mapping(source = "numberOfSeats", target = "seatCount")
    CarDto carToCarDto(Car car);
}