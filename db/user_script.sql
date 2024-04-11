-- Encrypted with Bcrypt using https://bcrypt.online/
INSERT INTO pizzeria.user (username, password, email, locked, disabled) VALUES
    ("admin",
	 "$2y$10$3d9Qi5RYQZ2oLGEF5KV2UeJnv.HUNS9tfUa7lPvoGk.CQKFxRj7cS",    -- admin123
	 "admin@ordep.com",
	 0,
	 0),

    ("customer",
	 "$2y$10$vOxzAacw1pyuulNLtfsoTefz6Bg4aeTadWp.0FtYQvns/Cv1lgvpa",    -- customer123
	 "customer@ordep.com",
	 0,
	 0)
;   
