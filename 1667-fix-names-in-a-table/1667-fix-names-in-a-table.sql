SELECT User_id ,CONCAT(
    UPPER(Left(name,1)),
    LOWER(SUBSTRING(name,2))
) AS name
FROM Users ORDER BY User_id;