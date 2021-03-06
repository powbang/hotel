package com.hotel.service;

import java.util.List;

import com.hotel.dao.IRoomBookDao;
import com.hotel.factory.DAOFactory;
import com.hotel.po.Room;
import com.hotel.po.RoomBook;
import com.hotel.po.RoomBookCustom;

public class RoomBookService {
	//得到RoomBookDao对象
	private static IRoomBookDao rb = DAOFactory.getRoomBookDao();
	
	public static List<Room> loadSelectRoom(RoomBookCustom rbc){
		return rb.loadSelectRoom(rbc);
	}
	public static boolean addBook(RoomBookCustom rbc){
		return rb.addBook(rbc);
	}
	public static List<RoomBook> loadAllBook() {
		
		return rb.getAllBook();
	}
	public static List<RoomBook> loadAllInroom() {

		return rb.loadAllInroom();
	}
	public static List<RoomBook> loadBookInfo(String u_username) {
		
		return rb.getUserBook(u_username);
	}
	public static boolean deleteBook(int rb_id) {
		
		return rb.deleteBook(rb_id);
	}
	public static boolean addInroom(RoomBookCustom rbc) {
		
		return rb.addInroom(rbc);
	}
	public static boolean changeBookInroom(int rb_id) {
		
		return rb.changeBookInroom(rb_id);
	}
	

}
