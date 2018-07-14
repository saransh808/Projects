import sqlite3

conn=sqlite3.connect('FinalSurvey.db')
cursor = conn.execute("SELECT * from data")
for row in cursor:
   print("Age = ", row[0])
   print("Gender = ", row[1])
   print("Married? = ", row[2])
   print("Student? = ", row[3])
   print("Label = ", row[4], "\n")
