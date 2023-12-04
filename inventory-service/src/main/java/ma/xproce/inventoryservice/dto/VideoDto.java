package ma.xproce.inventoryservice.dto;

import jakarta.persistence.ManyToOne;
import ma.xproce.inventoryservice.dao.entities.Creator;

import java.util.Date;

public class VideoDto {
    private String name;
    private String url;
    private String description;
    private Date datePublication;
    private Creator creator;
}
