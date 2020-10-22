package com.iplleagueanalyser;

import static org.junit.Assert.*;

import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.Test;

import com.exceptions.IPLAnalyserException;
import com.iplleagueanalyser.IPLLeagueAnalyser;

import opencsvbuilder.CSVException;

public class IPLLeagueAnalyserTest {
	private static final String IPL_BATSMAN_FILE_PATH = "C:\\Users\\HP\\eclipse-workspace\\IPL League Analyser\\WP DP Data_01 IPL2019FactsheetMostRuns.csv";
	private static final String IPL_BOWLER_FILE_PATH = "C:\\Users\\HP\\eclipse-workspace\\IPL League Analyser\\WP DP Data_02 IPL2019FactsheetMostWkts.csv";

	private IPLLeagueAnalyser iplLeagueAnalyser;

	@Before
	public void setup() {
		iplLeagueAnalyser = new IPLLeagueAnalyser();
		try {
			iplLeagueAnalyser.loadBatsmanData(IPL_BATSMAN_FILE_PATH);
			iplLeagueAnalyser.loadBowlerData(IPL_BOWLER_FILE_PATH);
		} catch (CSVException e) {
		}
	}

	@Test
	public void givenAFileWithBatsmanData_WhenLoaded_ShouldReturnTheEntries() {
		IPLLeagueAnalyser iplLeagueAnalyser = new IPLLeagueAnalyser();
		try {
			int entries = iplLeagueAnalyser.loadBatsmanData(IPL_BATSMAN_FILE_PATH);
			assertEquals(100, entries);
		} catch (CSVException e) {

		}
	}

	@Test
	public void givenAFileWithBowlerData_WhenLoaded_ShouldReturnTheEntries() {
		IPLLeagueAnalyser iplLeagueAnalyser = new IPLLeagueAnalyser();
		try {
			int entries = iplLeagueAnalyser.loadBowlerData(IPL_BOWLER_FILE_PATH);
			assertEquals(99, entries);
		} catch (CSVException e) {

		}
	}

	@Test
	public void givenAFileWhenLoadedToGetTopBattingAveragesOfTheCricketer_ShouldReturnCorrectResult() {
		try {
			List<Double> list = iplLeagueAnalyser.getTopBattingAverages(3);
			assertEquals(83.2, list.get(0), 0.0);
		} catch (IPLAnalyserException e) {
		}
	}

	@Test
	public void givenAFileWhenLoadedToGetTopBattingStrikeRatesOfTheBatsman_ShouldReturnCorrectResult() {
		try {
			List<Double> list = iplLeagueAnalyser.getTopStrikingRates(3);
			assertEquals(333.33, list.get(0), 0.0);
		} catch (IPLAnalyserException e) {
		}
	}

}
