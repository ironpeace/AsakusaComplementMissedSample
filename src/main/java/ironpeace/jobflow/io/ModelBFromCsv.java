package ironpeace.jobflow.io;

import ironpeace.modelgen.dmdl.csv.AbstractModelBCsvInputDescription;

public class ModelBFromCsv extends AbstractModelBCsvInputDescription {

	@Override
	public String getBasePath() {
		return "cms/input/";
	}

	@Override
	public String getResourcePattern() {
		return "modelB.csv";
	}

}
