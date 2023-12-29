package com.example.BookMyShow.repositories;

import com.example.BookMyShow.models.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatsRepository extends JpaRepository<Seat, Integer> {

    List<Seat> findByIdIn(List<Integer> seatIds);
}
