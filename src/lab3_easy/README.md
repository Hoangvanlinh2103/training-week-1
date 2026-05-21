


# Lab 3 – Breaking Records 

## Đề bài

Maria chơi bóng rổ và ghi lại điểm số từng trận trong mùa giải.

Hãy đếm:

- Số lần phá kỷ lục điểm cao nhất
- Số lần phá kỷ lục điểm thấp nhất

---

## Ví dụ

### Input

```text
scores = [10, 5, 20, 20, 4, 5, 2, 25, 1]
```

### Output

```text
2 4
```

### Giải thích

- Phá kỷ lục cao: `20`, `25` → 2 lần
- Phá kỷ lục thấp: `5`, `4`, `2`, `1` → 4 lần

---

## Ý tưởng

Ban đầu:

- `scores[0]` là kỷ lục cao nhất
- `scores[0]` cũng là kỷ lục thấp nhất

Duyệt từ phần tử thứ 2:

### Nếu

```text
score > maxRecord
```

→ phá kỷ lục cao

### Nếu

```text
score < minRecord
```

→ phá kỷ lục thấp

Mỗi lần phá:

- tăng biến đếm
- cập nhật kỷ lục mới

---

## Các bước xử lý

1. Gán:

```text
maxRecord = scores.get(0);
minRecord = scores.get(0);
```

2. Tạo:

```text
maxCount = 0;
minCount = 0;
```

3. Duyệt mảng từ vị trí `1`

4. Kiểm tra:

```text
if (score > maxRecord)
```

```text
if (score < minRecord)
```

5. Trả về:

```text
[maxCount, minCount]
```

---

## Độ phức tạp

| | Độ phức tạp |
|---|---|
| Time Complexity | O(n) |
| Space Complexity | O(1) |

---

## Kỹ thuật sử dụng


- So sánh số
- Biến đếm
- `Math.max()`
- `Math.min()`

---
