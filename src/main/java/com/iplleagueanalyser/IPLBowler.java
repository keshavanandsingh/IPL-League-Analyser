package com.iplleagueanalyser;

import com.opencsv.bean.CsvBindByName;

public class IPLBowler {
	@CsvBindByName(column = "POS", required = true)
	private int pos;
	@CsvBindByName(column = "PLAYER", required = true)
	private String playerName;
	@CsvBindByName(column = "Avg", required = true)
	private String average;
	@CsvBindByName(column = "Mat", required = true)
	private int matches;
	@CsvBindByName(column = "Inns", required = true)
	private int innings;
	@CsvBindByName(column = "Ov", required = true)
	private double overs;
	@CsvBindByName(column = "Runs", required = true)
	private int runs;
	@CsvBindByName(column = "Wkts", required = true)
	private int wickets;
	@CsvBindByName(column = "BBI", required = true)
	private int BBI;
	@CsvBindByName(column = "SR", required = true)
	private String strikeRate;
	@CsvBindByName(column = "Econ", required = true)
	private double economy;
	@CsvBindByName(column = "4w", required = true)
	private int fourWickets;
	@CsvBindByName(column = "5w", required = true)
	private int sixeWickets;
}
