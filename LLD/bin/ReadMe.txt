Three main tables :

USER
ID   	  - 	NAME 
id_nik 	  , 	Nikhil
id_poddar , 	Poddar
id_rishi  ,     Rishi

EXPENSE

ID ,   ,  LENDER  , 	BORROWERS , 		 , EXPENSE_TYPE  , AMOUNT
id_1   ,  id_nik  , {id_poddar , id_rishi}   ,  EQUAL		 , 900
id_2   ,  id_rishi , {id_nik , id_poddar}   ,   EQUAL		 , 600


EXPENSE_ENTRY

After Expense id_1

ENTRY_ID , 				EXPENSE_ID ,  LENDER , BORROWER   , AMOUNT 
id_nik-id_rishi         id_1       ,  id_nik  , id_rishi  , 300
id_nik-id_poddar        id_1       ,  id_nik  , id_poddar , 1200    

After Expense id_2

ENTRY_ID , 				EXPENSE_ID ,  LENDER , 		BORROWER    ,    AMOUNT 
id_nik-id_poddar        id_1       ,  id_nik  , 	id_poddar   ,    300
id_rishi-id_poddar      id_2       ,  id_rishi  , 	id_poddar   ,    400
id_nik-id_rishi         id_2       ,  id_rishi  ,   id_nik      ,    100    





    