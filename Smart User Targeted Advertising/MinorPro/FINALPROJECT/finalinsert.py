import sqlite3


def convert(s):
    if s=="Yes": return 1
    return 0;
def congen(s):
    if s=="M":  return 1
    return 0;
def conemp(s):
    if s=="Employed":   return 0
    return 1

Fconn=sqlite3.connect('FinalSurvey.db')
conn=sqlite3.connect('Survey.db')
cursor = conn.execute("SELECT * from data")
count=0
for row in cursor:
   row0=int(row[0])
   row1=congen(row[1])
   row2=convert(row[2])
   row3=conemp(row[3])
   label=(convert(row[4])+convert(row[5])+convert(row[6]))*100+(convert(row[7])+convert(row[8])+convert(row[9]))*10+(convert(row[10])+convert(row[11])+convert(row[12]))
   st='INSERT INTO DATA VALUES('+str(row0)+','+str(row1)+','+str(row2)+','+str(row3)+','+str(label)+')'
   #print(st)
   Fconn.execute(st)


Fconn.commit()
Fconn.close()
