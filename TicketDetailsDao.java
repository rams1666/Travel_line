package com.vir.dao;

import com.vir.model.TicketDetails;

public interface TicketDetailsDao {
 TicketDetails getTicket(int ticketNo);
  int cancelTicket(int ticketNo);
	
}
