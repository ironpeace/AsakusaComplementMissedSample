package ironpeace.jobflow.io;

import ironpeace.modelgen.dmdl.csv.AbstractJoinedModelCsvOutputDescription;

public class JoinedModelToCsv extends AbstractJoinedModelCsvOutputDescription {

	@Override
	public String getBasePath() {
		return "cms/output/";
	}

	@Override
	public String getResourcePattern() {
		return "joined.csv";
	}

}
