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
	
	//En fonction du type d'horloge, les heures seront différentes
	public LocalTime getCurrentTime() {
		switch(this.clockType) {
		case CPU:
			return LocalTime.now();
		case INTERNAL:
			return LocalTime.now();
		case EXTERNAL:
			return LocalTime.now();
		}
		return LocalTime.now();
	}
	
}
