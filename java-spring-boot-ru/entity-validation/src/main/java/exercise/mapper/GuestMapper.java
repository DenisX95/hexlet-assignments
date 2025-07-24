package exercise.mapper;

import exercise.dto.GuestCreateDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

import exercise.model.Guest;

@Mapper(
    nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
    componentModel = MappingConstants.ComponentModel.SPRING,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public abstract class GuestMapper {
    public abstract Guest map(GuestCreateDTO dto);
    public abstract GuestCreateDTO map(Guest model);
}
