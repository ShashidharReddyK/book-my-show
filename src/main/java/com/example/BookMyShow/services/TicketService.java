package com.example.BookNyShow.services;

import com.example.BookMyShow.exceptions.InvalidUser;
import com.example.BookMyShow.exceptions.SeatsAlreadyBookedException;
import com.example.BookMyShow.models.Ticket;

import java.util.List;

public interface TicketService {

    public Ticket bookTicket(List<Integer> showSeatIds, int userId) throws SeatsAlreadyBookedException, InvalidUser;
}

