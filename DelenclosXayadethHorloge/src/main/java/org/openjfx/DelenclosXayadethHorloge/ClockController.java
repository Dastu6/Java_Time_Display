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
		UniversalClockView uniV = new UniversalClockView();
		uniV.showTime(this.cModel.getClockHour());
	}
	
	public void updateTimeTask() {
		this.cModel.setClockHour(this.cModel.getCurrentTime());
		EnglishClockView engV = new EnglishClockView();
		engV.showTime(this.cModel.getClockHour());
	}
}
