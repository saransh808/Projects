import sqlite3
conncreate = sqlite3.connect('Survey.db')
conncreate.execute('''CREATE TABLE IF NOT EXISTS data (
                        att_age VARCHAR(3),
                        att_gender VARCHAR(1),
                        att_marr_status VARCHAR(3),
                        att_stud VARCHAR(10),
                        att_game VARCHAR(3),
                        att_tv VARCHAR(3),
                        att_shop VARCHAR(3),
                        att_trav VARCHAR(3),
                        att_invest VARCHAR(3),
                        att_gadget VARCHAR(3),
                        att_food VARCHAR(3),
                        att_movie VARCHAR(3),
                        att_decor VARCHAR(3)
                );''');
conncreate.commit();
conncreate.close();
