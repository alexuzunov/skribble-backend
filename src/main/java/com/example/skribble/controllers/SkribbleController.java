package com.example.skribble.controllers;

import com.example.skribble.entities.Room;
import com.example.skribble.forms.SettingsForm;
import com.example.skribble.repositories.RoomRepository;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class SkribbleController {
    @Autowired
    private RoomRepository roomRepository;

    @CrossOrigin
    @PostMapping("/create")
    public String create(@RequestBody String host) {
        String id = RandomStringUtils.random(20, true, true);
        Room room = new Room();
        room.setId(id);
        room.setHost(host);
        roomRepository.save(room);
        return id;
    }

    @CrossOrigin
    @PostMapping("/set")
    public void set(@RequestParam String id, @RequestBody SettingsForm settingsForm) {
        Optional<Room> room = roomRepository.findById(id);
        room.ifPresent(r -> roomRepository.settings(settingsForm.getDictionary(), settingsForm.getDrawTime(), settingsForm.getRounds(), id));
    }
}
