package ironpeace.jobflow.io;

import ironpeace.modelgen.dmdl.csv.AbstractModelACsvInputDescription;

public class ModelAFromCsv extends AbstractModelACsvInputDescription {

	@Override
	public String getBasePath() {
		return "cms/input/";
	}

	@Override
	public String getResourcePattern() {
		return "modelA.csv";
	}

}
