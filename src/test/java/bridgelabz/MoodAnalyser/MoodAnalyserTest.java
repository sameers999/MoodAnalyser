package bridgelabz.MoodAnalyser;

import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
public class MoodAnalyserTest {
	@Test
	public void analyseSadMood() {
		MoodAnalyser analyser = new MoodAnalyser();
		String actualResult = analyser
				.analyseMood("I am in Sad mood");

		assertEquals("SAD", actualResult);
	}

	@Test
	public void analyseHappyMood() {
		MoodAnalyser analyser = new MoodAnalyser();
		String actualResult = analyser
				.analyseMood("I am in any mood");

		assertEquals("HAPPY", actualResult);
	}
}
