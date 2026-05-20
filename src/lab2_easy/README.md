# Lab 2 – Bon Appetit

## Đề bài

Anna và Brian đi ăn cùng nhau, mỗi người chỉ trả tiền cho những món mình ăn.

Brian tính hóa đơn cho Anna nhưng có thể đã tính nhầm (tính cả món Anna không ăn).

Yêu cầu:

Kiểm tra Brian tính đúng hay sai.

---

## Công thức

```text
actual = (tong bill - bill[k]) / 2
```

- Nếu:

```text
actual == b
```

→ in:

```text
Bon Appetit
```

- Nếu:

```text
actual != b
```

→ in:

```text
b - actual
```

---

## Ví dụ

### Input

```text
bill = [3, 10, 2, 9]
k = 1
b = 12
```

### Output

```text
5
```

### Giải thích

Tổng bill:

```text
3 + 10 + 2 + 9 = 24
```

Anna không ăn món:

```text
bill[1] = 10
```

Tiền Anna thực sự phải trả:

```text
(24 - 10) / 2 = 7
```

Brian tính:

```text
12
```

Brian tính sai:

```text
12 - 7 = 5
```

---

## Ví dụ 2

### Input

```text
bill = [3, 10, 2, 9]
k = 1
b = 7
```

### Output

```text
Bon Appetit
```

### Giải thích

Tiền Anna thực sự phải trả:

```text
7
```

Brian cũng tính:

```text
7
```

→ Brian tính đúng.

---

## Ý tưởng

1. Tính tổng toàn bộ bill
2. Trừ món Anna không ăn
3. Chia đôi để ra số tiền thực tế Anna phải trả
4. So sánh với số tiền Brian đã tính

---

## Các bước xử lý

1. Tính tổng bill

```text
total += bill[i]
```

2. Trừ món Anna không ăn

```text
total - bill[k]
```

3. Chia đôi

```text
actual = (total - bill[k]) / 2
```

4. So sánh:

```text
actual == b
```

- Đúng → in `Bon Appetit`
- Sai → in `b - actual`

---

## Độ phức tạp

| | Độ phức tạp |
|---|---|
| Time Complexity | O(n) |
| Space Complexity | O(1) |

Trong đó:

- `n` là số phần tử của mảng `bill`

---

## Kỹ thuật sử dụng


- List / ArrayList
- Arithmetic
- Conditional