### install mariadb jdbc connector 
## gradle 
	// https://mvnrepository.com/artifact/org.mariadb.jdbc/mariadb-java-client
	compile group: 'org.mariadb.jdbc', name: 'mariadb-java-client', version: '2.3.0'
### tutorialpoint
## query 
	create table EMPLOYEE (
	   id INT NOT NULL auto_increment,
	   first_name VARCHAR(20) default NULL,
	   last_name  VARCHAR(20) default NULL,
	   salary     INT  default NULL,
	   PRIMARY KEY (id)
	);