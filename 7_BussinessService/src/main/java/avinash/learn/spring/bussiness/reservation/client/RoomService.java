package avinash.learn.spring.bussiness.reservation.client;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import avinash.learn.spring.bussiness.reservation.domain.Room;

@FeignClient(value="ROOMSERVICE")
public interface RoomService {
	@RequestMapping(value="/room" , method = RequestMethod.GET)
	List<Room> findAll(@RequestParam(name="roomNumber", required =false) String roonMumber);

}
