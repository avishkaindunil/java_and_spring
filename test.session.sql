--@block
CREATE TABLE Users(
    id INT PRIMARY KEY AUTO_INCREMENT,
    email VARCHAR(255) NOT NULL UNIQUE,
    bio TEXT,
    country VARCHAR(2)
);

--@block
INSERT INTO Users (email, bio, country)
VALUES (
    'avishka@gmail.com',
    'This is test one',
    'LK'
)

--@block
INSERT INTO Users (email, bio, country)
VALUES 
    ('a@gmail.com', 'Test Two', 'US'),
    ('b@c.com', 'Test 3', 'IN');

--@block
SELECT * FROM Users;

--@block
SELECT email, id FROM Users;

--@block
INSERT INTO Users (email, bio, country)
VALUES 
    ('asds@gmail.com', 'Test 4', 'US'),
    ('bsdsad@c.com', 'Test 5', 'FR');

--@block
SELECT * FROM Users;

--@block
SELECT email, id FROM Users 
LIMIT 2;

--@block
SELECT email, id FROM Users 
ORDER BY id ASC 
LIMIT 2;

--@block 
SELECT email, id FROM Users 
ORDER BY id DESC 
LIMIT 2;

--@block
SELECT email, id, country FROM Users 

WHERE country = 'US' 
AND id > 1

ORDER BY id ASC
LIMIT 2; 

--@block
INSERT INTO Users (email, bio, country)
VALUES 
    ('assdsdds@gmail.com', 'Test 6', 'US'),
    ('fgdbsdsad@c.com', 'Test 7', 'FR');

--@block
SELECT email, id, country FROM Users

WHERE country = 'FR'
AND email LIKE 'f%'

ORDER BY id ASC
LIMIT 4;

--@block
SELECT email, id, bio, country FROM Users
WHERE country = 'US'
OR bio = 'Test 6' 
AND email LIKE 'asd%'
ORDER BY id ASC
LIMIT 2;

--@block
CREATE INDEX email_index ON Users(email);


--@block
CREATE TABLE Rooms(
    id INT AUTO_INCREMENT,
    street VARCHAR(255),
    owner_id INT NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(owner_id) REFERENCES Users(id)
);

--@block
INSERT INTO Rooms (owner_id, street)
VALUES
    (1, 'san diego sailboat'),
    (1, 'antucket cottage'),
    (1, 'vail cabin'),
    (1, 'sf cardboard box');

--@block
SELECT * FROM Rooms;

--@block
SELECT * FROM Users 
INNER JOIN Rooms 
ON Rooms.owner_id = Users.id;

--@block
SELECT * FROM Users 
LEFT JOIN Rooms 
ON Rooms.owner_id = Users.id;

--@block
SELECT * FROM Users 
RIGHT JOIN Rooms 
ON Rooms.owner_id = Users.id;

--@block
SELECT * FROM Users 
FULL OUTER JOIN Rooms 
ON Rooms.owner_id = Users.id;

--@block
SELECT 
    Users.id AS user_id,
    Rooms.id AS room_id,
    email,
    country,
    street 
FROM Users 
INNER JOIN Rooms ON Rooms.owner_id = Users.id;

--@block
CREATE TABLE Bookings(
    id INT AUTO_INCREMENT,
    guest_id INT NOT NULL,
    room_id INT NOT NULL,
    check_in DATETIME,
    PRIMARY KEY(id),
    FOREIGN KEY (guest_id) REFERENCES Users(id),
    FOREIGN KEY (room_id) REFERENCES Rooms(id)
);

--@block Rooms a user has booked
SELECT
    guest_id,
    street,
    check_in
FROM Bookings 
INNER JOIN Rooms ON Rooms.owner_id = guest_id
WHERE guest_id = 1;