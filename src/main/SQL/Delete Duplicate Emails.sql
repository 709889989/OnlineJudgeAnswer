#��MySQL�У���ֹ��FROM�Ӿ���ָ�������µ�Ŀ���
DELETE a FROM Person a INNER JOIN Person b
WHERE a.Email = b.Email AND a.Id > b.Id;