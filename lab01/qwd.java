import java.util.Arrays;

public class CardOrder {

    // 交换两个元素的位置
    public static void swap(int[] cards, int i, int j) {
        int temp = cards[i];
        cards[i] = cards[j];
        cards[j] = temp;
    }

    // 模拟发牌过程并找到初始顺序
    public static void findOrder() {
        int[] cards = new int[13];
        for (int i = 0; i < 13; i++) {
            cards[i] = i + 1;
        }

        int top = 0;

        for (int i = 0; i < 13; i++) {
            swap(cards, top, cards.length - 1);
            top = (top + 1) % 13;

            for (int j = 0; j < cards.length - 1; j++) {
                if (cards[j] > cards[j + 1]) {
                    swap(cards, j, j + 1);
                }
            }
        }

        System.out.println(Arrays.toString(cards));
    }

    public static void main(String[] args) {
        findOrder();
    }
}