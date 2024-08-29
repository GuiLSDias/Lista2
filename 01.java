public int pesquisa(Node head, int valor) {
    Node atual = head;
    while (atual != null) {
        if (atual.data == valor) {
            return 1;
        }
        atual = atual.next;
    }
    return 0;
}
