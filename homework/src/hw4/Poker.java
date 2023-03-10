package hw4;

public class Poker {

	static void deal() {
		boolean[][] check = new boolean[4][13];//用來判斷牌是否已經發過 已發過為true 沒發過為false
		String[][] player_cards = new String[4][13];//用來放4位玩家手中的13張牌
		int random_poker_suits = 0;//隨機產生花色
		int random_poker_num = 0;//隨機產生點數
		int player_index = 0;//紀錄發到哪個玩家，相當於player_card的row index
		int cards_index = 0;//紀錄發到第幾輪，每發4個玩家為一輪，相當於player_card的column index
		for (int i = 0; i < check.length; i++) {//預設所有牌都沒被發過check[i][j] = false
			for (int j = 0; j < check[i].length; j++) {
				check[i][j] = false;
			}
		}
		for (int i = 0; i < 52; i++) {	
				do {//當這張牌被發過時，產生新的花色與點數check[random_poker_suits][random_poker_num] == true
					random_poker_suits = (int) (Math.random() * 4);
					random_poker_num = (int) (Math.random() * 13);
				} while (check[random_poker_suits][random_poker_num] == true);
				check[random_poker_suits][random_poker_num] = true;//記錄這張牌已發過
				switch (random_poker_suits) {// 花色判別+把牌存到player_card裡
				case 0:
					player_cards[player_index][cards_index] = "梅花";
					break;
				case 1:
					player_cards[player_index][cards_index] = "方塊";
					break;
				case 2:
					player_cards[player_index][cards_index] = "紅心";
					break;
				case 3:
					player_cards[player_index][cards_index] = "黑桃";
					break;
				}
				switch (random_poker_num) {// 點數判別+把牌存到player_card裡
				case 0:
					player_cards[player_index][cards_index] += "A\t";
					break;
				case 10:
					player_cards[player_index][cards_index] += "J\t";
					break;
				case 11:
					player_cards[player_index][cards_index] += "Q\t";
					break;
				case 12:
					player_cards[player_index][cards_index] += "K\t";
					break;
				default:
					player_cards[player_index][cards_index] += random_poker_num + 1+"\t";
				}

				if (player_index < 3) {//控制row index
					player_index++;
				} else if (player_index == 3) {
					player_index = 0;
				}
				if (player_index == 0) {//控制 column index
					cards_index++;
				}
			}
		
		for (int i = 0; i < player_cards.length; i++) {//顯示結果
			System.out.print("玩家" + (i+1) + "手牌:");
			for (int j = 0; j < player_cards[i].length; j++) {
				System.out.print(player_cards[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		deal();
	}

}
