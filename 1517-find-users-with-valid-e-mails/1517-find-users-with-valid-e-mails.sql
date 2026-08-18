select * from Users
where mail regexp '^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode\\.com$' 
and mail like binary '%@leetcode.com';

-- SELECT *
-- FROM Users
-- WHERE REGEXP_LIKE(
--     mail,
--     '^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode\\.com$',
--     'c'
-- );