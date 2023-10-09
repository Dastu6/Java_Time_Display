package org.openjfx.DelenclosXayadethHorloge;

public class ClockController {
	private ClockModel cModel;
	
	public ClockController() {
		
	}
	
	public ClockController(ClockModel model) {
		this.cModel = model;
	}

	public ClockModel getcModel() {
		return cModel;
	}

	public void setcModel(ClockModel cModel) {
		this.cModel = cModel;
	}
	
	public void updateMinuteTask() {
		this.cModel.setClockHour(this.cModel.getCurrentTime());
	}
	
	public void updateTimeTask() {
		this.cModel.setClockHour(this.cModel.getCurrentTime());
		
	}
}
