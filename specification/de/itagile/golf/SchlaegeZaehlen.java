package de.itagile.golf;

import de.itagile.golf.jbehave.BaseScenario;


public class SchlaegeZaehlen extends BaseScenario {
	
	public SchlaegeZaehlen() {
		TrackerDriver driver = new TrackerDriver();
		addSteps(new NerdGolfTrackerSteps(driver),
				 new SchlaegeZaehlenSteps(driver));
	}
}