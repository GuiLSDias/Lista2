public String decimalParaBinario(int n) {
    if (n == 0) {
        return "0";
    }
    if (n == 1) {
        return "1";
    }
    return decimalParaBinario(n / 2) + (n % 2);
}

