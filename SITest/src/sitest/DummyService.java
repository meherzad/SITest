package sitest;

import java.util.List;

import com.google.common.collect.ImmutableList;

public class DummyService {

	public ImmutableList<PayloadContent> dummyMethod(ImmutableList<PayloadContent> message) {
		System.out.println(message);
		return message;
	}

	public List<PayloadContent> smartMethod(List<PayloadContent> message) {
		System.out.println(message);
		return message;
	}
}
