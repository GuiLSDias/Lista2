public int somaVetor(int[] vetor, int n) {
    if (n == 0) {
        return 0;
    }
    return vetor[n-1] + somaVetor(vetor, n-1);
}
