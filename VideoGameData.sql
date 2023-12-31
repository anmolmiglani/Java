CREATE TABLE IF NOT EXISTS video_games (
    ID INT PRIMARY KEY,
    Game_Title VARCHAR(255),
    Genre VARCHAR(50),
    Release_Year INT,
    Sales_Millions DECIMAL(8, 2)
);

-- Insert data into the video_games table
INSERT INTO video_games (ID, Game_Title, Genre, Release_Year, Sales_Millions) VALUES
(2, 'Super Mario Bros.', 'Platform', 1985, 40.24),
(3, 'Tetris', 'Puzzle', 1984, 35.00),
(4, 'Minecraft', 'Sandbox', 2011, 200.00),
(5, 'Grand Theft Auto V', 'Action-Adventure', 2013, 110.00),
(6, 'Pokémon Red/Blue', 'RPG', 1996, 31.38),
(7, 'Wii Sports', 'Sports', 2006, 82.83),
(8, 'Call of Duty: Modern Warfare', 'FPS', 2007, 15.07),
(9, 'Fortnite', 'Battle Royale', 2017, 350.00),
(10, 'FIFA 21', 'Sports', 2020, 20.00),
(11, 'The Witcher 3: Wild Hunt', 'RPG', 2015, 30.00),
(12, 'Among Us', 'Party', 2018, 75.00),
(13, 'Pac-Man', 'Maze', 1980, 34.02),
(14, 'The Sims', 'Simulation', 2000, 16.00),
(15, 'Halo: Combat Evolved', 'FPS', 2001, 6.43),
(16, 'Animal Crossing: New Horizons', 'Life Sim', 2020, 34.85),
(17, 'Counter-Strike', 'FPS', 1999, 25.73),
(18, 'Red Dead Redemption 2', 'Action-Adventure', 2018, 38.00),
(19, 'The Elder Scrolls V: Skyrim', 'RPG', 2011, 30.00),
(20, 'Mario Kart 8 Deluxe', 'Racing', 2017, 35.39),
(21, 'PUBG', 'Battle Royale', 2017, 70.00),
(22, 'Super Mario Odyssey', 'Platform', 2017, 22.40),
(23, 'Fallout 4', 'RPG', 2015, 14.27),
(24, 'StarCraft', 'RTS', 1998, 11.00),
(25, 'The Last of Us Part II', 'Action-Adventure', 2020, 20.00),
(26, 'God of War', 'Action-Adventure', 2018, 20.00),
(27, 'Diablo III', 'Action RPG', 2012, 30.00),
(28, 'Garry''s Mod', 'Sandbox', 2004, 15.00),
(29, 'Donkey Kong', 'Platform', 1981, 1.70),
(30, 'League of Legends', 'MOBA', 2009, 100.00),
(31, 'Minecraft', 'Sandbox', 2011, 200.00),
(32, 'Super Mario Bros. 2', 'Platform', 1988, 10.24),
(33, 'The Legend of Zelda: Ocarina of Time', 'Action-Adventure', 1998, 13.22),
(34, 'Sonic the Hedgehog', 'Platform', 1991, 15.00),
(35, 'Resident Evil 4', 'Survival Horror', 2005, 10.20),
(36, 'The Sims 2', 'Simulation', 2004, 13.30),
(37, 'Need for Speed: Most Wanted', 'Racing', 2005, 15.85),
(38, 'Uncharted 4: A Thief''s End', 'Action-Adventure', 2016, 16.00),
(39, 'Overwatch', 'FPS', 2016, 10.00),
(40, 'Destiny', 'FPS', 2014, 13.00),
(41, 'The Legend of Zelda: Breath of the Wild', 'Action-Adventure', 2017, 23.20),
(42, 'Fallout: New Vegas', 'RPG', 2010, 12.00),
(43, 'The Sims 3', 'Simulation', 2009, 10.00),
(44, 'The Elder Scrolls IV: Oblivion', 'RPG', 2006, 9.45),
(45, 'Final Fantasy VII', 'RPG', 1997, 10.85),
(46, 'Tomb Raider (2013)', 'Action-Adventure', 2013, 8.50),
(47, 'Assassin''s Creed II', 'Action-Adventure', 2009, 10.40),
(48, 'The Legend of Zelda: Majora''s Mask', 'Action-Adventure', 2000, 3.36),
(49, 'Half-Life 2', 'FPS', 2004, 12.00),
(50, 'The Elder Scrolls III: Morrowind', 'RPG', 2002, 4.63),
(51, 'BioShock', 'FPS', 2007, 4.00),
(52, 'Metal Gear Solid', 'Action-Adventure', 1998, 6.03),
(53, 'The Witcher 2: Assassins of Kings', 'RPG', 2011, 4.00),
(54, 'Resident Evil 2 (2019)', 'Survival Horror', 2019, 8.00),
(55, 'Star Wars: Knights of the Old Republic', 'RPG', 2003, 2.00),
(56, 'Silent Hill 2', 'Survival Horror', 2001, 3.00),
(57, 'Street Fighter II', 'Fighting', 1991, 6.30),
(58, 'Metal Gear Solid 2: Sons of Liberty', 'Action-Adventure', 2001, 7.00),
(59, 'Devil May Cry', 'Action-Adventure', 2001, 3.50),
(60, 'Minecraft: Pocket Edition', 'Sandbox', 2011, 200.00);


Select * from video_games