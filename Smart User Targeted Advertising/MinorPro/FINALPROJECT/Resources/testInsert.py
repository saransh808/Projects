import sqlite3

conn=sqlite3.connect('Survey.db')

fo=open('insertcommand.txt')
str=fo.readline()
while str:
    str="INSERT INTO data VALUES"+str
    conn.execute(str)
    #print(str)
    str=fo.readline()
conn.commit()
conn.close()
fo.close()
