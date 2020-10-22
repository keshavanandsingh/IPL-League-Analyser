package com.iplleagueanalyser;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.exceptions.IPLAnalyserException;
import com.iplleagueanalyser.IPLLeagueAnalyser;

import opencsvbuilder.CSVException;

public class IPLLeagueAnalyserTest {
	private static final String IPL_BATSMAN_FILE_PATH = "C:\\Users\\HP\\eclipse-workspace\\IPL League Analyser\\WP DP Data_01 IPL2019FactsheetMostRuns.csv";
	private static final String IPL_BOWLER_FILE_PATH = "C:\\Users\\HP\\eclipse-workspace\\IPL League Analyser\\WP DP Data_02 IPL2019FactsheetMostWkts.csv";

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
		IPLLeagueAnalyser iplLeagueAnalyser = new IPLLeagueAnalyser();
		try {
			iplLeagueAnalyser.loadBatsmanData(IPL_BATSMAN_FILE_PATH);
			List<Double> list = iplLeagueAnalyser.getTopBattingAverages(3);
			assertEquals(83.2, list.get(0), 0.0);
		} catch (CSVException | IPLAnalyserException e) {
		}
	}

}
