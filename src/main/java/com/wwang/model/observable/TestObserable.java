package com.wwang.model.observable;

public class TestObserable {

	public static void main(String[] args) {
		MetricsObserable metricsObserable = new MetricsObserable();
		metricsObserable.addObserver(new AdminA());
		metricsObserable.addObserver(new AdminB());
		metricsObserable.updateCounter("request-count", 100L);
	}

}
