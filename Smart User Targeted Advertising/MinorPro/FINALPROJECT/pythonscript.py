from sklearn import tree
import sqlite3
import datetime

def condob(dob):
    now = datetime.datetime.now()
    dat=(int)(dob[0]+dob[1]+dob[2]+dob[3]+"")
    return (2018-dat)
def convert(s):
    if s=="Yes": return 1
    return 0;
def congen(s):
    if s=="m":  return 1
    return 0;
def conemp(s):
    if s=="employed":   return 0
    return 1
def consta(s):
    if s=="m":   return 1
    return 0

def qq(usrid):
    Fconn=sqlite3.connect('FinalSurvey.db')
    cursor = Fconn.execute("SELECT * from data")
    features= [[0 for j in range(4)]for i in range (78)]
    labels=[0 for i in range(78)]
    i=0
    for row in cursor:
        for j in range(4):
            features[i][j]=row[j]
            labels[i]=row[4]
        i=i+1
    clf=tree.DecisionTreeClassifier()
    clf=clf.fit(features,labels)

    sconn=sqlite3.connect('submit.db')
    scursor = sconn.execute("SELECT gender,dob, status, designation from signup where idd="+usrid)
    for row in scursor:
        Gender =congen(row[0])
        print(row[0])
        dob =condob(row[1])
        status=consta(row[2])
        designation =conemp(row[3])

        #print(row[0],"Hello There!!")
    print(Gender)
    fo=open("preferG.txt","w")
    fo.write(str(Gender))
    fo.close()
    m=(clf.predict([[dob,Gender,status,designation]]))

    f = open("preferML.txt","w")

    for item in m:
        f.write(str(item))
    f.close()
