INSERT INTO users (username, email, password, plan) VALUES
    ('user1', 'user1@example.com', 'password1', 'Free'),
    ('user2', 'user2@example.com', 'password2', 'Premium');

INSERT INTO posts (content, user_id) VALUES
    ('Post by user1', 1),
    ('Post by user2', 2);

INSERT INTO comments (content, user_id, post_id) VALUES
    ('Comment on post 1', 2, 1),
    ('Comment on post 2', 1, 2);
