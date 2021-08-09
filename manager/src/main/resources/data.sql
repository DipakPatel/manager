INSERT INTO brand (id, owner, name) VALUES
  (1, 'dipak', 'livi'),
  (2, 'dipak', 'wrong');

INSERT INTO color (id, code, name) VALUES
  (1, 'RG', 'REd'),
  (2, 'RGB', 'Blue');

INSERT INTO size (id, unit, size, country) VALUES
  (1, 'temp', 45, 'india'),
  (2, 'temp', 45, 'india');

INSERT INTO type (id, type) VALUES
  (1, 'pant'),
  (2, 'shirt');

insert into product(id, size_id, color_id, brand_id, type_id,price) VALUES
  (1, 1,1,1,1,123),
  (2, 2,2,2,2,321);