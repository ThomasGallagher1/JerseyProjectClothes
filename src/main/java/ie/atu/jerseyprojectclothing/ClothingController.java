package ie.atu.jerseyprojectclothing;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clothing")
public class ClothingController {
    @Autowired
    private ClothingRepository clothingRepository;


    @GetMapping("/team/{teamId}")
    public List<Clothing> getClothingByTeams(@PathVariable Long teamId){
        return clothingRepository.findByTeamId(teamId);
    }
}
