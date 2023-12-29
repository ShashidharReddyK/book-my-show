package com.example.BookMyShow.repositories;

import com.example.BookMyShow.models.SeatTypeShow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatTypeShowRepository extends JpaRepository<SeatTypeShow, Integer> {

    List<SeatTypeShow> findByShow(int showId);
}
