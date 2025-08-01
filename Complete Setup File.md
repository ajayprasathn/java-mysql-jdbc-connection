

---



\## How to Run the Java Program



1\. Make sure MySQL is running and you have the DB credentials:



\- URL: `jdbc:mysql://localhost:3306/MEC`

\- User: `root`

\- Password: `root`



2\. Download the MySQL Connector/J `.jar` file from the official MySQL website.



3\. Compile the `Main.java` file and include the MySQL Connector/J in the classpath. For example:









**javac -cp .:mysql-connector-java-8.0.XX.jar Main.java**







4\. Run the program:



java -cp .:mysql-connector-java-8.0.XX.jar Main







\*(On Windows, use `;` instead of `:` for classpath separation.)\*



---



\## Notes



\- Do not commit your database credentials to GitHub.

\- This project uses hardcoded credentials for simplicity; consider externalizing configuration in real projects.

\- The program inserts some employee records and then fetches and prints all employee data.



---



\## Troubleshooting



\- Verify the MySQL server is running, and the credentials are correct.

\- Ensure the MySQL Connector/J `.jar` is included correctly in your classpath.

\- Check for SQL exceptions in the program output.



---



Enjoy coding!



