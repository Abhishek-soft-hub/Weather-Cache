package com.example.Weather.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Weather.Entity.Wheathers;
@Repository
public interface WheatherRepo extends JpaRepository<Wheathers, Integer> {

}
