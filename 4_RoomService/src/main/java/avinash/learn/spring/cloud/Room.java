package avinash.learn.spring.cloud;

import javax.persistence.*;

@Entity
@Table(name = "ROOM")
public class Room {
	@Id
	@Column(name = "ROOM_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "ROOM_NUMBER")
	private String roomNumber;

	@Column(name = "BED_INFO")
	private String bedInfo;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getBedInfo() {
		return bedInfo;
	}

	public void setBedInfo(String bedInfo) {
		this.bedInfo = bedInfo;
	}

}
