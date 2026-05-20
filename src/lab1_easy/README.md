# Lab 1 – Designer PDF Viewer

## Đề bài

Trong một PDF viewer, khi bôi đen một từ, từ đó sẽ được highlight bằng một hình chữ nhật màu xanh.

Cho:

- Mảng `h` gồm 26 số nguyên biểu diễn chiều cao của các chữ cái `a → z`
- Một từ `word` chỉ gồm chữ thường

Yêu cầu:

Tính diện tích hình chữ nhật highlight của từ đó.

### Công thức

```text
Diện tích = độ dài từ × chiều cao lớn nhất
```

Vì mỗi ký tự có chiều rộng đúng `1mm`.

---

## Ví dụ

### Input

```text
h = [1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5]

word = "abc"
```

### Output

```text
9
```

### Giải thích

- `a = 1`
- `b = 3`
- `c = 1`

Chiều cao lớn nhất:

```text
maxHeight = 3
```

Độ dài từ:

```text
3
```

Diện tích:

```text
3 × 3 = 9
```

---

## Ý tưởng

Duyệt từng ký tự trong `word`:

- Chuyển ký tự thành index bằng:

```text
c - 'a'
```

Ví dụ:

```text
'b' - 'a' = 1
```

Sau đó:

- Lấy chiều cao từ mảng `h`
- Tìm chiều cao lớn nhất bằng `Math.max()`

Cuối cùng:

```text
diện tích = word.length() × maxHeight
```

---

## Các bước xử lý

1. Tạo biến:

```text
int maxHeight = 0;
```

2. Duyệt từng ký tự trong từ:

```text
for (char c : word.toCharArray())
```

3. Tính index:

```text
c - 'a'
```

4. Lấy chiều cao:

```text
h.get(index)
```

5. Cập nhật chiều cao lớn nhất:

```text
maxHeight = Math.max(maxHeight, height);
```

6. Trả về:

```text
word.length() * maxHeight
```

---

## Độ phức tạp

| | Độ phức tạp |
|---|---|
| Time Complexity | O(n) |
| Space Complexity | O(1) |

Trong đó:

- `n` là độ dài của từ

---

## Kỹ thuật sử dụng

- List
- `toCharArray()`
- `Math.max()`
- Arithmetic (`c - 'a'`)

---
