package com.ncu.processors;
import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.*;
/*import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;*/

public class CSVprocessor
{
	public boolean processCSV(String csvFileName,String jsonFileName)
	{
		String csvfilepath = ("C:\\Users\\Akshay\\Desktop\\Java2019\\csvtojson\\csvs");
		String jsonfilepath = ("C:\\Users\\Akshay\\Desktop\\Java2019\\csvtojson\\jsons");
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(csvfilepath+"\\"+csvFileName));
			String headerLine = br.readLine();
			String[] keyNames = headerLine.split(",");
			String line;
			JSONArray jsonArry = new JSONArray();
			try
			{
				BufferedWriter bw = new BufferedWriter(new FileWriter(jsonfilepath+"\\"+jsonFileName));
				while ((line = br.readLine()) != null)
				{
					JSONObject jObj = new JSONObject();
					String[] dataLine = line.split(",");
					for(int i=0;i<dataLine.length;i++)
					{
						jObj.put(keyNames[i],dataLine[i]);
					}
					jsonArry.add(jObj);
				}
			bw.write(jsonArry.toJSONString());
			bw.flush();
			}
			catch (IOException e)	{e.printStackTrace();return false;}
		}
		catch (IOException e)	{e.printStackTrace();return false;}
		return true;
	}
}

/*class test
{
	public static void main(String[] args)
	{
		CSVprocessor cv = new CSVprocessor();
		try
		{
			System.out.println(cv.processCSV("example.csv","jsonfile.json"));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}*/