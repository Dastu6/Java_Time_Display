package org.openjfx.DelenclosXayadethHorloge;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class ClockModel {
	private LocalTime clockHour;
	private enum Type{CPU,INTERNAL,EXTERNAL};
	private Type clockType;
	
	public ClockModel() {
		this.clockHour = LocalTime.from(LocalTime.now());
		this.clockType = ClockModel.Type.INTERNAL;
	}
	
	public ClockModel(LocalTime hour, ClockModel.Type type) {
		this.clockHour = hour;
		this.clockType = type;
	}
	
	public ClockModel(LocalTime hour) {
		this.clockHour = hour;
		this.clockType = ClockModel.Type.INTERNAL;
	}

	public LocalTime getClockHour() {
		return clockHour;
	}

	public void setClockHour(LocalTime clockHour) {
		this.clockHour = clockHour;
	}

	public Type getClockType() {
		return clockType;
	}

	public void setClockType(Type clockType) {
		this.clockType = clockType;
	}
	
	//Permet de directement récupérer l'heure actuelle selon la librairie LocalTime
	public LocalTime getCurrentTime() {
		return LocalTime.now();
	}
	
}
