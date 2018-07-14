import sqlite3
conncreate = sqlite3.connect('FinalSurvey.db')
conncreate.execute('''CREATE TABLE IF NOT EXISTS data (
                        att_age int,
                        att_gender int,
                        att_marr_status int,
                        att_stud int,
                        att_label int
                );''');
conncreate.commit();
conncreate.close();
