package org.w2g.common.w2gcommon;

import java.time.Instant;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		long start = Instant.now().getEpochSecond();
		Thread.sleep(3000);
		long end = Instant.now().getEpochSecond();
		System.out.println((end-start));
	}

}
