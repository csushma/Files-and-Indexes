package edu.utdallas.database;

import java.io.IOException;
import java.util.Scanner;


public class MyDatabase 
{

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException 
	{
		
		String dbFileName = "data.db";
		String idIndexFile = "id.ndx";
		String companyIndexFile = "company.ndx";
		String drug_idIndexFile = "drug_id.ndx";
		String trialsIndexFile = "trials_id.ndx";
		String patientsIndexFile = "patients.ndx";
		String dosage_mgIndexFile ="dosage_mg.ndx";
		String readingIndexFile ="reading.ndx";
		String double_blindIndexFile = "double_blind.ndx";
		String controlled_studyIndexFile = "controlled_study.ndx";
		String govt_fundedIndexFile = "govt_funded.ndx";
		String fda_approvedIndexFile = "fda_approved.ndx";
		String inputCSVFile ="PHARMA_TRIALS_1000B.csv";
		
		//Create the database Object and set the database file and index files
		Database database=new Database();
		database.setDbFileName(dbFileName);
		database.setIdIndexFile(idIndexFile);
		database.setCompanyIndexFile(companyIndexFile);
		database.setDrug_idIndexFile(drug_idIndexFile);
		database.setTrialsIndexFile(trialsIndexFile);
		database.setPatientsIndexFile(patientsIndexFile);
		database.setDosage_mgIndexFile(dosage_mgIndexFile);
		database.setReadingIndexFile(readingIndexFile);
		database.setDouble_blindIndexFile(double_blindIndexFile);
		database.setControlled_studyIndexFile(controlled_studyIndexFile);
		database.setGovt_fundedIndexFile(govt_fundedIndexFile);
		database.setFda_approvedIndexFile(fda_approvedIndexFile);
		
		if(FileUtil.isFilePresent(inputCSVFile)){
			DataImport dataImport= new DataImport();		
			dataImport.importCSVToDatabaseFile(inputCSVFile,database);
		}
		else{
			System.out.println("Cannot Import data. CSV File is missing");
		}
		
		System.out.println("\nEnter search attribute ");
		System.out.println("1 for Id"+ "\n" + "2 for company" + "\n" + "3 for drug_id"+ "\n" + "4 for trials"+"\n" + "5 for patients"+"\n" + "6 for dosage_mg"+"\n" + "7 for reading"+"\n" + "8 for double_blind"+"\n" + "9 for controlled_study"+"\n" + "10 for govt_funded"+"\n" + "11 for fda_approved");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		switch(input){
		case 1:
			System.out.println("Enter ID");
			Scanner sc1 = new Scanner(System.in);
			int id = sc1.nextInt();
			System.out.println("\nEnter the operator");
			System.out.println("1 for <"+ "\n2 for >"+"\n3 for ="+"\n4 for !=");
			int op = sc.nextInt();
			switch(op){
				case 1:
					database.selectByID(id,'<');
					break;
				case 2:
					database.selectByID(id,'>');
					break;
				case 3:
					database.selectByID(id,'=');
					break;
				case 4:
					database.selectByID(id,'!');
					break;
				default:
					System.out.println("Invalid Selection " + op);
					break;
			}
			break;
		case 2:
			System.out.println("Enter company");
			Scanner s2 = new Scanner(System.in);
			String name = s2.nextLine();
			database.selectByString(name,"company");
			break;
		case 3:
			System.out.println("Enter drug_id");
			Scanner s3 = new Scanner(System.in);
			String drug = s3.nextLine();
			database.selectByString(drug,"drug_id");
			break;
		case 4:
			System.out.println("Enter trials");
			Scanner sc2 = new Scanner(System.in);
			String trials = sc2.nextLine();
			String regex = "\\d+";
			short tr = 0;
			if(trials.matches(regex))
			{
				 tr = Short.parseShort(trials);
			}
			else
			{
				System.out.println("Invalid value for input. System Exiting!!");
				return;
			}
			System.out.println("\nEnter the operator");
			System.out.println("1 for <"+ "\n2 for >"+"\n3 for ="+"\n4 for !=");
			Scanner s4 = new Scanner(System.in);
			int op1 = s4.nextInt();
			switch(op1){
				case 1:
					database.selectByShort(tr, "trials",'<');
					break;
				case 2:
					database.selectByShort(tr,"trials",'>');
					break;
				case 3:
					database.selectByShort(tr,"trials",'=');
					break;
				case 4:
					database.selectByShort(tr,"trials",'!');
					break;
				default:
					System.out.println("Invalid Selection " + op1);
					break;
			}
			break;
		case 5:
			System.out.println("Enter patients");
			Scanner sc3 = new Scanner(System.in);
			String patients = sc3.nextLine();
			short pt=0;
			String regex1 = "\\d+";
			if(patients.matches(regex1))
			{
				 pt = Short.parseShort(patients);
			}
			else
			{
				System.out.println("Invalid value for input. System Exiting!!");
				return;
			}
			System.out.println("\nEnter the operator");
			System.out.println("1 for <"+ "\n2 for >"+"\n3 for ="+"\n4 for !=");
			Scanner s5 = new Scanner(System.in);
			int op2 = s5.nextInt();
			switch(op2){
				case 1:
					database.selectByShort(pt, "patients",'<');
					break;
				case 2:
					database.selectByShort(pt,"patients",'>');
					break;
				case 3:
					database.selectByShort(pt,"patients",'=');
					break;
				case 4:
					database.selectByShort(pt,"patients",'!');
					break;
				default:
					System.out.println("Invalid Selection " + op2);
					break;
			}
			break;
		case 6:
			System.out.println("Enter dosage_mg");
			Scanner sc4 = new Scanner(System.in);
			String dosage_mg = sc4.nextLine();
			short dm=0;
			String regex2 = "\\d+";
			if(dosage_mg.matches(regex2))
			{
				 dm = Short.parseShort(dosage_mg);
			}
			else
			{
				System.out.println("Invalid value for input. System Exiting!!");
				return;
			}
			System.out.println("\nEnter the operator");
			System.out.println("1 for <"+ "\n2 for >"+"\n3 for ="+"\n4 for !=");
			Scanner s6 = new Scanner(System.in);
			int op3 = s6.nextInt();
			switch(op3){
				case 1:
					database.selectByShort(dm, "dosage_mg",'<');
					break;
				case 2:
					database.selectByShort(dm,"dosage_mg",'>');
					break;
				case 3:
					database.selectByShort(dm,"dosage_mg",'=');
					break;
				case 4:
					database.selectByShort(dm,"dosage_mg",'!');
					break;
				default:
					System.out.println("Invalid Selection " + op3);
					break;
			}
			break;
		case 7:
			System.out.println("Enter reading");
			Scanner sc5 = new Scanner(System.in);
			String reading = sc5.nextLine();
			regex = "^[0-9]*\\.?[0-9]*$";
			Float f;
			if(reading.matches(regex)) {
				 f = Float.parseFloat(reading);
			}
			else {
				System.out.println("Invalid value for input. System Exiting!!");
				return;
			}
			
			System.out.println("\nEnter the operator");
			System.out.println("1 for <"+ "\n2 for >"+"\n3 for ="+"\n4 for !=");
			Scanner s7 = new Scanner(System.in);
			int op4 = s7.nextInt();
			switch(op4){
				case 1:
					database.selectByReading(f,'<');
					break;
				case 2:
					database.selectByReading(f,'>');
					break;
				case 3:
					database.selectByReading(f,'=');
					break;
				case 4:
					database.selectByReading(f,'!');
					break;
				default:
					System.out.println("Invalid Selection " + op4);
					break;
			}
			break;
		case 8:
			System.out.println("Enter double_blind");
			Scanner s8 = new Scanner(System.in);
			String double_blind = s8.nextLine();
			Boolean db = Boolean.parseBoolean(double_blind);
			database.selectByBoolean(db,"double_blind");
			break;
		case 9:
			System.out.println("Enter controlled_study");
			Scanner s9 = new Scanner(System.in);
			String controlled_study = s9.nextLine();
			Boolean cs = null;
			if (controlled_study.equalsIgnoreCase("true")||controlled_study.equalsIgnoreCase("false"))
			{
			cs = Boolean.parseBoolean(controlled_study);
			}
			database.selectByBoolean(cs,"controlled_study");
			break;
		case 10:
			System.out.println("Enter govt_funded");
			Scanner s10 = new Scanner(System.in);
			Boolean gf = null;
			String govt_funded = s10.nextLine();
			if (govt_funded.equalsIgnoreCase("true")||govt_funded.equalsIgnoreCase("false"))
			{
			gf = Boolean.parseBoolean(govt_funded);
			}
			database.selectByBoolean(gf,"govt_funded");
			break;
		case 11:
			System.out.println("Enter fda_approved");
			Scanner s11 = new Scanner(System.in);
			Boolean fa = null;
			String fda_approved = s11.nextLine();
			if (fda_approved.equalsIgnoreCase("true")||fda_approved.equalsIgnoreCase("false"))
			{
				fa = Boolean.parseBoolean(fda_approved);
			}
			database.selectByBoolean(fa,"fda_approved");
			break;
		default:
			System.out.println("Invalid selection "+input);
			break;
			
		}
	
	}//main
	
}//class
