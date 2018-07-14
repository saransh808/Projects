import sqlite3

conn=sqlite3.connect('FinalSurvey.db')
cursor = conn.execute("SELECT distinct(att_label) from data")
count=0
for row in cursor:
    print("Label = ", row[0], "\n")
    count=count+1
print(count)
