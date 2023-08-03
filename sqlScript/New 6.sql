/* Formatted on 03.08.2023 11:50:17 (QP5 v5.185.11230.41888) */
CREATE TABLE ROLE
(
   ID            NUMBER PRIMARY KEY,
   ROLE_NAME     VARCHAR2 (50) NOT NULL,
   DESCRIPTION   VARCHAR2 (50),
   DATA_DATE     DATE DEFAULT SYSDATE,
   ACTIVE        INTEGER DEFAULT 1
);


CREATE TABLE LOGIN_USER
(
   ID           NUMBER PRIMARY KEY,
   USERNAME     VARCHAR2 (50) NOT NULL,
   PASSWORD     VARCHAR2 (50) NOT NULL,
   ROLE_ID      NUMBER,
   STUDENT_ID   NUMBER UNIQUE,
   TEACHER_ID   NUMBER UNIQUE,
   DATA_DATE    DATE DEFAULT SYSDATE,
   ACTIVE       INTEGER DEFAULT 1
);



SELECT X.ID,
       X.NAME,
       X.SURNAME,
       X.USERNAME,

       X.ROLE_ID,
       ROLE_NAME
  FROM (SELECT LU.ID,
               LU.USERNAME,
               LU.PASSWORD,
               S.NAME,
               S.SURNAME,
               R.ID ROLE_ID,
               R.ROLE_NAME ROLE_NAME
          FROM LOGIN_USER LU
               INNER JOIN STUDENT S
                  ON S.ID = LU.STUDENT_ID
               INNER JOIN ROLE R
                  ON R.ID = LU.ROLE_ID
        UNION ALL
        SELECT LU.ID,
               LU.USERNAME,
               LU.PASSWORD,
               T.NAME,
               T.SURNAME,
               R.ID ROLE_ID,
               R.ROLE_NAME ROLE_NAME
          FROM LOGIN_USER LU
               INNER JOIN TEACHER T
                  ON T.ID = LU.TEACHER_ID
               INNER JOIN ROLE R
                  ON R.ID = LU.ROLE_ID) X
 WHERE X.USERNAME = 'valeh@gmail.com' AND X.PASSWORD = '111';
 
 SELECT X.ID,
                            X.NAME,
                            X.SURNAME,
                            X.USERNAME,
                            X.ROLE_ID ROLE_ID,
                            X.ROLE_NAME ROLE_NAME
                       FROM (SELECT LU.ID,
                                    LU.USERNAME,
                                    LU.PASSWORD,
                                    S.NAME,
                                    S.SURNAME,
                                    R.ID ROLE_ID,
                                    R.ROLE_NAME ROLE_NAME
                               FROM LOGIN_USER LU
                                    INNER JOIN STUDENT S
                                       ON S.ID = LU.STUDENT_ID
                                    INNER JOIN ROLE R
                                       ON R.ID = LU.ROLE_ID
                             UNION ALL
                             SELECT LU.ID,
                                    LU.USERNAME,
                                    LU.PASSWORD,
                                    T.NAME,
                                    T.SURNAME,
                                    R.ID ROLE_ID,
                                    R.ROLE_NAME ROLE_NAME
                               FROM LOGIN_USER LU
                                    INNER JOIN TEACHER T
                                       ON T.ID = LU.TEACHER_ID
                                    INNER JOIN ROLE R
                                       ON R.ID = LU.ROLE_ID) X
                      WHERE X.USERNAME ='valeh@gmail.com'  AND X.PASSWORD ='111';