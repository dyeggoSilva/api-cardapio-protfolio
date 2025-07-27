package com.dytecnology.cardapio.controllers;

import com.dytecnology.cardapio.dtos.response.FoodResponseDto;
import com.dytecnology.cardapio.repositorys.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {
    @Autowired
    private FoodRepository foodRepository;
    @GetMapping
    public List<FoodResponseDto> getAll(){
         List<FoodResponseDto> foodList =  foodRepository.findAll().stream().map(FoodResponseDto::new).toList();
        return foodList;
    }
}
