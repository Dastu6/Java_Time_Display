package org.openjfx.DelenclosXayadethHorloge;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class COperationsHorloge {
	private LocalDateTime datetimeOPHHorloge;
	private int iOPHTypeHorloge;
	
	public COperationsHorloge() {
		datetimeOPHHorloge = LocalDateTime.from(LocalDateTime.now());
		iOPHTypeHorloge = 0;
	}
	
	public COperationsHorloge(LocalDateTime datetime) {
		datetimeOPHHorloge = LocalDateTime.from(datetime);
	}
	
	public COperationsHorloge(LocalDateTime datetime, int type) {
		datetimeOPHHorloge = datetime;
		iOPHTypeHorloge = type;
	}
	
	public void OPHSetDateTime(LocalDateTime datetime) {
		datetimeOPHHorloge = datetime;
	}
	
	public LocalDateTime dtOPHGetDatetime() {
		return datetimeOPHHorloge;
	}
	
	public void OPHSetType(int type) {
		iOPHTypeHorloge = type;
	}
	
	public int iOPHGetType() {
		return iOPHTypeHorloge;
	}
}
