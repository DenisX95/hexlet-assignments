package exercise.controller;

import exercise.dto.GuestDTO;
import exercise.mapper.GuestMapper;
import exercise.model.Guest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import exercise.repository.GuestRepository;
import exercise.dto.GuestCreateDTO;
import exercise.exception.ResourceNotFoundException;

@RestController
@RequestMapping("/guests")
public class GuestsController {

    @Autowired
    private GuestRepository guestRepository;

    @Autowired
    private GuestMapper guestMapper;

    @GetMapping(path = "")
    public List<GuestCreateDTO> index() {
        var products = guestRepository.findAll();
        return products.stream()
                .map(p -> guestMapper.map(p))
                .toList();
    }

    @GetMapping(path = "/{id}")
    public GuestCreateDTO show(@PathVariable long id) {

        var guest =  guestRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Guest with id " + id + " not found"));
        var guestDto = guestMapper.map(guest);
        return guestDto;
    }

    // BEGIN
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public GuestDTO create(@Valid @RequestBody GuestCreateDTO dtoData) {
        Guest guest = guestMapper.map(dtoData);
        guestRepository.save(guest);
        return toDTO(guest);
    }

    public GuestDTO toDTO(Guest guest) {
        var dto = new GuestDTO();
        dto.setId(guest.getId());
        dto.setName(guest.getName());
        dto.setEmail(guest.getEmail());
        dto.setPhoneNumber(guest.getPhoneNumber());
        dto.setClubCard(guest.getClubCard());
        dto.setCardValidUntil(guest.getCardValidUntil());
        dto.setCreatedAt(guest.getCreatedAt());
        return dto;
    }
    // END
}
