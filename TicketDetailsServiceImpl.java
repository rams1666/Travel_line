package com.vir.service;

import com.vir.dao.TicketDetailsDao;
import com.vir.dao.TicketDetailsDaoImpl;
import com.vir.model.TicketDetails;

public class TicketDetailsServiceImpl implements TicketDetailsService{
	TicketDetailsDao tDao=new TicketDetailsDaoImpl();
	@Override
	public TicketDetails getTicket(int ticket_no) {
		// TODO Auto-generated method stub
		return tDao.getTicket(ticket_no);
	}

	@Override
	public int cancelTicket(int ticket_no) {
		// TODO Auto-generated method stub
		return tDao.cancelTicket(ticket_no);
	}

}
