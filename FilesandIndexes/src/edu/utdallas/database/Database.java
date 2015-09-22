package edu.utdallas.database;


import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class Database {
	
	String dbFileName;
	String idIndexFile;
	String companyIndexFile;
	String drug_idIndexFile;
	String trialsIndexFile;
	String patientsIndexFile;
	String dosage_mgIndexFile;
	String readingIndexFile;
	String double_blindIndexFile;
	String controlled_studyIndexFile;
	String govt_fundedIndexFile;
	String fda_approvedIndexFile;
	String headerfields[];
	long headerOffset;

	public String getDbFileName() {
		return dbFileName;
	}
	public void setDbFileName(String dbFileName) {
		this.dbFileName = dbFileName;
	}
		
	/**
	 * @return the idIndexFile
	 */
	public String getIdIndexFile() {
		return idIndexFile;
	}
	/**
	 * @param idIndexFile the idIndexFile to set
	 */
	public void setIdIndexFile(String idIndexFile) {
		this.idIndexFile = idIndexFile;
	}
	/**
	 * @return the companyIndexFile
	 */
	public String getCompanyIndexFile() {
		return companyIndexFile;
	}
	/**
	 * @param companyIndexFile the companyIndexFile to set
	 */
	public void setCompanyIndexFile(String companyIndexFile) {
		this.companyIndexFile = companyIndexFile;
	}
	/**
	 * @return the drug_idIndexFile
	 */
	public String getDrug_idIndexFile() {
		return drug_idIndexFile;
	}
	/**
	 * @param drug_idIndexFile the drug_idIndexFile to set
	 */
	public void setDrug_idIndexFile(String drug_idIndexFile) {
		this.drug_idIndexFile = drug_idIndexFile;
	}
	/**
	 * @return the trialsIndexFile
	 */
	public String getTrialsIndexFile() {
		return trialsIndexFile;
	}
	/**
	 * @param trialsIndexFile the trialsIndexFile to set
	 */
	public void setTrialsIndexFile(String trialsIndexFile) {
		this.trialsIndexFile = trialsIndexFile;
	}
	/**
	 * @return the patientsIndexFile
	 */
	public String getPatientsIndexFile() {
		return patientsIndexFile;
	}
	/**
	 * @param patientsIndexFile the patientsIndexFile to set
	 */
	public void setPatientsIndexFile(String patientsIndexFile) {
		this.patientsIndexFile = patientsIndexFile;
	}
	/**
	 * @return the dosage_mgIndexFile
	 */
	public String getDosage_mgIndexFile() {
		return dosage_mgIndexFile;
	}
	/**
	 * @param dosage_mgIndexFile the dosage_mgIndexFile to set
	 */
	public void setDosage_mgIndexFile(String dosage_mgIndexFile) {
		this.dosage_mgIndexFile = dosage_mgIndexFile;
	}
	/**
	 * @return the readingIndexFile
	 */
	public String getReadingIndexFile() {
		return readingIndexFile;
	}
	/**
	 * @param readingIndexFile the readingIndexFile to set
	 */
	public void setReadingIndexFile(String readingIndexFile) {
		this.readingIndexFile = readingIndexFile;
	}
	/**
	 * @return the double_blindIndexFile
	 */
	public String getDouble_blindIndexFile() {
		return double_blindIndexFile;
	}
	/**
	 * @param double_blindIndexFile the double_blindIndexFile to set
	 */
	public void setDouble_blindIndexFile(String double_blindIndexFile) {
		this.double_blindIndexFile = double_blindIndexFile;
	}
	/**
	 * @return the controlled_studyIndexFile
	 */
	public String getControlled_studyIndexFile() {
		return controlled_studyIndexFile;
	}
	/**
	 * @param controlled_studyIndexFile the controlled_studyIndexFile to set
	 */
	public void setControlled_studyIndexFile(String controlled_studyIndexFile) {
		this.controlled_studyIndexFile = controlled_studyIndexFile;
	}
	/**
	 * @return the govt_fundedIndexFile
	 */
	public String getGovt_fundedIndexFile() {
		return govt_fundedIndexFile;
	}
	/**
	 * @param govt_fundedIndexFile the govt_fundedIndexFile to set
	 */
	public void setGovt_fundedIndexFile(String govt_fundedIndexFile) {
		this.govt_fundedIndexFile = govt_fundedIndexFile;
	}
	/**
	 * @return the fda_approvedIndexFile
	 */
	public String getFda_approvedIndexFile() {
		return fda_approvedIndexFile;
	}
	/**
	 * @param fda_approvedIndexFile the fda_approvedIndexFile to set
	 */
	public void setFda_approvedIndexFile(String fda_approvedIndexFile) {
		this.fda_approvedIndexFile = fda_approvedIndexFile;
	}
	/**
	 * @return the idIndexMap
	 */
	public HashMap<Integer, Long> getIdIndexMap() {
		return idIndexMap;
	}
	/**
	 * @param idIndexMap the idIndexMap to set
	 */
	public void setIdIndexMap(HashMap<Integer, Long> idIndexMap) {
		this.idIndexMap = idIndexMap;
	}
	
	public HashMap<String, ArrayList<Long>> getCompanyIndexMap() {
		return companyIndexMap;
	}
	public void setCompanyIndexMap(HashMap<String, ArrayList<Long>> companyIndexMap) {
		this.companyIndexMap = companyIndexMap;
	}



	public HashMap<String, ArrayList<Long>> getDrug_idIndexMap() {
		return drug_idIndexMap;
	}
	public void setDrug_idIndexMap(HashMap<String, ArrayList<Long>> drug_idIndexMap) {
		this.drug_idIndexMap = drug_idIndexMap;
	}
	public HashMap<Short, ArrayList<Long>> getTrialsIndexMap() {
		return trialsIndexMap;
	}
	public void setTrialsIndexMap(HashMap<Short, ArrayList<Long>> trialsIndexMap) {
		this.trialsIndexMap = trialsIndexMap;
	}
	public HashMap<Short, ArrayList<Long>> getPatientsIndexMap() {
		return patientsIndexMap;
	}
	public void setPatientsIndexMap(HashMap<Short, ArrayList<Long>> patientsIndexMap) {
		this.patientsIndexMap = patientsIndexMap;
	}
	public HashMap<Short, ArrayList<Long>> getDosage_mgIndexMap() {
		return dosage_mgIndexMap;
	}
	public void setDosage_mgIndexMap(
			HashMap<Short, ArrayList<Long>> dosage_mgIndexMap) {
		this.dosage_mgIndexMap = dosage_mgIndexMap;
	}
	public HashMap<Float, ArrayList<Long>> getReadingIndexMap() {
		return readingIndexMap;
	}
	public void setReadingIndexMap(HashMap<Float, ArrayList<Long>> readingIndexMap) {
		this.readingIndexMap = readingIndexMap;
	}
	public HashMap<Boolean, ArrayList<Long>> getDouble_blindIndexMap() {
		return double_blindIndexMap;
	}
	public void setDouble_blindIndexMap(
			HashMap<Boolean, ArrayList<Long>> double_blindIndexMap) {
		this.double_blindIndexMap = double_blindIndexMap;
	}
	public HashMap<Boolean, ArrayList<Long>> getControlled_studyIndexMap() {
		return controlled_studyIndexMap;
	}
	public void setControlled_studyIndexMap(
			HashMap<Boolean, ArrayList<Long>> controlled_studyIndexMap) {
		this.controlled_studyIndexMap = controlled_studyIndexMap;
	}
	public HashMap<Boolean, ArrayList<Long>> getGovt_fundedIndexMap() {
		return govt_fundedIndexMap;
	}
	public void setGovt_fundedIndexMap(
			HashMap<Boolean, ArrayList<Long>> govt_fundedIndexMap) {
		this.govt_fundedIndexMap = govt_fundedIndexMap;
	}
	public HashMap<Boolean, ArrayList<Long>> getFda_approvedIndexMap() {
		return fda_approvedIndexMap;
	}
	public void setFda_approvedIndexMap(
			HashMap<Boolean, ArrayList<Long>> fda_approvedIndexMap) {
		this.fda_approvedIndexMap = fda_approvedIndexMap;
	}



	HashMap<Integer, Long> idIndexMap = new HashMap<Integer, Long>();
	HashMap<String, ArrayList<Long>> companyIndexMap = new HashMap<String, ArrayList<Long>>();
	HashMap<String, ArrayList<Long>> drug_idIndexMap = new HashMap<String, ArrayList<Long>>();
	HashMap<Short, ArrayList<Long>> trialsIndexMap = new HashMap<Short, ArrayList<Long>>();
	HashMap<Short, ArrayList<Long>> patientsIndexMap = new HashMap<Short, ArrayList<Long>>();
	HashMap<Short, ArrayList<Long>> dosage_mgIndexMap = new HashMap<Short, ArrayList<Long>>();
	HashMap<Float, ArrayList<Long>> readingIndexMap = new HashMap<Float, ArrayList<Long>>();
	HashMap<Boolean, ArrayList<Long>> double_blindIndexMap = new HashMap<Boolean, ArrayList<Long>>();
	HashMap<Boolean, ArrayList<Long>> controlled_studyIndexMap = new HashMap<Boolean, ArrayList<Long>>();
	HashMap<Boolean, ArrayList<Long>> govt_fundedIndexMap = new HashMap<Boolean, ArrayList<Long>>();
	HashMap<Boolean, ArrayList<Long>> fda_approvedIndexMap = new HashMap<Boolean, ArrayList<Long>>();
	
	boolean isInitialized = false;
	
	
	public int createDatabase(ArrayList<PharmaCompany> pcList,String headerRecord) {
		RandomAccessFile randomAccessFile = null;
		File file = new File(dbFileName);
		if (file.exists()) {
			System.out.println("\nDeleteing the old DB File: " + dbFileName);
			file.delete();
		}

		try {
			randomAccessFile = new RandomAccessFile(dbFileName, "rw");
			long offset = -1;
			System.out.println("\nWriting the records to the database");
			for (PharmaCompany pc : pcList) {
				offset = randomAccessFile.getFilePointer();
				randomAccessFile.writeInt(pc.getId());
				byte length = (byte) pc.getCompany().length();
				randomAccessFile.writeByte(length);
				randomAccessFile.writeBytes(pc.getCompany());
				randomAccessFile.writeBytes(pc.getDrug_id());
				randomAccessFile.writeShort(pc.getTrials());
				randomAccessFile.writeShort(pc.getPatients());
				randomAccessFile.writeShort(pc.getDosage_mg());
				randomAccessFile.writeFloat(pc.getReading());
				byte double_blind_mask;
				byte controlled_study_mask;
				byte govt_funded_mask;
				byte fda_approved_mask;
				
				if(pc.isDouble_blind()){
					double_blind_mask      = 0x08;
				}
				else{
					double_blind_mask      = 0x00;
				}
				if(pc.isControlled_study()){
					controlled_study_mask      = 0x04;
				}
				else{
					controlled_study_mask      = 0x00;
				}
				if(pc.isGovt_funded()){
					govt_funded_mask      = 0x02;
				}
				else{
					govt_funded_mask      = 0x00;
				}
				if(pc.isFda_approved()){
					fda_approved_mask      = 0x01;
				}
				else{
					fda_approved_mask      = 0x00;
				}
				byte commonByte = 0x00;               //  binary 0000 0000
				commonByte = (byte)(commonByte | double_blind_mask);
				commonByte = (byte)(commonByte | controlled_study_mask);
				commonByte = (byte)(commonByte | govt_funded_mask);
				commonByte = (byte)(commonByte | fda_approved_mask);
				randomAccessFile.writeByte(commonByte);			
				
				updateIDIndex(pc.getId(), offset);
				updateStringIndex(pc.getCompany(),offset,companyIndexMap);
				updateStringIndex(pc.getDrug_id(),offset,drug_idIndexMap);
				updateShortIndex(pc.getTrials(),offset,trialsIndexMap);
				updateShortIndex(pc.getPatients(),offset,patientsIndexMap);
				updateShortIndex(pc.getDosage_mg(),offset,dosage_mgIndexMap);
				updateReadingIndex(pc.getReading(),offset);
				updateBooleanIndex(pc.isDouble_blind(),offset,double_blindIndexMap);
				updateBooleanIndex(pc.isControlled_study(),offset,controlled_studyIndexMap);
				updateBooleanIndex(pc.isGovt_funded(),offset,govt_fundedIndexMap);
				updateBooleanIndex(pc.isFda_approved(),offset,fda_approvedIndexMap);
			}
			writeIndexFiles();
			

		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Unable to create the database file");
			return -1;
		} finally {
			try {
				randomAccessFile.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return 0;
	}
	
	
	
	public int writeIndexFiles() {
		Indexes.writeIndexFile(idIndexFile, idIndexMap);
		Indexes.writeIndexFile(companyIndexFile, companyIndexMap);
		Indexes.writeIndexFile(drug_idIndexFile, drug_idIndexMap);
		Indexes.writeIndexFile(trialsIndexFile, trialsIndexMap);
		Indexes.writeIndexFile(patientsIndexFile, patientsIndexMap);
		Indexes.writeIndexFile(dosage_mgIndexFile, dosage_mgIndexMap);
		Indexes.writeIndexFile(readingIndexFile, readingIndexMap);
		Indexes.writeIndexFile(double_blindIndexFile, double_blindIndexMap);
		Indexes.writeIndexFile(controlled_studyIndexFile, controlled_studyIndexMap);
		Indexes.writeIndexFile(govt_fundedIndexFile, govt_fundedIndexMap);
		Indexes.writeIndexFile(fda_approvedIndexFile, fda_approvedIndexMap);	
		return 0;
	}
	
	
	public int updateIDIndex(Integer id, long offset) {
		idIndexMap.put(id, offset);
		return 0;
	}
	
	public int updateStringIndex(String key, long offset, HashMap<String,  ArrayList<Long>> map) {
		ArrayList<Long> offsetList = map.get(key);

		if (offsetList == null) {
			offsetList = new ArrayList<Long>();
		}
		offsetList.add(offset);
		map.put(key, offsetList);

		return 0;
	}

	public int updateBooleanIndex(boolean key, long offset,HashMap<Boolean,  ArrayList<Long>> map) {
		// TODO Auto-generated method stub
		ArrayList<Long> offsetList = map.get(key);

		if (offsetList == null) {
			offsetList = new ArrayList<Long>();
		}
		offsetList.add(offset);
		map.put(key, offsetList);

		return 0;	
		
	}
	public int updateReadingIndex(Float reading, long offset) {
		// TODO Auto-generated method stub
		ArrayList<Long> offsetList = readingIndexMap.get(reading);

		if (offsetList == null) {
			offsetList = new ArrayList<Long>();
		}
		offsetList.add(offset);
		readingIndexMap.put(reading, offsetList);

		return 0;	
		
	}
	public int updateShortIndex(short key, long offset,HashMap<Short,  ArrayList<Long>> map) {
		// TODO Auto-generated method stub
		ArrayList<Long> offsetList = map.get(key);

		if (offsetList == null) {
			offsetList = new ArrayList<Long>();
		}
		offsetList.add(offset);
		map.put(key, offsetList);

		return 0;		
	}
	
	@SuppressWarnings("unchecked")
	public int readIndexes() {
		idIndexMap = (HashMap<Integer, Long>) Indexes.readIndexFile(idIndexFile);
		companyIndexMap = (HashMap<String, ArrayList<Long>>) Indexes.readIndexFile(companyIndexFile);
		drug_idIndexMap = (HashMap<String, ArrayList<Long>>) Indexes.readIndexFile(drug_idIndexFile);
		trialsIndexMap = (HashMap<Short, ArrayList<Long>>) Indexes.readIndexFile(trialsIndexFile);
		patientsIndexMap = (HashMap<Short, ArrayList<Long>>) Indexes.readIndexFile(patientsIndexFile);
		dosage_mgIndexMap = (HashMap<Short, ArrayList<Long>>) Indexes.readIndexFile(dosage_mgIndexFile);
		readingIndexMap = (HashMap<Float, ArrayList<Long>>) Indexes.readIndexFile(readingIndexFile);
		double_blindIndexMap = (HashMap<Boolean, ArrayList<Long>>) Indexes.readIndexFile(double_blindIndexFile);
		controlled_studyIndexMap = (HashMap<Boolean, ArrayList<Long>>) Indexes.readIndexFile(controlled_studyIndexFile);
		govt_fundedIndexMap = (HashMap<Boolean, ArrayList<Long>>) Indexes.readIndexFile(govt_fundedIndexFile);
		fda_approvedIndexMap = (HashMap<Boolean, ArrayList<Long>>) Indexes.readIndexFile(fda_approvedIndexFile);
		return 0;

	}
	
	public int initIndexes() {
		if (!isInitialized) {
			if (FileUtil.isFilePresent(dbFileName) &&
					FileUtil.isFilePresent(idIndexFile) &&
					FileUtil.isFilePresent(companyIndexFile)&&
					FileUtil.isFilePresent(drug_idIndexFile)&&
					FileUtil.isFilePresent(trialsIndexFile)&&
					FileUtil.isFilePresent(patientsIndexFile)&&
					FileUtil.isFilePresent(dosage_mgIndexFile)&&
					FileUtil.isFilePresent(readingIndexFile)&&
					FileUtil.isFilePresent(double_blindIndexFile)&&
					FileUtil.isFilePresent(controlled_studyIndexFile)&&
					FileUtil.isFilePresent(govt_fundedIndexFile)&&
					FileUtil.isFilePresent(fda_approvedIndexFile))
					{
				readIndexes();
				isInitialized = true;

			} else {
				System.out.println("Missing files.Database file and all index files are required.");
				System.out.println("Please run the dataImport.importCSVToDatabaseFile Method to recover the files. Before running the program again");
				System.out.println("Fatal Error: Exiting the program");
				System.exit(-1);
			}

		}
		return 0;
	}
	
	
	public PharmaCompany readNextRecord(RandomAccessFile randomAccessFile)
			throws IOException {
		PharmaCompany pc;

		try {
			Integer id =  randomAccessFile.readInt();
			byte length = randomAccessFile.readByte();
			String company="";
			for(int i=0;i<length;i++)
			{
				company += (char)randomAccessFile.readByte();
			}			
			String drug_id = "";
			for(int i=0;i<6;i++)
			{
				drug_id += (char)randomAccessFile.readByte();
			}
			short trials = randomAccessFile.readShort() ;
			short patients = randomAccessFile.readShort();
			short dosage_mg = randomAccessFile.readShort();
			Float reading = randomAccessFile.readFloat();
			byte commonbyte = randomAccessFile.readByte();
			
			byte double_blind_mask=0x08;
			byte controlled_study_mask= 0x04;
			byte govt_funded_mask = 0x02;
			byte fda_approved_mask= 0x01;
			
			boolean double_blind;			  
			boolean controlled_study;
			boolean govt_funded;
			boolean fda_approved;
			
			if(double_blind_mask != (commonbyte & double_blind_mask ))
				double_blind = false;
			else
				double_blind = true;
			
			if(controlled_study_mask != (commonbyte & controlled_study_mask ))
				controlled_study= false;
			else
				controlled_study = true;
			
			if(govt_funded_mask != (commonbyte & govt_funded_mask ))
				govt_funded= false;
			else
				govt_funded = true;
			
			if(fda_approved_mask != (commonbyte & fda_approved_mask ))
				fda_approved= false;
			else
				fda_approved = true;
			    
			pc = new PharmaCompany(id, company,drug_id,trials,patients,dosage_mg,reading,double_blind,controlled_study,govt_funded,fda_approved);
			
			
		} catch (EOFException e) {
			return null;

		}
		return pc;
	}
	
	//selectByID() function used to select the record based on the id.

		public  int selectByID(int id, char op) {
			initIndexes();
			Integer idValue = id ;
			System.out.println("\nSelecting by ID : " + idValue);
			Long offset;
			int count=0;
			Set<Integer> keys = idIndexMap.keySet();
			for(Iterator<Integer> i= keys.iterator();i.hasNext();){
				Integer key = (Integer) i.next();
		        if(key<idValue && op=='<')
		        {
		        	if ((offset = idIndexMap.get(key)) == null) {
		    			System.out.println("No records found with value : " + idValue);
		    			return -1;
		    		}
		        	else{
			        	selectByIDGL(offset,key,idValue);
			        	count++;
		        	}

		    	}else if(key>idValue && op=='>')
		    	{
		    		if ((offset = idIndexMap.get(key)) == null) {
		    			System.out.println("No records found with value : " + idValue);
		    			return -1;
		    		}
		        	else{
			        	selectByIDGL(offset,key,idValue);
			        	count++;
		        	}
		    	}else if((int)key==(int)idValue && op=='=')
		        {
		    		if ((offset = idIndexMap.get(key)) == null) {
		    			System.out.println("No records found with value : " + idValue);
		    			return -1;
		    		}
		        	else{
			        	selectByIDGL(offset,key,idValue);
			        	count++;
		        	}
		    	}else if((int)key!=(int)idValue && op=='!')
		        {
		    		if ((offset = idIndexMap.get(key)) == null) {
		    			System.out.println("No records found with value : " + idValue);
		    			return -1;
		    		}
		        	else{
			        	selectByIDGL(offset,key,idValue);
			        	count++;
		        	}
		    	}
		    }
			System.out.println("\nNumber of records: "+count);
			return 0;
		}
		
		public int selectByIDGL(Long offset,Object key,Object idValue)
		{
			PharmaCompany pc = null;
    		RandomAccessFile randomAccessFile = null;
			try {
    			randomAccessFile = new RandomAccessFile(dbFileName, "rw");
    			randomAccessFile.seek(offset);

    			if ((pc = readNextRecord(randomAccessFile)) != null) {
    					System.out.println(pc);
    			}

    		} catch (Exception e) {
    			e.printStackTrace();
    			System.err.println("Unable to perform search");
    			return -1;
    		} finally {
    			try {
    				randomAccessFile.close();
    			} catch (IOException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    		}
			return 0;
		}
	
		public int selectByString(String value, String index) {
	
			initIndexes();
			HashMap<String, ArrayList<Long>> map = null;
			if (index.equalsIgnoreCase("drug_id"))
			{
				map=drug_idIndexMap;
			}else if(index.equalsIgnoreCase("company"))
			{
				map=companyIndexMap;

			}
			
			String strValue = value ;
			System.out.println("\nSelecting : " + strValue);
			ArrayList<Long> offsets = null;
			Set<String> keys = map.keySet();
    		RandomAccessFile randomAccessFile = null; 	
    		PharmaCompany pc = null;
		        	int count=0;
					try {
		        		randomAccessFile = new RandomAccessFile(dbFileName, "rw");
			        	for(Iterator<String> i= keys.iterator();i.hasNext();){
			    				String key = (String) i.next();
			    				offsets = map.get(key);
			    				if(key.contains(strValue))
			    				{
			    					for (Long offset : offsets) {
			    						randomAccessFile.seek(offset);		
					        			if ((pc = readNextRecord(randomAccessFile)) != null) {
					        					System.out.println(pc);
					        					count++;
					        			}
		
				    				} 
			    				}
			        	}
			        	if(pc ==null){
			        		System.out.println("No records found "+strValue);
			        	}
		        	}catch (Exception e) {
		        			e.printStackTrace();
		        			System.err.println("Unable to perform search");
		        			return -1;
		        		} finally {
		        			try {
		        				randomAccessFile.close();
		        			} catch (IOException e) {
		        				// TODO Auto-generated catch block
		        				e.printStackTrace();
		        			}
		        		}
			System.out.println("\nNumber of records: "+count);
			return 0;

		}
		
		public int selectByShort(Short value, String index, char op) {
			initIndexes();
			HashMap<Short, ArrayList<Long>> map = null;
			if (index.equalsIgnoreCase("patients"))
			{
				map = patientsIndexMap;
			}else if(index.equalsIgnoreCase("trials"))
			{
				map= trialsIndexMap;

			}
			else if(index.equalsIgnoreCase("dosage_mg")){
				map = dosage_mgIndexMap;
			}
			int count=0;
			Short idValue = value ;
			System.out.println("\nSelecting : " + idValue);
			ArrayList<Long> offsets = null;
			Set<Short> keys = map.keySet();
			for(Iterator<Short> i= keys.iterator();i.hasNext();){
				Short key = (Short) i.next();
		        if(key<idValue && op=='<')
		        {
		        	if ((offsets = map.get(key)) == null) {
		    			System.out.println("No records found with value : " + idValue);
		    			return -1;
		    		}
		        	else{
		        		for (Long offset : offsets) {
		        			selectByIDGL(offset,key,idValue);
		        			count++;
		        		}
		        	}

		    	}else if(key>idValue && op=='>')
		    	{
		    		if ((offsets = map.get(key)) == null) {
		    			System.out.println("No records found with value : " + idValue);
		    			return -1;
		    		}
		        	else{
		        		for (Long offset : offsets) {
		        			selectByIDGL(offset,key,idValue);
		        			count++;
		        		}
		        	}
		    	}else if((int)key==(int)idValue && op=='=')
		        {
		    		if ((offsets = map.get(key)) == null) {
		    			System.out.println("No records found with value : " + idValue);
		    			return -1;
		    		}
		        	else{
		        		for (Long offset : offsets) {
		        			selectByIDGL(offset,key,idValue);
		        			count++;
		        		}
		        	}
		    	}else if((int)key!=(int)idValue && op=='!')
		        {
		    		if ((offsets = map.get(key)) == null) {
		    			System.out.println("No records found with value : " + idValue);
		    			return -1;
		    		}
		        	else{
		        		for (Long offset : offsets) {
		        			selectByIDGL(offset,key,idValue);
		        			count++;
		        		}
		        	}
		    	}
		    }
			if(offsets ==null){
        		System.out.println("No records found "+idValue);
        	}
			System.out.println("\nNumber of records: "+count);
			return 0;
		}
		
		public int selectByReading(Float value, char op) {
			initIndexes();
			
			Float readValue = value ;
			System.out.println("\nSelecting : " + readValue);
			ArrayList<Long> offsets = null;
			Set<Float> keys = readingIndexMap.keySet();
			int count = 0;
			for(Iterator<Float> i= keys.iterator();i.hasNext();){
				Float key = (Float) i.next();
		        if(key<readValue && op=='<')
		        {
		        	if ((offsets = readingIndexMap.get(key)) == null) {
		    			System.out.println("No records found with value : " + readValue);
		    			return -1;
		    		}
		        	else{
		        		for (Long offset : offsets) {
		        			selectByIDGL(offset,key,readValue);
		        			count++;
		        		}
		        	}

		    	}else if(key>readValue && op=='>')
		    	{
		    		if ((offsets = readingIndexMap.get(key)) == null) {
		    			System.out.println("No records found with value : " + readValue);
		    			return -1;
		    		}
		        	else{
		        		for (Long offset : offsets) {
		        			selectByIDGL(offset,key,readValue);
		        			count++;
		        		}
		        	}
		    	}else if((float)key==(float)readValue && op=='=')
		        {
		    		if ((offsets = readingIndexMap.get(key)) == null) {
		    			System.out.println("No records found with value : " + readValue);
		    			return -1;
		    		}
		        	else{
		        		for (Long offset : offsets) {
		        			selectByIDGL(offset,key,readValue);
		        			count++;
		        		}
		        	}
		    	}else if((float)key!=(float)readValue && op=='!')
		        {
		    		if ((offsets = readingIndexMap.get(key)) == null) {
		    			System.out.println("No records found with value : " + readValue);
		    			return -1;
		    		}
		        	else{
		        		for (Long offset : offsets) {
		        			selectByIDGL(offset,key,readValue);
		        			count++;
		        		}
		        	}
		    	}
		    }
			if(offsets ==null){
        		System.out.println("No records found "+readValue);
        	}
			System.out.println("\nNumber of records: "+count);
			return 0;
		}
		
		public int selectByBoolean(Boolean value, String index) {
			
			initIndexes();
			HashMap<Boolean, ArrayList<Long>> map = null;
			if (index.equalsIgnoreCase("double_blind"))
			{
				map=double_blindIndexMap;
			}else if(index.equalsIgnoreCase("controlled_study"))
			{
				map=controlled_studyIndexMap;
			}else if(index.equalsIgnoreCase("govt_funded")){
				map=govt_fundedIndexMap;
			}else if(index.equalsIgnoreCase("fda_approved")){
				map=fda_approvedIndexMap;
			}
			
			Boolean boolValue = value ;
			System.out.println("\nSelecting : " + boolValue);
			ArrayList<Long> offsets = null;
			Set<Boolean> keys = map.keySet();
    		RandomAccessFile randomAccessFile = null; 	
    		PharmaCompany pc = null;
    		int count = 0;
		        	try {
		        		randomAccessFile = new RandomAccessFile(dbFileName, "rw");
			        	for(Iterator<Boolean> i= keys.iterator();i.hasNext();){
			    				Boolean key = (Boolean) i.next();
			    				offsets = map.get(key);
			    				if(key.equals(boolValue))
			    				{
			    					for (Long offset : offsets) {
			    						randomAccessFile.seek(offset);		
					        			if ((pc = readNextRecord(randomAccessFile)) != null) {
					        					System.out.println(pc);	
					        					count++;
					        			}
		
				    				} 
			    				}
			        	}
			        	if(pc ==null){
			        		System.out.println("No records found "+boolValue);
			        	}
		        	}catch (Exception e) {
		        			e.printStackTrace();
		        			System.err.println("Unable to perform search");
		        			return -1;
		        		} finally {
		        			try {
		        				randomAccessFile.close();
		        			} catch (IOException e) {
		        				// TODO Auto-generated catch block
		        				e.printStackTrace();
		        			}
		        		}
		     System.out.println("\nNumber of records: "+count);
			return 0;

		}
}//class
