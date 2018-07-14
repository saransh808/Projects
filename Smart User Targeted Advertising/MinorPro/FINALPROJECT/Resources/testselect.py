import sqlite3

conn=sqlite3.connect('Survey.db')
cursor = conn.execute("SELECT * from data")
for row in cursor:
   print "Age = ", row[0]
   print "Gender = ", row[1]
   print "Married? = ", row[2]
   print "Student? = ", row[3]
   print "Game = ", row[4]
   print "TV series = ", row[5]
   print "Shopping = ", row[6]
   print "Traveller = ", row[7]
   print "Invester = ", row[8]
   print "Gadgets = ", row[9]
   print "Foody = ", row[10]
   print "Movies = ", row[11]
   print "Decor = ", row[12], "\n"
