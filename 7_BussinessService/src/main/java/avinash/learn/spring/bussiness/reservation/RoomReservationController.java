package avinash.learn.spring.bussiness.reservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import avinash.learn.spring.bussiness.reservation.client.RoomService;
import avinash.learn.spring.bussiness.reservation.domain.Room;
import avinash.learn.spring.bussiness.reservation.domain.RoomReservation;

import java.util.List;

@RestController
@Api(value="RoomReservations", description = "Business process service operations on rooms and reservations", tags=("roomReservations"))
public class RoomReservationController {

	
	//This sample uses rest template with Eureka
	/*
	@Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/room", method = RequestMethod.GET)
    public List<Room> getAllRooms(){
        ResponseEntity<List<Room>> roomsResponse = this.restTemplate.exchange(
                "http://ROOMSERVICE/room", HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Room>>() {
                });
        return roomsResponse.getBody();
    }*/
	
	  @Autowired
	    private RoomService roomService;

	    @Autowired
	    private RoomReservationBusinessProcess businessProcess;

	 @RequestMapping(value = "/room", method = RequestMethod.GET)
	    public List<Room> getAllRooms(){
	       return roomService.findAll(null);
	    }
	 @RequestMapping(value="/roomReservations/{date}", method=RequestMethod.GET)
	    @ApiOperation(value="Get Room Reservations", notes="Gets all reservations for a specific date", nickname="getReservationsForDate")
	    public List<RoomReservation> getRoomReservationsForDate(@PathVariable("date") String date){
	        return this.businessProcess.getRoomReservationsForDate(date);
	    }


}
