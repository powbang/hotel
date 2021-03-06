package com.hotel.service;

import java.util.List;

import com.hotel.dao.IRoomDao;
import com.hotel.factory.DAOFactory;
import com.hotel.po.Room;
//Room相关服务，服务于RoomColler
public class RoomService {
	//得到RoomDao对象
	private static IRoomDao r = DAOFactory.getRoomDao();
	//加载所有房间
	public static List<Room> loadRoom(Integer currentPage, int size){
		return r.getAllRoom(currentPage, size);
	}
	public static boolean addRoom(Room room){
		if(r.queryRoomByNum(room.getR_num())==null){
			r.addRoom(room);
			return true;
		}
		return false;
	}
	public static boolean updateRoom(Room room){
		
		return r.updateRoom(room);
	}
	
	public static boolean deleteRoom(int r_id){
		
		return r.deleteRoom(r_id);
	}
}
