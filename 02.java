public boolean isOrdenada(Node head) {
    if (head == null || head.next == null) {
        return true;
    }
    Node atual = head;
    while (atual.next != null) {
        if (atual.data > atual.next.data) {
            return false;
        }
        atual = atual.next;
    }
    return true;
}
