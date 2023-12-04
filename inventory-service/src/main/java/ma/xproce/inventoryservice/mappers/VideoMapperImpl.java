package ma.xproce.inventoryservice.mappers;

import ma.xproce.inventoryservice.dao.entities.Creator;
import ma.xproce.inventoryservice.dto.CreatorDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;

public class VideoMapperImpl {
    public CreatorDto fromCreatorToCreatorDto(Creator creator){
        private final ModelMapper modelMapper= new ModelMapper();
//        CreatorDto creatorDTO=new CreatorDto();
//        BeanUtils.copyProperties(creator,creatorDTO);
//        return creatorDTO;
        return this.modelMap
    }

}
