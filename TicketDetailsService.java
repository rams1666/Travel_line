package com.vir.service;

import com.vir.model.TicketDetails;

public interface TicketDetailsService {
	TicketDetails getTicket(int ticket_no);
	  int cancelTicket(int ticket_no);
		
}
