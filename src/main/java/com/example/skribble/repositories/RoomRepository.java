package com.example.skribble.repositories;

import com.example.skribble.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface RoomRepository extends JpaRepository<Room, String> {
    @Modifying
    @Transactional
    @Query(value = "update rooms set dictionary = :dictionary, draw_time = :draw_time, rounds = :rounds where rooms.id = :id ", nativeQuery = true)
    void settings(@Param("dictionary") String dictionary, @Param("draw_time") Integer drawTime,
                        @Param("rounds") Integer rounds, @Param("id") String id);
}
