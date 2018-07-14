import sqlite3
conn=sqlite3.connect('Survey.db')
cursor = conn.execute("SELECT count(att_tv) from data group by att_tv having att_tv='Yes'")
for row in cursor:
    print("att_tv = ", row[0], "\n")
    cursor = conn.execute("SELECT count(att_trav) from data group by att_trav having att_trav='Yes'")
    for row in cursor:
        print("att_trav = ", row[0], "\n")
cursor = conn.execute("SELECT count(att_game) from data group by att_game having att_game='Yes'")
for row in cursor:
    print("att_game = ", row[0], "\n")
cursor = conn.execute("SELECT count(att_shop) from data group by att_shop having att_shop='Yes'")
for row in cursor:
    print("att_shop = ", row[0], "\n")
cursor = conn.execute("SELECT count(att_food) from data group by att_food having att_food='Yes'")
for row in cursor:
    print("att_food = ", row[0], "\n")
cursor = conn.execute("SELECT count(att_movie) from data group by att_movie having att_movie='Yes'")
for row in cursor:
    print("att_movie = ", row[0], "\n")
cursor = conn.execute("SELECT count(att_decor) from data group by att_decor having att_decor='Yes'")
for row in cursor:
    print("att_decor = ", row[0], "\n")
cursor = conn.execute("SELECT count(att_invest) from data group by att_invest having att_invest='Yes'")
for row in cursor:
    print("att_invest = ", row[0], "\n")
