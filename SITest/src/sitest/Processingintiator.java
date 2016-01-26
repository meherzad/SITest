package sitest;

import org.springframework.integration.annotation.Gateway;

import com.google.common.collect.ImmutableList;

public interface Processingintiator {

	void process(ImmutableList<PayloadContent> message);

	@Gateway(requestChannel = "smartChannel")
	void processThroughSmartChannel(ImmutableList<PayloadContent> message);
}
