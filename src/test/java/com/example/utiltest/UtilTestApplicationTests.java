package com.example.utiltest;

import com.example.utiltest.mapstruct.domain.Car;
import com.example.utiltest.mapstruct.domain.CarDto;
import com.example.utiltest.mapstruct.domain.CarType;
import com.example.utiltest.mapstruct.mapper.CarMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UtilTestApplicationTests {

    @Test
    void contextLoads() {
        //given
        Car car = new Car( "Morris", 5, CarType.SEDAN );

        //when
        CarDto carDto = CarMapper.INSTANCE.carToCarDto( car );

        //then
        System.out.println(car);
        System.out.println(carDto);
    }

}
