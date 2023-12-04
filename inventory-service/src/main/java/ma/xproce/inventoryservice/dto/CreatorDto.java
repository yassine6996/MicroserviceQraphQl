package ma.xproce.inventoryservice.dto;

import jakarta.persistence.OneToMany;
import ma.xproce.inventoryservice.dao.entities.Video;

import java.util.List;

public class CreatorDto {
    private String name;
    private String email;
    private List<Video> videos;
}
