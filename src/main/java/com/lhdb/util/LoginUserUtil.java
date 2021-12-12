package com.lhdb.util;

import com.lhdb.game.entity.Users;

public class LoginUserUtil {
	
	private static final ThreadLocal<Users> threadLocal = new ThreadLocal<Users>();
	
	public static void put(Users value){
		threadLocal.set(value);
	}
	
	public static Users get( ){
		return (Users)threadLocal.get();
	}

}
