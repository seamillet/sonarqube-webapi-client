package com.willc.sonarqube.webapi.sample;

import java.net.URI;

import com.willc.sonarqube.webapi.SonarClient;
import com.willc.sonarqube.webapi.SonarServer;

public class SampleMeasure {

	public static void main(String args[]) throws Exception {
		
		URI uri;
		String componentKey;
		String metricKey = "coverage";
		String user = null, password = null;

		if(args.length < 1) throw new Exception("Missing SonarQube server URI");
		if(args.length < 2) throw new Exception("Missing SonarQube component key");
		uri = new URI(args[0]);
		componentKey = args[1];

		if(args.length >= 3) {
			metricKey = args[2];
			if(args.length >= 4) user = args[3];
			if(args.length >= 5) password = args[4];
		}

		SonarServer server = new SonarServer(uri, user, password);
		SonarClient client = server.getClient();
		
		System.out.println(
				"Fetch metric " + metricKey + " for component " + componentKey + ": "
				+ client.getMeasureClient()
					.getComponentMeasuresByKey(componentKey, metricKey));
	}
}

