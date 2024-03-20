5. O máximo divisor comum (MDC) de dois números inteiros x e y pode ser calculado usando-se uma definição recursiva:
    - MDC(x, y) = MDC(x - y, y), se x > y
    - MDC(x, y) = MDC(y, x)
    - MDC(x, x) = x

    Fazer uma função recursiva que receba 2 números inteiros positivos e apresente o MDC desses números.
