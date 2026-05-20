# Lab 3 – Extra Long Factorials

## Đề bài

Tính giai thừa của một số nguyên **n**, ký hiệu **n!**, được định nghĩa là:

```text
n! = n × (n-1) × (n-2) × ... × 3 × 2 × 1
```

In ra kết quả giai thừa của n.

---

## Ví dụ

### Input

```text
25
```

### Output

```text
15511210043330985984000000
```

### Giải thích

```text
25! = 25 × 24 × 23 × ... × 2 × 1 = 15511210043330985984000000
```

---

## Ý tưởng

Khởi tạo `factorial = 1`, sau đó nhân dần từ `1` đến `n`:

```text
factorial = 1
factorial = factorial × 1
factorial = factorial × 2
...
factorial = factorial × n
```

---

## Các bước xử lý

**Bước 1** – Khởi tạo kết quả ban đầu bằng 1:

```text
BigInteger factorial = BigInteger.ONE;
```

**Bước 2** – Nhân lần lượt từ 1 đến n:

```text
for i từ 1 đến n:
    factorial = factorial × i
```

**Bước 3** – In kết quả:

```text
System.out.println(factorial);
```

---

## Độ phức tạp

| | Độ phức tạp |
|---|---|
| Time Complexity | `O(n)` – duyệt vòng lặp một lần từ 1 đến n |
| Space Complexity | `O(1)` – chỉ dùng một biến `factorial` |

---

## Kỹ thuật sử dụng

- `BigInteger` để xử lý số nguyên rất lớn
- `.multiply()` để nhân hai `BigInteger`