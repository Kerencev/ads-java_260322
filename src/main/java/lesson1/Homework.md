**По вопросам проверки и переноса обращаться к Игорю tg: @inchestnov**
### 1. Прочитать в книге "Грокаем алгоритмы" или в предложенных материалах про алгоритмы и О-большое.
###2. Определить сложность следующих алгоритмов:
-. Поиск элемента массива с известным индексом

-. Дублирование одномерного массива через foreach

-. Удаление элемента массива с известным индексом без сдвига

-. Удаление элемента массива с неизвестным индексом без сдвига

-. Удаление элемента массива с неизвестным индексом со сдвига
.
###3. Определить сложность следующих алгоритмов. Сколько произойдет итераций?
a)

```
        int n = 10000;
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j *= 2) {
                arrayList.add(i * j);
            }
        }
```
b)

```
        int n = 10000;
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i += 2) {
            for (int j = i; j < n; j++) {
                arrayList.add(i * j);
            }
        }
```

с)

```
        int n = 10000;
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < n; j++) {
                arrayList.add(i * j);
				n--;
            }
        }
```

d*)
```
		
		factorial(12)
	
    public static int factorial(int n) {
        if (n == 1) {
            return n;
        }
        return n * factorial(n - 1);
    }
```

e*)
```
	
	fib(20);

    public static int fib(int n) {
        if (n == 1) || (n == 2)) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
```