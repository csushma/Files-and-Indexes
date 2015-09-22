*******************READ ME************************
1. Download the jar file from elearning. All java files are present in src folder
2. Open Command Prompt and execute the following command:
	Java -jar sxc149730.jar
3. All the data is now written to data.db
4. Enter the search attribute. For example to select ID, enter 1.
5. Enter the corresponding value for field you want to test.
	a. If you select Id, trials,patients,dosage_mg,reading select the operator. For example if you want to select '<' operator, enter 1.
	b. If you select company, drug_id you can enter entire String/sub-string of the String to get all values containing sub-string.
	c. If you select Boolean values (double_blind,controlled_study,govt_funded,fda_approved), please enter TRUE or FALSE
6. Please note that String values are case sensitive

Technologies Used: Java 
					-RandomAccessFile 
					-Collections

Files Included:
1. MyDatabase.java - contains main function
2. Database.java
3. DataImport.java
4. FileUtil.java
5. Indexes.java
6. PharmaCompany.java