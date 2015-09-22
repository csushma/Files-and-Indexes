package edu.utdallas.database;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class DataImport 
{
	
	ArrayList<PharmaCompany> pcList = new ArrayList<PharmaCompany>();
	Database database;
	int recordCounter;
	String headerRecord;
	/**
	 * @return the pcList
	 */
	public ArrayList<PharmaCompany> getPcList() {
		return pcList;
	}


	/**
	 * @param pcList the pcList to set
	 */
	public void setPcList(ArrayList<PharmaCompany> pcList) {
		this.pcList = pcList;
	}


	/**
	 * @return the headerRecord
	 */
	public String getHeaderRecord() {
		return headerRecord;
	}


	/**
	 * @param headerRecord the headerRecord to set
	 */
	public void setHeaderRecord(String headerRecord) {
		this.headerRecord = headerRecord;
	}


	public int importCSVToDatabaseFile(String inputFileName,Database database) {
		Scanner inputFileScanner = null;
		recordCounter = -1;
		try {
			inputFileScanner = new Scanner(new BufferedReader(new FileReader(inputFileName)));
			String record = null;
			while (inputFileScanner.hasNext()) {
				record = inputFileScanner.nextLine();
				 String otherThanQuote = " [^\"] ";
			     String quotedString = String.format(" \" %s* \" ", otherThanQuote);
			     String regex = String.format("(?x) "+ 
			                ",                         "+ 
			                "(?=                       "+ 
			                "  (                       "+ 
			                "    %s*                   "+ 
			                "    %s                    "+ 
			                "  )*                      "+ 
			                "  %s*                     "+ 
			                "  $                       "+ 
			                ")                         ", 
			                otherThanQuote, quotedString, otherThanQuote);

			    String[] tokens = record.split(regex, -1);

				if (recordCounter == -1) {
					recordCounter++;
				} else {// skip header record
					System.out.println(record);
					PharmaCompany pc = parsePCRecord(tokens);

					if (pc != null) {
						pcList.add(pc);
						recordCounter++;
					}
				}
			}
			
			database.createDatabase(getPcList(),getHeaderRecord());
			System.out.println("Imported " + recordCounter + " records to "+database.getDbFileName());
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			inputFileScanner.close();
		}
		return 0;

	}
	
	
	public static PharmaCompany parsePCRecord(String[] record) {

		String[] columns = record;
		PharmaCompany pc = null;
		Integer id = Integer.parseInt(columns[0]);
		String company = columns[1].replaceAll("\"", "");
		String drug_id = columns[2];
		short trials = Short.parseShort(columns[3]) ;
		short patients = Short.parseShort(columns[4]) ;;
		short dosage_mg = Short.parseShort(columns[5]) ;;
		Float reading = Float.parseFloat(columns[6]);
		boolean double_blind = Boolean.parseBoolean(columns[7]);
		boolean controlled_study = Boolean.parseBoolean(columns[8]);
		boolean govt_funded = Boolean.parseBoolean(columns[9]);
		boolean fda_approved = Boolean.parseBoolean(columns[10]);
		
		if (columns != null) {
			try {
				pc = new PharmaCompany(id, company,drug_id,trials,patients,dosage_mg,reading,double_blind,controlled_study,govt_funded,fda_approved);
				
			} catch (Exception e) {
				e.printStackTrace();
				System.err.println("unable to parse the record-->" + record);
				return null;
			}
		}

		return pc;
	}

	
	
	

}//class
