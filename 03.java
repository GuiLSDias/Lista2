public Node removePares(Node head) {
    while (head != null && head.data % 2 == 0) {
        head = head.next;
    }
    Node atual = head;
    while (atual != null && atual.next != null) {
        if (atual.next.data % 2 == 0) {
            atual.next = atual.next.next;
        } else {
            atual = atual.next;
        }
    }
    return head;
}
