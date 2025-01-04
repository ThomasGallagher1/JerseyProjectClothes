package ie.atu.jerseyprojectclothing;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "clothing")
public class Clothing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clothing_id")
    private Long clothingId;
    @Column(name = "clothing_type")
    private String clothingType;
    @Column(name = "team_id")
    private Long teamId;
    public Long getClothingId() {
        return clothingId;
    }

    public void setClothingId(Long clothingId) {
        this.clothingId = clothingId;
    }

    public String getClothingType() {
        return clothingType;
    }

    public void setClothingType(String clothingType) {
        this.clothingType = clothingType;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }


}
