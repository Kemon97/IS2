package com.mipresupuesto.personalbudget.crosscutting;

import java.util.UUID;

public final class UtilUUID {
	
	public static final String DEFAULT_UUID_STRING ="00000000-0000-0000-0000-000000000000";
	public static final UUID DEFAULT_UUID = UUID.fromString(DEFAULT_UUID_STRING);
	
	private UtilUUID() {
		super();
	}
	
	public static final UUID getDfaultUUID(final UUID uuid) {
		return(uuid==null)? DEFAULT_UUID : uuid;
	}
	
	public static final boolean isEqual(final UUID uuidOne, final UUID uuidTwo) {
		return getDfaultUUID(uuidOne).equals(getDfaultUUID(uuidTwo));
		
	}
	
	public static final UUID getNewUUID() {
		UUID uuid;
		
		do {
			uuid = UUID.randomUUID();
		} while ()
	}
	
}
