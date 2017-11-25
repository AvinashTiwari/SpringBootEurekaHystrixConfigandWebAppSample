package avinash.learn.spring.cloud;

import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/room")
@Api(value = "room", description = "Operation on Room", tags = ("room"))
public class RoomController {
	@Autowired
	private RoomRepository roomRepository;

	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value="get All room", notes="Get All Room From system",
	nickname ="getRooms")
	public List<Room> findAll(@RequestParam(name = "roomNumber", required = false) String roomNumber) {
		if (StringUtils.isNotEmpty(roomNumber)) {
			return Collections.singletonList(this.roomRepository.findByRoomNumber(roomNumber));
		}

		return (List<Room>) this.roomRepository.findAll();
	}

}
