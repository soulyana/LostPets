package me.soulyana.lostpets.Repositories;

import me.soulyana.lostpets.Models.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long>{
}
