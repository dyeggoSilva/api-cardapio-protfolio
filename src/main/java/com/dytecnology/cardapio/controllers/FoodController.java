package com.dytecnology.cardapio.controllers;

import com.dytecnology.cardapio.dtos.request.FoodRequestDto;
import com.dytecnology.cardapio.dtos.response.FoodResponseDto;
import com.dytecnology.cardapio.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public String addfoods(@RequestBody FoodRequestDto foodRequestDto){
        return foodService.postFoods(foodRequestDto);
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodResponseDto> foods(){
        return foodService.getAll();
    }

}
