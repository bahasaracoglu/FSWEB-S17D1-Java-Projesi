package com.workintech.s17d1.controller;

import com.workintech.s17d1.entity.Animal;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AnimalController {
   private Map<Integer, Animal> animals = new HashMap<>();

   @GetMapping("/")
    public List<Animal> getAll() {

       return animals.values().stream().toList();
   }

   @PostMapping("/")
    public int postAnimal(@RequestBody Animal animal) {
       animals.put(animal.getId(),animal);
       return animal.getId();
   }

   @GetMapping("/{id}")
    public Animal getAnimalWithID( @PathVariable int id) {
       return animals.get(id);
   }

@PutMapping("/{id}")
    public Animal updateAnimal(@PathVariable int id, @RequestBody Animal animal) {
       animals.put(id, new Animal(id,animal.getName()));
       return animals.get(id);
}
@DeleteMapping("/{id}")
    public Animal deleteAnimal(@PathVariable int id) {
       Animal removedAnimal = animals.get(id);
       animals.remove(id);
       return removedAnimal;
}




}
