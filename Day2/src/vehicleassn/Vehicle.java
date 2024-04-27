package vehicleassn;

import java.util.*;

public class Vehicle {
	public String chasisno;
	public int uniqueid;
	public double price, pollutionlevel;
	public Date mfd, insexp;

	public Vehicle(String cno, int unq, double price, double level, Date mfd, Date insexp) {
		this.chasisno = cno;
		this.uniqueid = unq;
		this.price = price;
		this.pollutionlevel = level;
		this.mfd = mfd;
		this.insexp = insexp;

	}

}
