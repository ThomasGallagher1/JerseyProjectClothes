package ie.atu.jerseyprojectclothing;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.nio.ReadOnlyBufferException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/clothing")
public class ClothingController {
    @Autowired
    private ClothingRepository clothingRepository;


    @GetMapping("/team/{teamId}")
    public List<Clothing> getClothingByTeams(@PathVariable Long teamId){
        List<Clothing> clothing = clothingRepository.findByTeamId(teamId);
        return clothing;
    }

    @GetMapping("/{clothingId}")
    public ResponseEntity<Map<String, Object>> getClothingDetails(@PathVariable Long clothingId){
        Clothing clothing = clothingRepository.findById(clothingId).orElseThrow(() -> new RuntimeException("Clothing not found"));

        Map<String, Object> response = new HashMap<>();
        response.put("clothingId", clothing.getClothingId());
        response.put("clothingName", clothing.getClothingType());
        return ResponseEntity.ok(response);
    }
}
