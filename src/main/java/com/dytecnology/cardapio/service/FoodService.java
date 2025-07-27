package com.dytecnology.cardapio.service;

import com.dytecnology.cardapio.dtos.request.FoodRequestDto;
import com.dytecnology.cardapio.dtos.response.FoodResponseDto;
import com.dytecnology.cardapio.entities.Food;
import com.dytecnology.cardapio.repositorys.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public String postFoods(FoodRequestDto foodRequestDto){

        try {
            Food foodData = new Food(foodRequestDto);
            foodRepository.save(foodData);
            return"prato cadastrado";
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public List<FoodResponseDto> getAll(){
        List<FoodResponseDto> foodList =  foodRepository.findAll().stream().map(FoodResponseDto::new).toList();
        return foodList;
    }
}
