package avinash.learn.spring.bussiness.reservation.client;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import avinash.learn.spring.bussiness.reservation.domain.Guest;

@Component
public class GuestServiceFallBackImpl implements GuestService {

	@Override
	public List<Guest> findAll(String emailAddress) {
		// TODO Auto-generated method stub
		return Collections.emptyList();
	}

	@Override
	public Guest findOne(long id) {
		// TODO Auto-generated method stub
	 Guest guest = new Guest();
	 guest.setFirstName("Guest");
	 guest.setLastName("Occuiped");
	 
	 return guest;
	}

}
